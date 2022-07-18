package com.rock.response.error;

import com.rock.response.Response;
/**
 * @author Vugar Mammadli
 */
public final class ErrorResponse extends Response  {

    public ErrorResponse(){
        super(false);
    }
    public ErrorResponse(String message){
        super(false,message);
    }
    public ErrorResponse(String message,String redirect){super(false,message,redirect);}
}