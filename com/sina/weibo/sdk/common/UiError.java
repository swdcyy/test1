package com.sina.weibo.sdk.common.UiError;
import java.lang.String;
import java.lang.Object;

public class UiError	// class@000bb9
{
    public int errorCode;
    public String errorDetail;
    public String errorMessage;

    public void UiError(int p0,String p1,String p2){
       super();
       this.errorCode = p0;
       this.errorMessage = p1;
       this.errorDetail = p2;
    }
}
