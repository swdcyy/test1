package com.meizu.cloud.pushsdk.a.b;
import com.meizu.cloud.pushsdk.a.b$a;
import java.lang.Object;
import java.util.HashMap;
import android.content.Context;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.a.b$1;
import java.util.Map;
import android.graphics.Point;
import com.meizu.cloud.pushsdk.d.f.e;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import android.os.Build;
import android.os.Build$VERSION;
import java.lang.Integer;

public class b	// class@001494
{
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public static final String a = "b";

    public void b(b$a p0){
       super();
       this.b = new HashMap();
       this.c = new HashMap();
       this.d = new HashMap();
       this.d();
       if (b$a.a(p0) != null) {
          this.b(b$a.a(p0));
          this.a(b$a.a(p0));
          this.c(b$a.a(p0));
          this.d(b$a.a(p0));
       }
       DebugLogger.i(b.a, "Subject created successfully.");
       return;
    }
    public void b(b$a p0,b$1 p1){
       super(p0);
    }
    public Map a(){
       return this.b;
    }
    public void a(Context p0){
       Point point = e.d(p0);
       if (point == null) {
          DebugLogger.e(b.a, "screen information not available.");
       }else {
          this.a("ss", point.x, point.y);
       }
       return;
    }
    public final void a(String p0,int p1,int p2){
       this.b.put(p0, p1+"."+p2);
    }
    public final void a(String p0,Object p1){
       if (!TextUtils.isEmpty(p0) && p1 != null) {
          if (p1 instanceof String && (p1).isEmpty()) {
             return;
          }else {
             this.c.put(p0, p1);
          }
       }
       return;
    }
    public final void a(String p0,String p1){
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          this.b.put(p0, p1);
       }
       return;
    }
    public Map b(){
       return this.c;
    }
    public final void b(Context p0){
       this.a("op", e.c(p0));
    }
    public final void b(String p0,Object p1){
       if (!TextUtils.isEmpty(p0) && p1 != null) {
          if (p1 instanceof String && (p1).isEmpty()) {
             return;
          }else {
             this.d.put(p0, p1);
          }
       }
       return;
    }
    public Map c(){
       return this.d;
    }
    public final void c(Context p0){
       this.b("nt", MzSystemUtils.getNetWorkType(p0));
    }
    public final void d(){
       this.a("br", Build.BRAND);
       this.a("dc", Build.MODEL);
       this.a("ot", Build$VERSION.RELEASE);
       this.a("ov", Build.DISPLAY);
       this.a("ll", MzSystemUtils.getCurrentLanguage());
    }
    public final void d(Context p0){
       this.a("pn", p0.getPackageName());
       this.a("pv", MzSystemUtils.getAppVersionName(p0));
       this.a("pvc", Integer.valueOf(MzSystemUtils.getAppVersionCode(p0)));
       this.a("st", Integer.valueOf((TextUtils.isEmpty(MzSystemUtils.findReceiver(p0, "com.meizu.ups.push.intent.MESSAGE", p0.getPackageName())) ^ 0x01)));
    }
}
