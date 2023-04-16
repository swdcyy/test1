package com.yxcorp.image.network.OkHttpException;
import java.lang.Exception;
import okhttp3.Response;
import java.lang.String;

public class OkHttpException extends Exception	// class@001a1c
{
    public final int code;
    public final String message;

    public void OkHttpException(Response p0){
       super();
       this.code = p0.code();
       this.message = p0.message();
    }
    public int code(){
       return this.code;
    }
    public String message(){
       return this.message;
    }
}
