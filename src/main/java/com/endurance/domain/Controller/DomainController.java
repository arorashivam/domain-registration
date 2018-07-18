package com.endurance.domain.Controller;

import com.endurance.domain.Domain;
import com.endurance.domain.Services.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shivam.a on 7/17/18.
 */

@RestController
public class DomainController {

    Domain domain;

    @Autowired
    private DomainService domainService;

    @RequestMapping(value = "/buy", method = RequestMethod.POST)
    public ResponseEntity<String> buyDomain(@RequestParam(value = "domainName") String domainName) {
            if(domainService.getDomain(domainName)) {
                return new ResponseEntity<String>("Purchase successful", HttpStatus.OK);
            }
            else {
                return new ResponseEntity<String>("The domain you are looking for is taken, try some different name", HttpStatus.OK);
            }
    }
}
