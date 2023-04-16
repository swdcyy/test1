package com.xiaomi.push.service.h0;
import com.xiaomi.push.id;
import com.xiaomi.push.ii;
import com.xiaomi.push.is;
import com.xiaomi.push.i;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.SharedPreferences;
import oe6.o;
import android.util.Base64;
import com.xiaomi.push.service.o0;
import com.xiaomi.push.service.k$c;
import com.xiaomi.push.service.k;
import rs8.c;
import java.lang.Throwable;
import android.content.SharedPreferences$Editor;
import oe6.g;
import ws8.m0;
import ws8.a6;

public class h0	// class@00116f
{

    public static ii a(id p0){
       byte[] uobyteArray = p0.a();
       try{
          ii oii = new ii();
          i.c(oii, uobyteArray);
          return oii;
       }catch(com.xiaomi.push.ix e0){
          return null;
       }
    }
    public static void b(Context p0,Intent p1){
       String stringExtra = p1.getStringExtra("ext_fcm_container_buffer");
       String stringExtra1 = p1.getStringExtra("mipush_app_package");
       if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra1)) {
          byte[] uobyteArray = h0.d(Base64.decode(stringExtra, 2), o.c(p0, "mipush_apps_scrt", 0).getString(stringExtra1, null));
          if (uobyteArray != null) {
             k.q(p0, o0.d(uobyteArray), uobyteArray);
          }else {
             c.l("notify fcm notification error £ºdencrypt failed");
          }
       }
       return;
    }
    public static void c(Context p0,String p1,String p2){
       if (p0 == null || (!TextUtils.isEmpty(p1) && !TextUtils.isEmpty(p2))) {
          g.a(o.c(p0, "mipush_apps_scrt", 0).edit().putString(p1, p2));
       }
    label_0021 :
       return;
    }
    public static byte[] d(byte[] p0,String p1){
       if (TextUtils.isEmpty(p1)) {
          c.l("secret is empty, return null");
          return null;
       }else {
          byte[] uobyteArray = m0.b(p1);
          try{
             return a6.b(uobyteArray, p0);
          }catch(java.lang.Exception e2){
             c.n("dencryption error. ", e2);
             return v1;
          }
       }
    }
}
