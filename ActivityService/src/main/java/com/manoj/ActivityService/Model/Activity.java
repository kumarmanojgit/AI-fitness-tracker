package com.manoj.ActivityService.Model;

import jakarta.persistence.*;
import lombok.*;

import org.hibernate.annotations.JdbcTypeCode;

import org.hibernate.type.SqlTypes;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.Map;

@Entity // Marks this as a JPA entity
@Table(name = "activities") // Recommended: explicitly name your table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // Standard for String-based IDs
    private String id;

    private String userId;

    @Enumerated(EnumType.STRING) // Best practice for Enums in DB
    private ActivityType type;

    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;

    // MySQL doesn't have a native 'Map' type.
    // Use this to store it as a JSON column (requires MySQL 5.7+)
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "json")

    private Map<String, Object> additionalMetrics;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}