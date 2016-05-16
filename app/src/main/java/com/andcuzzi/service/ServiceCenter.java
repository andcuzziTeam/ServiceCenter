package com.andcuzzi.service;

/**
 * Created by Administrator on 2016-05-12.
 */
public interface ServiceCenter {

    public ResResponse start(ResRequest request);

    public ResResponse asyncStart(ResRequest request, ResResponseListener listener);
}

