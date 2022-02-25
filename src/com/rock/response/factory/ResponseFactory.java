package com.rock.response.factory;


import com.rock.response.error.ErrorDataResponse;
import com.rock.response.error.ErrorResponse;
import com.rock.response.success.SuccessDataResponse;
import com.rock.response.success.SuccessResponse;
/**
 * @author Vugar Mammadli
 */
public class ResponseFactory<T> extends AbstractResponseFactory<T> {

    @Override
    public SuccessResponse factorySuccessResult(String message) {
        return new SuccessResponse(message);
    }

    @Override
    public ErrorResponse factoryErrorResult(String message) {
        return new ErrorResponse(message);
    }

    @Override
    public SuccessDataResponse<T> factorySuccessDataResult(T data, String message) {
        return new SuccessDataResponse<T>(data,message);
    }

    @Override
    public ErrorDataResponse<T> factoryErrorDataResult(String message) {
        return new ErrorDataResponse<T>(message);
    }

    @Override
    public ErrorDataResponse<T> factoryErrorDataResult(T data, String message) {
        return new ErrorDataResponse<T>(data,message);
    }


}