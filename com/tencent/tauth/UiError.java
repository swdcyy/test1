package com.tencent.tauth.UiError;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;

public class UiError	// class@000f91
{
    public int errorCode;
    public String errorDetail;
    public String errorMessage;

    public void UiError(int p0,String p1,String p2){
       super();
       this.errorMessage = p1;
       this.errorCode = p0;
       this.errorDetail = p2;
    }
    public String toString(){
       return "errorCode: "+this.errorCode+", errorMsg: "+this.errorMessage+", errorDetail: "+this.errorDetail;
    }
}
