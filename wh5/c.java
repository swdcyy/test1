package wh5.c;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Intent;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.w0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.a;
import xf6.d;
import com.kwai.component.uiconfig.childlock.model.TeenageModeConfig;
import wh5.a;
import com.kwai.component.uiconfig.childlock.model.TeenageModeFeatureConfig;
import java.lang.Number;
import java.lang.System;
import yb6.d;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.model.user.QCurrentUser;
import th5.a;

public final class c	// class@00275b
{

    public void c(){
       super();
    }
    public static void a(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "11")) {
          return;
       }
       if (TextUtils.x(p1)) {
          return;
       }
       Intent intent = new Intent("android.intent.action.DIAL");
       intent.setData(w0.f("tel:"+p1));
       p0.startActivity(intent);
       return;
    }
    public static boolean b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = PatchProxy.apply(null, null, uoc, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!a.c()) {
          Object obj1 = PatchProxy.apply(null, null, uoc, "3");
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): d.r("KEY_FORCE_CLOSE_CHILD_LOCK");
          if (!b) {
             TeenageModeConfig teenageModeC = a.c();
             if (teenageModeC == null) {
                return false;
             }else if(c.l()){
                return true;
             }else {
                return teenageModeC.mIsOpen;
             }
          }
       }
       return false;
    }
    public static boolean c(){
       TeenageModeFeatureConfig obj = PatchProxy.apply(null, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (c.b()) {
          obj = a.d();
          if (obj == null || obj.mEnableComment == null) {
             b = false;
          }
       }
       return b;
    }
    public static boolean d(){
       TeenageModeFeatureConfig obj = PatchProxy.apply(null, null, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (c.b()) {
          obj = a.d();
          if (obj == null || obj.mEnableShowLive == null) {
             b = false;
          }
       }
       return b;
    }
    public static boolean e(){
       TeenageModeFeatureConfig obj = PatchProxy.apply(null, null, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (c.b()) {
          obj = a.d();
          if (obj == null || obj.mEnableMessage == null) {
             b = false;
          }
       }
       return b;
    }
    public static boolean f(){
       TeenageModeFeatureConfig obj = PatchProxy.apply(null, null, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (c.b()) {
          obj = a.d();
          if (obj == null || obj.mEnableProfile == null) {
             b = false;
          }
       }
       return b;
    }
    public static boolean g(){
       TeenageModeFeatureConfig obj = PatchProxy.apply(null, null, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (c.b()) {
          obj = a.d();
          if (obj == null || obj.mEnablePostVideo == null) {
             b = false;
          }
       }
       return b;
    }
    public static boolean h(){
       TeenageModeFeatureConfig obj = PatchProxy.apply(null, null, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (c.b()) {
          obj = a.d();
          if (obj == null || obj.mEnableShare == null) {
             b = false;
          }
       }
       return b;
    }
    public static long i(){
       Object obj = PatchProxy.apply(null, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (d.r("KEY_CHILD_VERIFY_TIME_USE_LOCAL"))? System.currentTimeMillis(): d.a();
       return l;
    }
    public static boolean j(){
       Object obj = PatchProxy.apply(null, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b();
    }
    public static boolean k(){
       Object obj = PatchProxy.apply(null, null, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableUnLoignKeepTeenageMode", false);
    }
    public static boolean l(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, null, c.class, "12");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!QCurrentUser.me().isLogined()) {
          obj = PatchProxy.apply(null, null, a.class, "7");
          boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): TextUtils.x(a.a()) ^ b;
          if (b1) {
          label_003d :
             return b;
          }
       }
       b = false;
       goto label_003d ;
    }
    public static boolean m(){
       Object obj = PatchProxy.apply(null, null, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("isSyncUnLoginTeenageMode", false);
    }
    public static boolean n(){
       Object obj = PatchProxy.apply(null, null, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (c.o(a.c()) ^ 0x01);
    }
    public static boolean o(TeenageModeConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (c.k() && (p0 != null && p0.mIsOpen != null))? true: false;
       return b;
    }
    public static boolean p(){
       Object obj = PatchProxy.apply(null, null, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!QCurrentUser.me().isLogined() && c.o(a.c()))? true: false;
       return b;
    }
}
