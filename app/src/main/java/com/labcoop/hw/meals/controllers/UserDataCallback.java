package com.labcoop.hw.meals.controllers;

import com.labcoop.hw.meals.models.User;

/**
 * Created by holcz on 11/03/16.
 */
public interface UserDataCallback {
    void onUserDataAvailable(User user);
}
