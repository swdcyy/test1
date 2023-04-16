package com.kwai.framework.deviceid.i;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.k1;
import java.lang.Long;
import com.yxcorp.utility.TextUtils;
import java.security.SecureRandom;
import e66.c;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Throwable;
import o56.a;
import java.lang.Number;
import android.app.Application;
import android.content.Context;
import com.kwai.framework.deviceid.h;
import qe6.b;
import java.lang.Boolean;
import o56.c;
import com.yxcorp.utility.SystemUtil;
import com.kwai.framework.deviceid.i$a;
import d86.c;
import java.io.File;
import wkd.b;
import j80.c;
import com.kwai.framework.deviceid.DeviceIdWrapper;
import com.kwai.framework.deviceid.DeviceIdWrapper$c;
import com.kwai.framework.deviceid.DeviceIdWrapper$a;
import com.kwai.framework.deviceid.DeviceIdWrapper$f;
import com.kwai.framework.deviceid.DeviceIdWrapper$d;
import com.kwai.framework.deviceid.DeviceIdWrapper$b;
import qkd.b;
import h30.a;
import com.kuaishou.dfp.envdetect.Proxy.EngineProxy;
import ekd.a0;
import android.content.ContentResolver;
import com.kwai.framework.deviceid.a;
import i66.c;
import java.lang.Runnable;
import t45.c;
import java.lang.Integer;

public class i	// class@000b3f
{
    public static File a;
    public static File b;
    public static String c;
    public static String d;
    public static int e;
    public static final SharedPreferences f;

