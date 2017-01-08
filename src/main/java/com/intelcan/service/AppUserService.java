package com.intelcan.service;

import com.intelcan.model.AppUser;

/**
 * Created by Arek on 07.01.2017.
 */
public interface AppUserService {

    AppUser loadUserByUsername(String username);

    long post(AppUser appUser);

    AppUser get (long id);

    AppUser patch (AppUser appUser);

    boolean delete(long id);
}
