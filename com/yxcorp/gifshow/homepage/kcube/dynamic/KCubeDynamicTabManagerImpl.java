package com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl;
import cta.e;
import com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl$a;
import nsd.u;
import java.lang.Object;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl$b;
import java.lang.Runnable;
import t45.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import cta.d;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import on5.m;
import zr6.i;
import java.util.Map;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import xn5.a;
import on5.h$a;
import java.util.Collection;
import kotlin.Pair;
import cta.a;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl$removeAllDynamicTabChangeListener$1;
import msd.l;
import trd.y;
import cta.c;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Status;
import com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl$removeDynamicTabChangeListener$$inlined$let$lambda$1;
import ob6.p;
import com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl$c;
import ob6.p$b;
import ob6.p$a;
import com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl$d;
import java.lang.reflect.Type;
import el.a;
import da6.d;
import android.content.SharedPreferences;
import km8.b;
import brd.t;
import java.lang.Number;
import java.lang.Integer;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.x;
import xn5.b;
import xn5.b$b;
import crd.b;
import lnc.b9;
import yb6.d;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import cta.f;
import erd.g;
import io.reactivex.internal.functions.Functions;

public class KCubeDynamicTabManagerImpl implements e	// class@00172d
{
    public final a a;
    public List b;
    public List c;
    public final List d;
    public b e;
    public final Map f;
    public final List g;
    public AtomicBoolean h;
    public AtomicInteger i;
    public static final KCubeDynamicTabManagerImpl$a j;

