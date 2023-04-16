package com.meizu.cloud.pushsdk.d.a;
import java.lang.Object;
import android.content.Context;
import com.meizu.cloud.pushsdk.c.c.a;
import com.meizu.cloud.pushsdk.d.b.f;
import com.meizu.cloud.pushsdk.d.e.a;
import com.meizu.cloud.pushsdk.d.b.a;
import com.meizu.cloud.pushsdk.d.e.c;
import java.lang.StringBuilder;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.d.e.a.a;
import com.meizu.cloud.pushsdk.d.e.a$a;
import java.lang.Class;
import com.meizu.cloud.pushsdk.d.f.b;
import java.lang.Boolean;
import com.meizu.cloud.pushsdk.d.e.c$a;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import com.meizu.cloud.pushsdk.d.a$1;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.meizu.cloud.pushsdk.d.b.a.a;
import com.meizu.cloud.pushsdk.d.b.a$a;
import com.meizu.cloud.pushsdk.d.b.b;

public class a	// class@001504
{
    public static a a;
    public static BroadcastReceiver b;

    public void a(){
       super();
    }
    public static a a(Context p0,a p1,f p2){
       if (a.a == null) {
          _monitor_enter(a.class);
          if (a.a == null) {
             p1 = a.a(a.b(p0, p1, p2), null, p0);
             a.a = p1;
             a.a(p0, p1);
          }
          _monitor_exit(a.class);
       }
       return a.a;
    }
    public static a a(Context p0,boolean p1){
       if (a.a == null) {
          a uoa = a.class;
          _monitor_enter(uoa);
          if (a.a == null) {
             a.a = a.a(a.b(p0, null, null), null, p0);
          }
          _monitor_exit(uoa);
       }
       DebugLogger.i("PushAndroidTracker", "can upload subject "+p1);
       if (p1) {
          a.a.a(a.a(p0));
       }
       return a.a;
    }
    public static a a(a p0,c p1,Context p2){
       a$a uoa = new a$a(p0, "PushAndroidTracker", p2.getPackageCodePath(), p2, a.class);
       return new a(v7.a(b.d).a(Boolean.FALSE).a(p1).a(4));
    }
    public static c a(Context p0){
       return new c$a().a(p0).a();
    }
    public static String a(){
       String str = (MzSystemUtils.isOverseas())? "push-statics.in.meizu.com": "push-statics.meizu.com";
       DebugLogger.e("QuickTracker", "current statics domain is "+str);
       return str;
    }
    public static void a(Context p0,a p1){
       if (a.b != null) {
          return;
       }
       a.b = new a$1(p1);
       UniversalReceiver.e(p0, a.b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
       return;
    }
    public static a b(Context p0,a p1,f p2){
       b b = b.b;
       a$a uoa = new a$a(a.a(), p0, a.class).a(p2).a(p1).a(1).a(b);
       return new a(uoa.b(b.a()).c(2));
    }
}
