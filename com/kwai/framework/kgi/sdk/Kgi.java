package com.kwai.framework.kgi.sdk.Kgi;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import noa.a;
import xma.c;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.j;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import xma.b;
import erd.g;
import crd.b;
import ooa.a;
import java.lang.Integer;
import java.util.List;
import trd.t;
import com.yxcorp.gifshow.growth.kgi.redpacket.consumer.KgiRedPacketConsumer$register$1;
import msd.l;
import qoa.c;
import roa.a;
import com.yxcorp.gifshow.growth.kgi.staydialogs.consumer.KgiStayDialogsConsumer$register$1;
import wf5.c;
import wf5.b;
import p76.e;
import ooa.d;
import ooa.c;
import roa.c;
import roa.b;
import msd.a;
import kotlin.jvm.internal.a;
import s76.a;
import q76.a;
import java.lang.StringBuilder;
import y76.b;
import com.kwai.framework.kgi.sdk.Kgi$observeKgiEvent$filterChannel$1;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import com.kwai.robust.PatchProxyResult;
import p76.d;
import w76.e;
import kotlin.Pair;
import w76.a;
import com.kwai.framework.kgi.sdk.Kgi$a;
import java.lang.Boolean;
import x76.a;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfig;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfigItem;
import fg6.a;
import java.util.ArrayList;
import trd.u;
import com.kwai.framework.kgi.sdk.internal.config.KgiChannelConfigItem;
import com.google.gson.Gson;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.framework.kgi.sdk.internal.init.KgiInit$registerKgi$1;
import trd.y;
import java.util.Map;
import p76.b;

public final class Kgi	// class@001582
{
    public static final Kgi a;

    static {
       Kgi.a = new Kgi();
    }
    public void Kgi(){
       super();
    }
    public static final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, Kgi.class, "2")) {
          return;
       }
       String str = "1";
       if (!PatchProxy.applyVoid(objArray, objArray, a.class, str)) {
          c b = c.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, c.class, str)) {
             RxBus.f.g(j.class, RxBus$ThreadMode.MAIN).subscribe(b.b);
          }
          Kgi.d(a.class, t.k(Integer.valueOf(1)), KgiRedPacketConsumer$register$1.INSTANCE);
       }
       if (!PatchProxy.applyVoid(objArray, objArray, c.class, str)) {
          Kgi.d(a.class, t.k(Integer.valueOf(2)), KgiStayDialogsConsumer$register$1.INSTANCE);
       }
       return;
    }
    public static final void b(){
       String str = "1";
       if (PatchProxy.applyVoid(null, null, Kgi.class, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, c.class, str)) {
          Kgi.e(3, new b(), 1);
       }
       if (!PatchProxy.applyVoid(null, null, d.class, str)) {
          Kgi.f(1, new c(), false, 4, null);
       }
       if (!PatchProxy.applyVoid(null, null, c.class, str)) {
          Kgi.f(2, new b(), false, 4, null);
       }
       return;
    }
    public static final void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Kgi.class, "5")) {
          return;
       }
       String str = "supplier";
       a.p(p0, str);
       if (!PatchProxy.applyVoidOneRefs(p0, null, a.class, "12")) {
          a.p(p0, str);
          if (a.e()) {
             p0.invoke().g();
          }
       }
       return;
    }
    public static final void d(Class p0,List p1,l p2){
       Object obj;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, Kgi.class, "7")) {
          return;
       }
       a.p(p0, "eventType");
       a.p(p1, "channelIds");
       a.p(p2, "eventConsumer");
       Kgi$observeKgiEvent$filterChannel$1 oobserveKgiE = new Kgi$observeKgiEvent$filterChannel$1(p1, p2);
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          int i = iterator.next().intValue();
          int i1 = 0;
          Kgi kgi = Kgi.class;
          d uod = null;
          if (PatchProxy.isSupport(kgi)) {
             obj = PatchProxy.applyTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), uod, kgi, "8");
             if (obj != PatchProxyResult.class) {
             label_006d :
                if (obj != null) {
                   oobserveKgiE.invoke(obj);
                }
             }
          }
          Pair pair = e.e.a(i, i1);
          d second = (pair != null)? pair.getSecond(): uod;
          if (second instanceof d) {
             uod = second;
          }
          obj = uod;
          goto label_006d ;
       }
       a.b.b(p0, RxBus$ThreadMode.MAIN, new Kgi$a(oobserveKgiE));
       return;
    }
    public static final void e(int p0,e p1,boolean p2){
       e obj;
       Gson a;
       ArrayList uArrayList;
       Object obj1;
       if (PatchProxy.isSupport(Kgi.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), null, Kgi.class, "3")) {
          return;
       }
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), null, a.class, "3")) {
          KgiConfig kgiConfig = KgiConfig.class;
          int i = 2;
          boolean b = true;
          if (PatchProxy.isSupport(kgiConfig)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, kgiConfig, "17");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
             label_0061 :
                kgiConfig = KgiConfig.g;
                if (kgiConfig.f(p0)) {
                   KgiConfigItem kgiConfigIte = kgiConfig.d();
                   kgiConfigIte = (kgiConfigIte != null)? kgiConfigIte.channelConfigs: null;
                   StringBuilder str = "KgiConfig#isEnable : channelConfigs = ";
                   a = a.a;
                   if (kgiConfigIte != null) {
                      uArrayList = new ArrayList(u.Y(kgiConfigIte, 10));
                      Iterator iterator = kgiConfigIte.iterator();
                      while (iterator.hasNext()) {
                         KgiChannelConfigItem kgiChannelCo = iterator.next();
                         Integer integer = (kgiChannelCo != null)? Integer.valueOf(kgiChannelCo.channelId): null;
                         uArrayList.add(integer);
                      }
                   }else {
                      uArrayList = null;
                   }
                   b.e(str+a.q(uArrayList), false, i, null);
                   if (kgiConfigIte != null) {
                      Iterator iterator1 = kgiConfigIte.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            obj1 = iterator1.next();
                            Object obj2 = obj1;
                            obj2 = (obj2 != null && obj2.channelId == p0)? 1: null;
                            if (!obj2) {
                               continue ;
                            }
                         }else {
                            obj1 = null;
                         }
                      }
                   }else {
                      obj1 = null;
                   }
                   if (obj1 == null) {
                   label_00e2 :
                      b = false;
                   }
                }
             }
          }else {
             goto label_0061 ;
          }
          if (p0 < 0 || !b) {
             b.e("KgiInit#registerKgi : cannot add ["+p0+"] , isEnable = "+b, false, i, null);
          }else if(p2){
             a.c.addIfAbsent(Integer.valueOf(p0));
          }else {
             y.K0(a.c, new KgiInit$registerKgi$1(p0));
          }
          List b1 = a.b;
          if (!b1.contains(Integer.valueOf(p0))) {
             b.e("KgiInit#registerKgi : add ["+p0+']', false, i, null);
             b1.add(Integer.valueOf(p0));
             e e = e.e;
             Objects.requireNonNull(e);
             obj = e.class;
             if (!PatchProxy.isSupport(obj) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, e, obj, "3")) {
                e.a.put(Integer.valueOf(p0), p1);
                if (p1 instanceof b) {
                   e.b.put(Integer.valueOf(p0), p1);
                }
             }
          }
       }
       return;
    }
    public static void f(int p0,e p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = false;
       }
       Kgi.e(p0, p1, p2);
       return;
    }
}
