package com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter$Companion;
import java.lang.Object;
import nsd.u;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import com.kwai.framework.kgi.sdk.internal.store.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;
import java.lang.Number;
import com.kwai.framework.kgi.sdk.internal.store.EvictingQueue;
import java.lang.StringBuilder;
import y76.b;
import com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter$Companion$getAllListByChannelId$$inlined$forEach$lambda$1;
import msd.l;
import com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter$Companion$a;
import java.util.Comparator;
import trd.x;
import com.kwai.framework.kgi.sdk.internal.feature.a;
import java.lang.reflect.Type;
import el.a;
import n76.a;
import android.content.SharedPreferences;
import km8.b;
import a86.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter;
import java.util.Objects;
import java.lang.Boolean;
import x76.a;
import r76.a;
import q76.a;
import q76.b;
import w76.a;
import p76.f$a;
import p76.d;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import com.kwai.framework.kgi.sdk.internal.feature.KgiDataCenter$Companion$obtainFeedbackFeatureList$1$1;
import java.util.Map$Entry;
import java.lang.Math;
import android.content.SharedPreferences$Editor;
import oe6.g;
import trd.u;

public final class KgiDataCenter$Companion	// class@001594
{

    public void KgiDataCenter$Companion(){
       super();
    }
    public void KgiDataCenter$Companion(u p0){
       super();
    }
    public final List a(ConcurrentHashMap p0,int p1){
       ArrayList obj1;
       Object obj = p0;
       int i = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KgiDataCenter$Companion uCompanion = KgiDataCenter$Companion.class;
       if (PatchProxy.isSupport(uCompanion)) {
          obj1 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(p1), this, uCompanion, "2");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }else {
          int i6 = this;
       }
       obj1 = new ArrayList();
       Set set = p0.keySet();
       a.o(set, "keys");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = set.iterator();
       int i1 = 0x186a0;
       while (iterator.hasNext()) {
          Object obj2 = iterator.next();
          int i2 = obj2.intValue() % i1;
          String str = (i2 == i)? 1: null;
          if (str) {
             uArrayList.add(obj2);
          }
       }
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          Integer integer = iterator.next();
          int i3 = integer.intValue() / i1;
          b uob = obj.get(integer);
          if (uob != null) {
             Object obj3 = PatchProxy.apply(null, uob, b.class, "1");
             int i4 = (obj3 != patchProxyRe)? obj3.intValue(): uob.b.size() + uob.a.size();
             String str1 = "channelId = ";
             int i5 = 2;
             PatchProxyResult patchProxyRe1 = patchProxyRe;
             Iterator iterator1 = iterator;
             b.e("KgiDataCenter#getAllListByChannelId: find local feature, "+str1+i+", subChannel = "+i3+", count = "+i4+" start\t=====================>", false, i5, null);
             KgiDataCenter$Companion$getAllListByChannelId$$inlined$forEach$lambda$1 uCompanion$g = new KgiDataCenter$Companion$getAllListByChannelId$$inlined$forEach$lambda$1(obj, i, obj1);
             if (!PatchProxy.applyVoidOneRefs(uCompanion$g, uob, b.class, "8")) {
                a.p(uCompanion$g, "block");
                iterator = uob.d().iterator();
                while (iterator.hasNext()) {
                   uCompanion$g.invoke(iterator.next());
                }
             }
             b.e("KgiDataCenter#getAllListByChannelId: find local feature, "+str1+i+", subChannel = "+i3+", count = "+i4+" end \t=====================>", false, i5, null);
             patchProxyRe = patchProxyRe1;
             iterator = iterator1;
             i1 = 0x186a0;
          }
       }
       if (obj1.size() > 1) {
          x.p0(obj1, new KgiDataCenter$Companion$a());
       }
       return obj1;
    }
    public final void b(){
       Iterator iterator;
       List list;
       Object[] objArray1;
       KgiDataCenter$Companion uCompanion = KgiDataCenter$Companion.class;
       if (PatchProxy.applyVoid(null, this, uCompanion, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uCompanion, "3")) {
          Type type = new a().getType();
          String str = a.a.getString("kgiFeedbackFeatureMap", "null");
          Object[] objArray = (str == null || str == "")? null: b.a(str, type);
          if (objArray != null) {
             iterator = objArray.iterator();
             while (iterator.hasNext()) {
                b uob = iterator.next();
                if (uob.channelKey > null) {
                   b uob1 = uob.featureList;
                   KgiDataCenter$Companion uCompanion1 = 1;
                   uob1 = (uob1 == null || uob1.isEmpty())? 1: null;
                   if (!uob1) {
                      uob1 = uob.featureList;
                      list = (uob1 != null)? CollectionsKt___CollectionsKt.d2(uob1): null;
                      if (list != null && !list.isEmpty()) {
                         uCompanion1 = null;
                      }
                      if (!uCompanion1) {
                         uob = KgiDataCenter.g.d(uob.channelKey);
                         Objects.requireNonNull(uob);
                         Object obj = PatchProxy.applyOneRefs(list, uob, b.class, "4");
                         if (obj != PatchProxyResult.class) {
                            obj.booleanValue();
                         }else {
                            a.p(list, "elements");
                            uob.a.addAll(list);
                         }
                      }
                   }
                }
             }
          }
       }
       iterator = a.d.a().iterator();
       while (iterator.hasNext()) {
          int i = iterator.next().intValue();
          KgiDataCenter$Companion g = KgiDataCenter.g;
          KgiDataCenter kgiDataCente = g.c(i);
          list = g.a(KgiDataCenter.e, i);
          if (list != null) {
             int i1 = list.size();
             b.e("KgiDataCenter#init: add local feature, "+"channelId = "+i+", count = "+i1+" start\t=====================>", false, 2, null);
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                a uoa = iterator1.next();
                if (uoa != null) {
                   kgiDataCente.a(uoa);
                   b.g("KgiDataCenter#init: add local feature, channelId = "+i+','+" featureType = "+uoa.c()+','+" feature = "+uoa.b(), false, 2, null);
                }
             }
             b.e("KgiDataCenter#init: add local feature, "+"channelId = "+i+", count = "+i1+" end \t=====================>", false, 2, null);
          }
          a.b.a(new f$a(i));
       }
       return;
    }
    public final KgiDataCenter c(int p0){
       ConcurrentHashMap obj;
       KgiDataCenter$Companion uCompanion = KgiDataCenter$Companion.class;
       if (PatchProxy.isSupport(uCompanion)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uCompanion, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = KgiDataCenter.f;
       KgiDataCenter kgiDataCente = obj.get(Integer.valueOf(p0));
       if (kgiDataCente == null) {
          kgiDataCente = new KgiDataCenter(p0);
          obj.put(Integer.valueOf(p0), kgiDataCente);
       }
       a.o(kgiDataCente, "dataCenterIdBy\(channelId¡­dataCenter\n      }\)\n    }");
       return kgiDataCente;
    }
    public final b d(int p0){
       ConcurrentHashMap obj;
       KgiDataCenter$Companion uCompanion = KgiDataCenter$Companion.class;
       if (PatchProxy.isSupport(uCompanion)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uCompanion, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = KgiDataCenter.e;
       Integer integer = Integer.valueOf(p0);
       b uob = obj.get(integer);
       if (uob == null) {
          uob = new b(20, 20, KgiDataCenter$Companion$obtainFeedbackFeatureList$1$1.INSTANCE);
          Object obj1 = obj.putIfAbsent(integer, uob);
          if (obj1 != null) {
             uob = obj1;
          }
       }
       a.o(uob, "mFeedbackFeatureMap.getO¡­oKeepInList\(\) }\n        }");
       return uob;
    }
    public final List e(){
       Object[] objArray = null;
       Iterator obj = PatchProxy.apply(objArray, this, KgiDataCenter$Companion.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ArrayList uArrayList = new ArrayList();
       obj = KgiDataCenter.e.entrySet().iterator();
       while (obj.hasNext()) {
          Map$Entry uEntry = obj.next();
          b uob = new b();
          uob.channelKey = uEntry.getKey().intValue();
          uob.featureList = uEntry.getValue().d();
          uArrayList.add(uob);
       }
       if (uArrayList.isEmpty() ^ 0x01) {
          objArray = uArrayList;
       }
       return objArray;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, KgiDataCenter$Companion.class, "8")) {
          return;
       }
       Iterator iterator = KgiDataCenter.f.entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().b();
       }
       KgiDataCenter.f.clear();
       return;
    }
    public final void g(a p0){
       KgiDataCenter$Companion uCompanion = KgiDataCenter$Companion.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uCompanion, "6")) {
          return;
       }
       a.p(p0, "feature");
       b.e("KgiDataCenter#trySaveFeedbackFeature : start\t=====================>", false, 2, null);
       SharedPreferences$Editor obj = PatchProxy.applyOneRefs(p0, this, uCompanion, "1");
       boolean i = (obj != PatchProxyResult.class)? obj.intValue(): (Math.abs(p0.i()) * 0x186a0) + p0.h();
       i = this.d(i).b(p0);
       if (i) {
          b.e("KgiDataCenter#trySaveFeedbackFeature : add feature = "+p0, false, 2, null);
       }
       if (i) {
          List list = this.e();
          if (list != null) {
             obj = a.a.edit();
             obj.putString("kgiFeedbackFeatureMap", b.e(list));
             g.a(obj);
             StringBuilder str = "KgiDataCenter#trySaveFeedbackFeature : save to local = ";
             ArrayList uArrayList = new ArrayList(u.Y(list, 10));
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                b uob = iterator.next();
                StringBuilder str1 = "channelKey: "+uob.channelKey+" - count: ";
                uob = uob.featureList;
                Integer integer = (uob != null)? Integer.valueOf(uob.size()): null;
                uArrayList.add(str1+integer);
             }
             b.e(str+uArrayList, false, 2, null);
          }
       }
       b.e("KgiDataCenter#trySaveFeedbackFeature : end \t=====================>", false, 2, null);
       return;
    }
}
