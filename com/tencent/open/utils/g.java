package com.tencent.open.utils.g;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import com.tencent.open.log.SLog;
import org.json.JSONObject;
import java.lang.StringBuilder;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.io.OutputStream;
import java.io.IOException;
import android.os.SystemClock;
import android.os.Build$VERSION;
import android.os.Build;
import com.tencent.open.utils.g$1;
import java.lang.Runnable;
import com.tencent.open.utils.j;
import java.lang.Integer;
import java.lang.Boolean;
import java.io.FileInputStream;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.StringBuffer;

public class g	// class@000f7d
{
    public Context c;
    public String d;
    public JSONObject e;
    public long f;
    public int g;
    public boolean h;
    public static Map a;
    public static String b;

    static {
       g.a = Collections.synchronizedMap(new HashMap());
       g.b = null;
    }
    public void g(Context p0,String p1){
       super();
       this.c = null;
       this.d = null;
       this.e = null;
       this.f = 0;
       this.g = 0;
       this.h = true;
       this.c = p0.getApplicationContext();
       this.d = p1;
       this.a();
       this.b();
    }
    public static int a(g p0,int p1){
       p0.g = p1;
       return p1;
    }
    public static g a(Context p0,String p1){
       Map a = g.a;
       _monitor_enter(a);
       SLog.v("openSDK_LOG.OpenConfig", "getInstance begin");
       if (p1 != null) {
          g.b = p1;
       }
       if (p1 == null) {
          p1 = g.b;
          if (p1 == null) {
             p1 = "0";
          }
       }
       g og = g.a.get(p1);
       if (og == null) {
          og = new g(p0, p1);
          g.a.put(p1, og);
       }
       SLog.v("openSDK_LOG.OpenConfig", "getInstance end");
       _monitor_exit(a);
       return og;
    }
    public static void a(g p0,JSONObject p1){
       p0.a(p1);
    }
    public int a(String p0){
       this.d("get "+p0);
       this.c();
       return this.e.optInt(p0);
    }
    public final void a(){
       String str = this.c("com.tencent.open.config.json");
       try{
          this.e = new JSONObject(str);
       }catch(org.json.JSONException e0){
          this.e = new JSONObject();
       }
       return;
    }
    public final void a(String p0,String p1){
       try{
          if (this.d != null) {
             p0 = p0+"."+this.d;
          }
          OutputStreamWriter outputStream = new OutputStreamWriter(this.c.openFileOutput(p0, 0), Charset.forName("UTF-8"));
          outputStream.write(p1);
          outputStream.flush();
          outputStream.close();
       }catch(java.io.IOException e3){
          e3.printStackTrace();
       }
       return;
    }
    public final void a(JSONObject p0){
       this.d("cgi back, do update");
       this.e = p0;
       this.a("com.tencent.open.config.json", p0.toString());
       this.f = SystemClock.elapsedRealtime();
    }
    public final void b(){
       if (this.g != null) {
          this.d("update thread is running, return");
          return;
       }else {
          this.g = 1;
          HashMap hashMap = new HashMap();
          hashMap.put("appid", this.d);
          hashMap.put("status_os", Build$VERSION.RELEASE);
          hashMap.put("status_machine", Build.MODEL);
          hashMap.put("status_version", Build$VERSION.SDK);
          hashMap.put("sdkv", "3.5.4.lite");
          hashMap.put("sdkp", "a");
          j.a(new g$1(this, hashMap));
          return;
       }
    }
    public boolean b(String p0){
       this.d("get "+p0);
       this.c();
       p0 = this.e.opt(p0);
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0 instanceof Integer) {
          return (p0.equals(Integer.valueOf(b)) ^ 0x01);
       }
       if (p0 instanceof Boolean) {
          return p0.booleanValue();
       }
       return b;
    }
    public final String c(String p0){
       InputStream inputStream;
       BufferedReader uBufferedRea;
       StringBuffer str1;
       String str2;
       String str = "";
       try{
          String str3 = (this.d != null)? p0+"."+this.d: p0;
          inputStream = this.c.openFileInput(str3);
       }catch(java.io.FileNotFoundException e0){
          inputStream = SplitAssetHelper.open(this.c.getAssets(), p0);
       }catch(java.io.IOException e5){
          e5.printStackTrace();
          return e0;
       }
    }
    public final void c(){
       int i = this.e.optInt("Common_frequency");
       if (!i) {
          i = 1;
       }
       if ((SystemClock.elapsedRealtime() - this.f) - (long)(i * 0x36ee80) >= 0) {
          this.b();
       }
       return;
    }
    public final void d(String p0){
       if (this.h != null) {
          SLog.v("openSDK_LOG.OpenConfig", p0+"; appid: "+this.d);
       }
       return;
    }
}
