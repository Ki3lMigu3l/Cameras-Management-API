package com.github.ki3lmigu3l.cameraAPI.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/cameras")
public class CameraApiController {
    private final Set<String> blacklist = new HashSet<>();

    private static final String PROVIDER_KEY = "pk_Abc123Def456";
    private static final String SECRET_KEY = "sk_Xyz789Ghi012";

}
