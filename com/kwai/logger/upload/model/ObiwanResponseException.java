package com.kwai.logger.upload.model.ObiwanResponseException;
import java.lang.Exception;
import v87.b;
import java.lang.String;

public class ObiwanResponseException extends Exception	// class@000ee3
{
    public final int mErrorCode;
    public final String mErrorMessage;
    public final b mResponse;

    public void ObiwanResponseException(b p0){
       super();
       this.mResponse = p0;
       this.mErrorCode = p0.b();
       this.mErrorMessage = p0.c;
    }
    public int getErrorCode(){
       return this.mErrorCode;
    }
    public String getMessage(){
       return this.mErrorMessage;
    }
}
