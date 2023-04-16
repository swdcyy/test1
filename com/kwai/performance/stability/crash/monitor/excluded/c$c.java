package com.kwai.performance.stability.crash.monitor.excluded.c$c;
import java.lang.reflect.InvocationHandler;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.String;
import com.kwai.performance.stability.crash.monitor.util.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.performance.stability.crash.monitor.util.g;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.System;
import yf7.h;
import com.kwai.performance.stability.crash.monitor.excluded.c;
import com.kwai.performance.stability.crash.monitor.message.CatchedException;
import java.lang.Exception;
import com.kwai.performance.stability.crash.monitor.excluded.c$a;
import android.app.Application;
import yf7.k;
import android.app.Activity;
import yf7.p;
import java.lang.Throwable;
import android.util.Log;

public class c$c implements InvocationHandler	// class@0011d8
{
    public Object b;

    public void c$c(Object p0){
       super();
       this.b = p0;
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       c$a g;
       p0 = null;
       if (p1 == null) {
          e.v("BadToken", "badcase1: method obj null");
          return p0;
       }else {
          String name = p1.getName();
          if (TextUtils.isEmpty(name)) {
             e.v("BadToken", "badcase2: methodName empty");
             return p0;
          }else {
             CatchedException uCatchedExce = 1;
             c$c uoc = (name.contains("addToDisplay") && p2.length > 3)? 1: null;
             if (uoc) {
                int i = g.d(p2[2], "type").intValue();
                int i1 = p1.invoke(this.b, p2).intValue();
                String str = "type: "+i+", ret:"+i1+", t: "+System.currentTimeMillis();
                e.v("BadToken", str);
                h.d("BadToken", str);
                if (i >= 1000 && (i < 2000 && (i1 == -1 || i1 == -2))) {
                   g = c.g;
                   if (g != null) {
                      g.a(new CatchedException("PopupWindow BadTokenException"));
                   }
                   return Integer.valueOf(-6);
                }else if(i == uCatchedExce && (i1 == -1 || i1 == -2)){
                   Activity uActivity = p.a(k.b());
                   if (uActivity != null) {
                      c$a g1 = c.g;
                      if (g1 != null) {
                         g1.a(new CatchedException("PopupWindow BadTokenException"));
                      }
                      uActivity.finish();
                      e.v("BadToken", str+"\(Fixed\)");
                      return Integer.valueOf(-6);
                   }
                }
                return Integer.valueOf(i1);
             }else {
                return p1.invoke(this.b, p2);
             }
          }
       }
    }
}
