package com.vivo.push.d.z;
import com.vivo.push.l;
import com.vivo.push.o;
import com.vivo.push.sdk.PushMessageCallback;
import java.security.PublicKey;
import java.lang.String;
import com.vivo.push.e;
import com.vivo.push.util.p;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import android.util.Base64;
import com.vivo.push.util.u;
import android.content.Context;
import java.lang.Exception;
import android.os.Build$VERSION;
import java.lang.Object;
import android.app.NotificationManager;
import android.app.NotificationChannel;

public abstract class z extends l	// class@00107a
{
    public PushMessageCallback b;

    public void z(o p0){
       super(p0);
    }
    public final void a(PushMessageCallback p0){
       this.b = p0;
    }
    public final boolean a(PublicKey p0,String p1,String p2){
       if (!e.a().d()) {
          p.d("OnVerifyCallBackCommand", "vertify is not support , vertify is ignore");
          return true;
       }else if(p0 == null){
          p.d("OnVerifyCallBackCommand", "vertify key is null");
          return false;
       }else if(TextUtils.isEmpty(p1)){
          p.d("OnVerifyCallBackCommand", "contentTag is null");
          return false;
       }else if(!TextUtils.isEmpty(p2)){
          try{
             p.d("OnVerifyCallBackCommand", p1.hashCode()+" = "+p2);
             if (u.a(p1.getBytes("UTF-8"), p0, Base64.decode(p2, 2))) {
                p.d("OnVerifyCallBackCommand", "vertify id is success");
                return true;
             }else {
                p.d("OnVerifyCallBackCommand", "vertify fail srcDigest is ".concat(p1));
                p.c(this.a, "vertify fail srcDigest is ".concat(p1));
                return false;
             }
          }catch(java.lang.Exception e7){
             e7.printStackTrace();
             p.d("OnVerifyCallBackCommand", "vertify exception");
             return false;
          }
       }else {
          p.d("OnVerifyCallBackCommand", "vertify id is null");
          return false;
       }
    }
    public final int b(){
       NotificationChannel notification;
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 24) {
          NotificationManager systemServic = this.a.getSystemService("notification");
          if (systemServic != null && !systemServic.areNotificationsEnabled()) {
             return 2104;
          }else if(sDK_INT >= 26 && systemServic != null){
             try{
                notification = systemServic.getNotificationChannel("vivo_push_channel");
                if (notification != null && !notification.getImportance()) {
                   return 2121;
                }
             }catch(java.lang.Exception e0){
                p.b("OnVerifyCallBackCommand", "判断通知通道出现系统错误");
             }
          }
       }
    }
}
