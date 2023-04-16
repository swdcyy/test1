package com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import java.lang.Long;
import java.lang.Exception;
import com.sina.weibo.sdk.b.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;

public class Oauth2AccessToken	// class@000bae
{
    public String mAccessToken;
    public long mExpiresTime;
    public String mRefreshToken;
    public String mScreenName;
    public String mUid;

    public void Oauth2AccessToken(){
       super();
    }
    public static Oauth2AccessToken parseAccessToken(Bundle p0){
       if (p0 != null) {
          try{
             Oauth2AccessToken oauth2Access = new Oauth2AccessToken();
             oauth2Access.setUid(p0.getString("uid"));
             oauth2Access.setScreenName(p0.getString("userName"));
             oauth2Access.setAccessToken(p0.getString("access_token"));
             oauth2Access.setRefreshToken(p0.getString("refresh_token"));
             String str = p0.getString("expires_in");
             try{
                oauth2Access.setExpiresTime((Long.parseLong(str) * 1000));
             }catch(java.lang.Exception e5){
                c.b("Oauth2AccessToken expires parse error: ", e5.getMessage());
             }
             return oauth2Access;
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
          }
          return null;
       }else {
          goto label_004c ;
       }
    }
    public static Oauth2AccessToken parseAccessToken(String p0){
       if (!TextUtils.isEmpty(p0)) {
          try{
             JSONObject jSONObject = new JSONObject(p0);
             Oauth2AccessToken oauth2Access = new Oauth2AccessToken();
             oauth2Access.setUid(jSONObject.optString("uid"));
             oauth2Access.setScreenName(jSONObject.optString("userName"));
             oauth2Access.setAccessToken(jSONObject.optString("access_token"));
             String str = jSONObject.getString("expires_in");
             try{
                oauth2Access.setExpiresTime((Long.parseLong(str) * 1000));
             }catch(java.lang.Exception e1){
                c.b("Oauth2AccessToken expires parse error: ", e1.getMessage());
             }
             oauth2Access.setRefreshToken(jSONObject.optString("refresh_token"));
             return oauth2Access;
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
          }
          return null;
       }else {
          goto label_0055 ;
       }
    }
    public String getAccessToken(){
       return this.mAccessToken;
    }
    public long getExpiresTime(){
       return this.mExpiresTime;
    }
    public String getRefreshToken(){
       return this.mRefreshToken;
    }
    public String getScreenName(){
       return this.mScreenName;
    }
    public String getUid(){
       return this.mUid;
    }
    public boolean isSessionValid(){
       if (!TextUtils.isEmpty(this.mAccessToken) && this.mExpiresTime > 0) {
          return true;
       }
       return false;
    }
    public void setAccessToken(String p0){
       this.mAccessToken = p0;
    }
    public void setExpiresTime(long p0){
       this.mExpiresTime = p0;
    }
    public void setRefreshToken(String p0){
       this.mRefreshToken = p0;
    }
    public void setScreenName(String p0){
       this.mScreenName = p0;
    }
    public void setUid(String p0){
       this.mUid = p0;
    }
}
