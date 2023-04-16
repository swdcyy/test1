package com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt;
import android.content.Context;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.ug.deviceinfo.DeviceInfoManager;
import w25.c;
import w25.d;
import w25.b;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.a;
import com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt$getCarrierNameList$1;
import com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt$getCarrierNameList$2;
import msd.l;
import msd.a;
import java.lang.CharSequence;
import zsd.u;
import java.util.Collection;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.t;
import com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt$getIccidList$1;
import com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt$getIccidList$2;
import v25.b;
import java.lang.StringBuilder;
import com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt$getImsiList$1;
import com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt$getImsiList$2;
import com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt$getPhoneNumberList$1;
import com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt$getPhoneNumberList$2;
import android.telephony.TelephonyManager;
import java.lang.Integer;
import android.os.Build$VERSION;
import java.lang.Long;
import java.lang.reflect.Method;
import java.lang.Exception;

public final class TelephonyUitlsKt	// class@00118f
{

    public static final List a(Context p0){
       b obj = PatchProxy.applyOneRefs(p0, null, TelephonyUitlsKt.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          p0 = DeviceInfoManager.d.b();
       }
       obj = d.a(p0);
       if (obj != null) {
          ArrayList uArrayList = new ArrayList();
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          a.m(p0);
          obj.j(p0, new TelephonyUitlsKt$getCarrierNameList$1(objectRef, uArrayList), new TelephonyUitlsKt$getCarrierNameList$2(uArrayList));
          if (uArrayList.isEmpty()) {
             String str = obj.d();
             objectRef.element = str;
             Ref$ObjectRef objectRef1 = (str == null || u.S1(str))? 1: null;
             if (!objectRef1) {
                objectRef1 = objectRef.element;
                a.m(objectRef1);
                uArrayList.add(objectRef1);
             }
          }
          List list = (uArrayList.isEmpty() ^ 1)? CollectionsKt___CollectionsKt.L1(uArrayList): t.k("UG_GET_FIELD_EMPTY");
          return list;
       }else {
          return t.k("UG_SERVICE_OBJECT_NULL");
       }
    }
    public static final List b(Context p0){
       b obj = PatchProxy.applyOneRefs(p0, null, TelephonyUitlsKt.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          p0 = DeviceInfoManager.d.b();
       }
       obj = d.a(p0);
       if (obj != null) {
          ArrayList uArrayList = new ArrayList();
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          a.m(p0);
          obj.j(p0, new TelephonyUitlsKt$getIccidList$1(objectRef, obj, uArrayList), new TelephonyUitlsKt$getIccidList$2(uArrayList));
          if (uArrayList.isEmpty()) {
             String str = obj.c();
             objectRef.element = str;
             Ref$ObjectRef objectRef1 = (str == null || u.S1(str))? 1: null;
             if (!objectRef1) {
                objectRef1 = objectRef.element;
                a.m(objectRef1);
                uArrayList.add(objectRef1);
             }
          }
          List list = (uArrayList.isEmpty() ^ 1)? CollectionsKt___CollectionsKt.L1(uArrayList): t.k("UG_GET_FIELD_EMPTY");
          return list;
       }else {
          return t.k("UG_SERVICE_OBJECT_NULL");
       }
    }
    public static final List c(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TelephonyUitlsKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          p0 = DeviceInfoManager.d.b();
       }
       c uoc = d.a(p0);
       if (uoc != null) {
          int i = uoc.i();
          int i1 = 0;
          ArrayList uArrayList = new ArrayList();
          if (i < 1) {
             DeviceInfoManager.d.d().info("TelephonyUtils", "simCount invalid: "+i);
             i = 1;
          }
          while (i1 < i) {
             int i2 = i1 + 1;
             String str = uoc.g(i1);
             if (str != null) {
                int i3 = u.S1(str) ^ 1;
                if (i3) {
                   uArrayList.add(str);
                }
             }
             i1 = i2;
          }
          if (uArrayList.isEmpty() ^ 1) {
             return CollectionsKt___CollectionsKt.L1(uArrayList);
          }
       }
       return t.k("UG_GET_FIELD_EMPTY");
    }
    public static final List d(Context p0){
       b obj = PatchProxy.applyOneRefs(p0, null, TelephonyUitlsKt.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          p0 = DeviceInfoManager.d.b();
       }
       obj = d.a(p0);
       if (obj != null) {
          ArrayList uArrayList = new ArrayList();
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          a.m(p0);
          obj.j(p0, new TelephonyUitlsKt$getImsiList$1(objectRef, obj, uArrayList), new TelephonyUitlsKt$getImsiList$2(uArrayList));
          if (uArrayList.isEmpty()) {
             String imsi = obj.getImsi();
             objectRef.element = imsi;
             Ref$ObjectRef objectRef1 = (imsi == null || u.S1(imsi))? 1: null;
             if (!objectRef1) {
                objectRef1 = objectRef.element;
                a.m(objectRef1);
                uArrayList.add(objectRef1);
             }
          }
          List list = (uArrayList.isEmpty() ^ 1)? CollectionsKt___CollectionsKt.L1(uArrayList): t.k("UG_GET_FIELD_EMPTY");
          return list;
       }else {
          return t.k("UG_SERVICE_OBJECT_NULL");
       }
    }
    public static final List e(Context p0){
       b obj = PatchProxy.applyOneRefs(p0, null, TelephonyUitlsKt.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          p0 = DeviceInfoManager.d.b();
       }
       obj = d.a(p0);
       if (obj != null) {
          ArrayList uArrayList = new ArrayList();
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          a.m(p0);
          obj.j(p0, new TelephonyUitlsKt$getPhoneNumberList$1(objectRef, obj, uArrayList), new TelephonyUitlsKt$getPhoneNumberList$2(uArrayList));
          if (uArrayList.isEmpty()) {
             String str = obj.h();
             objectRef.element = str;
             Ref$ObjectRef objectRef1 = (str == null || u.S1(str))? 1: null;
             if (!objectRef1) {
                objectRef1 = objectRef.element;
                a.m(objectRef1);
                uArrayList.add(objectRef1);
             }
          }
          List list = (uArrayList.isEmpty() ^ 1)? CollectionsKt___CollectionsKt.L1(uArrayList): t.k("UG_GET_FIELD_EMPTY");
          return list;
       }else {
          return t.k("UG_SERVICE_OBJECT_NULL");
       }
    }
    public static final String f(TelephonyManager p0,String p1,int p2){
       String obj;
       Class tYPE;
       if (PatchProxy.isSupport(TelephonyUitlsKt.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, TelephonyUitlsKt.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "methodName");
       if (p0 != null) {
          obj = 0;
          try{
             if (Build$VERSION.SDK_INT > 21) {
                tYPE = Integer.TYPE;
             label_0031 :
                Class[] uClassArray = new Class[]{tYPE};
                Method method = p0.getClass().getMethod(p1, uClassArray);
                a.o(method, "telephonyManager::class.¡­d\(methodName, paramsType\)");
                Object[] objArray = new Object[]{Integer.valueOf(p2)};
                obj = method.invoke(p0, objArray);
             }else {
                tYPE = Long.TYPE;
                goto label_0031 ;
             }
          }catch(java.lang.SecurityException e0){
             obj = "UG_AUTH_FAILED";
          }catch(java.lang.Exception e7){
             e7.printStackTrace();
          }
          DeviceInfoManager.d.d().info("TelephonyUtils", p1+'('+p2+"\): "+obj);
          return obj;
       }else {
          return "UG_SERVICE_OBJECT_NULL";
       }
    }
}
