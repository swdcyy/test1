package com.sina.weibo.sdk.openapi.SdkConfig;
import java.lang.Object;

public class SdkConfig	// class@000bc9
{
    public boolean userAgree;
    public boolean userAgreeWifiInfo;

    public void SdkConfig(){
       super();
    }
    public boolean isUserAgree(){
       return this.userAgree;
    }
    public boolean isUserAgreeWifiInfo(){
       return this.userAgreeWifiInfo;
    }
    public void setUserAgree(boolean p0){
       this.userAgree = p0;
    }
    public void setUserAgreeWifiInfo(boolean p0){
       this.userAgreeWifiInfo = p0;
    }
}
