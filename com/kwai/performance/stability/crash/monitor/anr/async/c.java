package com.kwai.performance.stability.crash.monitor.anr.async.c;
import java.lang.reflect.InvocationHandler;
import java.lang.Object;
import java.lang.reflect.Method;
import com.kwai.performance.stability.crash.monitor.anr.async.MessageUtils;
import java.lang.String;
import android.os.Message;
import android.os.Handler;
import java.lang.StringBuilder;
import yf7.h;
import java.lang.Exception;
import java.lang.Throwable;
import android.util.Log;
import java.lang.System;
import java.lang.Long;

public final class c implements InvocationHandler	// class@0011af
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object invoke(Object p0,Method p1,Object[] p2){
       p0 = p1.getName();
       int i = 1;
       if (p0.equals("messageDispatched")) {
          p0 = p2[i];
          if (p0.getTarget() == MessageUtils.e()) {
             h.d("MessageUtils", "messageDispatched\(\) | "+p0);
          }
       }else if(p0.equals("dispatchingThrewException")){
          p0 = p2[i];
          object oobject = p2[2];
          if (p0.getTarget() == MessageUtils.e()) {
             h.g("MessageUtils", "dispatchingThrewException\(\) | "+p0);
             h.g("MessageUtils", "dispatchingThrewException\(\) | "+Log.getStackTraceString(oobject));
          }
       }else if(p0.equals("messageDispatchStarting")){
          p0 = Long.valueOf(System.currentTimeMillis());
       label_008c :
          return p0;
       }
       p0 = null;
       goto label_008c ;
    }
}
