package com.example.controller;

import com.example.client.FeignClient1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vikash.yadav@piramal.com
 */
@RestController
@Slf4j
public class FeignAdapterTestController {
    @Autowired
    private FeignClient1 feignClient1;
    
    @GetMapping("/test-feign-exception")
    public ResponseEntity<String> fetchData(@RequestParam("statusCodeDownstreamShouldRespond") int statusCodeDownstreamShouldRespond) {
        String value = feignClient1.callApi(statusCodeDownstreamShouldRespond);
        return ResponseEntity.ok(value);
    }
}
