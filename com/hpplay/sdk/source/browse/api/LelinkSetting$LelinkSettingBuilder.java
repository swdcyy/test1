package com.hpplay.sdk.source.browse.api.LelinkSetting$LelinkSettingBuilder;
import java.lang.String;
import java.lang.Object;
import com.hpplay.sdk.source.browse.api.LelinkSetting;

public class LelinkSetting$LelinkSettingBuilder	// class@00065d
{
    public final String appSecret;
    public String appVersion;
    public final String appkey;
    public String userIcon;
    public String userId;
    public String userName;

    public void LelinkSetting$LelinkSettingBuilder(String p0,String p1){
       super();
       this.appkey = p0;
       this.appSecret = p1;
    }
    public void LelinkSetting$LelinkSettingBuilder(String p0,String p1,String p2){
       super();
       this.appkey = p0;
       this.appSecret = p1;
    }
    public LelinkSetting build(){
       return LelinkSetting.newInstance(this);
    }
    public LelinkSetting$LelinkSettingBuilder setAppVersion(String p0){
       this.appVersion = p0;
       return this;
    }
    public void setUserIcon(String p0){
       this.userIcon = p0;
    }
    public LelinkSetting$LelinkSettingBuilder setUserId(String p0){
       this.userId = p0;
       return this;
    }
    public void setUserName(String p0){
       this.userName = p0;
    }
}
