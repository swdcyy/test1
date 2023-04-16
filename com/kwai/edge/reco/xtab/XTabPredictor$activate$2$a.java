package com.kwai.edge.reco.xtab.XTabPredictor$activate$2$a;
import erd.g;
import java.lang.Object;
import sm7.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wj5.c;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.utility.Log;
import java.lang.Throwable;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.InferenceState;
import ml5.a;
import java.lang.Long;
import zsd.t;
import fg6.a;
import java.util.Map;
import com.google.gson.Gson;
import yj5.b;
import msd.l;
import qrd.l1;
import com.kwai.sdk.eve.proto.CustomEvent;
import yj5.c;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import wn7.j;
import com.kwai.sdk.eve.internal.statistics.inference.ProcessorInfo;
import java.lang.System;
import yj5.a;
import nsd.u;
import com.kwai.edge.reco.xtab.log.XTabResultLogger;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kwai.edge.reco.xtab.config.XTabPredictConfig;
import xj5.a;
import wj5.a;
import android.os.SystemClock;
import java.lang.Runnable;
import ekd.k1;
import wj5.b;

public final class XTabPredictor$activate$2$a implements g	// class@000d5b
{
    public static final XTabPredictor$activate$2$a b;

    static {
       XTabPredictor$activate$2$a.b = new XTabPredictor$activate$2$a();
    }
    public void XTabPredictor$activate$2$a(){
       super();
    }
    public void accept(Object p0){
       Gson a;
       String str4;
       l1 ol1;
       c uoc2;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, XTabPredictor$activate$2$a.class, "1")) {
       }else {
          c o = c.o;
          a.o(obj, "it");
          Objects.requireNonNull(o);
          if (!PatchProxy.applyVoidOneRefs(obj, o, c.class, "7")) {
             String str = "XTabPredictor";
             Log.g(str, "onInferResult start run");
             String str1 = " result:";
             String str2 = " state:";
             if (obj.a() != null) {
                Log.e(str, "onInferResult with error not null"+", id:"+obj.b()+str2+obj.g()+str1+obj.f(), obj.a());
             }else {
                a uoa = obj.f();
                StringBuilder str3 = (uoa != null)? uoa.g(): null;
                c uoc = null;
                boolean b = true;
                str3 = (str3 == null || !str3.length())? 1: null;
                if (str3) {
                   Log.d(str, "onInferResult with empty result, id:"+obj.b()+str2+obj.g());
                }else if(t.Z0(obj.b()) == null){
                   Log.d(str, "onInferResult id:"+obj.b()+" not time type"+", state:"+obj.g()+str1+obj.f());
                }else {
                   a = a.a;
                   a uoa1 = obj.f();
                   Map map = (uoa1 != null)? uoa1.d(): null;
                   Log.g(str, "onInferResult finish: "+a.q(map));
                   uoa1 = obj.f();
                   str2 = "";
                   if (uoa1 != null) {
                      map = uoa1.d();
                      if (map != null) {
                         str1 = map.get("action");
                         if (str1 != null) {
                         label_012e :
                            a uoa2 = obj.f();
                            if (uoa2 != null) {
                               Map map1 = uoa2.d();
                               if (map1 != null) {
                                  str4 = map1.get("tab");
                                  if (str4 != null) {
                                  label_0146 :
                                     l d = c.d;
                                     if (d != null) {
                                        ol1 = d.invoke(new b(str1, str4));
                                     }
                                     uoa1 = obj.h();
                                     if (uoa1 != null) {
                                        map = uoa1.d();
                                        if (map != null) {
                                           str1 = map.get("protoData");
                                        label_016b :
                                           if (!str1 instanceof CustomEvent) {
                                              str1 = null;
                                           }
                                           str1 = (str1 != null)? str1.getCustomValue(): null;
                                           c uoc1 = (str1 != null)? a.h(str1, c.class): null;
                                           if (uoc1 != null) {
                                              uoc = uoc1.triggerType;
                                           }
                                           if (uoc1 != null) {
                                              uoc1 = uoc1.randomUUID;
                                              if (uoc1 != null) {
                                                 uoc2 = uoc1;
                                              }
                                           }
                                           String str5 = obj.b();
                                           LinkedHashMap linkedHashMa = new LinkedHashMap();
                                           Map map2 = obj.e();
                                           if (map2 != null) {
                                              Set set = map2.entrySet();
                                              if (set != null) {
                                                 Iterator iterator = set.iterator();
                                                 while (iterator.hasNext()) {
                                                    Map$Entry uEntry = iterator.next();
                                                    str4 = uEntry.getValue().a();
                                                    if (!str4 instanceof a) {
                                                       str4 = null;
                                                    }
                                                    if (str4 != null) {
                                                       map1 = str4.d();
                                                       if (map1 != null) {
                                                          linkedHashMa.putAll(map1);
                                                       }
                                                    }
                                                    Log.d(str, "result of "+uEntry.getKey()+" is not map"+", result:"+a.a.q(uEntry.getValue().a()));
                                                    ol1 = l1.a;
                                                 }
                                                 uoa2 = new a(str5, uoc, linkedHashMa, System.currentTimeMillis(), false, 16, null);
                                                 if (uoc != 3) {
                                                    if (uoc != 4) {
                                                       if (uoc != 5) {
                                                          XTabResultLogger.b.a(str);
                                                       }else {
                                                          c.j = b;
                                                          g.a(c.k.edit().putString("xtabInferResult_loadmore", a.a.q(str)));
                                                       }
                                                    }else if(c.c.a().reportIntervalTimeLabelSeparate != null){
                                                       XTabResultLogger.b.a(str);
                                                       uoa1 = new a(obj.b(), 7, null, System.currentTimeMillis(), false, 16, null);
                                                    }
                                                    g.a(c.k.edit().putString("xtabInferResultInternalTime", a.a.q(str)));
                                                    c.m = new a(str);
                                                    c.n = SystemClock.elapsedRealtime();
                                                    k1.r(c.m, c.c.a().b());
                                                 }else {
                                                    XTabResultLogger.b.a(str);
                                                    if (c.c.a().enableDelayReport != null) {
                                                       k1.r(new b(uoc2), c.c.a().delayReportTime);
                                                    }
                                                 }
                                              }
                                           }
                                           Log.d(str, "processorResults is null");
                                           goto label_0212 ;
                                        }
                                     }
                                     str1 = null;
                                     goto label_016b ;
                                  }
                               }
                            }
                            str4 = str2;
                            goto label_0146 ;
                         }
                      }
                   }
                   str1 = str2;
                   goto label_012e ;
                }
             }
          }
          c.d(c.o, null);
       }
       return;
    }
}
