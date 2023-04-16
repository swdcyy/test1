package com.kwai.kxb.storage.KxbBundleDao;
import com.kwai.kxb.PlatformType;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.kxb.storage.KxbBundleDao$mDelegateBundleDao$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ru6.o;
import com.kwai.kxb.service.BaseServiceProviderKt;
import java.lang.StringBuilder;
import java.lang.Throwable;
import ru6.o$b;
import tu6.a;
import java.util.Iterator;
import java.lang.Iterable;
import tu6.d;
import tu6.e;
import java.util.ArrayList;
import trd.u;
import iu6.a;
import com.kwai.kxb.BundleSource;
import nsd.u;
import java.util.Collection;
import com.kwai.kxb.storage.KxbBundleDao$cleanCacheByBundleId$1;
import msd.l;
import trd.y;
import com.kwai.robust.PatchProxyResult;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.LinkedHashMap;
import trd.t;
import java.util.Map;
import tu6.b;
import java.io.File;
import qkd.b;
import nu6.d;
import nu6.c;
import iu6.a$a;
import nu6.b;
import vu6.a;
import java.util.Objects;
import com.kwai.kxb.KxbManager;
import gu6.k;
import ru6.q;
import bv6.a;
import zu6.a;
import java.lang.Enum;
import vu6.b;
import wu6.k;
import cv6.a;
import com.kwai.kxb.storage.KxbBundleDao$updateBundleCache$2;

public final class KxbBundleDao	// class@0007f4
{
    public boolean a;
    public final p b;
    public final CopyOnWriteArrayList c;
    public final PlatformType d;

