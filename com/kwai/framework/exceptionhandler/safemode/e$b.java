package com.kwai.framework.exceptionhandler.safemode.e$b;
import pm7.c;
import java.lang.Object;
import q66.c;
import rm7.a;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import com.kwai.framework.exceptionhandler.safemode.e;
import com.google.gson.Gson;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Throwable;
import java.lang.StringBuilder;
import org.json.JSONObject;
import rm7.m;
import java.util.concurrent.CountDownLatch;
import rm7.i;
import rm7.s;
import java.lang.System;
import com.kwai.framework.exceptionhandler.safemode.SafeModeDebugLog;

public class e$b implements c	// class@001552
{

    public void e$b(){
       super();
    }
    public void e$b(c p0){
       super();
    }
    public void onEvent(a p0,String p1,Object[] p2){
       int i;
       String str;
       HashMap hashMap = new HashMap();
       hashMap.put("event", p0.b());
       hashMap.put("robustId", p1);
       hashMap.put("ReportValue", p0.i());
       try{
          i = 1;
          str = e.e0.q(hashMap);
       }catch(java.lang.Exception e0){
          HashMap hashMap1 = new HashMap();
          Iterator iterator = str.entrySet().iterator();
       label_0032 :
          if (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry.getValue() instanceof Throwable) {
                hashMap1.put(uEntry.getKey(), uEntry.getValue().toString());
                goto label_0032 ;
             }else {
                hashMap1.put(uEntry.getKey(), uEntry.getValue());
                goto label_0032 ;
             }
          }else {
             Object[] objArray = new Object[2];
             objArray[0] = p0.b();
             objArray[i] = new JSONObject(hashMap1);
             str = String.format("onEvent exception:%s,realValue=%s", objArray)+e0;
          }
       }
       if (p0.d()) {
          if (p0 instanceof m) {
             e.f0.countDown();
             e.m0 = i;
          }
       }else if(p0 instanceof i){
          e.f0.countDown();
          e.m0 = i;
       }else if(p0 instanceof s){
          e.f0.countDown();
          e.m0 = i;
       }
       e.l0 = i;
       e.j0 = System.currentTimeMillis();
       e.k0 = str;
       SafeModeDebugLog.f("SafeMode", "robust2 event: "+str);
       return;
    }
}
