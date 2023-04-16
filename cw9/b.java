package cw9.b;
import java.lang.Object;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.Float;
import java.lang.Boolean;
import android.graphics.Bitmap;
import java.lang.Integer;
import ukd.a;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.content.res.Configuration;
import pd6.b;

public class b	// class@00144b
{
    public static final String a = "b";
    public static float b = 1.075000;
    public static float c = 0.000000;
    public static boolean d;
    public static boolean e;
    public static float f;
    public static float g;
    public static int h;
    public static int i;

    public void b(){
       super();
    }
    public static DisplayMetrics a(Resources p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DisplayMetrics displayMetri = p0.getDisplayMetrics();
       int h = b.h;
       if (h) {
          int i = b.i;
          if (i) {
             displayMetri.widthPixels = h;
             displayMetri.heightPixels = i;
          }
       }
       return displayMetri;
    }
    public static float b(){
       Object obj = PatchProxy.apply(null, null, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = b.f;
       if (f <= 0) {
          f = b.a(a.b().getResources()).density;
       }
       return f;
    }
    public static int c(Context p0){
       Application uApplication;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          uApplication = a.b();
       }
       return (int)((float)b.a(uApplication.getResources()).heightPixels / b.b());
    }
    public static int d(Context p0){
       Application uApplication;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          uApplication = a.b();
       }
       return (int)((float)b.a(uApplication.getResources()).widthPixels / b.b());
    }
    public static float e(){
       Object obj = PatchProxy.apply(null, null, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float g = (b.g())? b.g: b.f;
       if (g <= 0) {
          g = b.a(a.b().getResources()).density;
       }
       return g;
    }
    public static boolean f(float p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, uob, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(Bitmap.class, "sDefaultDensity", Integer.valueOf((int)(p0 * 160.00f)));
       return true;
    }
    public static boolean g(){
       boolean b = (b.d && b.e)? true: false;
       return b;
    }
    public static void h(){
       if (PatchProxy.applyVoid(null, null, b.class, "4")) {
          return;
       }
       b.d = false;
       b.e = false;
       b.g = 0;
       b.f(b.f);
       return;
    }
    public static void i(Resources p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "16")) {
          return;
       }
       b.j(p0, true);
       return;
    }
    public static void j(Resources p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uob, "17")) {
          return;
       }
       if (!b.g()) {
          return;
       }
       if (p1) {
          b.f(b.g);
       }
       if (p0 == null) {
          return;
       }else {
          Configuration configuratio = p0.getConfiguration();
          if (configuratio == null) {
             return;
          }else {
             DisplayMetrics uDisplayMetr = b.a(p0);
             float g = b.g;
             int i = (int)(160.00f * g);
             if (configuratio.densityDpi != i) {
                configuratio.densityDpi = i;
                configuratio.screenWidthDp = (int)((float)uDisplayMetr.widthPixels / g);
                configuratio.screenHeightDp = (int)((float)uDisplayMetr.heightPixels / g);
                p0.updateConfiguration(configuratio, null);
             }
             return;
          }
       }
    }
    public static Context k(Context p0){
       DisplayMetrics obj = PatchProxy.applyOneRefs(p0, null, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!b.g()) {
          return p0;
       }
       b.f(b.g);
       obj = b.a(p0.getResources());
       Configuration uConfigurati = new Configuration(p0.getResources().getConfiguration());
       float g = b.g;
       uConfigurati.densityDpi = (int)(160.00f * g);
       uConfigurati.screenWidthDp = (int)((float)obj.widthPixels / g);
       uConfigurati.screenHeightDp = (int)((float)obj.heightPixels / g);
       return b.a(p0, uConfigurati);
    }
}
