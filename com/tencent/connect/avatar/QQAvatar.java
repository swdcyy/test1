package com.tencent.connect.avatar.QQAvatar;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.auth.QQToken;
import android.app.Activity;
import android.content.Intent;
import com.tencent.connect.avatar.ImageActivity;
import android.content.Context;
import java.lang.Class;
import android.os.Bundle;
import java.lang.String;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.tauth.IUiListener;
import java.lang.Object;
import com.tencent.open.utils.f;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.Exception;
import android.net.Uri;
import com.tencent.open.b.e;
import com.tencent.open.utils.i;
import java.lang.CharSequence;
import android.widget.Toast;
import com.tencent.open.utils.k;
import java.lang.StringBuffer;
import android.text.TextUtils;
import java.lang.StringBuilder;
import android.util.Base64;
import java.lang.Throwable;
import com.tencent.open.log.SLog;

public class QQAvatar extends BaseApi	// class@000e39
{
    public IUiListener a;

    public void QQAvatar(QQToken p0){
       super(p0);
    }
    public final Intent a(Activity p0){
       Intent intent = new Intent();
       intent.setClass(p0, ImageActivity.class);
       return intent;
    }
    public final void a(Activity p0,Bundle p1,Intent p2){
       this.a(p1);
       p2.putExtra("key_action", "action_avatar");
       p2.putExtra("key_params", p1);
       UIListenerManager.getInstance().setListenerWithRequestcode(0x2b5e, this.a);
       this.a(p0, p2, 0x2b5e);
    }
    public final void a(Bundle p0){
       String str = "openmobile_android";
       String str1 = "pf";
       BaseApi tc = this.c;
       if (tc != null) {
          p0.putString("appid", tc.getAppId());
          if (this.c.isSessionValid()) {
             p0.putString("keystr", this.c.getAccessToken());
             p0.putString("keytype", "0x80");
          }
          String openId = this.c.getOpenId();
          if (openId != null) {
             p0.putString("hopenid", openId);
          }
          openId = "platform";
          String str2 = "androidqz";
          try{
             p0.putString(openId, str2);
             p0.putString(str1, o.c(f.a(), "pfStore", 0).getString(str1, str));
          }catch(java.lang.Exception e2){
             e2.printStackTrace();
             p0.putString(str1, str);
          }
       }
    }
    public void setAvatar(Activity p0,Uri p1,IUiListener p2,int p3){
       QQAvatar qQAvatar = this;
       QQAvatar a = qQAvatar.a;
       if (a != null) {
          a.onCancel();
       }
       qQAvatar.a = p2;
       Bundle uBundle = new Bundle();
       uBundle.putString("picture", p1.toString());
       uBundle.putInt("exitAnim", p3);
       uBundle.putString("appid", qQAvatar.c.getAppId());
       uBundle.putString("access_token", qQAvatar.c.getAccessToken());
       uBundle.putLong("expires_in", qQAvatar.c.getExpireTimeInSecond());
       uBundle.putString("openid", qQAvatar.c.getOpenId());
       Intent intent = this.a(p0);
       if (qQAvatar.a(intent)) {
          qQAvatar.a(p0, uBundle, intent);
          e.a().a(qQAvatar.c.getOpenId(), qQAvatar.c.getAppId(), "ANDROIDSDK.SETAVATAR.XX", "12", "18", "0");
       }else {
          e.a().a(qQAvatar.c.getOpenId(), qQAvatar.c.getAppId(), "ANDROIDSDK.SETAVATAR.XX", "12", "18", "1");
       }
       return;
    }
    public void setAvatarByQQ(Activity p0,Uri p1,IUiListener p2){
       Intent intent;
       QQAvatar ta = this.a;
       if (ta != null) {
          ta.onCancel();
       }
       this.a = p2;
       int i = 1;
       if (!i.b(p0)) {
          Toast.makeText(p0.getApplicationContext(), "当前手机未安装QQ，请安装最新版QQ后再试。", i).show();
          return;
       }else if(i.c(p0, "8.0.0") < 0){
          Toast.makeText(p0.getApplicationContext(), "当前手机QQ版本过低，不支持设置头像功能。", i).show();
          return;
       }else {
          String str = k.a(p0);
          StringBuffer str1 = "mqqapi://profile/sdk_avatar_edit?";
          if (!TextUtils.isEmpty(str)) {
             int i1 = 20;
             if (str.length() > i1) {
                str = str.substring(0, i1)+"...";
             }
             str1 = str1+"&app_name="+Base64.encodeToString(k.j(str), 2);
          }
          str = this.c.getAppId();
          String openId = this.c.getOpenId();
          if (!TextUtils.isEmpty(str)) {
             str1 = str1+"&share_id="+str;
          }
          if (!TextUtils.isEmpty(openId)) {
             str1 = str1+"&open_id="+Base64.encodeToString(k.j(openId), 2);
          }
          str = k.b(p0, p1);
          if (!TextUtils.isEmpty(str)) {
             try{
                p0.grantUriPermission("com.tencent.mobileqq", p1, 3);
                str1 = str1+"&set_uri="+Base64.encodeToString(k.j(p1.toString()), 2);
             }catch(java.lang.Exception e9){
                SLog.e("QQAvatar", "Exception", e9);
             }
          }
       }
    }
    public void setDynamicAvatar(Activity p0,Uri p1,IUiListener p2){
       Intent intent;
       QQAvatar ta = this.a;
       if (ta != null) {
          ta.onCancel();
       }
       this.a = p2;
       int i = 1;
       if (!i.b(p0)) {
          Toast.makeText(p0.getApplicationContext(), "当前手机未安装QQ，请安装最新版QQ后再试。", i).show();
          return;
       }else if(i.c(p0, "8.0.5") < 0){
          Toast.makeText(p0.getApplicationContext(), "当前手机QQ版本过低，不支持设置头像功能。", i).show();
          return;
       }else {
          String str = k.a(p0);
          StringBuffer str1 = "mqqapi://profile/sdk_dynamic_avatar_edit?";
          if (!TextUtils.isEmpty(str)) {
             int i1 = 20;
             if (str.length() > i1) {
                str = str.substring(0, i1)+"...";
             }
             str1 = str1+"&app_name="+Base64.encodeToString(k.j(str), 2);
          }
          str = this.c.getAppId();
          String openId = this.c.getOpenId();
          if (!TextUtils.isEmpty(str)) {
             str1 = str1+"&share_id="+str;
          }
          if (!TextUtils.isEmpty(openId)) {
             str1 = str1+"&open_id="+Base64.encodeToString(k.j(openId), 2);
          }
          str = k.b(p0, p1);
          if (!TextUtils.isEmpty(str)) {
             try{
                p0.grantUriPermission("com.tencent.mobileqq", p1, 3);
                str1 = str1+"&video_uri="+Base64.encodeToString(k.j(p1.toString()), 2);
             }catch(java.lang.Exception e9){
                SLog.e("QQAvatar", "Exception", e9);
             }
          }
       }
    }
}
