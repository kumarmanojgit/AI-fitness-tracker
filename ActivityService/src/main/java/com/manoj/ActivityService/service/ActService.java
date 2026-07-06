package com.manoj.ActivityService.service;

import com.manoj.ActivityService.Model.Activity;
import com.manoj.ActivityService.Repository.ActivityRepository;
import com.manoj.ActivityService.dto.ActivityRequest;
import com.manoj.ActivityService.dto.ActivityResponse;

import org.springframework.stereotype.Service;

@Service
public class ActService {

     private final ActivityRepository activityRepository;

    public ActService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public  ActivityResponse trackActivity(ActivityRequest request) {
        Activity activity=Activity.builder()
                .userId(request.getUserId())
                .type(request.getType())
                .duration(request.getDuration())
                .caloriesBurned(request.getCaloriesBurned())
                .startTime(request.getStartTime())
                .additionalMetrics(request.getAdditionalMetrics())
                .build();
        Activity saveActivity=activityRepository.save(activity);
        return  mapToResponse(saveActivity);
    }

    private  ActivityResponse mapToResponse(Activity saveActivity) {
        ActivityResponse response=new ActivityResponse();
        response.setId(saveActivity.getId());
        response.setUserId(saveActivity.getUserId());
        response.setType(saveActivity.getType());
        response.setDuration(saveActivity.getDuration());
        response.setCaloriesBurned(saveActivity.getCaloriesBurned());
        response.setStartTime(saveActivity.getStartTime());
        response.setAdditionalMetrics(saveActivity.getAdditionalMetrics());
        response.setCreatedAt(saveActivity.getCreatedAt());
        response.setUpdatedAt(saveActivity.getUpdatedAt());
        return response;
    }
}
