package com.intelcan.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Arek on 07.01.2017.
 */

@RestController
@RequestMapping("protected")
public class ProtectedController {
    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public ResponseEntity<?> getDaHoney() {
        return ResponseEntity.ok("{\"success\":true}");
    }
}
