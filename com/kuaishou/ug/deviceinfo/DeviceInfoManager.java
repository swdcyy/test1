package com.kuaishou.ug.deviceinfo.DeviceInfoManager;
import v25.a;
import java.lang.String;
import com.kuaishou.ug.deviceinfo.DeviceInfoManager$lastBootTimestamp$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.content.Context;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import y25.c;
import kotlin.jvm.internal.a;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.view.Display;
import cw9.c;
import java.lang.Integer;
import android.os.Bundle;
import java.util.List;
import java.util.Collection;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import v25.b;
import org.json.JSONObject;
import t25.a;
import qrd.l1;
import android.os.Build$VERSION;
import java.lang.ref.WeakReference;
import java.lang.Boolean;
import com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt;
import w25.c;
import w25.d;
import android.os.Build;
import y25.a;

public final class DeviceInfoManager	// class@000954
{
    public static WeakReference a;
    public static b b;
    public static final p c;
    public static final DeviceInfoManager d;

    static {
       DeviceInfoManager.d = new DeviceInfoManager();
       DeviceInfoManager.b = new a("DeviceInfo");
       DeviceInfoManager.c = s.c(DeviceInfoManager$lastBootTimestamp$2.INSTANCE);
    }
    public void DeviceInfoManager(){
       super();
    }
    public static int h(DeviceInfoManager p0,Context p1,int p2,Object p3){
       int i;
       Objects.requireNonNull(p0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(null, p0, DeviceInfoManager.class, "20");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          Context uContext = p0.b();
          if (uContext != null) {
             obj = PatchProxy.applyOneRefs(uContext, null, c.class, "4");
             if (obj != patchProxyRe) {
                i = obj.intValue();
             }else {
                a.p(uContext, "context");
                uContext = uContext.getSystemService("window");
                Objects.requireNonNull(uContext, "null cannot be cast to non-null type android.view.WindowManager");
                DisplayMetrics uDisplayMetr = new DisplayMetrics();
                c.d(uContext.getDefaultDisplay(), uDisplayMetr);
                i = uDisplayMetr.heightPixels;
             }
          }else {
             i = 0;
          }
          DeviceInfoManager.l(DeviceInfoManager.d, "screen_height_px", Integer.valueOf(i), null, 4, null);
       }
       return i;
    }
    public static int i(DeviceInfoManager p0,Context p1,int p2,Object p3){
       int i;
       Objects.requireNonNull(p0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(null, p0, DeviceInfoManager.class, "19");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          Context uContext = p0.b();
          if (uContext != null) {
             obj = PatchProxy.applyOneRefs(uContext, null, c.class, "3");
             if (obj != patchProxyRe) {
                i = obj.intValue();
             }else {
                a.p(uContext, "context");
                uContext = uContext.getSystemService("window");
                Objects.requireNonNull(uContext, "null cannot be cast to non-null type android.view.WindowManager");
                DisplayMetrics uDisplayMetr = new DisplayMetrics();
                c.d(uContext.getDefaultDisplay(), uDisplayMetr);
                i = uDisplayMetr.widthPixels;
             }
          }else {
             i = 0;
          }
          DeviceInfoManager.l(DeviceInfoManager.d, "screen_width_px", Integer.valueOf(i), null, 4, null);
       }
       return i;
    }
    public static void l(DeviceInfoManager p0,String p1,Object p2,Bundle p3,int p4,Object p5){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidThreeRefs(p1, p2, null, p0, DeviceInfoManager.class, "32")) {
       }else {
          a.p(p1, "fieldName");
          a.p(p2, "value");
          String str = (p2 instanceof List && (p2.isEmpty() ^ 0x01))? CollectionsKt___CollectionsKt.V2(p2, null, null, null, 0, null, null, 63, null): p2.toString();
          DeviceInfoManager.b.info(p1, str);
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("sdk_version", "0.0.1.9");
          jSONObject.put("success", a.a(p2));
          jSONObject.put("field", p1);
          jSONObject.put("result", str);
          DeviceInfoManager.b.report("KS_UG_DEVICE_INFO", jSONObject.toString());
       }
       return;
    }
    public final int a(){
       Object obj = PatchProxy.apply(null, this, DeviceInfoManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       DeviceInfoManager.l(DeviceInfoManager.d, "android_version", Integer.valueOf(sDK_INT), null, 4, null);
       return sDK_INT;
    }
    public final Context b(){
       Object[] objArray = null;
       WeakReference obj = PatchProxy.apply(objArray, this, DeviceInfoManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = DeviceInfoManager.a;
       if (obj != null) {
          objArray = obj.get();
       }
       return objArray;
    }
    public final String c(Context p0,boolean p1){
       String str;
       String imei;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DeviceInfoManager uDeviceInfoM = DeviceInfoManager.class;
       if (PatchProxy.isSupport(uDeviceInfoM)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uDeviceInfoM, "13");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p1) {
          str = PatchProxy.applyOneRefs(p0, null, TelephonyUitlsKt.class, "2");
          if (str != patchProxyRe) {
          }else if(p0 != null){
             p0 = DeviceInfoManager.d.b();
          }
          c uoc = d.a(p0);
          if (uoc != null) {
             imei = uoc.getImei();
             if (imei != null) {
             label_0041 :
                str = imei;
             }
          }
          imei = "UG_GET_FIELD_EMPTY";
          goto label_0041 ;
       }else {
          str = CollectionsKt___CollectionsKt.V2(TelephonyUitlsKt.c(p0), null, null, null, 0, null, null, 63, null);
       }
       DeviceInfoManager.l(DeviceInfoManager.d, "imei", str, null, 4, null);
       return str;
    }
    public final b d(){
       return DeviceInfoManager.b;
    }
    public final String e(){
       String obj = PatchProxy.apply(null, this, DeviceInfoManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Build.MANUFACTURER;
       a.o(obj, "it");
       DeviceInfoManager.l(DeviceInfoManager.d, "manufacturer", obj, null, 4, null);
       a.o(obj, "Build.MANUFACTURER.also ¡­NUFACTURER, it\)\n        }");
       return obj;
    }
    public final String f(){
       String obj = PatchProxy.apply(null, this, DeviceInfoManager.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.e();
       DeviceInfoManager.l(DeviceInfoManager.d, "manufacturer_os_info", obj, null, 4, null);
       return obj;
    }
    public final String g(){
       String obj = PatchProxy.apply(null, this, DeviceInfoManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Build.MODEL;
       a.o(obj, "it");
       DeviceInfoManager.l(DeviceInfoManager.d, "model", obj, null, 4, null);
       a.o(obj, "Build.MODEL.also {\n     ¡­NAME_MODEL, it\)\n        }");
       return obj;
    }
    public final void j(Context p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DeviceInfoManager.class, "3")) {
          return;
       }
       a.p(p0, "context");
       DeviceInfoManager.a = new WeakReference(p0.getApplicationContext());
       if (p1 != null) {
          DeviceInfoManager.b = p1;
       }
       return;
    }
    public final boolean k(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, DeviceInfoManager.class, "31");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "12");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): a.g("harmony", a.c());
    label_0031 :
       DeviceInfoManager.l(DeviceInfoManager.d, "harmony_os_enable", Boolean.valueOf(b), null, 4, null);
       return b;
    }
}
