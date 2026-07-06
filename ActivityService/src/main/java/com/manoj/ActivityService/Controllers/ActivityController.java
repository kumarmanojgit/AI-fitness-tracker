package com.manoj.ActivityService.Controllers;

import com.manoj.ActivityService.dto.ActivityRequest;
import com.manoj.ActivityService.dto.ActivityResponse;
import com.manoj.ActivityService.service.ActService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/activities")
public class ActivityController {
    private final ActService actService;

    public ActivityController(ActService actService) {
        this.actService = actService;
    }

    @PostMapping
    public ResponseEntity<ActivityResponse> trackActivity(@RequestBody ActivityRequest request)
    {
        return ResponseEntity.ok(actService.trackActivity(request));
    }
}
