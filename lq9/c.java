package lq9.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build$VERSION;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.util.Objects;
import android.app.AppOpsManager;
import java.lang.reflect.Method;
import android.os.Binder;
import java.lang.NullPointerException;
import java.lang.Throwable;
import android.util.Log;
import android.content.Intent;
import android.net.Uri;
import com.yxcorp.gifshow.corona.common.monitor.CostDebugView;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.corona.common.monitor.FloatLayoutNew;
import android.util.AttributeSet;
import nsd.u;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager;
import java.lang.Exception;
import android.content.pm.PackageManager;
import java.util.List;
import cq9.a;
import q87.c;

public final class c	// class@002e97
{
    public static final String a = "PageMonitorDebugUtils";
    public static final int b = 24;
    public static FloatLayoutNew c;
    public static CostDebugView d;
    public static boolean e;
    public static final c f;

    static {
       c.f = new c();
    }
    public void c(){
       super();
    }
    public final boolean a(){
       boolean b;
       Application obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT >= 23) {
          b = Settings.canDrawOverlays(a.b());
       }else {
          obj = a.b();
          a.o(obj, "AppEnv.getAppContext\(\)");
          b = this.b(obj, c.b);
       }
       return b;
    }
    public final boolean b(Context p0,int p1){
       Object obj;
       boolean i;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = p0.getSystemService("appops");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.app.AppOpsManager");
       try{
          i = 0;
          Class[] uClassArray = new Class[3];
          Class tYPE = Integer.TYPE;
          uClassArray[i] = tYPE;
          uClassArray[1] = tYPE;
          uClassArray[2] = String.class;
          Object[] objArray = new Object[3];
          objArray[i] = Integer.valueOf(p1);
          objArray[1] = Integer.valueOf(Binder.getCallingUid());
          objArray[2] = p0.getPackageName();
          p0 = AppOpsManager.class.getDeclaredMethod("checkOp", uClassArray).invoke(obj, objArray);
          if (p0 != null) {
             if (!p0.intValue()) {
                i = true;
             }
             return i;
          }else {
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
          }
       }catch(java.lang.Exception e10){
          Log.getStackTraceString(e10);
          return i;
       }
    }
    public final boolean c(Context p0){
       Uri uri;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Intent obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       try{
          obj = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
          String packageName = p0.getPackageName();
          uri = PatchProxy.applyThreeRefs("package", packageName, null, this, c.class, "7");
          if (uri != patchProxyRe) {
          }else {
             String str = null;
             Uri uri1 = Uri.fromParts("package", packageName, str);
             uri = e0;
          }
       }catch(java.lang.NullPointerException e0){
       }
       obj.setData(uri);
       return this.h(p0, obj);
    }
    public final CostDebugView d(){
       return c.d;
    }
    public final boolean e(){
       Intent obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT >= 23) {
          obj = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          Context applicationC = uApplication.getApplicationContext();
          a.o(applicationC, "AppEnv.getAppContext\(\).applicationContext");
          obj.setData(this.f("package:"+applicationC.getPackageName()));
          Application uApplication1 = a.b();
          a.o(uApplication1, "AppEnv.getAppContext\(\)");
          this.h(uApplication1, obj);
          return true;
       }else {
          Application uApplication2 = a.b();
          a.o(uApplication2, "AppEnv.getAppContext\(\)");
          this.c(uApplication2);
          return false;
       }
    }
    public final Uri f(String p0){
       Uri uri;
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          uri = Uri.parse(p0);
       }catch(java.lang.NullPointerException e0){
          uri = null;
       }
       return uri;
    }
    public final void g(){
       FloatLayoutNew c;
       Object obj;
       FloatLayoutNew o;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
          return;
       }
       if (!this.a()) {
          this.e();
          return;
       }else if(c.c == null){
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          FloatLayoutNew uFloatLayout = new FloatLayoutNew(uApplication, null, 0, 6, null);
          c.c = v1;
       }
       if (!c.e) {
          c = c.c;
          if (c != null) {
             obj = PatchProxy.apply(objArray, c, FloatLayoutNew.class, "7");
             if (obj != patchProxyRe) {
                obj.booleanValue();
             }else if(c.g == null){
                c.g = true;
                c.c();
             }
             o = c.o;
             if (o != null) {
                o.addView(c, c.n);
             }
             c.k = true;
          }
          c.e = true;
       }else {
          c = c.c;
          if (c != null) {
             obj = PatchProxy.apply(objArray, c, FloatLayoutNew.class, "8");
             if (obj != patchProxyRe) {
                obj.booleanValue();
             }else {
                c.k = false;
                try{
                   o = c.o;
                   if (o != null) {
                      o.removeView(c);
                   }
                }catch(java.lang.Exception e0){
                   e0.printStackTrace();
                }
             }
          }
       }
       return;
    }
    public final boolean h(Context p0,Intent p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0.getPackageManager().queryIntentActivities(p1, 0x10000).size() > 0) {
          p1.setFlags(0x10000000);
          p0.startActivity(p1);
          i = true;
       }else {
          obj = new Object[i];
          a.C().w("CostMoniterDebugUtils", "---------startSafely:Intent is not available! "+p1, obj);
       }
       return i;
    }
}
