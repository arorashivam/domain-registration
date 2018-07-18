package com.endurance.domain.Services;

import com.endurance.domain.Repositories.AvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shivam.a on 7/18/18.
 */

@Service
public class AvailabilityService {

    // can check with 3rd party apis and internal records

    @Autowired
    AvailabilityRepository availabilityRepository;

    public boolean checkAvailability(String domainName) {
        if(availabilityRepository.Response()) {
            return true;
        }
        else {
            return false;
        }
    }

}
