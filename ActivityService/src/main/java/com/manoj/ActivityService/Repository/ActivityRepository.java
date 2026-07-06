package com.manoj.ActivityService.Repository;

import com.manoj.ActivityService.Model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity,String> {

}
