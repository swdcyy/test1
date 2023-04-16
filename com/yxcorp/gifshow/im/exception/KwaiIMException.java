package com.yxcorp.gifshow.im.exception.KwaiIMException;
import java.lang.Exception;
import java.lang.String;
import dp6.i0;

public class KwaiIMException extends Exception	// class@001921
{
    public final int mErrorCode;
    public final String mErrorMessage;
    public final i0 mResponse;

    public void KwaiIMException(int p0,String p1){
       super();
       i0 oi0 = new i0();
       this.mResponse = oi0;
       oi0.b(p0);
       oi0.a(p1);
       this.mErrorCode = p0;
       this.mErrorMessage = p1;
    }
    public void KwaiIMException(i0 p0){
       super();
       this.mResponse = p0;
       this.mErrorCode = p0.a;
       this.mErrorMessage = p0.b;
    }
    public int getErrorCode(){
       return this.mErrorCode;
    }
    public String getMessage(){
       return this.mErrorMessage;
    }
}
