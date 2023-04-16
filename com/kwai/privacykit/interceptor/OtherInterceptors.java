package com.kwai.privacykit.interceptor.OtherInterceptors;
import java.lang.Object;
import android.telephony.SubscriptionManager;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vk7.i0;
import vk7.e0;
import java.util.Collections;
import java.util.concurrent.Callable;
import android.telephony.TelephonyManager;
import vk7.f0;
import wk7.d;
import ekd.e0;
import android.content.Context;
import java.lang.Boolean;

public class OtherInterceptors	// class@0013c8
{

    public void OtherInterceptors(){
       super();
    }
    public static List getActiveSubscriptionInfoList(SubscriptionManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, OtherInterceptors.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i0("device", "SubscriptionManager#getActiveSubscriptionInfoList", new e0(p0), Collections.emptyList()).a();
    }
    public static String getVoiceMailNumber(TelephonyManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, OtherInterceptors.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i0("device", "TelephonyManager#getVoiceNumber", new f0(p0), "").a();
    }
    public static List lambda$getActiveSubscriptionInfoList$1(SubscriptionManager p0){
       List list = PatchProxy.applyOneRefs(p0, null, d.class, "14");
       if (list != PatchProxyResult.class) {
       }else if(!d.e(e0.b)){
          list = Collections.emptyList();
       }else if(d.f().booleanValue() && d.l.booleanValue()){
          list = d.k;
       }else if(d.k == null){
          d.k = p0.getActiveSubscriptionInfoList();
          d.l = Boolean.TRUE;
       }
       list = d.k;
       return list;
    }
    public static String lambda$getVoiceMailNumber$0(TelephonyManager p0){
       String str = PatchProxy.applyOneRefs(p0, null, d.class, "13");
       if (str != PatchProxyResult.class) {
       }else if(!d.e(e0.b)){
          str = "";
       }else if(d.f().booleanValue() && d.j.booleanValue()){
          str = d.i;
       }else if(d.i == null){
          d.i = p0.getVoiceMailNumber();
          d.j = Boolean.TRUE;
       }
       str = d.i;
       return str;
    }
}
