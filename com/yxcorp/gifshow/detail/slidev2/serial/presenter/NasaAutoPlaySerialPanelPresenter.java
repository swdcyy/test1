package com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter$a;
import nsd.u;
import yp7.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.util.BitSet;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import b8a.w;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter$d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter$e;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter$f;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter$b;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter$c;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.o;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.NasaAutoPlaySerialPanelPresenter$g;
import qvb.i;
import zl5.f;
import com.yxcorp.gifshow.entity.QPhoto;
import fm5.a;
import java.util.HashMap;
import e0a.j;
import cda.k;
import t45.d;
import brd.z;
import t8a.a;
import b95.a;
import w85.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import t8a.b;
import n8a.a;
import com.kwai.robust.PatchProxyResult;
import uw9.o;
import q87.c;
import com.kwai.framework.activitycontext.ActivityContext;
import tkd.b;
import tkd.d;
import xpb.a;
import java.util.List;
import qvb.a;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import n8a.a$a;
import java.lang.Integer;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.StringBuilder;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import y8a.e;
import java.util.Collection;
import ekd.q;
import y8a.d;
import com.yxcorp.gifshow.tube.StandardSerialInfo;
import com.yxcorp.gifshow.tube.SerialInfo;
import wkd.b;
import rl5.b;
import cjd.e;
import erd.o;
import android.view.View;
import com.yxcorp.utility.n;
import y8a.c;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.tube.SerialPhoto;
import android.content.Context;
import lnc.a1;
import android.content.res.Resources;
import android.widget.TextView;
import cda.l;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.Float;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import uw9.q;
import f6a.c;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import android.os.SystemClock;
import brd.y;
import java.util.Map;
import java.lang.Number;
import java.lang.Math;
import uw9.u3;
import io.reactivex.subjects.PublishSubject;
import mrd.c;
import androidx.fragment.app.Fragment;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.util.DisplayMetrics;
import cw9.c;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class NasaAutoPlaySerialPanelPresenter extends SlidePlayAutoPlayNextPresenter	// class@0019e5
{
    public final String f1;
    public t g1;
    public u3 h1;
    public PublishSubject i1;
    public PublishSubject j1;
    public a k1;
    public t l1;
    public c m1;
    public d n1;
    public final a o1;
    public PublishSubject p1;
    public MilanoContainerEventBus q1;
    public w r1;
    public boolean s1;
    public boolean t1;
    public float u1;
    public float v1;
    public int w1;
    public NasaBizParam x1;
    public boolean y1;
    public static boolean A1;
    public static final NasaAutoPlaySerialPanelPresenter$a B1;
    public static QPhoto z1;

    static {
       NasaAutoPlaySerialPanelPresenter.B1 = new NasaAutoPlaySerialPanelPresenter$a(null);
       NasaAutoPlaySerialPanelPresenter.A1 = true;
    }
    public void NasaAutoPlaySerialPanelPresenter(){
       super();
       this.f1 = "NasaAutoPlaySerialPanelPresenter";
       a uoa = new a(0, false, null, 0, 15, null);
       this.o1 = v0;
       this.v1 = 0xbf800000;
    }
    public void B9(boolean p0){
       NasaAutoPlaySerialPanelPresenter nasaAutoPlay = NasaAutoPlaySerialPanelPresenter.class;
       if (PatchProxy.isSupport(nasaAutoPlay) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, nasaAutoPlay, "28")) {
          return;
       }
       nasaAutoPlay = this.o1;
       int i = (p0)? 3: 2;
       if (i != nasaAutoPlay.a() || nasaAutoPlay.b()) {
          nasaAutoPlay.d(i);
          nasaAutoPlay.e(false);
       }
       this.V9();
       if (this.v1 - (float)false >= 0) {
          this.v1 = 0xbf800000;
       }
       return;
    }
    public void C9(){
       if (PatchProxy.applyVoid(null, this, NasaAutoPlaySerialPanelPresenter.class, "27")) {
          return;
       }
       NasaAutoPlaySerialPanelPresenter to1 = this.o1;
       if (!to1.b() && !this.T.get(6)) {
          to1.d(3);
          to1.e(true);
          this.V9();
       }
       return;
    }
    public void D9(){
       if (PatchProxy.applyVoid(null, this, NasaAutoPlaySerialPanelPresenter.class, "31")) {
          return;
       }
       NasaAutoPlaySerialPanelPresenter to1 = this.o1;
       if (!to1.b() && !this.T.get(6)) {
          to1.d(3);
          to1.e(true);
          this.V9();
          this.U9();
       }
       return;
    }
    public void E8(){
       f d;
       NasaAutoPlaySerialPanelPresenter nasaAutoPlay = NasaAutoPlaySerialPanelPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaAutoPlay, "7")) {
          return;
       }
       if (this.T9()) {
          return;
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       ViewModel viewModel = ViewModelProviders.of(activity).get(w.class);
       a.o(viewModel, "ViewModelProviders.of\(fr¡­amaViewModel::class.java\)");
       this.r1 = viewModel;
       if (viewModel == null) {
          a.S("mPanoramaViewModel");
       }
       viewModel.r0().observe(this.G, new NasaAutoPlaySerialPanelPresenter$d(this));
       super.E8();
       SlidePlayAutoPlayNextPresenter tV0 = this.V0;
       a.o(tV0, "mSlidePlayViewModel");
       this.w1 = tV0.a0();
       NasaAutoPlaySerialPanelPresenter.A1 = true;
       this.v1 = (float)this.b9() / 1000.00f;
       this.Z = false;
       NasaAutoPlaySerialPanelPresenter ti1 = this.i1;
       if (ti1 == null) {
          a.S("mCommentFragmentVisiblePublisher");
       }
       this.X7(ti1.subscribe(new NasaAutoPlaySerialPanelPresenter$e(this)));
       ti1 = this.j1;
       if (ti1 == null) {
          a.S("mAiTextFragmentVisiblePublisher");
       }
       this.X7(ti1.subscribe(new NasaAutoPlaySerialPanelPresenter$f(this)));
       ti1 = this.q1;
       if (ti1 != null) {
          this.X7(ti1.r.subscribe(new NasaAutoPlaySerialPanelPresenter$b(this)));
       }
       ti1 = this.p1;
       if (ti1 != null) {
          this.X7(ti1.subscribe(new NasaAutoPlaySerialPanelPresenter$c(this)));
       }
       RxBus f = RxBus.f;
       this.X7(f.f(o.class).subscribe(new NasaAutoPlaySerialPanelPresenter$g(this)));
       SlidePlayAutoPlayNextPresenter tV01 = this.V0;
       i oi = (tV01 != null)? tV01.X0(): objArray;
       if (!oi instanceof f) {
          oi = objArray;
       }
       if (oi != null) {
          String str = a.g(this.x);
          d = oi.D;
          if (!PatchProxy.isSupport(nasaAutoPlay) || (!PatchProxy.applyVoidTwoRefs(str, Boolean.valueOf(d), this, nasaAutoPlay, "34") && (str != null && !SlidePlayAutoPlayNextPresenter.e1.containsKey(str)))) {
             this.X9(str, d);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, nasaAutoPlay, "9") && j.h()) {
          this.X7(f.f(k.class).observeOn(d.a).subscribe(new a(this)));
       }
       if (this.H.n().b() && !PatchProxy.applyVoid(objArray, this, nasaAutoPlay, "8")) {
          GifshowActivity activity1 = this.getActivity();
          if (activity1 != null) {
             this.X7(activity1.m().subscribe(new b(this)));
          }
       }
       return;
    }
    public void E9(){
       NasaAutoPlaySerialPanelPresenter tk1;
       QPhoto obj;
       boolean b;
       List obj1;
       boolean b2;
       a b3;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaAutoPlaySerialPanelPresenter.class, "4")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "NasaSerialAutoPlayPageList";
       o.C().w(str, " ---------playNext", objArray1);
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       String str1 = 1;
       if (!uActivityCon.h() && d.a(0x513becbe).uQ(this.getActivity())) {
          tk1 = this.k1;
          if (tk1 != null) {
             obj = PatchProxy.apply(objArray, tk1, uoa, "11");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                b3 = tk1.a;
                if (b3 != null) {
                   List items = b3.getItems();
                   if (items != null) {
                      Iterator iterator = items.iterator();
                      String str2 = null;
                      while (true) {
                         if (iterator.hasNext()) {
                            QPhoto qPhoto2 = iterator.next();
                            a.o(qPhoto2, "it");
                            String photoId1 = qPhoto2.getPhotoId();
                            a b4 = tk1.b;
                            String photoId2 = (b4 != null)? b4.getPhotoId(): objArray;
                            if (TextUtils.n(photoId1, photoId2)) {
                            label_008d :
                               if (a.w(tk1.b) || str2 == (items.size() - str1)) {
                                  a c1 = tk1.c;
                                  if (c1 != null) {
                                     c1.d();
                                  }
                                  b = true;
                               }
                            }else {
                               str2 = str2 + 1;
                            }
                         }else {
                            str2 = -1;
                            goto label_008d ;
                         }
                      }
                   }
                }
                b = false;
             }
             if (b == str1) {
                tk1 = this.k1;
                if (tk1 != null) {
                   NasaAutoPlaySerialPanelPresenter tw1 = this.w1;
                   if (PatchProxy.isSupport(uoa)) {
                      obj1 = PatchProxy.applyOneRefs(Integer.valueOf(tw1), tk1, uoa, "14");
                      if (obj1 != patchProxyRe) {
                         obj1.booleanValue();
                      }
                   }
                   uoa = tk1.a;
                   if (uoa != null) {
                      obj1 = uoa.getItems();
                      if (obj1 != null) {
                         QPhoto qPhoto = CollectionsKt___CollectionsKt.p2(obj1);
                         if (qPhoto != null) {
                            a c = tk1.c;
                            if (c != null) {
                               c.b(qPhoto, tw1);
                            }
                         }
                      }
                   }
                }
             label_00df :
                return;
             }
          }
       }
       if (a.w(this.x)) {
          Object[] objArray2 = new Object[i];
          o.C().w(str, " ---------playNext: "+"serialNum "+a.m(this.x)+", serialCount "+a.d(this.x)+", is lastPhoto ,return", objArray2);
          return;
       }else {
          tk1 = this.k1;
          if (tk1 != null) {
             boolean b1 = e.a(this.x1);
             if (PatchProxy.isSupport(uoa)) {
                obj = PatchProxy.applyOneRefs(Boolean.valueOf(b1), tk1, uoa, "12");
                if (obj != patchProxyRe) {
                   obj.booleanValue();
                }
             }
             obj = tk1.a(b1);
             if (obj != null) {
                uoa = tk1.c;
                if (uoa != null) {
                   b2 = uoa.a(obj);
                }
             }else {
                b3 = tk1.b;
                if (b3 != null) {
                   if (PatchProxy.isSupport(uoa)) {
                      Object[] obj2 = PatchProxy.applyOneRefs(Boolean.valueOf(b1), tk1, uoa, "13");
                      if (obj2 != patchProxyRe) {
                         b2 = obj2.booleanValue();
                      }else if(!b1){
                         b2 = a.w(tk1.b);
                      }else {
                         uoa = tk1.a;
                         obj1 = (uoa != null)? uoa.getItems(): objArray;
                         if (!q.f(obj1)) {
                            uoa = tk1.a;
                            if (uoa != null) {
                               obj1 = uoa.getItems();
                               if (obj1 != null) {
                                  objArray = CollectionsKt___CollectionsKt.Y2(obj1);
                               }
                            }
                            b2 = a.w(objArray);
                         }else {
                            b2 = false;
                         }
                      }
                   }else {
                      goto label_016f ;
                   }
                   if (!b2) {
                      d.b(b3, i, "102");
                   }
                }
             }
          }
       label_01a6 :
          if (this.H.n().b()) {
             return;
          }else {
             StandardSerialInfo standardSeri = a.t(this.x);
             if (standardSeri != null) {
                NasaAutoPlaySerialPanelPresenter tk11 = this.k1;
                if (tk11 != null) {
                   QPhoto qPhoto1 = tk11.a(e.a(this.x1));
                   if (qPhoto1 != null) {
                      String photoId = qPhoto1.getPhotoId();
                      if (photoId != null) {
                         standardSeri = standardSeri.mSerialInfo;
                         if (standardSeri != null) {
                            a.o(standardSeri, "mStandardSerialInfo.mSerialInfo ?: return");
                            if (this.L9(standardSeri.mSerialId)) {
                               return;
                            }else {
                               this.M9(str1);
                               this.X7(b.a(-1256759027).i(standardSeri.mSerialId, standardSeri.mType, photoId).map(new e()).subscribeOn(d.b).observeOn(d.a).subscribe());
                            }
                         }
                      }
                   }
                }
             }
             return;
          }
       }
    }
    public void H9(int p0){
       boolean b;
       String str;
       NasaAutoPlaySerialPanelPresenter nasaAutoPlay = NasaAutoPlaySerialPanelPresenter.class;
       if (PatchProxy.isSupport(nasaAutoPlay) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, nasaAutoPlay, "25")) {
          return;
       }
       if (p0 > 0) {
          if (this.s != null) {
             View[] viewArray = new View[]{this.t};
             int i = 8;
             n.Z(i, viewArray);
             viewArray = new View[]{this.s};
             n.Z(i, viewArray);
             viewArray = new View[]{this.r};
             n.Z(i, viewArray);
          }
          c a = c.a;
          SlidePlayAutoPlayNextPresenter tx = this.x;
          Objects.requireNonNull(a);
          QPhoto obj = PatchProxy.applyOneRefs(tx, a, c.class, "9");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(tx != null && tx.getCommonMeta() != null){
             if (a.m(tx) == a.d(tx)) {
             label_0077 :
                b = true;
             }
          }else if(tx != null){
             StandardSerialInfo standardSeri = a.t(tx);
             if (standardSeri != null) {
                standardSeri = standardSeri.mSerialPhoto;
                if (standardSeri != null && standardSeri.isLastValidEpisode == 1) {
                   goto label_0077 ;
                }
             }
          }
          b = false;
          if (b) {
             nasaAutoPlay = this.k1;
             if (nasaAutoPlay != null) {
                obj = nasaAutoPlay.a(e.a(this.x1));
                if (obj != null) {
                   Context uContext = a1.c();
                   a.o(uContext, "CommonUtil.context\(\)");
                   Object[] objArray = new Object[]{String.valueOf(p0),Integer.valueOf(a.m(obj))};
                   str = uContext.getResources().getString(R.string.arg_RES_7f100d61, objArray);
                }
             }
             str = null;
          }else {
             str = a1.r(R.string.arg_RES_7f100304, String.valueOf(p0));
          }
          if (str != null) {
             SlidePlayAutoPlayNextPresenter ts = this.s;
             if (ts != null && !ts.getVisibility()) {
                ts = this.s;
                if (ts != null) {
                   ts.setText(str);
                }
             }
             nasaAutoPlay = this.o1;
             if (nasaAutoPlay.a() != 1 || !TextUtils.n(nasaAutoPlay.c(), str)) {
                nasaAutoPlay.d(1);
                nasaAutoPlay.f(str);
                this.V9();
             }
          }
          this.y1 = false;
       }
       return;
    }
    public void I9(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, NasaAutoPlaySerialPanelPresenter.class, "24")) {
          return;
       }
       c a = c.a;
       SlidePlayAutoPlayNextPresenter tx = this.x;
       Objects.requireNonNull(a);
       String obj = PatchProxy.applyOneRefs(tx, a, c.class, "10");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          b = false;
          if (tx != null && tx.getCommonMeta() != null) {
             if (a.m(tx) != 1) {
             label_0049 :
                obj = (b)? a1.q(R.string.arg_RES_7f1014c7, a.m(this.x)): a1.p(R.string.arg_RES_7f1014c8);
                if (obj != null) {
                   tx = this.s;
                   if (tx != null && !tx.getVisibility()) {
                      tx = this.s;
                      if (tx != null) {
                         tx.setText(obj);
                      }
                   }
                   NasaAutoPlaySerialPanelPresenter to1 = this.o1;
                   if (to1.a() != 1 || !TextUtils.n(to1.c(), obj)) {
                      to1.d(1);
                      to1.f(obj);
                      this.V9();
                   }
                }
                this.y1 = true;
                return;
             }
          }else if(tx != null){
             StandardSerialInfo standardSeri = a.t(tx);
             if (standardSeri != null) {
                standardSeri = standardSeri.mSerialPhoto;
                if (standardSeri == null || standardSeri.isFirstValidEpisode != 1) {
                }
             }else {
                goto label_0049 ;
             }
          }else {
             goto label_0049 ;
          }
          b = true;
          goto label_0049 ;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, NasaAutoPlaySerialPanelPresenter.class, "30")) {
          return;
       }
       if (this.T9()) {
          return;
       }
       NasaAutoPlaySerialPanelPresenter to1 = this.o1;
       to1.a = 0;
       to1.c = "";
       to1.b = false;
       to1.d = 0;
       this.u1 = 0;
       this.y1 = false;
       super.J8();
       return;
    }
    public boolean J9(){
       return false;
    }
    public final boolean L9(String p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NasaAutoPlaySerialPanelPresenter$a obj = PatchProxy.applyOneRefs(p0, this, NasaAutoPlaySerialPanelPresenter.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = NasaAutoPlaySerialPanelPresenter.B1;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, NasaAutoPlaySerialPanelPresenter$a.class, "1");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(TextUtils.x(p0)){
          Boolean uBoolean = SlidePlayAutoPlayNextPresenter.e1.get(p0);
          if (uBoolean != null) {
             b1 = uBoolean.booleanValue();
          }
       }
       b1 = false;
       if (!b1 && a.r(this.x) != 1) {
          b = true;
       }
       return b;
    }
    public final void M9(boolean p0){
       NasaAutoPlaySerialPanelPresenter nasaAutoPlay = NasaAutoPlaySerialPanelPresenter.class;
       if (PatchProxy.isSupport(nasaAutoPlay) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, nasaAutoPlay, "32")) {
          return;
       }
       if (p0) {
          RxBus.f.b(new l(this.x, 1));
       }else {
          RxBus.f.b(new l(this.x, 2));
       }
       return;
    }
    public final void O9(){
       if (PatchProxy.applyVoid(null, this, NasaAutoPlaySerialPanelPresenter.class, "10")) {
          return;
       }
       if (!this.R9(this.u1)) {
          NasaAutoPlaySerialPanelPresenter to1 = this.o1;
          if (to1.a() != 2 || to1.b()) {
             to1.d(2);
             to1.e(false);
             this.V9();
          }
       }
       return;
    }
    public final boolean Q9(){
       boolean b;
       SlidePlayAutoPlayNextPresenter obj = PatchProxy.apply(null, this, NasaAutoPlaySerialPanelPresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.x;
       a.o(obj, "mPhoto");
       if (obj.isVideoType() && r1.l3(this.x.mEntity)) {
          NasaAutoPlaySerialPanelPresenter tr1 = this.r1;
          if (tr1 == null) {
             a.S("mPanoramaViewModel");
          }
          if (a.g(tr1.r0().getValue(), Boolean.TRUE)) {
             b = true;
          label_0049 :
             return b;
          }
       }
    label_0048 :
       b = false;
       goto label_0049 ;
    }
    public final boolean R9(float p0){
       NasaAutoPlaySerialPanelPresenter nasaAutoPlay = NasaAutoPlaySerialPanelPresenter.class;
       if (PatchProxy.isSupport(nasaAutoPlay)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, nasaAutoPlay, "23");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 1;
       if ((((float)this.d9() * ((float)i - p0)) / 1000.00f) - (float)3 > 0) {
          i = false;
       }
       return i;
    }
    public final boolean T9(){
       boolean b1;
       NasaSlideParam nasaSlidePar;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NasaAutoPlaySerialPanelPresenter nasaAutoPlay = NasaAutoPlaySerialPanelPresenter.class;
       SlidePlayAutoPlayNextPresenter obj = PatchProxy.apply(null, this, nasaAutoPlay, "17");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       obj = (NasaExperimentUtils.F())? null: q.b(this.x);
       if (!q.c(this.x) && c.e(this.x)) {
          SlidePlayAutoPlayNextPresenter tx = this.x;
          a.o(tx, "mPhoto");
          if (tx.isVideoType()) {
             tx = this.x;
             a.o(tx, "mPhoto");
             if (!tx.isQuestionnaire() && !obj) {
                obj = this.x;
                a.o(obj, "mPhoto");
                if (!obj.isKtv()) {
                   SlidePlayAutoPlayNextPresenter obj1 = PatchProxy.apply(null, this, nasaAutoPlay, "18");
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else if(!this.H.e() && a.t(this.x) != null){
                      b1 = true;
                   }else {
                      b1 = false;
                   }
                   if (!b1) {
                      obj1 = this.x;
                      a.o(obj1, "mPhoto");
                      if (!c.a.h(obj1)) {
                         NasaAutoPlaySerialPanelPresenter tx1 = this.x1;
                         if (tx1 != null) {
                            nasaSlidePar = tx1.getNasaSlideParam();
                            if (nasaSlidePar != null && nasaSlidePar.isFromWatchLater() == true) {
                            label_00ab :
                               b = true;
                            label_00ac :
                               return b;
                            }
                         }
                         tx1 = this.x1;
                         if (tx1 != null) {
                            nasaSlidePar = tx1.getNasaSlideParam();
                            if (nasaSlidePar != null && nasaSlidePar.enableDecSearchPage() == true) {
                               goto label_00ab ;
                            }else {
                               goto label_00ac ;
                            }
                         }else {
                            goto label_00ac ;
                         }
                      }else {
                         goto label_00ab ;
                      }
                   }else {
                      goto label_00ab ;
                   }
                }else {
                   goto label_00ab ;
                }
             }else {
                goto label_00ab ;
             }
          }else {
             goto label_00ab ;
          }
       }else {
          goto label_00ab ;
       }
    }
    public final void U9(){
       NasaAutoPlaySerialPanelPresenter.z1 = null;
    }
    public boolean V8(){
       Object[] objArray = null;
       SlidePlayAutoPlayNextPresenter obj = PatchProxy.apply(objArray, this, NasaAutoPlaySerialPanelPresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.x;
       a.o(obj, "mPhoto");
       String photoId = obj.getPhotoId();
       QPhoto z1 = NasaAutoPlaySerialPanelPresenter.z1;
       if (z1 != null) {
          objArray = z1.getPhotoId();
       }
       return photoId.equals(objArray);
    }
    public final void V9(){
       if (PatchProxy.applyVoid(null, this, NasaAutoPlaySerialPanelPresenter.class, "26")) {
          return;
       }
       if (a.w(this.x) && this.y1 == null) {
          return;
       }
       NasaAutoPlaySerialPanelPresenter tm1 = this.m1;
       if (tm1 != null) {
          this.o1.d = SystemClock.elapsedRealtimeNanos();
          tm1.onNext(this.o1);
       }
       return;
    }
    public boolean W8(){
       Object obj = PatchProxy.apply(null, this, NasaAutoPlaySerialPanelPresenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.n9() && !this.Q9())? true: false;
       return b;
    }
    public final void X9(String p0,boolean p1){
       NasaAutoPlaySerialPanelPresenter nasaAutoPlay = NasaAutoPlaySerialPanelPresenter.class;
       if (PatchProxy.isSupport(nasaAutoPlay) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, nasaAutoPlay, "35")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       HashMap e1 = SlidePlayAutoPlayNextPresenter.e1;
       a.o(e1, "mSerialCollectMap");
       e1.put(p0, Boolean.valueOf(p1));
       return;
    }
    public void Y8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaAutoPlaySerialPanelPresenter.class, "6")) {
          return;
       }
       SlidePlayAutoPlayNextPresenter tV0 = this.V0;
       a.o(tV0, "mSlidePlayViewModel");
       if (tV0.C()) {
          NasaAutoPlaySerialPanelPresenter tk1 = this.k1;
          if (tk1 != null) {
             objArray = tk1.a(e.a(this.x1));
          }
          if (objArray != null) {
             b = true;
          label_002c :
             this.O = b;
             return;
          }
       }
       b = false;
       goto label_002c ;
    }
    public int Z8(float p0){
       NasaAutoPlaySerialPanelPresenter nasaAutoPlay = NasaAutoPlaySerialPanelPresenter.class;
       if (PatchProxy.isSupport(nasaAutoPlay)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, nasaAutoPlay, "22");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return Math.min(3, ((int)p0 + 1));
    }
    public int h9(){
       return 0x7f0a396b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaAutoPlaySerialPanelPresenter.class, "1")) {
          return;
       }
       super.j8();
       this.x1 = this.s8(NasaBizParam.class);
       this.g1 = this.r8("DETAIL_PLAY_TIME_DOWN_OBSERVABLE");
       this.h1 = this.q8(u3.class);
       Object obj = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­COMMENT_FRAGMENT_VISIBLE\)");
       this.i1 = obj;
       obj = this.r8("DETAIL_SLIDE_AI_TEXT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­AI_TEXT_FRAGMENT_VISIBLE\)");
       this.j1 = obj;
       this.k1 = this.r8("SERIAL_EPISODE_SHARE_DATA");
       this.l1 = this.r8("SLIDE_PLAY_PALYER_STATE_CHANGE_OBSERVABLE");
       this.p1 = this.t8("DETAIL_PROGRESSBAR_DRAG_POSITION_EVENT");
       this.m1 = this.t8("EPISODE_BOTTOM_TOAST_EVENT");
       this.q1 = this.s8(MilanoContainerEventBus.class);
       return;
    }
    public int j9(){
       return 0x7f0a39e0;
    }
    public void k9(){
       int i;
       NasaAutoPlaySerialPanelPresenter nasaAutoPlay = NasaAutoPlaySerialPanelPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaAutoPlay, "20")) {
          return;
       }
       super.k9();
       Context uContext = this.G.requireContext();
       a.o(uContext, "mFragment.requireContext\(\)");
       SlidePlayAutoPlayNextPresenter obj = PatchProxy.applyOneRefs(uContext, this, nasaAutoPlay, "21");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          TypedValue typedValue = new TypedValue();
          uContext.getTheme().resolveAttribute(R.attr.arg_RES_7f0400f6, typedValue, true);
          Resources resources = uContext.getResources();
          a.o(resources, "context.resources");
          i = TypedValue.complexToDimensionPixelSize(typedValue.data, c.c(resources));
       }
       i = i + a1.e(12.00f);
       if (i.c()) {
          i = i + n.A(this.G.requireContext());
       }
       SlidePlayAutoPlayNextPresenter tq = this.q;
       ViewGroup$LayoutParams layoutParams = (tq != null)? tq.getLayoutParams(): objArray;
       if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams = objArray;
       }
       if (layoutParams != null) {
          layoutParams.topMargin = i;
       }
       if (layoutParams) {
          layoutParams.rightMargin = a1.e(19.00f);
       }
       obj = this.q;
       ViewParent parent = (obj != null)? obj.getParent(): objArray;
       if (parent instanceof RelativeLayout) {
          objArray = parent;
       }
       if (objArray != null) {
          objArray.bringToFront();
       }
       return;
    }
    public boolean m9(){
       Object obj = PatchProxy.apply(null, this, NasaAutoPlaySerialPanelPresenter.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.o1.b();
    }
    public boolean n9(){
       SlidePlayAutoPlayNextPresenter obj = PatchProxy.apply(null, this, NasaAutoPlaySerialPanelPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.V0;
       a.o(obj, "mSlidePlayViewModel");
       boolean b = true;
       if (obj.C() && (this.T9() || this.Q9())) {
          NasaAutoPlaySerialPanelPresenter tx1 = this.x1;
          if (tx1 != null) {
             NasaSlideParam nasaSlidePar = tx1.getNasaSlideParam();
             if (nasaSlidePar == null || nasaSlidePar.mIsMusicRadio != b) {
             }
          }else {
          }
       }
    label_003e :
       return b;
    }
    public boolean o9(){
       NasaAutoPlaySerialPanelPresenter obj = PatchProxy.apply(null, this, NasaAutoPlaySerialPanelPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.x1;
       boolean b = true;
       if (obj != null) {
          NasaSlideParam nasaSlidePar = obj.getNasaSlideParam();
          if (nasaSlidePar != null && nasaSlidePar.mEnableMusicRadioBackPlay == b) {
          label_0025 :
             return b;
          }
       }
       b = false;
       goto label_0025 ;
    }
    public void q9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaAutoPlaySerialPanelPresenter.class, "15")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AUTO_PLAY_TIPS_CARD";
       i3 oi3 = i3.f();
       oi3.d("tips_content", p0);
       oi3.d("tips_type", "COLLECTION_NEXT");
       uElementPack.params = oi3.e();
       SlidePlayAutoPlayNextPresenter tx = this.x;
       a.o(tx, "mPhoto");
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(tx.getEntity());
       u1.M("", this.G, 0, uElementPack, uContentPack, null);
       return;
    }
    public void s9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaAutoPlaySerialPanelPresenter.class, "14")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AUTO_PLAY_TIPS_CARD";
       i3 oi3 = i3.f();
       oi3.d("tips_content", p0);
       oi3.d("tips_type", "COLLECTION_NEXT");
       uElementPack.params = oi3.e();
       SlidePlayAutoPlayNextPresenter tx = this.x;
       a.o(tx, "mPhoto");
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(tx.getEntity());
       u1.D0("", this.G, 0, uElementPack, uContentPack, null);
       return;
    }
    public void t9(boolean p0){
       NasaAutoPlaySerialPanelPresenter nasaAutoPlay = NasaAutoPlaySerialPanelPresenter.class;
       if (PatchProxy.isSupport(nasaAutoPlay) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, nasaAutoPlay, "33")) {
          return;
       }
       StandardSerialInfo standardSeri = a.t(this.x);
       if (standardSeri != null) {
          standardSeri = standardSeri.mSerialInfo;
          if (standardSeri != null) {
             a.o(standardSeri, "mStandardSerialInfo.mSerialInfo ?: return");
             if (this.L9(standardSeri.mSerialId)) {
                return;
             }else {
                this.M9(p0);
                SlidePlayAutoPlayNextPresenter tx = this.x;
                a.o(tx, "mPhoto");
                this.X7(b.a(-1256759027).i(standardSeri.mSerialId, standardSeri.mType, tx.getPhotoId()).map(new e()).subscribeOn(d.b).observeOn(d.a).subscribe());
             }
          }
       }
       return;
    }
    public boolean u9(float p0){
       int i = 0;
       if (p0 - 0x40533333 <= 0 && (p0 - (float)i > 0 && NasaAutoPlaySerialPanelPresenter.A1)) {
          i = true;
       }
    label_0012 :
       return i;
    }
    public boolean x9(float p0){
       NasaAutoPlaySerialPanelPresenter tv1 = this.v1;
       float f = 0.30f;
       int i = 0;
       if (p0 - (((float)3 + tv1) + f) <= 0 && (p0 - (f + tv1) >= 0 && tv1 - (float)i >= 0)) {
          i = true;
       }
    label_0019 :
       return i;
    }
}
