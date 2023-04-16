package com.yxcorp.retrofit.model.RetrofitException;
import java.io.IOException;
import java.lang.Exception;
import okhttp3.Request;
import java.lang.String;
import java.lang.Throwable;

public class RetrofitException extends IOException	// class@000979
{
    public final Exception mCause;
    public final String mExpiresTime;
    public final Request mRequest;
    public final int mResponseCode;

    public void RetrofitException(Exception p0,Request p1,int p2,String p3){
       super(p0);
       this.mRequest = p1;
       this.mCause = p0;
       this.mResponseCode = p2;
       this.mExpiresTime = p3;
    }
    public synchronized Throwable getCause(){
       return this.mCause;
    }
}
