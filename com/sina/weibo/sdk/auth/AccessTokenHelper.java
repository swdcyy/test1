package com.sina.weibo.sdk.auth.AccessTokenHelper;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.a.e;
import com.sina.weibo.sdk.auth.AccessTokenHelper$1;
import com.sina.weibo.sdk.net.c;
import com.sina.weibo.sdk.a.b;
import com.sina.weibo.sdk.a.b$a;
import com.sina.weibo.sdk.a.c;
import java.lang.CharSequence;
import android.text.TextUtils;

public class AccessTokenHelper	// class@000bab
{

    public void AccessTokenHelper(){
       super();
    }
    public static void clearAccessToken(Context p0){
       if (p0 == null) {
          return;
       }
       SharedPreferences$Editor uEditor = o.c(p0, "com_weibo_sdk_android", 0).edit();
       uEditor.clear();
       g.a(uEditor);
       return;
    }
    public static Oauth2AccessToken readAccessToken(Context p0){
       if (p0 == null) {
          return null;
       }
       Oauth2AccessToken oauth2Access = new Oauth2AccessToken();
       SharedPreferences sharedPrefer = o.c(p0, "com_weibo_sdk_android", 0);
       oauth2Access.setUid(sharedPrefer.getString("uid", ""));
       oauth2Access.setScreenName(sharedPrefer.getString("userName", ""));
       oauth2Access.setAccessToken(sharedPrefer.getString("access_token", ""));
       oauth2Access.setRefreshToken(sharedPrefer.getString("refresh_token", ""));
       oauth2Access.setExpiresTime(sharedPrefer.getLong("expires_in", 0));
       return oauth2Access;
    }
    public static void refreshAccessToken(Context p0,String p1){
       Oauth2AccessToken oauth2Access = AccessTokenHelper.readAccessToken(p0);
       if (oauth2Access != null) {
          b$a.k().a(new e(p1, oauth2Access, new AccessTokenHelper$1(p0)));
       }
       return;
    }
    public static void writeAccessToken(Context p0,Oauth2AccessToken p1){
       if (p0 == null || (p1 != null && !TextUtils.isEmpty(p1.getAccessToken()))) {
          SharedPreferences$Editor uEditor = o.c(p0, "com_weibo_sdk_android", 0).edit();
          uEditor.putString("uid", p1.getUid());
          uEditor.putString("userName", p1.getScreenName());
          uEditor.putString("access_token", p1.getAccessToken());
          uEditor.putString("refresh_token", p1.getRefreshToken());
          uEditor.putLong("expires_in", p1.getExpiresTime());
          g.a(uEditor);
       }
    label_004a :
       return;
    }
}
