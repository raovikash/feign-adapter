package com.example.client;


import com.example.config.FeignClientConfig1;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author vikash.yadav@piramal.com
 */
@FeignClient(name = "FeignClient1", url = "http://localhost:8002",
  configuration = FeignClientConfig1.class)
public interface FeignClient1 {
    @GetMapping(value = "/api/v1/practice/test-exception")
    String callApi(@RequestParam("statusCodeApiShouldRespond") int statusCodeApiShouldRespond);
}
