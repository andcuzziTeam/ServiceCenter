package com.andcuzzi.service;

/**
 * Created by Administrator on 2016-05-12.
 */
public class RequestHeader {


    private String host;
    private String uri;
    private RequestMethod method;

    public RequestHeader(){ }

    public RequestHeader(String host, String uri, RequestMethod method) {
        this.host = host;
        this.uri = uri;
        this.method = method;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public RequestMethod getMethod() {
        return method;
    }

    public void setMethod(RequestMethod method) {
        this.method = method;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}


