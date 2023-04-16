package com.kwai.framework.deviceid.h$a;
import com.kuaishou.dfp.ResponseDidCallback;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import e66.c;
import java.lang.StringBuilder;
import o56.a;
import q87.c;
import com.google.gson.JsonObject;
import java.lang.Number;
import java.lang.System;
import java.lang.Long;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.google.gson.JsonElement;
import com.kwai.framework.deviceid.h;
import k2b.r;
import com.kwai.framework.deviceid.i;
import i66.b;
import java.lang.Runnable;
import t45.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import h30.a;
import com.kwai.framework.deviceid.g;
import com.kwai.framework.init.c;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$DeviceIdMappingEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;

public class h$a implements ResponseDidCallback	// class@001529
{

    public void h$a(){
       super();
    }
    public void onError(int p0,String p1){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().w("CloudUtil", "onError, errorCode = "+p0+" errorMessage = "+p1+"; AppEnv.DEVICE_ID = "+a.a+"; AppEnv.CLOUD_ID_TAG = "+a.c+"; AppEnv.O_DID="+a.b, objArray);
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("yunfama_onerror_errorCode", Integer.valueOf(p0));
       jsonObject.c0("yunfama_onerror_errorMessage", p1);
       jsonObject.a0("event_timestamp", Long.valueOf(System.currentTimeMillis()));
       p1 = jsonObject.toString();
       b.a(0x4b316083).logCustomEvent("yunfama_onerror", p1);
       return;
    }
    public void onGetDid(String p0,int p1,String p2){
       String str2;
       h oh = h.class;
       if (PatchProxy.isSupport(h$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, h$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().w("CloudUtil", "onGetDid, hgid = "+p0+"; didtag = "+p1+"; type = "+p2, objArray);
       a.e = a.a;
       String str = "; AppEnv.O_DID = ";
       Object[] objArray1 = new Object[0];
       c.C().w("CloudUtil", "onGetDid 刷新前 AppEnv.DEVICE_ID = "+a.a+"; AppEnv.PRE_DEVICE_ID="+a.e+"; AppEnv.CLOUD_ID_TAG = "+a.c+str+a.b, objArray1);
       int i = (a.a).equals(p0) ^ 1;
       a.a = p0;
       a.d = a.c;
       a.c = p1;
       r.b(a.a, p1);
       i.r(p0, p1);
       Object[] objArray2 = new Object[0];
       c.C().w("CloudUtil", "onGetDid 刷新后 AppEnv.DEVICE_ID = "+a.a+"; AppEnv.PRE_DEVICE_ID="+a.e+"; AppEnv.CLOUD_ID_TAG = "+a.c+str+a.b, objArray2);
       h.g(i);
       if (!PatchProxy.applyVoidOneRefs(p2, null, oh, "6")) {
          c.a(new b(p2));
       }
       if (i) {
          Object[] objArray3 = new Object[0];
          c.C().w("CloudUtil", "CloudUtil Refresh Api!", objArray3);
          if (!PatchProxy.applyVoidOneRefs(p2, null, oh, "8")) {
             if (!PatchProxy.applyVoidOneRefs(p2, null, oh, "9")) {
                if (!TextUtils.x(p2)) {
                   i3 oi3 = i3.f();
                   oi3.d("rpc_type", a.b(p2));
                   str2 = oi3.e();
                }else {
                   str2 = "";
                }
                b.a(0x4b316083).A(25, str2);
             }
             c.c(g.b);
          }
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("hgid", p0);
       jsonObject.a0("didTag", Integer.valueOf(p1));
       jsonObject.c0("type", p2);
       jsonObject.a0("event_timestamp", Long.valueOf(System.currentTimeMillis()));
       String str1 = jsonObject.toString();
       b.a(0x4b316083).logCustomEvent("yunfama_getdid", str1);
       if (!PatchProxy.applyVoidOneRefs(p2, null, oh, "7")) {
          Object[] objArray4 = new Object[0];
          c.C().w("CloudUtil", "cloud reportDeviceIdMappingEvent", objArray4);
          ClientStat$DeviceIdMappingEvent uDeviceIdMap = new ClientStat$DeviceIdMappingEvent();
          uDeviceIdMap.randomDeviceId = a.f;
          uDeviceIdMap.deviceId = a.a;
          uDeviceIdMap.oldDeviceId = a.b;
          uDeviceIdMap.didTag = String.valueOf(a.c);
          uDeviceIdMap.preDeviceId = a.e;
          uDeviceIdMap.preDidTag = String.valueOf(a.d);
          if (!TextUtils.x(p2)) {
             uDeviceIdMap.deviceMappingRpcType = a.b(p2);
          }
          ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
          statPackage.deviceMappingEvent = uDeviceIdMap;
          b.a(0x4b316083).i1(statPackage, 1);
          Object[] objArray5 = new Object[0];
          c.C().w("CloudUtil", "reportDeviceIdMappingEvent "+statPackage.deviceMappingEvent, objArray5);
       }
       return;
    }
    public void report(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "3")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("yunfama_report_"+p0, p1);
       jsonObject.a0("event_timestamp", Long.valueOf(System.currentTimeMillis()));
       b.a(0x4b316083).logCustomEvent("yunfama_report_"+p0, jsonObject.toString());
       Object[] objArray = new Object[0];
       c.C().w("CloudUtil", "yunfama_report_"+p0+"; value = "+p1, objArray);
       return;
    }
}
