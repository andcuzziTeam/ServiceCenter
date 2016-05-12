package com.andcuzzi.service;

import org.json.JSONObject;

/**
 * Created by Administrator on 2016-05-12.
 */
public class ResRequest {

    RequestHeader header;
    JSONObject body;

    public RequestHeader getHeader() {
        return header;
    }

    public void setHeader(RequestHeader header) {
        this.header = header;
    }

    public JSONObject getBody() {
        return body;
    }

    public void setBody(JSONObject body) {
        this.body = body;
    }
}
