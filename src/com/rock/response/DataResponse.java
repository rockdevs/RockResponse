package com.rock.response;

public class DataResponse<T> extends Response {

    private final T data;

    public DataResponse(T data, boolean success, String message) {
        super(success, message);
        this.data=data;
    }

    public DataResponse(boolean success, T data) {
        super(success);
        this.data = data;
    }

    public DataResponse(boolean success) {
        super(success);
        this.data = null;
    }
}
