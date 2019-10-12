package com.example.cocshopandroid.utils;

import com.example.cocshopandroid.repositories.FAccountService;

public class ClientApi extends BaseApi {
    public FAccountService fAccountService() {
        return this.getService(FAccountService.class, ConfigApi.BASE_URL);
    }
}

