package com.pinfy.controller.v1;

import com.pinfy.model.dto.VersionDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("/api/auth/version")
public class VersionController {

    @Value("${spring.application.version}")
    private static String version;

    @GetMapping
    public Mono<ResponseEntity<?>> getVersion() {
        return Mono.just(ResponseEntity.ok(VersionDTO.builder()
                .version(version)
                .build()));
    }
}