    static {
       i.f = b.c("gifshow", 0);
    }
    public void i(){
       super();
    }
    public static String a(){
       Object obj = PatchProxy.apply(null, null, i.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.z(Long.toHexString(k1.j()), 16, '0');
    }
    public static String b(){
       String str = "DeviceIdManager";
       Object obj = PatchProxy.apply(null, null, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str1 = TextUtils.z(Long.toHexString((long)new SecureRandom().nextInt()), 16, '0');
       Object[] objArray = new Object[0];
       c.C().w(str, "generateRandomDeviceId generatedRandomId = "+str1, objArray);
       if (!TextUtils.x(str1)) {
          g.a(i.f.edit().putString("new_random_android_id", str1));
       }
       return "ANDROID_"+str1;
    }
    public static String c(){
       return a.a;
    }
    public static int d(){
       Object obj = PatchProxy.apply(null, null, i.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (h.b(a.b())) {
          return a.c;
       }
       return a.g;
    }
    public static String e(){
       Object obj = PatchProxy.apply(null, null, i.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.a()) {
          return i.f();
       }
       return "";
    }
    public static synchronized String f(){
       _monitor_enter(i.class);
       Object obj = PatchProxy.apply(null, null, i.class, "3");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(i.class);
          return obj;
       }else {
          _monitor_exit(i.class);
          return i.g(true);
       }
    }
    public static synchronized String g(boolean p0){
       _monitor_enter(i.class);
       if (PatchProxy.isSupport(i.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, i.class, "4");
          if (obj != PatchProxyResult.class) {
             _monitor_exit(i.class);
             return obj;
          }
       }
       if (a.a().c() || SystemUtil.P()) {
          i.c = i$a.a();
       }
       if (TextUtils.x(i.c)) {
          i.c = i.l(p0);
       }
       if (a.a().c()) {
          c.h(i.c);
       }
       _monitor_exit(i.class);
       return i.c;
    }
    public static synchronized String h(){
       _monitor_enter(i.class);
       Object obj = PatchProxy.apply(null, null, i.class, "5");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(i.class);
          return obj;
       }else if(TextUtils.x(i.d)){
          i.d = i.n();
       }
       _monitor_exit(i.class);
       return i.d;
    }
    public static synchronized void i(){
       int i;
       _monitor_enter(i.class);
       if (PatchProxy.applyVoid(null, null, i.class, "1")) {
          _monitor_exit(i.class);
          return;
       }else {
          i = -1504323719;
          if (i.a == null) {
             i.a = new File(b.a(i).n(), ".kwai_did");
          }
          if (i.b == null) {
             i.b = new File(b.a(i).k(), ".yxcorp_did");
          }
          _monitor_exit(i.class);
          return;
       }
    }
    public static boolean j(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "25");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, DeviceIdWrapper.class, "3");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): DeviceIdWrapper.b(new DeviceIdWrapper$c(null), p0, DeviceIdWrapper.c(3)) ^ 0x01;
       return (b ^ 0x01);
    }
    public static boolean k(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "24");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, DeviceIdWrapper.class, "4");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): DeviceIdWrapper.b(new DeviceIdWrapper$b(null), p0, DeviceIdWrapper.c(2));
       return b;
    }
    public static String l(boolean p0){
       String obj;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, oi, "8");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = i.o();
       Object[] objArray = new Object[0];
       c.C().w("DeviceIdManager", "readDeviceId  systemAndroidId = "+obj, objArray);
       if (i.k(obj) && !i.j(obj)) {
          return "ANDROID_"+obj;
       }else if(p0){
          str = PatchProxy.apply(null, null, oi, "21");
          if (str != patchProxyRe) {
          }else {
             str = b.c("gifshow", 0).getString("android_id", null);
             i.i();
             obj = i.m(i.a);
             String str1 = i.m(i.b);
             if (TextUtils.x(str) || (!str.equals(obj) || !str.equals(str1))) {
                if (!TextUtils.x(str) && str.equals(obj)) {
                   i.p(i.b, str);
                }else if(!TextUtils.x(str) && str.equals(str1)){
                   i.p(i.a, str);
                }else if(!TextUtils.x(obj) && obj.equals(str1)){
                   i.q(obj);
                }else if(!TextUtils.x(str)){
                   i.p(i.a, str);
                   i.p(i.b, str);
                }else if(!TextUtils.x(obj)){
                   i.q(obj);
                   i.p(i.b, obj);
                }else if(!TextUtils.x(str1)){
                   i.q(str1);
                   i.p(i.b, str1);
                   str = str1;
                }else {
                   str = null;
                }
                str = obj;
             }
          }
          if (i.k(str)) {
             return "ANDROID_"+str;
          }
       }
       str = PatchProxy.apply(null, null, oi, "9");
       if (str != patchProxyRe) {
       }else {
          str = i.a();
          Object[] objArray1 = new Object[0];
          c.C().w("DeviceIdManager", "readDeviceId  generatedAndroidId = "+str, objArray1);
          if (str != null) {
             i.q(str);
             i.i();
             i.p(i.a, str);
             i.p(i.b, str);
          }
          str = "ANDROID_"+str;
       }
       return str;
    }
    public static String m(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return b.g0(p0, "utf-8");
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
    public static String n(){
       Object[] objArray2;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SharedPreferences obj = PatchProxy.apply(objArray, objArray, i.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = i.f;
       String str = "new_random_android_id";
       String str1 = obj.getString(str, objArray);
       Object[] objArray1 = new Object[0];
       c.C().w("DeviceIdManager", "readNewRandomDeviceId savedRandomDeviceId = "+str1, objArray1);
       if (i.k(str1)) {
          return "ANDROID_"+str1;
       }
       Application uApplication = a.b();
       String str2 = PatchProxy.applyOneRefs(uApplication, objArray, a.class, "28");
       if (str2 != patchProxyRe) {
       }else {
          str2 = EngineProxy.getInstance(uApplication).gRdi();
       }
       if (TextUtils.x(str2)) {
          objArray2 = new Object[0];
          c.C().w("DeviceIdManager", "readNewRandomDeviceId romId is null", objArray2);
          return i.b();
       }else {
          String str3 = a0.c(str2);
          if (TextUtils.x(str3)) {
             objArray2 = new Object[0];
             c.C().w("DeviceIdManager", "readNewRandomDeviceId romIdHex is null", objArray2);
             return i.b();
          }else {
             i = 32;
             if (str3.length() >= i) {
                str1 = str3.substring(16, i);
                g.a(obj.edit().putString(str, str1));
             }else {
                str1 = "";
             }
             objArray = new Object[0];
             c.C().w("DeviceIdManager", "readNewRandomDeviceId romId = "+str2+"; romIdHex = "+str3+"; randomDeviceId = "+str1, objArray);
             return "ANDROID_"+str1;
          }
       }
    }
    public static String o(){
       Object obj = PatchProxy.apply(null, null, i.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.g(a.a().a().getContentResolver(), "android_id");
    }
    public static void p(File p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, i.class, "27")) {
          return;
       }
       c.a(new c(p0, p1));
       return;
    }
    public static void q(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, i.class, "26")) {
          return;
       }
       g.a(b.c("gifshow", 0).edit().putString("android_id", p0));
       return;
    }
    public static void r(String p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oi, "14")) {
          return;
       }
       if (PatchProxy.applyVoidOneRefs(p0, null, oi, "15") || (!TextUtils.x(p0) && !PatchProxy.applyVoidOneRefs(p0, null, oi, "16"))) {
          g.a(b.c("gifshow", 0).edit().putString("android_c_id_10560", p0));
       }
    label_0044 :
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), null, oi, "18")) {
          g.a(b.c("gifshow", 0).edit().putInt("android_c_id_tag_10560", p1));
       }
       return;
    }
}
