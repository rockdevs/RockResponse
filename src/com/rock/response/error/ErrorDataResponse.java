package com.rock.response.error;


import com.rock.response.DataResponse;
/**
 * @author Vugar Mammadli
 */
public  final class ErrorDataResponse<T> extends DataResponse<T> {
    public ErrorDataResponse(T data, String message) {
        super(data, false, message);
    }

    public ErrorDataResponse(T data, String message, Exception exception) {
        super(data, false, message);
    }

    public ErrorDataResponse(T data){
        super(false,data);
    }

    public ErrorDataResponse(String message){
        super(null,false,message);
    }

    public ErrorDataResponse(String message,String redirect){super(null,false,message,redirect);}

    public ErrorDataResponse(){
        super(false,null);
    }
}