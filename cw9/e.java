package cw9.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import cw9.f;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.Float;
import android.content.ComponentCallbacks;
import cw9.d;
import android.util.DisplayMetrics;
import android.content.Context;
import pd6.b;

public class e	// class@001e27
{
    public static final String a = "e";
    public static float b = 0.000000;
    public static float c = 0.000000;
    public static f d;
    public static boolean e;
    public static ComponentCallbacks f;

    public void e(){
       super();
    }
    public static boolean a(){
       f obj = PatchProxy.apply(null, null, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = e.d;
       boolean b = true;
       if (obj != null) {
          obj = (obj.a == null && (obj.b != null || obj.c > 0))? 1: 0;
          if (obj) {
          label_0031 :
             return b;
          }
       }
       b = false;
       goto label_0031 ;
    }
    public static float b(){
       Resources obj = PatchProxy.apply(null, null, e.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = a.b().getResources();
       Configuration fontScale = (obj != null)? obj.getConfiguration().fontScale: 0x3f800000;
       return fontScale;
    }
    public static float c(){
       Object obj = PatchProxy.apply(null, null, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float c = (e.a())? e.c: e.b;
       if (c <= 0) {
          c = e.b();
       }
       return c;
    }
    public static void d(Configuration p0){
       e uoe = e.class;
       String obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uoe, "4")) {
          return;
       }
       if (e.b - null <= 0) {
          e.b = p0.fontScale;
       }
       f uof = 0x3f800000;
       if (!e.b - uof) {
          f d = e.d;
          if (d == null || (!d.a() || !e.d.c - uof)) {
          label_0034 :
             String a = e.a;
             Log.b(a, "sOriginFontScale="+e.b+", sStayDefault="+e.e);
             float b = e.b;
             if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Float.valueOf(b), obj, uoe, "5")) {
                f d1 = e.d;
                obj = 0x3fa20000;
                if (d1 != null && d1.a()) {
                   uof = e.d.c;
                }else if(b - obj >= 0){
                   uof = 0x3fa20000;
                }else if(b - 0x3f900000 >= 0){
                   uof = 0x3f900000;
                }else if(b - uof >= 0){
                   uof = 0x3f638e39;
                }
                e.c = uof;
                Log.b(a, "sTargetFontScale="+e.c);
             }
             return;
          }
       }
       e.e = false;
       goto label_0034 ;
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (e.a() && (e.e || e.c <= 0)) {
          return false;
       }
       return true;
    }
    public static void f(Application p0,f p1){
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, uoe, "2")) {
          return;
       }
       e.d = p1;
       Log.b(e.a, p1.toString());
       if (!e.a()) {
          return;
       }
       if (p0 != null && p0.getResources() != null) {
          Configuration configuratio = p0.getResources().getConfiguration();
          if (configuratio == null) {
             return;
          }else if(PatchProxy.applyVoidTwoRefs(p0, configuratio, null, uoe, "3")){
             e.d(configuratio);
             ComponentCallbacks uComponentCa = PatchProxy.apply(null, null, uoe, "13");
             if (uComponentCa != PatchProxyResult.class) {
             }else {
                uComponentCa = e.f;
                if (uComponentCa == null) {
                   uComponentCa = new d();
                   e.f = uComponentCa;
                }
             }
             p0.unregisterComponentCallbacks(uComponentCa);
             p0.registerComponentCallbacks(uComponentCa);
             e.g(a.b().getResources());
          }
       }
       return;
    }
    public static void g(Resources p0){
       e uoe = e.class;
       DisplayMetrics obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uoe, "6")) {
          return;
       }
       if (!e.e()) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, obj, uoe, "8") && p0 != null) {
          Configuration configuratio = p0.getConfiguration();
          if (configuratio != null) {
             obj = p0.getDisplayMetrics();
             float c = e.c;
             float f = ((float)obj.densityDpi * c) / 160.00f;
             if (configuratio.fontScale - c || obj.scaledDensity - f) {
                configuratio.fontScale = c;
                obj.scaledDensity = f;
                p0.updateConfiguration(configuratio, obj);
             }
          }
       }
       return;
    }
    public static Context h(Context p0){
       Configuration obj = PatchProxy.applyOneRefs(p0, null, e.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!e.e()) {
          return p0;
       }
       obj = new Configuration(p0.getResources().getConfiguration());
       obj.fontScale = e.c;
       return b.a(p0, obj);
    }
}
