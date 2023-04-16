package com.kwai.privacykit.interceptor.ImeiInterceptor;
import java.lang.Object;
import android.telephony.TelephonyManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vk7.i0;
import vk7.a;
import java.util.concurrent.Callable;
import java.lang.Integer;
import vk7.d;
import vk7.b;
import vk7.e;
import vk7.c;
import vk7.f;
import wk7.d;
import java.lang.Boolean;
import java.util.HashMap;
import wk7.d$a;
import ekd.e0;
import android.content.Context;
import ukd.a;

public class ImeiInterceptor	// class@0013c4
{

    public void ImeiInterceptor(){
       super();
    }
    public static String getDeviceId(TelephonyManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImeiInterceptor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0.b("onEnter: TelephonyManager#getDeviceId");
       return new i0("device", "TelephonyManager#getDeviceId", new a(p0), "").a();
    }
    public static String getDeviceId(TelephonyManager p0,int p1){
       ImeiInterceptor imeiIntercep = ImeiInterceptor.class;
       if (PatchProxy.isSupport(imeiIntercep)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, imeiIntercep, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       i0.b("onEnter: TelephonyManager#getDeviceId");
       return new i0("device", "TelephonyManager#getDeviceId", new d(p0, p1), "").a();
    }
    public static String getImei(TelephonyManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImeiInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0.b("onEnter: TelephonyManager#getImei");
       return new i0("device", "TelephonyManager#getImei", new b(p0), "").a();
    }
    public static String getImei(TelephonyManager p0,int p1){
       ImeiInterceptor imeiIntercep = ImeiInterceptor.class;
       if (PatchProxy.isSupport(imeiIntercep)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, imeiIntercep, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       i0.b("onEnter: TelephonyManager#getImei");
       return new i0("device", "TelephonyManager#getImei", new e(p0, p1), "").a();
    }
    public static String getMeid(TelephonyManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImeiInterceptor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0.b("onEnter: TelephonyManager#getMeid");
       return new i0("device", "TelephonyManager#getMeid", new c(p0), "").a();
    }
    public static String getMeid(TelephonyManager p0,int p1){
       ImeiInterceptor imeiIntercep = ImeiInterceptor.class;
       if (PatchProxy.isSupport(imeiIntercep)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, imeiIntercep, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       i0.b("onEnter: TelephonyManager#getMeid");
       return new i0("device", "TelephonyManager#getMeid", new f(p0, p1), "").a();
    }
    public static String lambda$getDeviceId$4(TelephonyManager p0){
       String str = PatchProxy.applyOneRefs(p0, null, d.class, "3");
       if (str != PatchProxyResult.class) {
       }else if(d.f().booleanValue() && d.c.booleanValue()){
          str = d.b;
       }else if(d.b == null){
          d.b = d.a(p0, 0);
          d.c = Boolean.TRUE;
       }
       str = d.b;
       return str;
    }
    public static String lambda$getDeviceId$5(TelephonyManager p0,int p1){
       d$a uoa;
       HashMap d;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uod, "4");
          if (uoa != PatchProxyResult.class) {
          }else {
          label_001c :
             d = d.d;
             d$a uoa1 = d.get(Integer.valueOf(p1));
             if (uoa1 != null) {
                d$a a = uoa1.a;
                if (a != null) {
                   uoa = a;
                }
             }
             if (d.f().booleanValue() && (uoa1 != null && uoa1.b.booleanValue())) {
                uoa = uoa1.a;
             }else {
                String str = d.a(p0, p1);
                d.put(Integer.valueOf(p1), new d$a(str, Boolean.TRUE));
                uoa = str;
             }
          }
       }else {
          goto label_001c ;
       }
       return uoa;
    }
    public static String lambda$getImei$0(TelephonyManager p0){
       String str = PatchProxy.applyOneRefs(p0, null, d.class, "6");
       if (str != PatchProxyResult.class) {
       }else if(d.f().booleanValue() && d.f.booleanValue()){
          str = d.e;
       }else if(d.e == null){
          d.e = d.b(p0);
          d.f = Boolean.TRUE;
       }
       str = d.e;
       return str;
    }
    public static String lambda$getImei$1(TelephonyManager p0,int p1){
       d$a uoa;
       d$a a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = null;
       if (PatchProxy.isSupport(uod)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, uod, "8");
          if (uoa != patchProxyRe) {
          }else {
          label_001d :
             uoa = d.g.get(Integer.valueOf(p1));
             if (uoa != null) {
                a = uoa.a;
                if (a != null) {
                   uoa = a;
                }
             }
             if (d.f().booleanValue() && (uoa != null && uoa.b.booleanValue())) {
                uoa = uoa.a;
             }else if(PatchProxy.isSupport(uod)){
                Object[] obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, uod, "9");
                if (obj1 != patchProxyRe) {
                   obj = obj1;
                }else if(!d.e(e0.b)){
                   obj1 = new Object[]{Integer.valueOf(p1)};
                   obj = a.a(p0, "getImei", obj1);
                }
             }else {
                goto label_005e ;
             }
             d.g.put(Integer.valueOf(p1), new d$a(obj, Boolean.TRUE));
             uoa = obj;
          }
       }else {
          goto label_001d ;
       }
       return uoa;
    }
    public static String lambda$getMeid$2(TelephonyManager p0){
       return d.c(p0, 0);
    }
    public static String lambda$getMeid$3(TelephonyManager p0,int p1){
       return d.c(p0, p1);
    }
}
