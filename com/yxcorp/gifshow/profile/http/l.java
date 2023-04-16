package com.yxcorp.gifshow.profile.http.l;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle;
import o3c.p;
import java.lang.String;
import gu7.b;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle$a;
import java.util.HashMap;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import qvb.n0$a;
import qvb.n0;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ju7.b;
import o3c.u;
import msd.a;
import com.kwai.tuna_preloader.DataPreLoader$LoadController;
import com.yxcorp.gifshow.profile.http.k;
import erd.o;
import java.util.List;
import v2c.e;
import v2c.g;
import o3c.r;
import erd.g;
import o3c.q;
import o3c.s;
import z5c.f2;
import o3c.t;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import la6.b;
import qvb.f;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import java.util.Map;
import qk.g0;
import b06.d;
import com.yxcorp.gifshow.profile.http.l$a;
import com.kwai.feature.api.social.profile.model.ProfileDraftsFeed;
import java.util.Locale;
import ra6.a;
import wkd.b;
import o3c.l;
import wh5.c;
import z5c.k0;
import com.kwai.components.social.util.network.NetworkTrace;
import li5.a;
import cjd.e;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import jsa.c;

public class l extends p implements ListReqLifecycle	// class@00135a
{
    public final String A;
    public String p;
    public final String q;
    public final boolean r;
    public boolean s;
    public QPhoto t;
    public l$a u;
    public b v;
    public boolean w;
    public final ListReqLifecycle$a x;
    public final Map y;
    public int z;

    public void l(String p0,boolean p1,String p2,boolean p3,b p4){
       super();
       this.x = new ListReqLifecycle$a();
       this.y = new HashMap(KsLogProfileTag.getExpectedSize(3));
       this.z = 0;
       this.p = p0;
       this.r = p1;
       this.q = p2;
       p0 = (p3)? "3": null;
       this.A = p0;
       this.v = p4;
       return;
    }
    public static void i2(l p0,n0$a p1){
       super.K1(p1);
    }
    public t I1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l ol = l.class;
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, this, ol, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       this.x.c();
       obj = PatchProxy.apply(objArray, this, ol, "10");
       if (obj != patchProxyRe) {
       }else {
          Object obj1 = PatchProxy.apply(objArray, this, ol, "12");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             l tv = this.v;
             if (tv != null) {
                t ot = tv.b(true, new b(new u(this)));
                if (ot != null) {
                   objArray = ot.map(k.b);
                }
             }
          }
          if (objArray == null) {
             g.e(KsLogProfileTag.PHOTO_TAB_PRE_LOAD.appendTag("ProfileFeedPageList"), "no preload");
             obj = this.j2();
          }else {
             Object[] objArray1 = objArray;
          }
       }
       return obj.doOnNext(new r(this)).doOnError(new q(this)).doOnNext(new s(this));
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "8")) {
          return;
       }
       if (f2.a()) {
          k1.r(new t(this, p0), 0);
       }else {
          super.K1(p0);
       }
       this.x.a();
       return;
    }
    public void M1(Object p0,List p1){
       this.n2(p0, p1);
    }
    public List W1(b p0,List p1){
       int i;
       ArrayList uArrayList = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "4");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = null;
          if (this.r != null) {
             uArrayList = super.W1(p0, p1);
          }else {
             List items = p0.getItems();
             if (items != null) {
                uArrayList = new ArrayList();
                ArrayList uArrayList1 = new ArrayList();
                Iterator iterator = items.iterator();
                while (iterator.hasNext()) {
                   QPhoto qPhoto = iterator.next();
                   if (!p1.contains(qPhoto)) {
                      if (w.j0(qPhoto.mEntity) && !this.y.containsKey(qPhoto.getPhotoId())) {
                         this.y.put(qPhoto.getPhotoId(), qPhoto);
                      }
                      if (!uArrayList.contains(qPhoto)) {
                         uArrayList.add(qPhoto);
                      }else if(this.m2(qPhoto, uArrayList)){
                         i = this.z + 1;
                         this.z = i;
                         uArrayList.add(qPhoto);
                      }else {
                         uArrayList1.add(qPhoto);
                      }
                   }else if(this.m2(qPhoto, p1) && !uArrayList.contains(qPhoto)){
                      i = this.z + 1;
                      this.z = i;
                      uArrayList.add(qPhoto);
                   }else {
                      uArrayList1.add(qPhoto);
                   }
                }
             }
          }
          if (uArrayList != null) {
             d.f(uArrayList);
          }
       }
       return uArrayList;
    }
    public void a2(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "3")) {
          return;
       }
       l tu = this.u;
       if (tu != null) {
          tu.a(p0);
       }
       if (this.r != null || (this.t != null && (!p0.size() || !p0.get(0).getEntity() instanceof ProfileDraftsFeed))) {
          p0.add(0, this.t);
          g.e(KsLogProfileTag.DRAFT.appendTag("ProfileFeedPageList"), "add draft item");
       }
    label_0042 :
       return;
    }
    public void d2(b p0,List p1){
       this.n2(p0, p1);
    }
    public boolean i(){
       return (this.r ^ 0x01);
    }
    public final t j2(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, l.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String language = a.c().getLanguage();
       Object obj1 = b.a(0x37313f08);
       l tp = this.p;
       obj = (this.r != null)? "private": "public";
       String str = obj;
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return obj1.f(tp, language, 20, str, objArray, this.q, this.A, c.j(), k0.r(), this.w, a.c("ProfileFeedPageList")).map(new e());
    }
    public boolean k2(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.y.isEmpty()) {
          return b;
       }
       if (this.y.get(p0.getPhotoId()) == p0) {
          b = true;
       }
       return b;
    }
    public boolean l2(){
       return this.r;
    }
    public t m(){
       Object obj = PatchProxy.apply(null, this, l.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.m();
    }
    public final boolean m2(QPhoto p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = p1.indexOf(p0);
       boolean i1 = p1.lastIndexOf(p0);
       i1 = (i != -1 && (i == i1 && (w.F0(p1.get(i).mEntity) && w.j0(p1.get(i).mEntity))))? true: false;
       return i1;
    }
    public void n2(ProfileFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "1")) {
          return;
       }
       super.d2(p0, p1);
       RxBus.f.b(new c(p0.getItems(), p1, 5, 4));
       return;
    }
    public void o2(l$a p0){
       this.u = p0;
    }
    public void p2(QPhoto p0){
       this.t = p0;
    }
}
