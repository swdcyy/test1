package com.kwai.privacykit.interceptor.ImsiInterceptor;
import java.lang.Object;
import android.telephony.TelephonyManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vk7.i0;
import vk7.h;
import java.util.concurrent.Callable;
import java.lang.Number;
import java.util.Objects;
import vk7.g;
import java.lang.Integer;
import wk7.d;
import java.util.HashMap;
import wk7.d$a;
import java.lang.Boolean;
import ekd.e0;
import android.content.Context;
import ukd.a;

public class ImsiInterceptor	// class@0013c5
{

    public void ImsiInterceptor(){
       super();
    }
    public static String getSubscriberId(TelephonyManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImsiInterceptor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i0.b("onEnter: TelephonyManager#getSubscriberId");
       return new i0("device", "TelephonyManager#getSubscriberId", new h(p0), "").a();
    }
    public static int getSubscriptionId(TelephonyManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImsiInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       i0.b("onEnter: TelephonyManager#getSubscriptionId");
       Objects.requireNonNull(p0);
       return new i0("device", "TelephonyManager#getSubscriptionId", new g(p0), Integer.valueOf(0)).a().intValue();
    }
    public static String lambda$getSubscriberId$0(TelephonyManager p0){
       d$a uoa;
       d$a a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = null;
       if (PatchProxy.isSupport(uod)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(0), obj, uod, "1");
          if (uoa != patchProxyRe) {
          }else {
          label_001e :
             uoa = d.a.get(Integer.valueOf(0));
             if (uoa != null) {
                a = uoa.a;
                if (a != null) {
                   uoa = a;
                }
             }
             if (d.f().booleanValue() && (uoa != null && uoa.b.booleanValue())) {
                uoa = uoa.a;
             }else if(PatchProxy.isSupport(uod)){
                Object[] obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(0), obj, uod, "2");
                if (obj1 != patchProxyRe) {
                   obj = obj1;
                }else if(!d.e(e0.b)){
                   obj1 = new Object[]{Integer.valueOf(0)};
                   obj = a.a(p0, "getSubscriberId", obj1);
                }
             }else {
                goto label_005f ;
             }
             d.a.put(Integer.valueOf(0), new d$a(obj, Boolean.TRUE));
             uoa = obj;
          }
       }else {
          goto label_001e ;
       }
       return uoa;
    }
}
