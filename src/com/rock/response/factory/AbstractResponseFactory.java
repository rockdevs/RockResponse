package com.rock.response.factory;


import com.rock.response.error.ErrorDataResponse;
import com.rock.response.error.ErrorResponse;
import com.rock.response.success.SuccessDataResponse;
import com.rock.response.success.SuccessResponse;
/**
 * @author Vugar Mammadli
 */
public abstract class AbstractResponseFactory<T> {

    public abstract SuccessResponse factorySuccessResult(String message);

    public abstract SuccessDataResponse<T> factorySuccessDataResult(T data, String message);


    public abstract ErrorResponse factoryErrorResult(String message);

    public abstract ErrorDataResponse<T> factoryErrorDataResult(String message);

    public abstract ErrorDataResponse<T> factoryErrorDataResult(T data, String message);

}