package com.kuaishou.webkit.internal.ErrorResult;
import java.lang.String;
import java.lang.Object;

public class ErrorResult	// class@00130f
{
    public final String mError;
    public final int mErrorCode;
    public final boolean mSucceed;

    public void ErrorResult(boolean p0,String p1,int p2){
       super();
       this.mSucceed = p0;
       this.mError = p1;
       this.mErrorCode = p2;
    }
    public static ErrorResult makeError(String p0){
       return new ErrorResult(false, p0, -1);
    }
    public static ErrorResult makeError(String p0,int p1){
       return new ErrorResult(false, p0, p1);
    }
    public static ErrorResult makeSucceed(){
       return new ErrorResult(true, null, 0);
    }
    public String error(){
       return this.mError;
    }
    public int errorCode(){
       return this.mErrorCode;
    }
    public boolean succeed(){
       return this.mSucceed;
    }
}
