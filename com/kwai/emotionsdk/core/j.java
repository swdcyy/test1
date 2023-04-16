package com.kwai.emotionsdk.core.j;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Collection;
import java.util.Map;
import ekd.q;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import ck5.m;
import java.lang.Integer;
import com.kwai.emotionsdk.bean.EmotionPackage;
import java.lang.Boolean;
import java.lang.Number;
import ak5.j;
import ak5.a;
import brd.a0;
import nk5.m;
import lk5.b;
import lk5.a;
import bk5.k;
import brd.t;
import com.kwai.emotionsdk.http.a;
import erd.o;
import cjd.e;
import jl5.m;
import brd.z;
import ck5.g;
import java.lang.StringBuilder;

public class j	// class@000d9d
{
    public final Map a;
    public static j b;

    public void j(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public static j e(){
       j oj = j.class;
       Object obj = PatchProxy.apply(null, null, oj, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.b == null) {
          _monitor_enter(oj);
          if (j.b == null) {
             j.b = new j();
          }
          _monitor_exit(oj);
       }
       return j.b;
    }
    public List a(){
       ArrayList obj = PatchProxy.apply(null, this, j.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.a.values())) {
          return Collections.emptyList();
       }
       obj = new ArrayList();
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          m om = iterator.next();
          if (om == null || q.f(om.c())) {
             continue ;
          }else {
             obj.addAll(om.c());
          }
       }
       return obj;
    }
    public List b(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       m om = this.d(p0);
       if (om != null) {
          return om.c();
       }else {
          return null;
       }
    }
    public List c(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       m om = this.a.get(Integer.valueOf(p0));
       if (om != null) {
          return om.c();
       }else {
          return Collections.emptyList();
       }
    }
    public m d(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.get(Integer.valueOf(p0));
    }
    public EmotionPackage f(String p0){
       EmotionPackage uEmotionPack;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, j.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uEmotionPack = obj.next();
          if ((uEmotionPack.mId).equals(p0)) {
             break ;
          }
       }
       return uEmotionPack;
    }
    public boolean g(){
       int i2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       List obj = PatchProxy.apply(null, this, oj, "18");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.c(2);
       int i = 0;
       if (!obj.isEmpty()) {
          EmotionPackage mEmotions = obj.get(i).mEmotions;
          if (mEmotions != null) {
             int i1 = mEmotions.size();
             Object obj1 = PatchProxy.apply(null, this, oj, "19");
             if (obj1 != patchProxyRe) {
                i2 = obj1.intValue();
             }else {
                a b = j.o().i().b;
                if (b <= null) {
                   b = 158;
                }
                i2 = b + 1;
             }
             if (i1 >= i2) {
                i = true;
             }
          }
       }
       return i;
    }
    public a0 h(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       m.d("EmotionDataManager", "fetch emotions form network v2");
       z b = m.b;
       return b.b().a().i(j.o().i().f.b, p0, p1).retryWhen(new a()).map(new e()).firstOrError().T(b).G(b);
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.a.clear();
       return;
    }
    public t j(){
       t obj = PatchProxy.apply(null, this, j.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       z b = m.b;
       obj = b.b().a().g(j.o().i().f.c).subscribeOn(b).map(new e()).subscribeOn(b).observeOn(b);
       return obj.map(new g(this)).observeOn(m.a);
    }
    public void k(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "9")) {
          return;
       }
       m.d("EmotionDataManager", "prepareMemoryData: size="+p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          EmotionPackage uEmotionPack = iterator.next();
          if (q.f(uEmotionPack.mEmotions)) {
             m.b("EmotionDataManager", "emotions list is empty , pkgId = "+uEmotionPack.mId);
          }else {
             m om = this.a.get(Integer.valueOf(uEmotionPack.mType));
             if (om != null) {
                om.a(uEmotionPack.mId, uEmotionPack);
             }else {
                om = new m();
                om.a(uEmotionPack.mId, uEmotionPack);
                this.a.put(Integer.valueOf(uEmotionPack.mType), om);
             }
          }
       }
       return;
    }
}