    public void KxbBundleDao(PlatformType p0){
       a.p(p0, "mPlatformType");
       super();
       this.d = p0;
       this.a = true;
       this.b = s.c(new KxbBundleDao$mDelegateBundleDao$2(this));
       this.c = new CopyOnWriteArrayList();
    }
    public synchronized final void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KxbBundleDao.class, "9")) {
          return;
       }
       a.p(p0, "bundleEntities");
       if (p0.isEmpty()) {
          return;
       }
       o$b.d(BaseServiceProviderKt.a(), "cleanBundles: "+p0, null, 2, null);
       this.h().b(p0);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          Iterator iterator1 = this.c.iterator();
          int i = 0;
          while (true) {
             if (iterator1.hasNext()) {
                d uod1 = iterator1.next();
                boolean b = (a.g(uod1.a(), uod.a()) && (uod1.k() == uod.k() && a.g(uod1.l(), uod.l())))? true: false;
                if (b) {
                label_0090 :
                   if (i == -1) {
                      continue ;
                   }else {
                      d uod2 = this.c.get(i);
                      a.o(uod2, "entityToRemove");
                      d uod3 = this.i(this.c, uod.a());
                      a.m(uod3);
                      this.c.remove(i);
                      if (e.a(uod3, uod2) > 0) {
                         continue ;
                      }else {
                         this.j(uod3, this.i(this.c, uod.a()));
                      }
                   }
                }else {
                   i = i + 1;
                }
             }else {
                i = -1;
                goto label_0090 ;
             }
          }
       }
       return;
    }
    public synchronized final void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KxbBundleDao.class, "7")) {
          return;
       }
       a.p(p0, "bundleIds");
       o$b.d(BaseServiceProviderKt.a(), "cleanByBundleId: "+p0, null, 2, null);
       this.h().d(p0);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          d uod = this.i(this.c, iterator.next());
          if (uod != null) {
             this.j(uod, null);
          }
       }
       this.d(p0);
       return;
    }
    public synchronized final void c(List p0){
       Object obj = this;
       Iterator obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, KxbBundleDao.class, "8")) {
          return;
       }
       a.p(obj1, "bundleInfos");
       ArrayList uArrayList = new ArrayList(u.Y(obj1, 10));
       obj1 = p0.iterator();
       while (obj1.hasNext()) {
          a uoa = obj1.next();
          String str = uoa.a();
          int i = uoa.h();
          d uod = v8;
          d uod1 = v8;
          uod = new d(str, null, i, uoa.i(), null, null, null, null, 0, null, null, null, null, 0, 0x3ff2, null);
          uArrayList.add(uod1);
          obj1 = obj1;
       }
       obj.a(uArrayList);
       return;
    }
    public synchronized final void d(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KxbBundleDao.class, "10")) {
          return;
       }
       a.p(p0, "bundleIds");
       o$b.d(BaseServiceProviderKt.a(), "cleanCacheByBundleId --> "+p0, null, 2, null);
       y.K0(this.c, new KxbBundleDao$cleanCacheByBundleId$1(p0));
       return;
    }
    public final List e(){
       Object obj = PatchProxy.apply(null, this, KxbBundleDao.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CollectionsKt___CollectionsKt.J5(this.c);
    }
    public synchronized final List f(String p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, KxbBundleDao.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "bundleId");
       obj = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       b.c(this.d, this.h().a(t.k(p0)), new LinkedHashMap(), obj, uArrayList);
       this.a(uArrayList);
       this.l(obj);
       List list = this.k(this.h(), p0, obj);
       if (list.isEmpty() ^ 0x01) {
          obj.addAll(list);
       }
       return obj;
    }
    public synchronized final Map g(){
       ArrayList obj = PatchProxy.apply(null, this, KxbBundleDao.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       b.c(this.d, this.h().getAll(), linkedHashMa, obj, uArrayList);
       this.h().b(uArrayList);
       if (this.a != null) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             b.q(new File(iterator.next().g()));
          }
          b.b(this.d, obj);
          this.a = false;
       }
       this.c.clear();
       this.c.addAll(obj);
       return linkedHashMa;
    }
    public final a h(){
       Object obj = PatchProxy.apply(null, this, KxbBundleDao.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final d i(List p0,String p1){
       Object obj1;
       d uod;
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, KxbBundleDao.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj1 = iterator.next();
          if (a.g(obj1.a(), p1)) {
             obj.add(obj1);
          }
       }
       iterator = obj.iterator();
       if (!iterator.hasNext()) {
          uod = null;
       }else {
          p1 = iterator.next();
          if (iterator.hasNext()) {
             int i = p1.k();
             do {
                obj1 = iterator.next();
                int i1 = obj1.k();
                if (i < i1) {
                   p1 = obj1;
                   i = i1;
                }
             } while (!iterator.hasNext());
          }
          uod = p1;
       }
       return uod;
    }
    public final void j(d p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KxbBundleDao.class, "11")) {
          return;
       }
       c uoc = d.b.a(this.d);
       if (uoc != null) {
          uoc = uoc.d;
          if (uoc != null) {
             a uoa = null;
             a uoa1 = (p0 == null)? uoa: a$a.b(a.d, p0, uoa, 2, uoa);
             if (p1 != null) {
                uoa = a$a.b(a.d, p1, uoa, 2, uoa);
             }
             uoc.a(uoa1, uoa);
          }
       }
       return;
    }
    public final List k(a p0,String p1,List p2){
       a this;
       Iterator iterator;
       File obj2;
       int i;
       d uod1;
       File uFile;
       KxbBundleDao kxbBundleDao = this;
       String str = p1;
       a obj = p2;
       ArrayList obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KxbBundleDao.class, "15");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       this = a.a;
       KxbBundleDao d = kxbBundleDao.d;
       Objects.requireNonNull(this);
       obj1 = PatchProxy.applyThreeRefs(d, p1, p2, this, a.class, "1");
       char c = '[';
       if (obj1 != PatchProxyResult.class) {
       }else {
          a.p(d, "platformType");
          a.p(obj, "dbBundles");
          List list = KxbManager.g.d().e().a(d);
          ArrayList uArrayList = (str == null || !p1.length())? 1: null;
          if (!uArrayList) {
             uArrayList = new ArrayList();
             iterator = list.iterator();
             while (iterator.hasNext()) {
                obj2 = iterator.next();
                if (a.g(obj2.a(), str)) {
                   uArrayList.add(obj2);
                }
             }
             list = uArrayList;
          }
          uArrayList = new ArrayList();
          iterator = list.iterator();
          while (iterator.hasNext()) {
             obj2 = iterator.next();
             Object obj3 = obj2;
             if (!obj instanceof Collection || !p2.isEmpty()) {
                Iterator iterator1 = p2.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      d uod = iterator1.next();
                      String str1 = (a.g(uod.a(), obj3.a()) && uod.k() >= obj3.c())? 1: null;
                      if (str1) {
                         i = 1;
                         break ;
                      }
                   }
                }
                i = i ^ 1;
                if (i) {
                   uArrayList.add(obj2);
                }
             }
             i = 0;
             goto label_00d7 ;
          }
          obj1 = new ArrayList();
          Iterator iterator2 = uArrayList.iterator();
          while (iterator2.hasNext()) {
             try{
                Object obj4 = iterator2.next();
                o$b.d(BaseServiceProviderKt.a(), c+d.name()+"] -> find preset bundle to install: "+obj4, null, 2, null);
                obj = a.a;
                Objects.requireNonNull(obj);
                uod1 = PatchProxy.applyTwoRefs(d, obj4, obj, a.class, "2");
                if (uod1 != PatchProxyResult.class) {
                }else {
                   uFile = b.a.a(obj4);
                   try{
                      obj2 = k.a.a(d, obj4.a(), obj4.c());
                      try{
                         a.a.b(uFile, obj2);
                         uod1 = obj.a(obj4, obj2);
                      }catch(java.lang.Exception e0){
                      }
                   }catch(java.lang.Exception e0){
                      obj2 = null;
                   }
                }
             }catch(java.lang.Exception e0){
                uFile = null;
                obj2 = uFile;
             }
             if (uod1 != null) {
                obj1.add(uod1);
             }
          }
       }
       if (obj1.isEmpty() ^ 1) {
          o$b.d(BaseServiceProviderKt.a(), c+kxbBundleDao.d.name()+"] -> try to install preset bundles, bundleId="+str, null, 2, null);
          p0.c(obj1);
          kxbBundleDao.l(obj1);
       }
       return obj1;
    }
    public final void l(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KxbBundleDao.class, "6")) {
          return;
       }
       if (p0.isEmpty()) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          d uod1 = this.i(this.c, uod.a());
          if (e.a(uod, uod1) > 0) {
             this.j(uod1, uod);
          }
       }
       y.K0(this.c, new KxbBundleDao$updateBundleCache$2(p0));
       this.c.addAll(p0);
       return;
    }
}
