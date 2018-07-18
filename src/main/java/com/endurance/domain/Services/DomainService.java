package com.endurance.domain.Services;

//import com.endurance.domain.Domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shivam.a on 7/17/18.
 */

@Service
public class DomainService {

    @Autowired
    AvailabilityService availabilityService;

    public boolean getDomain(String domainName) {
        if(availabilityService.checkAvailability(domainName)) {
            // make a call to domainRepository to update the D
            return true;
        }
        else {
            return false;
        }
    }
}