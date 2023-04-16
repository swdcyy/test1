package com.kwai.feature.api.social.im.jsbridge.model.ErrorInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public final class ErrorInfo implements Serializable	// class@0010da
{
    public final int errorCode;
    public final String errorMsg;

    public void ErrorInfo(int p0,String p1){
       super();
       this.errorCode = p0;
       this.errorMsg = p1;
    }
}
