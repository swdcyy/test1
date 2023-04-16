package com.yxcorp.gifshow.commercial.api.AdSdkException;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.String;

public final class AdSdkException extends Exception	// class@00111a
{
    public final int errorCode;

    public void AdSdkException(int p0){
       super("´íÎóÂë£º"+p0);
       this.errorCode = p0;
    }
    public final int getErrorCode(){
       return this.errorCode;
    }
}
