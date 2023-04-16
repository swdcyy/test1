package com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.System;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptInitModule$mFilterHlsStrategy$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import kotlin.collections.CollectionsKt__CollectionsKt;
import o56.d;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptInitModule$a;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import crd.b;
import b76.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptUpdateEvent;
import jea.b;
import erd.o;
import jea.c;
import erd.g;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptRerankResultEvent;
import jea.d;
import java.lang.Boolean;
import java.lang.Math;
import pea.b;
import java.util.ArrayList;
import iea.d;
import java.util.Iterator;
import java.lang.Iterable;
import lea.e;
import wkd.b;
import zy5.k;
import zy5.d;
import java.util.Collection;
import trd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import qea.u;
import lea.f;
import lea.b;
import com.yxcorp.gifshow.featured.feedprefetcher.PhotoPrefetchDataUtil;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.CharSequence;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptIndexModel;
import java.lang.Number;
import yb6.d;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager;

public final class NasaLaunchOptInitModule extends TTIInitModule	// class@000f9f
{
    public final String q;
    public final AtomicLong r;
    public final p s;

    public void NasaLaunchOptInitModule(){
       super();
       this.q = "NasaLaunchOptInitModule";
       this.r = new AtomicLong(System.currentTimeMillis());
       this.s = s.c(NasaLaunchOptInitModule$mFilterHlsStrategy$2.INSTANCE);
    }
    public boolean H7(){
       return false;
    }
    public int f0(){
       return 14;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, NasaLaunchOptInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return CollectionsKt__CollectionsKt.P(obj);
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, NasaLaunchOptInitModule.class, "2")) {
          return;
       }
       if (!d.i) {
          return;
       }
       t.fromCallable(new NasaLaunchOptInitModule$a(this)).subscribeOn(d.c).subscribe();
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaLaunchOptInitModule.class, "3")) {
          return;
       }
       if (!d.i) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, NasaLaunchOptInitModule.class, "7")) {
          RxBus f = RxBus.f;
          z c = d.c;
          f.f(NasaLaunchOptUpdateEvent.class).observeOn(c).map(new b(this)).observeOn(d.a).subscribe(new c(this));
          f.f(NasaLaunchOptRerankResultEvent.class).observeOn(c).subscribe(new d(this));
       }
       return;
    }
    public final void n0(){
       if (PatchProxy.applyVoid(null, this, NasaLaunchOptInitModule.class, "6")) {
          return;
       }
       this.r.set(System.currentTimeMillis());
       return;
    }
    public final List o0(){
       boolean b1;
       ArrayList uArrayList;
       ArrayList obj1;
       ArrayList obj2;
       ArrayList uArrayList1;
       Iterator iterator1;
       Object obj3;
       Iterator iterator2;
       List list2;
       QPhoto obj6;
       long videoDuratio;
       QPhoto qPhoto;
       Object[] obj8;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, NasaLaunchOptInitModule.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, NasaLaunchOptInitModule.class, "5");
       boolean b = false;
       int i = 1;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(Math.abs((System.currentTimeMillis() - this.r.get())) - 1000 >= 0){
          b1 = true;
       }else {
          b1 = false;
       }
       if (!b1) {
          b.b(this.q, "processUpdateEvent isDurationValid false");
          return new ArrayList();
       }else {
          this.n0();
          obj = new ArrayList();
          List list = d.b();
          int i1 = 10;
          if (list != null) {
             uArrayList = new ArrayList();
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                obj2 = obj1;
                obj2 = (d.l(obj2.createTimestamp) && !b.a(-275376108).k(obj2.photoId))? 1: null;
                if (obj2) {
                   uArrayList.add(obj1);
                }
             }
             uArrayList1 = new ArrayList(u.Y(uArrayList, i1));
             iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                uArrayList1.add(iterator1.next().photoId);
             }
          }else {
             obj8 = objArray;
          }
          List list1 = d.a();
          if (list1 != null) {
             obj1 = new ArrayList();
             iterator1 = list1.iterator();
             while (iterator1.hasNext()) {
                obj2 = iterator1.next();
                obj3 = obj2;
                if (uArrayList1 != null) {
                   a.o(obj3, "qPhoto");
                   if (uArrayList1.contains(obj3.getPhotoId()) == i && d.h(obj3)) {
                      obj3 = 1;
                   label_00e8 :
                      if (obj3) {
                         obj1.add(obj2);
                      }
                   }
                }
                obj3 = null;
                goto label_00e8 ;
             }
          }else {
             obj1 = new ArrayList();
          }
          int i2 = -622777217;
          Object[] obj4 = b.a(i2);
          a.o(obj4, "Singleton.get\(PrefetchDa¡­ourceManager::class.java\)");
          list1 = obj4.n();
          if (list1 != null) {
             obj2 = new ArrayList();
             iterator1 = list1.iterator();
             while (iterator1.hasNext()) {
                obj3 = iterator1.next();
                Object obj5 = obj3;
                obj5 = (PhotoPrefetchDataUtil.a(obj5.mQPhoto) == i && b.a(i2).u(obj5))? 1: null;
                if (obj5) {
                   obj2.add(obj3);
                }
             }
             uArrayList = new ArrayList(u.Y(obj2, i1));
             iterator2 = obj2.iterator();
             while (iterator2.hasNext()) {
                uArrayList.add(iterator2.next().mQPhoto);
             }
             list2 = CollectionsKt___CollectionsKt.G4(uArrayList);
          }else {
             list2 = objArray;
          }
          obj.addAll(obj1);
          if (list2 != null) {
             obj.addAll(list2);
          }
          Boolean uBoolean = PatchProxy.apply(objArray, this, NasaLaunchOptInitModule.class, "1");
          if (uBoolean == patchProxyRe) {
             uBoolean = this.s.getValue();
          }
          if (uBoolean.booleanValue()) {
             ArrayList uArrayList2 = new ArrayList();
             iterator1 = obj.iterator();
             while (iterator1.hasNext()) {
                obj6 = iterator1.next();
                int i3 = obj6.isHlsVideo() ^ i;
                if (i3) {
                   uArrayList2.add(obj6);
                }
             }
             if (uArrayList2.isEmpty() ^ i) {
                b.b(this.q, "filter not hls candidate");
                obj.clear();
                obj.addAll(uArrayList2);
             }
          }
          iterator2 = obj.iterator();
          obj4 = objArray;
          while (iterator2.hasNext()) {
             obj6 = iterator2.next();
             videoDuratio = obj6.getVideoDuration();
             long videoDuratio1 = (obj4 != null)? obj4.getVideoDuration(): 0;
             if (videoDuratio - videoDuratio1 >= 0) {
                qPhoto = obj6;
             }
          }
          if ((obj.isEmpty() ^ i) && obj4 != null) {
             String photoId = obj4.getPhotoId();
             if (photoId != null) {
                NasaLaunchOptIndexModel nasaLaunchOp = (photoId.length() > 0)? 1: null;
                if (nasaLaunchOp == i) {
                   nasaLaunchOp = new NasaLaunchOptIndexModel();
                   String photoId1 = obj4.getPhotoId();
                   if (photoId1 == null) {
                      photoId1 = "";
                   }
                   nasaLaunchOp.setPhotoId(photoId1);
                   e obj7 = PatchProxy.applyOneRefs(obj4, this, NasaLaunchOptInitModule.class, "10");
                   if (obj7 != patchProxyRe) {
                      videoDuratio = obj7.longValue();
                   }else if(obj4.isPrefetch()){
                      e uoe = b.a(i2).j(obj4.getPhotoId());
                      if (uoe != null) {
                         obj7 = uoe.createTimestamp;
                      }else {
                         videoDuratio = d.a();
                      }
                   }else {
                      List list3 = d.b();
                      if (list3 != null) {
                         Iterator iterator3 = list3.iterator();
                         while (true) {
                            if (iterator3.hasNext()) {
                               obj8 = iterator3.next();
                               if (TextUtils.n(obj4.getPhotoId(), obj8.photoId)) {
                                  objArray = obj8;
                               }
                            }
                            if (objArray != null) {
                               obj7 = objArray.createTimestamp;
                            }
                         }
                         return obj;
                      }
                      videoDuratio = d.a();
                   }
                   nasaLaunchOp.setCreateTimestamp(videoDuratio);
                   if (obj4.isPrefetch() == i) {
                      b = true;
                   }
                   nasaLaunchOp.setPrefetch(b);
                   nasaLaunchOp.setAid(obj4.getUserId());
                   b.b(this.q, "call saveConfigToFile size£º"+obj.size());
                   NasaLaunchOptManager.j(nasaLaunchOp, obj4, "dateUpdate");
                   goto label_02b3 ;
                }
             }
          }
          b.b(this.q, "call saveConfigToFile null, "+obj.size());
          NasaLaunchOptManager.j(objArray, objArray, "dateUpdate");
          goto label_02b3 ;
       }
    }
}
