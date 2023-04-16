package com.yxcorp.gifshow.social.bridge.tools.LoadImageException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class LoadImageException extends RuntimeException	// class@001d63
{
    public final int errorCode;
    public final String errorMsg;
    public final String url;

    public void LoadImageException(int p0,String p1,String p2){
       a.p(p1, "url");
       a.p(p2, "errorMsg");
       super(p1+" load failure:"+p2);
       this.errorCode = p0;
       this.url = p1;
       this.errorMsg = p2;
    }
    public final int getErrorCode(){
       return this.errorCode;
    }
    public final String getErrorMsg(){
       return this.errorMsg;
    }
    public final String getUrl(){
       return this.url;
    }
}
