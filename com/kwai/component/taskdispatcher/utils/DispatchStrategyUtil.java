package com.kwai.component.taskdispatcher.utils.DispatchStrategyUtil;
import com.kwai.component.taskdispatcher.utils.DispatchStrategyUtil$mPreferences$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.component.taskdispatcher.utils.DispatchStrategyUtil$mDefaultSlideDispatchConfig$2;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import nh5.c;
import lh5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import java.lang.StringBuilder;
import android.content.SharedPreferences;
import java.lang.System;

public final class DispatchStrategyUtil	// class@000bc1
{
    public static final p a;
    public static AtomicInteger b;
    public static final p c;
    public static a d;
    public static final DispatchStrategyUtil e;

    static {
       DispatchStrategyUtil.e = new DispatchStrategyUtil();
       DispatchStrategyUtil.a = s.c(DispatchStrategyUtil$mPreferences$2.INSTANCE);
       DispatchStrategyUtil.c = s.c(DispatchStrategyUtil$mDefaultSlideDispatchConfig$2.INSTANCE);
    }
    public void DispatchStrategyUtil(){
       super();
    }
    public static final AtomicInteger a(DispatchStrategyUtil p0){
       return DispatchStrategyUtil.b;
    }
    public static final a b(c p0,int p1){
       Map obj;
       Number number;
       DispatchStrategyUtil uDispatchStr = DispatchStrategyUtil.class;
       if (PatchProxy.isSupport(uDispatchStr)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uDispatchStr, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = p0.a();
       int i = -1;
       if (obj != null) {
          Iterator iterator = obj.entrySet().iterator();
          number = -1;
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (p1 >= Integer.parseInt(uEntry.getKey()) && number < uEntry.getValue().intValue()) {
                number = uEntry.getValue().intValue();
             }
          }
       }else {
          number = -1;
       }
       p0 = p0.countLimit;
       if (p0 != null) {
          Iterator iterator1 = p0.entrySet().iterator();
          while (iterator1.hasNext()) {
             Map$Entry uEntry1 = iterator1.next();
             if (p1 >= Integer.parseInt(uEntry1.getKey())) {
                i = uEntry1.getValue().intValue();
             }
          }
       }
       a uoa = (number < 0)? DispatchStrategyUtil.c(): new a(TimeUnit.MILLISECONDS.toNanos((long)number), i);
       return uoa;
    }
    public static final a c(){
       Object obj = PatchProxy.apply(null, null, DispatchStrategyUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DispatchStrategyUtil.c.getValue();
    }
    public static final a e(){
       String str2;
       AtomicInteger b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DispatchStrategyUtil uDispatchStr = DispatchStrategyUtil.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, objArray, uDispatchStr, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = DispatchStrategyUtil.d;
       if (obj != null) {
          a.m(obj);
          return obj;
       }else {
          String obj1 = PatchProxy.apply(objArray, objArray, uDispatchStr, "3");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = a.t().getValue("slide_dispatch_config_data", c.class, objArray);
          }
          if (obj1 != null) {
             a.m(obj1);
             Map map = obj1.a();
             map = (map == null || map.isEmpty())? 1: null;
             if (!map) {
                map = obj1.a();
                a.m(map);
                int i = -1;
                if (!map.containsValue(Integer.valueOf(i))) {
                   AtomicInteger b = DispatchStrategyUtil.b;
                   String str = " , CountThreshold=";
                   StringBuilder str1 = null;
                   if (b != null) {
                      a.m(b);
                      if (b.get() >= 0) {
                         b = DispatchStrategyUtil.b;
                         a.m(b);
                         a uoa = DispatchStrategyUtil.b(obj1, b.get());
                         obj1 = ", TimeThreshold=";
                         str2 = "mDeviceLevel=";
                         if (uoa.b() - str1 <= 0) {
                            b1 = DispatchStrategyUtil.b;
                            a.m(b1);
                            DispatchLogger.d.j("DispatchStrategyUtil", str2+b1.get()+obj1+uoa.b());
                            uoa = DispatchStrategyUtil.c();
                         }else {
                            DispatchStrategyUtil.d = new a(uoa.b(), uoa.a());
                            b1 = DispatchStrategyUtil.b;
                            a.m(b1);
                            DispatchLogger.d.j("DispatchStrategyUtil", str2+b1.get()+obj1+uoa.b()+str+uoa.a());
                         }
                         return uoa;
                      }
                   }
                   DispatchStrategyUtil e = DispatchStrategyUtil.e;
                   i = e.d().getInt("device_level_value", i);
                   long longx = e.d().getLong("device_level_time", str1);
                   DispatchLogger d = DispatchLogger.d;
                   d.j("DispatchStrategyUtil", "spDeviceLevel="+i+" , spDeviceLeveTime="+longx);
                   if (i < 0 || (System.currentTimeMillis() - longx) - 0x19bfcc00 > 0) {
                      d.j("DispatchStrategyUtil", "sp level error, spTime="+longx+", spValue="+i);
                      return DispatchStrategyUtil.c();
                   }else {
                      a uoa1 = DispatchStrategyUtil.b(obj1, i);
                      str2 = "TimeThreshold=";
                      if (uoa1.b() - str1 <= 0) {
                         d.j("DispatchStrategyUtil", str2+uoa1.b());
                         uoa1 = DispatchStrategyUtil.c();
                      }else {
                         d.j("DispatchStrategyUtil", str2+uoa1.b()+str+uoa1.a());
                      }
                      return uoa1;
                   }
                }
             }
             DispatchLogger.d.j("DispatchStrategyUtil", "slide dispatch config timeLimt is null");
             return DispatchStrategyUtil.c();
          }else {
             return DispatchStrategyUtil.c();
          }
       }
    }
    public final SharedPreferences d(){
       Object obj = PatchProxy.apply(null, this, DispatchStrategyUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DispatchStrategyUtil.a.getValue();
    }
}
