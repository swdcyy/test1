package com.kuaishou.commercial.splash.y;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import wkd.b;
import tjc.c;
import yx.j0;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import yy.x1;
import com.kuaishou.commercial.splash.w;
import erd.g;
import crd.b;
import mrd.a;
import t45.d;
import brd.z;
import yy.u1;
import com.kuaishou.commercial.splash.x;
import ujc.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.r;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import yy.w1;
import wl9.x;
import yy.s1;
import yy.t1;
import bz.d;
import yy.y1;
import wl9.h;
import yy.v1;
import lnc.b9;
import tjc.b;
import com.kuaishou.android.model.ads.SplashInfo;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import cz.b;
import cz.d;
import com.kuaishou.commercial.splash.i;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import qvb.i;
import tjc.i;
import tkd.b;
import tkd.d;
import nl9.h0;
import fw6.c;
import yw6.g;
import bw6.a;
import fw6.b;
import kp.r1;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Objects;
import java.lang.Integer;
import lw6.a;
import fx6.b;

public class y extends PresenterV2	// class@00163a
{
    public b p;
    public b q;
    public b r;
    public b s;
    public BaseFragment t;
    public SlidePlayViewModel u;
    public BaseFeed v;
    public boolean w;
    public boolean x;
    public b y;
    public boolean z;

