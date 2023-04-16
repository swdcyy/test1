package com.heytap.mcssdk.utils.e;
import java.lang.Object;
import com.heytap.mcssdk.PushService;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import com.heytap.mcssdk.utils.e$1;
import com.heytap.mcssdk.utils.e$a;
import com.heytap.mcssdk.utils.a;
import java.lang.StringBuilder;
import com.heytap.mcssdk.utils.d;
import android.os.Build$VERSION;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.heytap.mcssdk.constant.a;
import java.lang.Long;

public class e	// class@000545
{
    public Context f;
    public SharedPreferences g;
    public Object h;

    public void e(){
       super();
       this.h = new Object();
       Context context = PushService.getInstance().getContext();
       if (context != null) {
          this.f = this.a(context);
       }
       e tf = this.f;
       if (tf != null) {
          this.g = o.c(tf, "shared_msg_sdk", 0);
       }
       return;
    }
    public void e(e$1 p0){
       super();
    }
    public static e f(){
       return e$a.a;
    }
    public int a(String p0,int p1){
       SharedPreferences sharedPrefer = this.g();
       if (sharedPrefer != null) {
          return sharedPrefer.getInt(p0, p1);
       }
       return p1;
    }
    public long a(String p0,long p1){
       SharedPreferences sharedPrefer = this.g();
       if (sharedPrefer != null) {
          return sharedPrefer.getLong(p0, p1);
       }
       return p1;
    }
    public final Context a(Context p0){
       boolean b = a.a();
       d.b("fbeVersion is "+b);
       if (b && Build$VERSION.SDK_INT >= 24) {
          return p0.createDeviceProtectedStorageContext();
       }
       return p0.getApplicationContext();
    }
    public void a(String p0){
       SharedPreferences sharedPrefer = this.g();
       if (sharedPrefer != null) {
          g.b(sharedPrefer.edit().putString("lastUploadInfoUniqueID", p0));
       }
       return;
    }
    public void a(boolean p0){
       SharedPreferences sharedPrefer = this.g();
       if (sharedPrefer != null) {
          g.b(sharedPrefer.edit().putBoolean("hasDefaultChannelCreated", p0));
       }
       return;
    }
    public boolean a(){
       SharedPreferences sharedPrefer = this.g();
       boolean b = false;
       if (sharedPrefer != null) {
          b = sharedPrefer.getBoolean("hasDefaultChannelCreated", b);
       }
       return b;
    }
    public void b(){
       SharedPreferences sharedPrefer = this.g();
       if (sharedPrefer != null) {
          g.b(sharedPrefer.edit().putString("lastUpLoadInfoSDKVersionName", "3.0.0"));
       }
       return;
    }
    public void b(String p0){
       SharedPreferences sharedPrefer = this.g();
       if (sharedPrefer != null) {
          g.b(sharedPrefer.edit().putString("decryptTag", p0));
       }
       return;
    }
    public void b(String p0,int p1){
       SharedPreferences sharedPrefer = this.g();
       if (sharedPrefer != null) {
          SharedPreferences$Editor uEditor = sharedPrefer.edit();
          uEditor.putInt(p0, p1);
          g.a(uEditor);
       }
       return;
    }
    public void b(String p0,long p1){
       SharedPreferences sharedPrefer = this.g();
       if (sharedPrefer != null) {
          SharedPreferences$Editor uEditor = sharedPrefer.edit();
          uEditor.putLong(p0, p1);
          g.a(uEditor);
       }
       return;
    }
    public int c(String p0){
       SharedPreferences sharedPrefer = this.g();
       if (sharedPrefer != null) {
          return sharedPrefer.getInt(p0, 0);
       }
       return 0;
    }
    public String c(){
       SharedPreferences sharedPrefer = this.g();
       String str = "";
       if (sharedPrefer != null) {
          str = sharedPrefer.getString("lastUploadInfoUniqueID", str);
       }
       return str;
    }
    public long d(String p0){
       SharedPreferences sharedPrefer = this.g();
       if (sharedPrefer != null) {
          return sharedPrefer.getLong(p0, a.b.longValue());
       }
       return a.b.longValue();
    }
    public String d(){
       SharedPreferences sharedPrefer = this.g();
       String str = "";
       if (sharedPrefer != null) {
          str = sharedPrefer.getString("lastUpLoadInfoSDKVersionName", str);
       }
       return str;
    }
    public String e(){
       SharedPreferences sharedPrefer = this.g();
       String str = "DES";
       if (sharedPrefer != null) {
          str = sharedPrefer.getString("decryptTag", str);
       }
       return str;
    }
    public final SharedPreferences g(){
       e tg = this.g;
       if (tg != null) {
          return tg;
       }
       tg = this.h;
       _monitor_enter(tg);
       e tg1 = this.g;
       if (tg1 == null) {
          e tf = this.f;
          if (tf != null) {
             SharedPreferences sharedPrefer = o.c(tf, "shared_msg_sdk", 0);
             this.g = sharedPrefer;
             _monitor_exit(tg);
             return sharedPrefer;
          }
       }
       _monitor_exit(tg);
       return tg1;
    }
}
