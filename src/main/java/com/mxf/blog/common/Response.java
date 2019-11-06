package com.mxf.blog.common;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {
    private Integer returnCode;
    private String description;
    private T result;

    public Response() {
        this.returnCode = 0;
    }

    public Response(Integer returnCode) {
        this(returnCode, (String)null);
    }

    public Response(Integer returnCode, String description) {
        this(returnCode, description, null);
    }

    public Response(Integer returnCode, String description, T result) {
        this.returnCode = 0;
        this.returnCode = returnCode;
        this.description = description;
        this.result = result;
    }

    public Integer getReturnCode() {
        return this.returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T data) {
        this.result = data;
    }
}