    static {
       KCubeDynamicTabManagerImpl.j = new KCubeDynamicTabManagerImpl$a(null);
    }
    public void KCubeDynamicTabManagerImpl(){
       super();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create\(\)");
       this.a = uoa;
       this.d = new ArrayList();
       this.f = new LinkedHashMap();
       this.g = new ArrayList();
       this.h = new AtomicBoolean(false);
       this.i = new AtomicInteger(false);
    }
    public final List a(List p0,String p1){
       Object[] objArray;
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, KCubeDynamicTabManagerImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          c.a(new KCubeDynamicTabManagerImpl$b(p1, p0));
       }
       ArrayList uArrayList = null;
       if (p0 != null) {
          obj = new ArrayList();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             Object obj2 = obj1;
             d a = d.a;
             Objects.requireNonNull(a);
             DynamicTabConfig obj3 = PatchProxy.applyOneRefs(obj2, a, d.class, "1");
             boolean b = false;
             if (obj3 != PatchProxyResult.class) {
                b = obj3.booleanValue();
             }else {
                a.p(obj2, "config");
                String str = "KCubeDynamicTabDataChecker";
                if (TextUtils.x(obj2.mType) || TextUtils.x(obj2.mId)) {
                   objArray = new Object[b];
                   b.C().w(str, "type or id is NULL, config = "+obj2.logInfo(), objArray);
                   a.c.a(obj2, "type or id is NULL");
                }else {
                   obj3 = obj2.mType;
                   Object obj4 = PatchProxy.applyOneRefs(obj3, uArrayList, m.class, "6");
                   if (obj4 != PatchProxyResult.class) {
                   }else {
                      obj4 = m.a.get(obj3);
                   }
                   if (obj4 == null) {
                      objArray = new Object[b];
                      b.C().w(str, "type not support, config = "+obj2.logInfo(), objArray);
                      a.c.a(obj2, "type not support");
                   }else if(obj4 instanceof h$a && !obj4.a(obj2)){
                      objArray = new Object[b];
                      b.C().w(str, "check data fail, config = "+obj2.logInfo(), objArray);
                      a.c.a(obj2, "check data fail");
                   }else {
                      b = true;
                   }
                }
             }
             if (b) {
                obj.add(obj1);
             }
          }
          uArrayList = obj;
       }
       return uArrayList;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, KCubeDynamicTabManagerImpl.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.h.get();
    }
    public List c(){
       ArrayList obj = PatchProxy.apply(null, this, KCubeDynamicTabManagerImpl.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.addAll(this.d);
       return obj;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, KCubeDynamicTabManagerImpl.class, "19")) {
          return;
       }
       this.h.set(false);
       this.i.set(false);
       this.d.clear();
       this.a.onNext(new Pair(null, null));
       a.c.b();
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeDynamicTabManagerImpl.class, "6")) {
          return;
       }
       a.p(p0, "listener");
       this.g.add(new WeakReference(p0));
       return;
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeDynamicTabManagerImpl.class, "7")) {
          return;
       }
       a.p(p0, "listener");
       y.K0(this.g, new KCubeDynamicTabManagerImpl$removeAllDynamicTabChangeListener$1(p0));
       return;
    }
    public void f(List p0){
       List list;
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeDynamicTabManagerImpl.class, "8")) {
          return;
       }
       a.p(p0, "list");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          DynamicTabConfig uDynamicTabC = iterator.next();
          Object[] objArray = new Object[0];
          b.C().w("KCubeDynamicTabManagerImpl", "notifyConfigChanged: status "+uDynamicTabC.mStatus+", "+uDynamicTabC.logInfo(), objArray);
          list = this.f.get(uDynamicTabC.mId);
          if (list != null) {
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                c uoc = iterator1.next().get();
                if (uoc != null) {
                   DynamicTabConfig mStatus = uDynamicTabC.mStatus;
                   a.o(mStatus, "config.mStatus");
                   uoc.a(uDynamicTabC, mStatus);
                }else {
                   continue ;
                }
             }
          }
       }
       iterator = this.g.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next().get();
          if (uoa != null) {
             uoa.a(p0);
          }else {
             continue ;
          }
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, KCubeDynamicTabManagerImpl.class, "11")) {
          return;
       }
       this.n(true, this.b, "tryToUpdate");
       return;
    }
    public void h(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KCubeDynamicTabManagerImpl.class, "5")) {
          return;
       }
       a.p(p0, "tabId");
       a.p(p1, "listener");
       List list = this.f.get(p0);
       if (list != null) {
          y.K0(list, new KCubeDynamicTabManagerImpl$removeDynamicTabChangeListener$$inlined$let$lambda$1(p1));
       }
       return;
    }
    public List i(){
       return this.c;
    }
    public void init(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KCubeDynamicTabManagerImpl.class, "1")) {
          return;
       }
       this.i.set(1);
       p.a.a(new KCubeDynamicTabManagerImpl$c(this));
       a.c.d();
       Type type = new KCubeDynamicTabManagerImpl$d().getType();
       String str = d.a.getString("DynamicTabs", "null");
       if (str != null && str != "") {
          objArray = b.a(str, type);
       }
       List list = this.a(objArray, "init");
       this.b = list;
       this.n(false, list, "init");
       return;
    }
    public void j(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KCubeDynamicTabManagerImpl.class, "4")) {
          return;
       }
       a.p(p0, "tabId");
       a.p(p1, "listener");
       List list = this.f.get(p0);
       if (list == null) {
          list = new ArrayList();
          this.f.put(p0, list);
       }
       list.add(new WeakReference(p1));
       return;
    }
    public t k(){
       return this.a;
    }
    public int l(){
       Object obj = PatchProxy.apply(null, this, KCubeDynamicTabManagerImpl.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.i.get();
    }
    public void m(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeDynamicTabManagerImpl.class, "9")) {
          return;
       }
       a.p(p0, "list");
       KCubeDynamicTabManagerImpl td = this.d;
       td.clear();
       td.addAll(p0);
       return;
    }
    public final void n(boolean p0,List p1,String p2){
       Iterator obj2;
       DynamicTabConfig mType;
       ArrayList uArrayList3;
       PatchProxyResult patchProxyRe1;
       String str1;
       Iterator integer2;
       Object obj3;
       KCubeDynamicTabManagerImpl kCubeDynamic = this;
       int b = p0;
       Object obj = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(KCubeDynamicTabManagerImpl.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, KCubeDynamicTabManagerImpl.class, "12")) {
          return;
       }
       b uob = b.C();
       StringBuilder str = "onConfigUpdated notify "+b+", configs ";
       Object[] objArray = null;
       Integer integer = (obj)? Integer.valueOf(p1.size()): objArray;
       Object[] objArray1 = new Object[0];
       uob.w("KCubeDynamicTabManagerImpl", str+integer+", reason "+p2, objArray1);
       a c = a.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(objArray, c, a.class, "2") && !a.b) {
          c.d();
       }
       ArrayList uArrayList = new ArrayList();
       KCubeDynamicTabManagerImpl c1 = kCubeDynamic.c;
       if (c1 != null) {
          uArrayList.addAll(c1);
       }
       ArrayList uArrayList1 = new ArrayList();
       if (obj) {
          List list = CollectionsKt___CollectionsKt.b5(p1);
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             DynamicTabConfig mStrategies = iterator.next().mStrategies;
             if (mStrategies != null) {
                x.m0(mStrategies);
             }
          }
          ArrayList uArrayList2 = new ArrayList();
          Iterator iterator1 = list.iterator();
          while (iterator1.hasNext()) {
             Object obj1 = iterator1.next();
             obj2 = obj1;
             mType = obj2.mType;
             b$b String integer1 = PatchProxy.applyOneRefs(mType, objArray, b.class, "4");
             if (integer1 != patchProxyRe) {
             }else {
                integer1 = b.a.get(mType);
                if (integer1 == null) {
                   integer1 = b.b;
                }
             }
             if (integer1.a(obj2)) {
                uArrayList2.add(obj1);
             }
             integer1 = null;
          }
          uArrayList1.addAll(uArrayList2);
       }
       if (PatchProxy.applyVoidOneRefs(obj, kCubeDynamic, KCubeDynamicTabManagerImpl.class, "14")) {
       label_00f9 :
          uArrayList3 = uArrayList;
          patchProxyRe1 = patchProxyRe;
       }else {
          b9.a(kCubeDynamic.e);
          if (obj == null) {
             goto label_00f9 ;
          }else {
             long integer3 = -1;
             obj3 = PatchProxy.apply(objArray, kCubeDynamic, KCubeDynamicTabManagerImpl.class, "15");
             long l = (obj3 != patchProxyRe)? obj3.longValue(): d.a();
             obj2 = p1.iterator();
             while (obj2.hasNext()) {
                mType = obj2.next();
                str1 = ", time ";
                Iterator iterator4 = obj2;
                String str2 = " by config ";
                String str3 = "update delay ";
                int i = 0;
                if (mType.getStartTime() - i && l - mType.getStartTime() < 0) {
                   if (integer3 - i >= 0) {
                      long l1 = mType.getStartTime() - l;
                      if (l1 - integer3 >= 0) {
                      label_01a3 :
                         uArrayList3 = uArrayList;
                         patchProxyRe1 = patchProxyRe;
                      label_01a7 :
                         long l3 = 0;
                         if (mType.getEndTime() - l3 && l - mType.getEndTime() < 0) {
                            if (integer3 - l3 >= 0) {
                               l3 = mType.getEndTime() - l;
                               if (l3 - integer3 >= 0) {
                               label_0217 :
                                  obj2 = iterator4;
                                  patchProxyRe = patchProxyRe1;
                                  uArrayList = uArrayList3;
                                  str1 = null;
                               }
                            }
                            integer3 = mType.getEndTime() - l;
                            l3 = integer3;
                            objArray1 = new Object[0];
                            b.C().w("KCubeDynamicTabManagerImpl", str3+integer3+str2+mType.mType+", "+mType.mId+", endTime "+mType.getEndTime()+str1+l+", delayTime $"+mType.getDelayTime(), objArray1);
                            integer3 = l3;
                            goto label_0217 ;
                         }
                      }
                   }
                   integer3 = mType.getStartTime() - l;
                   patchProxyRe1 = patchProxyRe;
                   uArrayList3 = uArrayList;
                   long l2 = integer3;
                   objArray1 = new Object[0];
                   b.C().w("KCubeDynamicTabManagerImpl", str3+integer3+str2+mType.mType+", "+mType.mId+", startTime "+mType.getStartTime()+str1+l+", delayTime "+mType.getDelayTime(), objArray1);
                   integer3 = l2;
                   goto label_01a7 ;
                }else {
                   goto label_01a3 ;
                }
             }
             uArrayList3 = uArrayList;
             patchProxyRe1 = patchProxyRe;
             if (integer3 - null >= 0) {
                Object[] objArray3 = new Object[0];
                b.C().w("KCubeDynamicTabManagerImpl", "set delay time "+integer3, objArray3);
                kCubeDynamic.e = t.just(Boolean.TRUE).delay(integer3, TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new f(kCubeDynamic, obj), Functions.d());
             }
          }
       }
       ArrayList uArrayList4 = uArrayList3;
       uArrayList = PatchProxy.applyTwoRefs(uArrayList1, uArrayList4, kCubeDynamic, KCubeDynamicTabManagerImpl.class, "13");
       if (uArrayList != patchProxyRe1) {
       }else {
          uArrayList = new ArrayList();
          integer2 = uArrayList1.iterator();
          while (integer2.hasNext()) {
             DynamicTabConfig uDynamicTabC = integer2.next();
             Iterator iterator2 = uArrayList4.iterator();
             while (true) {
                if (iterator2.hasNext()) {
                   obj = iterator2.next();
                   obj3 = obj;
                   obj3 = (a.g(uDynamicTabC.mType, obj3.mType) && a.g(uDynamicTabC.mId, obj3.mId))? 1: null;
                   if (!obj3) {
                      continue ;
                   }
                }else {
                   obj = null;
                }
                if (obj == null) {
                   uArrayList.add(uDynamicTabC);
                }else {
                   b = a.g(uDynamicTabC, obj) ^ 1;
                   if (b) {
                      uArrayList.add(uDynamicTabC);
                   }
                }
                if (obj != null) {
                   uArrayList4.remove(obj);
                }else {
                   continue ;
                }
             }
          }
          Iterator iterator3 = uArrayList4.iterator();
          while (iterator3.hasNext()) {
             uArrayList.add(iterator3.next());
          }
       }
       if (uArrayList.isEmpty()) {
          Object[] objArray2 = new Object[0];
          b.C().w("KCubeDynamicTabManagerImpl", "onConfigUpdated: same configs, return.", objArray2);
          a.c.c();
          return;
       }else {
          kCubeDynamic.c = uArrayList1;
          str1 = "";
          integer2 = uArrayList1.iterator();
          while (integer2.hasNext()) {
             str1 = str1+integer2.next().toString()+"\n";
          }
          objArray1 = new Object[0];
          b.C().w("KCubeDynamicTabManagerImpl", "currentValidConfigs:\n"+str1, objArray1);
          if (p0 && !PatchProxy.applyVoidTwoRefs(uArrayList1, uArrayList, kCubeDynamic, KCubeDynamicTabManagerImpl.class, "16")) {
             kCubeDynamic.a.onNext(new Pair(uArrayList1, uArrayList));
          }
          return;
       }
    }
}
