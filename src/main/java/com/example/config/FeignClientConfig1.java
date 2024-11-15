package com.example.config;

import feign.Request;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * @author vikash.yadav@piramal.com
 */
public class FeignClientConfig1 {
    @Value("${fcs.client.read.timeout.ms}")
    private Long readTimeoutMs;
    
    @Bean
    public Request.Options requestOptions() {
        return new Request.Options(10000, TimeUnit.MILLISECONDS, readTimeoutMs, TimeUnit.MILLISECONDS, true);
    }
}
