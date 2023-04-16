package com.hpplay.sdk.source.browse.api.LelinkSetting;
import com.hpplay.sdk.source.browse.api.LelinkSetting$LelinkSettingBuilder;
import java.lang.Object;
import com.hpplay.sdk.source.browse.api.LelinkSetting$ConfigChangeListener;
import java.util.HashSet;
import java.util.Set;
import java.lang.String;
import java.util.Iterator;

public class LelinkSetting	// class@00065e
{
    public String appKey;
    public String appSecret;
    public String appVersion;
    public Set mListeners;
    public String userIcon;
    public String userId;
    public String userName;
    public static LelinkSetting sInstance;

    public void LelinkSetting(LelinkSetting$LelinkSettingBuilder p0){
       super();
       this.appKey = p0.appkey;
       this.appSecret = p0.appSecret;
       this.appVersion = p0.appVersion;
       this.userId = p0.userId;
       this.userName = p0.userName;
       this.userIcon = p0.userIcon;
    }
    public static LelinkSetting getInstance(){
       return LelinkSetting.sInstance;
    }
    public static LelinkSetting newInstance(LelinkSetting$LelinkSettingBuilder p0){
       if (LelinkSetting.sInstance == null) {
          _monitor_enter(LelinkSetting.class);
          if (LelinkSetting.sInstance == null) {
             LelinkSetting.sInstance = new LelinkSetting(p0);
          }
          _monitor_exit(LelinkSetting.class);
       }
       return LelinkSetting.sInstance;
    }
    public void addConfigChangeListener(LelinkSetting$ConfigChangeListener p0){
       if (this.mListeners == null) {
          this.mListeners = new HashSet();
       }
       this.mListeners.add(p0);
       return;
    }
    public String getAppKey(){
       return this.appKey;
    }
    public String getAppSecret(){
       return this.appSecret;
    }
    public String getAppVersion(){
       return this.appVersion;
    }
    public String getUserIcon(){
       return this.userIcon;
    }
    public String getUserId(){
       return this.userId;
    }
    public String getUserName(){
       return this.userName;
    }
    public void setUserIcon(String p0){
       this.userIcon = p0;
    }
    public void setUserId(String p0){
       this.userId = p0;
       LelinkSetting tmListeners = this.mListeners;
       if (tmListeners != null) {
          Iterator iterator = tmListeners.iterator();
          while (iterator.hasNext()) {
             iterator.next().onUserIdChange();
          }
       }
       return;
    }
    public void setUserName(String p0){
       this.userName = p0;
    }
}
