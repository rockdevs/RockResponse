package com.rock.response;

import java.time.LocalDateTime;
/**
 * @author Vugar Mammadli
 */
public abstract class Response {

    private final boolean success;

    private String message;

    private LocalDateTime time;

    public Response(boolean success, String message) {
        this(success); // Bool Constractoru cagiri
        this.message = message;
        this.time = LocalDateTime.now();
    }

    public Response(boolean success, String message, LocalDateTime localDateTime) {
        this(success); // Bool Constractoru cagiri
        this.message = message;
        this.time =localDateTime;
    }

    public Response(boolean success) { //bool Constroctor
        this.success = success;
        this.time = LocalDateTime.now();
    }

    public boolean isSuccess(){
        return this.success;
    }

    public String getMessage(){
        return this.message;
    }

    public LocalDateTime getTime() {
        return this.time;
    }
}