    public void y(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, y.class, "4")) {
          return;
       }
       this.reset();
       int i = -1608526086;
       Object[] objArray = new Object[0];
       j0.f("SplashPhotoInsertPresen", "onBind needEyemaxSplash Splash status:"+b.a(i).getState(), objArray);
       this.u = SlidePlayViewModel.B0(this.t);
       if (b.a(i).S() && b.a(i).D2()) {
          this.R8();
       }
       this.X7(this.t.Vg().j().subscribe(new x1(this), w.b));
       this.X7(b.a(i).Q().observeOn(d.a).subscribe(new u1(this), x.b));
       return;
    }
    public void F8(){
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, y.class, "2")) {
          return;
       }
       if (this.y == null) {
          this.y = RxBus.f.g(r.class, RxBus$ThreadMode.MAIN).subscribe(new w1(this));
       }
       if (this.p == null) {
          this.p = RxBus.f.f(x.class).observeOn(d.a).subscribe(new s1(this));
       }
       if (this.q == null) {
          this.q = (b.a(-1608526086).M())? RxBus.f.g(uoe, RxBus$ThreadMode.MAIN).subscribe(new t1(this)): RxBus.f.f(uoe).observeOn(d.a).subscribe(new t1(this));
       }
    label_0082 :
       if (this.r == null) {
          this.r = RxBus.f.f(d.class).observeOn(d.a).subscribe(new y1(this));
       }
       if (this.s == null) {
          this.s = RxBus.f.g(h.class, RxBus$ThreadMode.MAIN).subscribe(new v1(this));
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, y.class, "5")) {
          return;
       }
       y ty = this.y;
       if (ty != null) {
          ty.dispose();
          this.y = null;
       }
       b9.a(this.q);
       this.q = null;
       b9.a(this.p);
       this.p = null;
       b9.a(this.r);
       this.r = null;
       b9.a(this.s);
       this.s = null;
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "21")) {
          return;
       }
       b uob = b.a(-1608526086).a();
       if (uob != null) {
          b a = uob.a;
          if (a != null && a.mSplashBaseInfo != null) {
             i.d(d.b(RequestTiming.DEFAULT, uob, p0));
          }
       }
       return;
    }
    public final void R8(){
       Object[] objArray1;
       boolean b;
       boolean b1;
       g obj1;
       int b2;
       Object obj3;
       boolean b3;
       BaseFeed uBaseFeed = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       y oy = y.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uBaseFeed, oy, "9")) {
          return;
       }
       if (uBaseFeed.u == null) {
          objArray1 = new Object[0];
          j0.f("SplashPhotoInsertPresen", "processSplashData mSlidePlayViewModel null", objArray1);
          return;
       }else {
          c uoc = b.a(-1608526086);
          if (uBaseFeed.u.Y0() > 0 && (uBaseFeed.v != null && TextUtils.equals(uBaseFeed.u.U0(0).getPhotoId(), uBaseFeed.v.getId()))) {
             objArray1 = new Object[0];
             j0.f("SplashPhotoInsertPresen", "processSplashData splash has been inserted", objArray1);
             return;
          }else if(b.a(-1608526086).D2()){
             Object[] objArray2 = new Object[0];
             j0.f("SplashPhotoInsertPresen", "processSplashData needEyemaxSplash", objArray2);
             if (uoc.J()) {
                Object obj = PatchProxy.apply(objArray, uBaseFeed, oy, "15");
                b = true;
                if (obj != patchProxyRe) {
                   b1 = obj.booleanValue();
                }else {
                   b1 = uBaseFeed.t.Vg().c();
                   if (b1 && b.a(-1608526086).S()) {
                      b1 = true;
                   }else {
                      Object[] objArray3 = new Object[0];
                      j0.f("SplashPhotoInsertPresen", "not insert "+b1+" "+b.a(-1608526086).getState(), objArray3);
                      b1 = false;
                   }
                }
                if (b1) {
                   if (!PatchProxy.applyVoidOneRefs(uoc, uBaseFeed, oy, "10")) {
                      b uob = uoc.a();
                      if (uob != null) {
                         uob = uob.b;
                         if (uob != null) {
                            uBaseFeed.v = uob;
                            if (uBaseFeed.u.Y0()) {
                               obj1 = PatchProxy.apply(objArray, uBaseFeed, oy, "11");
                               b2 = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().d("adCanInsertEyemaxWhenListNotNull", b);
                               if (!b2) {
                                  objArray1 = new Object[0];
                                  j0.f("SplashPhotoInsertPresen", "processSplashData already load complete", objArray1);
                                  b.a(-1608526086).a0();
                                  uBaseFeed.P8(i.l);
                               }
                            }
                            QPhoto obj2 = PatchProxy.apply(objArray, uBaseFeed, oy, "12");
                            if (obj2 != patchProxyRe) {
                               b = obj2.booleanValue();
                            }else {
                               objArray = new Object[0];
                               j0.f("SplashPhotoInsertPresen", "processFirstData", objArray);
                               obj2 = new QPhoto(uBaseFeed.v);
                               if (uBaseFeed.u.X0() instanceof i) {
                                  b2 = -536296199;
                                  if (!d.a(b2).yz()) {
                                     if (d.a(b2).VP()) {
                                        if (uBaseFeed.u.getDataSource() == null) {
                                           obj1 = uBaseFeed.u.O0();
                                           obj3 = PatchProxy.applyOneRefs(obj1, uBaseFeed, oy, "14");
                                           if (obj3 != patchProxyRe) {
                                              b3 = obj3.booleanValue();
                                           }else if(obj1 != null && r1.w3(obj1.get(0))){
                                              b3 = true;
                                           }else {
                                              b3 = false;
                                           }
                                           if (!b3) {
                                              objArray1 = new Object[0];
                                              j0.f("SplashPhotoInsertPresen", "has not SplashInGrootSource processFirstData", objArray1);
                                              uBaseFeed.u.O0().H(0, obj2);
                                           }else {
                                              objArray1 = new Object[0];
                                              j0.c("SplashPhotoInsertPresen", "already has SplashInGrootSource", objArray1);
                                           }
                                        }else {
                                           y u = uBaseFeed.u;
                                           obj3 = PatchProxy.applyOneRefs(u, uBaseFeed, oy, "13");
                                           if (obj3 != patchProxyRe) {
                                              b3 = obj3.booleanValue();
                                           }else if(u != null && (!q.f(u.V0()) && r1.w3(u.U0(0)))){
                                              b3 = true;
                                           }else {
                                              b3 = false;
                                           }
                                           if (!b3) {
                                              objArray1 = new Object[0];
                                              j0.f("SplashPhotoInsertPresen", "has not SplashSlideViewModel processFirstData", objArray1);
                                              y u1 = uBaseFeed.u;
                                              Objects.requireNonNull(u1);
                                              if (!PatchProxy.isSupport(SlidePlayViewModel.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(0), obj2, Boolean.TRUE, "SplashTopPhotoInsertPresenter", u1, SlidePlayViewModel.class, "78")) {
                                                 a.b("SlidePlayViewModel", "insertItem  index = 0 modifyOriginDataAlso=true reason = SplashTopPhotoInsertPresenter");
                                                 b uob1 = u1.Q0("kwai_data_source_service");
                                                 if (uob1 != null) {
                                                    uob1.a().q0(0, obj2, b);
                                                 }
                                              }
                                           }else {
                                              objArray1 = new Object[0];
                                              j0.c("SplashPhotoInsertPresen", "already has SplashSlideViewModel", objArray1);
                                           }
                                        }
                                        uBaseFeed.u.k(0, 0);
                                     }
                                     uBaseFeed.u.X0().f1(obj2);
                                     uBaseFeed.w = b;
                                  }
                               }
                               b = false;
                            }
                            if (!b) {
                               objArray1 = new Object[0];
                               j0.c("SplashPhotoInsertPresen", "processSplashData not insert successfully", objArray1);
                               b.a(-1608526086).a0();
                               uBaseFeed.P8(i.l);
                            }
                         }
                      }
                   }
                }else {
                   this.V8();
                }
             }else {
                objArray1 = new Object[0];
                j0.f("SplashPhotoInsertPresen", "processSplashData splashFinish", objArray1);
                uBaseFeed.P8(i.l);
                b.a(-1608526086).a0();
             }
          }
       label_0259 :
          return;
       }
    }
    public final void S8(boolean p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oy, "16")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "SplashPhotoInsertPresen";
       j0.f(str, "removeFeedIfNeed mHasInsert:"+this.w+",mHasEnterDetail:"+this.x, objArray);
       if (this.w != null) {
          QPhoto obj = PatchProxy.apply(null, this, oy, "18");
          if (obj != PatchProxyResult.class) {
             i = obj.booleanValue();
          }else if(this.v == null){
             if (!this.u.X0() instanceof i || this.w == null) {
                objArray = new Object[i];
                j0.f(str, "doRemove has not insert or unknown pagelist", objArray);
             }else {
                obj = new QPhoto(this.v);
                this.u.X0().W0();
                this.w = i;
                if (this.u.getDataSource() == null) {
                   this.u.O0().W(obj);
                }else if(this.u.e1() > 0){
                   this.u.F1(obj, "SplashTopPhotoInsertPresenter");
                }
                i = true;
             }
          }
          if (!i || (p0 && !PatchProxy.applyVoid(null, this, oy, "17"))) {
             c uoc = b.a(-1608526086);
             if (uoc.S()) {
                uoc.a0();
             }
          }
       }
    label_00c1 :
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, y.class, "20")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("SplashPhotoInsertPresen", "reportEyemaxFailed", objArray);
       if (!b.a(-1608526086).D2()) {
          return;
       }
       if (b.a(-1608526086).S() && b.a(-1608526086).X()) {
          Object[] objArray1 = new Object[i];
          j0.f("SplashPhotoInsertPresen", "reportEyemaxFailed", objArray1);
          this.P8(i.i);
          b.a(-1608526086).a0();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "1")) {
          return;
       }
       this.t = this.r8("FRAGMENT");
       return;
    }
    public void onHomeSplashStateEvent(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "6")) {
          return;
       }
       p0 = p0.a;
       if (p0 == 1) {
          this.reset();
       }else if(p0 == 2){
          this.R8();
       }else if(p0 == 5 || p0 == 4){
          if (this.w != null && this.z == null) {
             this.S8(false);
          }
          y tu = this.u;
          if (tu != null && tu.X0() instanceof i) {
             this.u.X0().Q();
          }
       }
       return;
    }
    public void onHomeSplashStateEvent(x p0){
       this.x = true;
    }
    public final void reset(){
       this.v = null;
       this.w = false;
       this.z = false;
       this.x = false;
    }
}
