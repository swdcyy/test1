package com.yxcorp.gifshow.apm.PerfLaunchHttpLogInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.lang.StringBuilder;
import java.lang.System;
import android.os.Trace;
import java.lang.Long;
import java.io.File;
import android.app.Application;
import o56.a;
import qkd.b;
import fg6.a;
import com.yxcorp.gifshow.apm.PerfLaunchHttpLogInterceptor$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import java.util.Map;
import t06.b;
import q87.c;
import java.lang.Exception;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Thread;
import java.lang.InterruptedException;

public class PerfLaunchHttpLogInterceptor implements Interceptor	// class@001056
{
    public Map a;
    public boolean b;

    public void PerfLaunchHttpLogInterceptor(){
       super();
       this.b = false;
    }
    public Response intercept(Interceptor$Chain p0){
       Object[] objArray1;
       Map map = this;
       PerfLaunchHttpLogInterceptor obj = p0;
       PerfLaunchHttpLogInterceptor perfLaunchHt = PerfLaunchHttpLogInterceptor.class;
       Request obj1 = PatchProxy.applyOneRefs(obj, map, perfLaunchHt, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = p0.request();
       String str = obj1.url().encodedPath();
       long l = System.currentTimeMillis();
       Trace.beginSection("kwai_url_"+obj1.url().host()+str);
       Response response = obj.proceed(obj1);
       Trace.endSection();
       int i = 0;
       if (!PatchProxy.isSupport(perfLaunchHt) || !PatchProxy.applyVoidTwoRefs(str, Long.valueOf(l), map, perfLaunchHt, "5")) {
          Trace.beginSection("kwai_url_wait");
          if (map.b == null) {
             _monitor_enter(this);
             objArray1 = null;
             if (PatchProxy.applyVoid(objArray1, map, perfLaunchHt, "4")) {
                _monitor_exit(this);
             }else if(map.b != null){
                _monitor_exit(this);
             }else {
                try{
                   File uFile = new File(a.b().getExternalFilesDir(objArray1), "performance/startup/applab_core_api_cost.json");
                   if (uFile.exists()) {
                      map.a = a.a.i(b.f0(uFile), new PerfLaunchHttpLogInterceptor$1(map).getType());
                      Object[] objArray2 = new Object[i];
                      b.C().s("Perf_Launch_Http_Inter", "init apiCost="+map.a, objArray2);
                   }
                }catch(java.lang.Exception e0){
                   e0.printStackTrace();
                }
                map.b = true;
                _monitor_exit(this);
             }
          }
          obj = map.a;
          if (obj != null) {
             Iterator iterator = obj.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                if (str.endsWith(uEntry.getKey())) {
                   Long value = uEntry.getValue();
                   long l1 = System.currentTimeMillis() - l;
                   long l2 = (value == null)? 0: value.longValue();
                   l2 = l2 - l1;
                   objArray1 = new Object[i];
                   b.C().w("Perf_Launch_Http_Inter", "waitIfNeed: path="+str+", apiTime="+value+", costTime="+l1+", waitTime="+l2, objArray1);
                   if (l2 - null > 0) {
                      try{
                         Thread.sleep(l2);
                      }catch(java.lang.InterruptedException e0){
                         e0.printStackTrace();
                         goto label_00de ;
                      }
                   }
                }
             }
             Trace.endSection();
          }
       }
       Object[] objArray = new Object[i];
       b.C().s("Perf_Launch_Http_Inter", "request: "+str+" cost "+(System.currentTimeMillis() - l), objArray);
       return response;
    }
}
