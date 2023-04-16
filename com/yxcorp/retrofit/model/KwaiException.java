package com.yxcorp.retrofit.model.KwaiException;
import java.lang.Exception;
import njd.a;
import java.lang.String;
import java.lang.StringBuilder;

public class KwaiException extends Exception	// class@000976
{
    public final int mErrorCode;
    public final String mErrorMessage;
    public final a mResponse;

    public void KwaiException(a p0){
       super();
       this.mResponse = p0;
       this.mErrorCode = p0.b();
       this.mErrorMessage = p0.c();
    }
    public int getErrorCode(){
       return this.mErrorCode;
    }
    public String getMessage(){
       return this.mErrorMessage;
    }
    public String toString(){
       return "KwaiException{errorCode="+this.mErrorCode+", errorMessage="+this.mErrorMessage+"}";
    }
}
