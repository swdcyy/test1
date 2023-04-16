package com.yxcorp.gifshow.encode.EncodeException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;

public class EncodeException extends Exception	// class@000cff
{
    public int mErrorCode;
    public String mErrorMsg;

    public void EncodeException(int p0,String p1){
       super(p1);
       this.mErrorCode = p0;
       this.mErrorMsg = p1;
    }
    public void EncodeException(Throwable p0){
       super(p0);
    }
    public int getErrorCode(){
       return this.mErrorCode;
    }
    public String getErrorMsg(){
       return this.mErrorMsg;
    }
    public void setErrorCode(int p0){
       this.mErrorCode = p0;
    }
    public void setErrorMsg(String p0){
       this.mErrorMsg = p0;
    }
}
