package com.rock.response.success;


import com.rock.response.Response;

/**
 * @author Vugar Mammadli
 */
public final class SuccessResponse extends Response {
    public SuccessResponse() {
        super(true);
    }

    public SuccessResponse(String message) {
        super(true,message);
    }

    public SuccessResponse(String message,String redirect) {
        super(true,message,redirect);
    }
}