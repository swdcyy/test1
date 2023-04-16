package com.yxcorp.gifshow.detail.common.information.subscribeauthor.f;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import jh5.a;
import xq7.d;
import rp7.a;
import xy9.a;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.f$a;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.util.Objects;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.app.Activity;
import k2b.e0;
import k2b.f0;
import k2b.u1;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import xy9.j;
import xy9.i;
import java.lang.Boolean;
import qp7.b;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.SubscribeAuthorGuideManager;
import qp7.c;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.b;
import crd.b;
import erd.g;
import brd.t;
import xy9.c;
import xy9.b;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.e;
import erd.o;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.a;
import qp7.b1;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import de5.c;
import qp7.x0;
import pp7.b;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Integer;
import java.lang.Number;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.detail.model.SubscribeAuthorConfig;
import java.lang.reflect.Type;
import uw9.c;
import qrd.p;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import qp7.d;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.g;

public class f extends DispatchBaseElement	// class@00145c
{
    public final y0 A;
    public QPhoto t;
    public PhotoDetailParam u;
    public Activity v;
    public BaseFragment w;
    public User x;
    public c y;
    public final IMediaPlayer$OnInfoListener z;
    public static final int B;

    public void f(a p0){
       super(d.y, p0);
       this.z = new a(this);
       this.A = new f$a(this);
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "2")) {
       }else {
          a c = p0.c;
          PhotoDetailParam mPhoto = c.mPhoto;
          this.t = mPhoto;
          this.u = c;
          this.w = p0.b;
          this.v = p0.a;
          this.x = mPhoto.getUser();
          this.y = p0.k;
          PatchProxy.onMethodExit(f.class, "2");
       }
       return;
    }
    public void S(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "13")) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          f tt = this.t;
          Objects.requireNonNull(tt);
          if (tt.mEntity != null) {
             uContentPack.photoPackage = w1.f(this.t.mEntity);
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "UPDATE_NOTICE";
          u1.B0(new ShowMetaData().setLogPage(f0.a(this.w, this.v)).setContentPackage(uContentPack).setElementPackage(uElementPack).setType(3));
       }
       return;
    }
    public a f0(a p0){
       j oj = PatchProxy.applyOneRefs(p0, this, f.class, "9");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j(p0);
       }
       return oj;
    }
    public void j0(boolean p0){
       i oi = i.class;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "3")) {
          return;
       }
       this.b0();
       i obj = PatchProxy.apply(null, this, uof, "6");
       if (obj != PatchProxyResult.class) {
          obj = obj.booleanValue();
       }else {
          f tt = this.t;
          tt = (tt == null || tt.isManualHideSubscribeAuthor())? true: SubscribeAuthorGuideManager.b();
       }
       if (obj) {
          return;
       }else {
          obj = this.A();
          b uob = new b(this);
          Objects.requireNonNull(obj);
          b uob1 = PatchProxy.applyOneRefs(uob, obj, oi, "2");
          if (uob1 != PatchProxyResult.class) {
          }else {
             uob1 = obj.a.subscribe(uob);
          }
          this.j(uob1);
          obj = this.A();
          c uoc = new c(this);
          Objects.requireNonNull(obj);
          uob1 = PatchProxy.applyOneRefs(uoc, obj, oi, "4");
          if (uob1 != PatchProxyResult.class) {
          }else {
             uob1 = obj.b.subscribe(uoc);
          }
          this.j(uob1);
          obj = this.A();
          uob = new b(this);
          Objects.requireNonNull(obj);
          b uob2 = PatchProxy.applyOneRefs(uob, obj, oi, "6");
          if (uob2 != PatchProxyResult.class) {
          }else {
             uob2 = obj.c.subscribe(uob);
          }
          this.j(uob2);
          this.j(this.x.observable().distinctUntilChanged(e.b).observeOn(d.a).subscribe(new a(this)));
          this.i(this.A);
          this.y.b(this.z);
          return;
       }
    }
    public void m0(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "8")) {
          return;
       }
       this.y.f(this.z);
       j oj = this.E();
       Objects.requireNonNull(oj);
       j oj1 = j.class;
       if (!PatchProxy.isSupport(oj1) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, oj, oj1, "1")) {
          oj.d.f(Boolean.TRUE);
       }
       return;
    }
    public final void n0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "12")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       f tt = this.t;
       Objects.requireNonNull(tt);
       if (tt.mEntity != null) {
          uContentPack.photoPackage = w1.f(this.t.mEntity);
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "UPDATE_NOTICE";
       i3 oi3 = i3.f();
       oi3.d("click_area", p0);
       uElementPack.params = oi3.e();
       u1.B(new ClickMetaData().setLogPage(f0.a(this.w, this.v)).setContentPackage(uContentPack).setElementPackage(uElementPack).setType(1));
       return;
    }
    public void o0(){
       PatchProxyResult patchProxyRe1;
       Map obj1;
       Integer integer;
       SubscribeAuthorGuideManager g;
       Object obj = this;
       SubscribeAuthorGuideManager subscribeAut = SubscribeAuthorGuideManager.class;
       String str = "1";
       if (PatchProxy.applyVoid(null, obj, f.class, str)) {
          return;
       }
       String id = obj.x.getId();
       boolean b = obj.x.isFollowingOrFollowRequesting();
       f t = obj.t;
       boolean i = 0;
       if (PatchProxy.isSupport(subscribeAut)) {
          if (!PatchProxy.applyVoidThreeRefs(id, Boolean.valueOf(b), t, null, SubscribeAuthorGuideManager.class, "3")) {
          label_0042 :
             a.p(id, "uid");
             a.p(t, "photo");
             if (!t.isAlreadyConsumed() && b) {
                obj1 = SubscribeAuthorGuideManager.e;
                integer = obj1.get(id);
                int i2 = (integer != null)? integer.intValue() + 1: 1;
                obj1.put(id, Integer.valueOf(i2));
                t.setAlreadyConsumed(1);
                Object[] objArray = new Object[i];
                o.C().w("SubscribeAuthorElement", "记录消费用户作品个数:uid: "+id+" count: "+obj1.get(id), objArray);
             }
          }
       }else {
          int i3 = 1;
          goto label_0042 ;
       }
       id = obj.x.getId();
       b = obj.x.isFollowingOrFollowRequesting();
       t = obj.t;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(subscribeAut)) {
          patchProxyRe1 = patchProxyRe;
          obj1 = PatchProxy.applyThreeRefs(id, Boolean.valueOf(b), t, null, SubscribeAuthorGuideManager.class, "2");
          if (obj1 != patchProxyRe1) {
             i = obj1.booleanValue();
          }else {
          label_00cb :
             a.p(id, "uid");
             a.p(t, "photo");
             if (c.t(SubscribeAuthorConfig.class) != null && (!t.isMine() && (!t.isManualHideSubscribeAuthor() && (!SubscribeAuthorGuideManager.a(t) && (!SubscribeAuthorGuideManager.b() && b))))) {
                obj1 = SubscribeAuthorGuideManager.f;
                if (a.g(obj1.get(id), Boolean.TRUE)) {
                   integer = SubscribeAuthorGuideManager.e.get(id);
                   g = SubscribeAuthorGuideManager.g;
                   Objects.requireNonNull(g);
                   Number number = PatchProxy.apply(null, g, subscribeAut, str);
                   if (number == patchProxyRe1) {
                      number = SubscribeAuthorGuideManager.a.getValue();
                   }
                   int i1 = number.intValue();
                   if (integer != null && integer.intValue() == i1) {
                   label_014a :
                      i = true;
                   }
                }
             label_0136 :
                if (obj1.get(id) == null || a.g(obj1.get(id), Boolean.FALSE)) {
                   goto label_014a ;
                }
             }
          label_00d9 :
             i = false;
          }
       }else {
          patchProxyRe1 = patchProxyRe;
          goto label_00cb ;
       }
       if (i) {
          this.c0();
          SharedPreferences$Editor uEditor = c.a.edit();
          uEditor.putLong("subscribeAuthorGuideShowTime", System.currentTimeMillis());
          g.a(uEditor);
          c.M((c.v() + 1));
          c.N((c.w() + 1));
          c.L((c.u() + 1));
       }
       return;
    }
    public d q(){
       g og = PatchProxy.apply(null, this, f.class, "11");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g();
       }
       return og;
    }
    public c r(){
       i oi = PatchProxy.apply(null, this, f.class, "10");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = new i();
       }
       return oi;
    }
}
