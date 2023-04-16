package com.kwai.framework.location.util.a;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.lang.System;
import java.lang.Long;
import java.lang.Float;
import u96.b;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import java.lang.Integer;
import java.lang.Boolean;

public class a	// class@001656
{

    public void a(){
       super();
    }
    public static Map a(){
       HashMap obj = PatchProxy.apply(null, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("timeStamp", Long.valueOf(System.currentTimeMillis()));
       return obj;
    }
    public static void b(Map p0,String p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, uoa, "6")) {
          return;
       }
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(0x3f800000), null, a.class, "7")) {
          c.k(new b(0x3f800000, p1, p0));
       }
       return;
    }
    public static void c(String p0,int p1,long p2,long p3,String p4,String p5,String p6,int p7,boolean p8,String p9){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Long.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = p9;
          if (PatchProxy.applyVoid(objArray, null, uoa, "5")) {
             return;
          }
       }
       Map map = a.a();
       map.put("sdk_type", p0);
       map.put("event_type", Integer.valueOf(p1));
       map.put("request_duration", Long.valueOf(p2));
       map.put("request_start_time", Long.valueOf(p3));
       map.put("biz_code", p4);
       map.put("stat_key", p5);
       map.put("scene", p6);
       map.put("errorCode", Integer.valueOf(p7));
       map.put("location_enabled", Boolean.valueOf(p8));
       a.b(map, p9);
       return;
    }
    public static void d(String p0,int p1,long p2,long p3,String p4,String p5,String p6,int p7,boolean p8){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Long.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, null, uoa, "4")) {
             return;
          }
       }
       a.c(p0, p1, p2, p3, p4, p5, p6, p7, p8, "LOCATION_ERROR_EVENT");
       return;
    }
    public static void e(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "2")) {
          return;
       }
       Map map = a.a();
       map.put("biz_code", p0);
       map.put("stat_key", p1);
       map.put("scene", p2);
       a.b(map, "LOCATION_START_EVENT");
       return;
    }
}
