package com.kwai.platform.keventbus.KEventBus;
import zk.d;
import com.google.gson.Gson;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import ph7.g;
import java.util.ArrayList;
import java.util.NavigableMap;
import java.util.Collection;
import qrd.l1;
import java.util.Iterator;
import java.util.List;
import dn.b;
import com.kwai.platform.keventbus.KEventMap;
import java.util.HashMap;
import java.util.Map;
import com.kwai.platform.keventbus.KEventBus$a;
import org.json.JSONObject;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.kwai.platform.keventbus.KEventBus$ThreadMode;
import java.lang.Boolean;
import java.lang.Integer;
import com.jakewharton.rxrelay2.PublishRelay;
import ph7.c;
import brd.w;
import ph7.b;
import java.lang.Enum;
import ph7.l;
import brd.z;
import ph7.j;
import com.kwai.platform.keventbus.KEventBus$b;
import erd.r;
import com.kwai.platform.keventbus.KEventBus$c;
import erd.o;

public final class KEventBus	// class@001287
{
    public static TreeMap a;
    public static ConcurrentHashMap b;
    public static Gson c;
    public static final KEventBus d;

    static {
       KEventBus.d = new KEventBus();
       d uod = new d();
       uod.j();
       Gson gson = uod.b();
       a.o(gson, "GsonBuilder\(\)\n        .s¡­alues\(\)\n        .create\(\)");
       KEventBus.c = gson;
       KEventBus.a = new TreeMap();
       KEventBus.b = new ConcurrentHashMap();
    }
    public void KEventBus(){
       super();
    }
    public final void a(Object p0){
       TreeMap a;
       if (PatchProxy.applyVoidOneRefs(p0, this, KEventBus.class, "2")) {
          return;
       }
       a.p(p0, "event");
       g.a("KEventBus", "post "+p0.getClass());
       a = KEventBus.a;
       a.m(a);
       _monitor_enter(a);
       TreeMap a1 = KEventBus.a;
       a.m(a1);
       _monitor_exit(a);
       Iterator iterator = new ArrayList(a1.descendingMap().values()).iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          a.m(uob);
          uob.accept(p0);
          KEventMap c = KEventMap.c;
          if (c.a().containsKey(p0.getClass())) {
             String str = c.a().get(p0.getClass());
             if (str != null) {
                uob.accept(new KEventBus$a(str, new JSONObject(KEventBus.c.q(p0))));
             }
          }
       }
       return;
    }
    public final t b(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KEventBus.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "eventType");
       return this.c(p0, KEventBus$ThreadMode.POSTING, false, false);
    }
    public final t c(Class p0,KEventBus$ThreadMode p1,boolean p2,int p3){
       TreeMap obj;
       TreeMap a;
       t ot;
       if (PatchProxy.isSupport(KEventBus.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Integer.valueOf(p3), this, KEventBus.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "eventType");
       obj = KEventBus.a;
       a.m(obj);
       _monitor_enter(obj);
       a = KEventBus.a;
       a.m(a);
       b uob = a.get(Integer.valueOf(p3));
       if (uob == null) {
          uob = PublishRelay.d();
          TreeMap a1 = KEventBus.a;
          a.m(a1);
          a1.put(Integer.valueOf(p3), uob);
       }
       b uob1 = uob;
       _monitor_exit(obj);
       char c = ' ';
       g.a("KEventBus", "toObservable "+p0+c+p1+c+p2+c+p3);
       if (PatchProxy.isSupport(KEventBus.class)) {
          ot = PatchProxy.applyFourRefs(uob1, p0, p1, Boolean.valueOf(p2), this, KEventBus.class, "19");
          if (ot != PatchProxyResult.class) {
          }else {
          label_0097 :
             a.m(uob1);
             ot = uob1.ofType(p0);
             if (p2) {
                ot = ot.startWith(new c(p0));
             }
             a.o(ot, "observable");
             p0 = PatchProxy.applyTwoRefs(ot, p1, this, KEventBus.class, "20");
             if (p0 != PatchProxyResult.class) {
                ot = p0;
             }else if(p1 == null){
                int i = b.a[p1.ordinal()];
                if (i != 1) {
                   if (i != 2) {
                      if (i != 3) {
                         if (i == 4) {
                            ot = ot.observeOn(l.c.d());
                         }
                      }else {
                         ot = ot.observeOn(l.c.c());
                      }
                   }else {
                      ot = ot.observeOn(l.c.b());
                   }
                }else {
                   ot = ot.observeOn(j.c);
                }
             }
          }
       }else {
          goto label_0097 ;
       }
       return ot;
    }
    public final t d(String p0,Class p1){
       t ot;
       t obj = PatchProxy.applyTwoRefs(p0, p1, this, KEventBus.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "eventType");
       a.p(p1, "eventValue");
       obj = this.b(KEventBus$a.class);
       if (obj != null) {
          ot = obj.filter(new KEventBus$b(p0, p1));
          if (ot != null) {
             ot = ot.map(KEventBus$c.b);
          label_0034 :
             return ot;
          }
       }
       ot = null;
       goto label_0034 ;
    }
}
