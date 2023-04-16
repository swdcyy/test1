package com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel;
import kf5.l;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel$a;
import nsd.u;
import lnc.a1;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import mf5.s0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ew5.a;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import android.animation.ValueAnimator;
import kf5.r;
import android.animation.Animator$AnimatorListener;
import kf5.s;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import bt7.c;
import android.animation.TimeInterpolator;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.feature.api.social.message.imshare.model.IMShareRecoRequest;
import java.lang.System;
import xf6.d;
import xf6.l;
import o56.a;
import le5.f;
import java.lang.Number;
import ok.x;
import java.lang.Integer;
import k2b.k0;
import q87.c;
import tkd.b;
import tkd.d;
import dw5.a;
import brd.a0;
import bw5.u;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import kf5.u;
import erd.g;
import kf5.v;
import erd.a;
import kf5.w;
import io.reactivex.internal.functions.Functions;
import crd.b;
import xtd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b9;
import kf5.k;
import xtd.i;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel$d;
import com.yxcorp.gifshow.recycler.widget.OperationRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import ytd.b;
import java.util.List;
import i9c.a;
import mf5.r0;
import g9c.a;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import i9c.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import u2.f;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewTreeObserver;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel$e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Float;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel$b;
import brd.t;
import crd.a;
import kf5.l$b;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import mf5.s0$a;
import mf5.w0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.HashSet;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel$c;
import java.util.Comparator;
import trd.x;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel$dealOperationList$2;
import msd.l;
import trd.y;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import mf5.n;
import mf5.e0;
import djc.k;
import kf5.t;

public final class NewPlayerFeedbackPanel extends l	// class@000a7b
{
    public b U;
    public boolean U0;
    public PresenterV2 V;
    public int V0;
    public ClientContent$LiveStreamPackage W;
    public List W0;
    public final PublishSubject X;
    public List X0;
    public final PublishSubject Y;
    public b Y0;
    public QPreInfo Z;
    public final ValueAnimator Z0;
    public final BaseFragment a1;
    public final s0 b1;
    public static final int c1;
    public static final int d1;
    public static final NewPlayerFeedbackPanel$a e1;

    static {
       NewPlayerFeedbackPanel.e1 = new NewPlayerFeedbackPanel$a(null);
       NewPlayerFeedbackPanel.c1 = a1.d(0x7f0702ab);
       NewPlayerFeedbackPanel.d1 = a1.d(0x7f070271);
    }
    public void NewPlayerFeedbackPanel(Activity p0,BaseFragment p1,QPhoto p2,s0 p3,u p4){
       boolean b;
       a.p(p0, "context");
       a.p(p2, "photo");
       a.p("POPUP_MORE_OPERATION", "source");
       super(p0);
       this.z = p2;
       this.H = "NEGATIVE_PANEL";
       this.a1 = p1;
       this.b1 = p3;
       this.W = a.a(p2);
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<List<IMShareTarget>>\(\)");
       this.X = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.Y = publishSubje;
       this.V0 = 1;
       this.W0 = new ArrayList();
       this.X0 = new ArrayList();
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       valueAnimato.addListener(new r(this));
       valueAnimato.addUpdateListener(new s(this));
       valueAnimato.setDuration(200);
       valueAnimato.setInterpolator(new c(0, 0x3f19999a, 0.30f, 0x3f800000));
       a.o(valueAnimato, "ValueAnimator.ofFloat\(0f…r\(0f, 0.6f, 0.3f, 1f\)\n  }");
       this.Z0 = valueAnimato;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NewPlayerFeedbackPanel.class, "3")) {
       }else if(this.r() == null){
          p3 = PatchProxy.apply(objArray, this, NewPlayerFeedbackPanel.class, "1");
          if (p3 != patchProxyRe) {
             b = p3.booleanValue();
          }else {
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             if (qCurrentUser.isLogined()) {
                qCurrentUser = PatchProxy.apply(objArray, this, NewPlayerFeedbackPanel.class, "2");
                if (qCurrentUser != patchProxyRe) {
                   b = qCurrentUser.booleanValue();
                }else {
                   QPhoto qPhoto2 = this.r();
                   a.m(qPhoto2);
                   if (!qPhoto2.isPublic()) {
                      qPhoto2 = this.r();
                      a.m(qPhoto2);
                      if (!qPhoto2.isLiveStream()) {
                         b = false;
                      }
                   }
                   b = true;
                }
                if (b) {
                   b = true;
                }
             }
             b = false;
          }
          if (b) {
             String str = String.valueOf(System.currentTimeMillis());
             QPhoto qPhoto = this.r();
             a.m(qPhoto);
             int i = (qPhoto.isLiveStream())? 2: 1;
             QPhoto qPhoto1 = this.r();
             a.m(qPhoto1);
             String photoId = qPhoto1.getPhotoId();
             a.o(photoId, "mPhoto!!.photoId");
             qPhoto1 = this.r();
             a.m(qPhoto1);
             IMShareRecoRequest iMShareRecoR = new IMShareRecoRequest(str, i, photoId, qPhoto1.getUserId(), 2);
             long l = 0;
             long l1 = l.f("key_feedback_panel_refresh_reco_timeout", l);
             if (!a.d() || l1 - l <= 0) {
                l = PatchProxy.apply(objArray, objArray, f.class, "31");
                int i1 = (l != patchProxyRe)? l.intValue(): f.j.get().intValue();
                l1 = (long)i1;
             }
             Object[] objArray1 = new Object[0];
             k0.C().w("NewPlayerFeedbackPanel", "开始请求reco数据", objArray1);
             this.Y0 = d.a(0x7904f115).Ai(b).V(l1, TimeUnit.MILLISECONDS, d.c).G(d.a).p(new u(this)).n(new v(this)).R(new w(this), Functions.d());
          }
       }
       return;
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, NewPlayerFeedbackPanel.class, "14")) {
          return;
       }
       super.A();
       NewPlayerFeedbackPanel tU = this.U;
       if (tU != null) {
          tU.detach();
       }
       tU = this.V;
       if (tU != null) {
          a.m(tU);
          if (tU.R1()) {
             tU = this.V;
             a.m(tU);
             tU.destroy();
             this.V = null;
          }
       }
       b9.a(this.Y0);
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, NewPlayerFeedbackPanel.class, "13")) {
          return;
       }
       super.B();
       k.a.i(this.a1, this.r(), this.U0);
       this.U = new i(new NewPlayerFeedbackPanel$d(this, this.s()));
       return;
    }
    public final void D(int p0){
       if (PatchProxy.isSupport(NewPlayerFeedbackPanel.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NewPlayerFeedbackPanel.class, "8")) {
          return;
       }
       if (this.p()) {
          this.y();
       }
       this.V0 = p0;
       List list = this.k();
       h$e uoe = h.c(new a(this.q().Q0(), list), true);
       a.o(uoe, "DiffUtil.calculateDiff\(\n…ewList\),\n      true\n    \)");
       b uob = new b(this.q(), null);
       this.q().W0(list);
       uoe.e(uob);
       uob.e();
       this.C = this.s().getHeight();
       list.height = this.v();
       this.t().requestLayout();
       this.s().getViewTreeObserver().addOnGlobalLayoutListener(new NewPlayerFeedbackPanel$e(this));
       return;
    }
    public final void E(float p0){
       if (PatchProxy.isSupport(NewPlayerFeedbackPanel.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, NewPlayerFeedbackPanel.class, "10")) {
          return;
       }
       this.t().getLayoutParams().height = (int)((float)this.v() + ((float)(this.D - this.v()) * p0));
       this.t().requestLayout();
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, NewPlayerFeedbackPanel.class, "6")) {
          return;
       }
       b uob = this.n().subscribe(new NewPlayerFeedbackPanel$b(this));
       a.o(uob, "mDismissDialogSubject.su…ar\(\)\n      cancel\(\)\n    }");
       if (!PatchProxy.applyVoidOneRefs(uob, this, l.class, "29")) {
          a.p(uob, "disposable");
          this.p.c(uob);
       }
       return;
    }
    public l$b j(){
       l$b obj = PatchProxy.apply(null, this, NewPlayerFeedbackPanel.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new l$b();
       obj.f = this.r();
       obj.e = this.W;
       return obj;
    }
    public List k(){
       NewPlayerFeedbackPanel tW0;
       Object obj1;
       List list;
       NewPlayerFeedbackPanel tb1;
       ArrayList uArrayList2;
       List list1;
       int i;
       int i1;
       int i2;
       int c1;
       int i4;
       Iterator obj2;
       w0 ow0;
       Object obj3;
       Iterator iterator2;
       Object[] objArray1;
       ArrayList uArrayList3;
       List obj4;
       Object[] objArray2;
       s0 os0 = s0.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       NewPlayerFeedbackPanel obj = PatchProxy.apply(objArray, this, NewPlayerFeedbackPanel.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.X0.size() > 0 && this.W0.size() > 0) {
          tW0 = (this.V0 == 1)? this.W0: this.X0;
          return tW0;
       }else {
          obj = this.b1;
          Objects.requireNonNull(obj);
          ArrayList uArrayList = PatchProxy.apply(objArray, obj, os0, "3");
          if (uArrayList != patchProxyRe) {
          }else {
             obj2 = obj.a.iterator();
             if (obj2.hasNext()) {
                objArray2 = obj2.next();
                Objects.requireNonNull(objArray2);
             }else {
                objArray2 = objArray;
             }
             if (objArray2 != null) {
                list = objArray2.a();
                if (list != null) {
                   uArrayList = new ArrayList();
                   obj2 = list.iterator();
                   while (obj2.hasNext()) {
                      Object obj5 = obj2.next();
                      obj1 = obj5;
                      obj1 = (obj1.E() || (obj1.D() && (obj1.C() && f.f())))? 1: null;
                      if (obj1) {
                         uArrayList.add(obj5);
                      }
                   }
                }
             }
             obj4 = CollectionsKt__CollectionsKt.E();
          }
          HashSet hashSet = new HashSet();
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             obj1 = iterator.next();
             if (hashSet.add(obj1.A())) {
                uArrayList1.add(obj1);
             }
          }
          list = CollectionsKt___CollectionsKt.J5(uArrayList1);
          if (list.size() > 2) {
             tb1 = this.b1;
             Objects.requireNonNull(tb1);
             uArrayList2 = PatchProxy.apply(objArray, tb1, os0, "1");
             if (uArrayList2 != patchProxyRe) {
             }else {
                iterator2 = tb1.a.iterator();
                if (iterator2.hasNext()) {
                   objArray1 = iterator2.next();
                   Objects.requireNonNull(objArray1);
                }else {
                   objArray1 = objArray;
                }
                if (objArray1 != null) {
                   list1 = objArray1.a();
                   if (list1 != null) {
                      uArrayList3 = new ArrayList();
                      iterator2 = list1.iterator();
                      while (iterator2.hasNext()) {
                         obj4 = iterator2.next();
                         obj3 = obj4;
                         obj3 = (obj3.E() || (obj3.D() && (obj3.C() && (a.g(obj3.A(), "space") || !f.f()))))? 1: null;
                         if (obj3) {
                            uArrayList3.add(obj4);
                         }
                      }
                      uArrayList2 = uArrayList3;
                   }
                }
                list1 = CollectionsKt__CollectionsKt.E();
             }
             list1 = CollectionsKt___CollectionsKt.J5(uArrayList2);
          }else {
             tb1 = this.b1;
             Objects.requireNonNull(tb1);
             uArrayList2 = PatchProxy.apply(objArray, tb1, os0, "2");
             if (uArrayList2 != patchProxyRe) {
             }else {
                iterator2 = tb1.a.iterator();
                if (iterator2.hasNext()) {
                   objArray1 = iterator2.next();
                   Objects.requireNonNull(objArray1);
                }else {
                   objArray1 = objArray;
                }
                if (objArray1 != null) {
                   list1 = objArray1.a();
                   if (list1 != null) {
                      uArrayList3 = new ArrayList();
                      iterator2 = list1.iterator();
                      while (iterator2.hasNext()) {
                         obj4 = iterator2.next();
                         obj3 = obj4;
                         obj3 = (obj3.E() || obj3.D())? 1: null;
                         if (obj3) {
                            uArrayList3.add(obj4);
                         }
                      }
                      uArrayList2 = uArrayList3;
                   }
                }
                list1 = CollectionsKt__CollectionsKt.E();
             }
             list1 = CollectionsKt___CollectionsKt.J5(uArrayList2);
          }
          if (list.size() > 2) {
             if (list.size() > 1) {
                x.p0(list, new NewPlayerFeedbackPanel$c());
             }
             i = ((NewPlayerFeedbackPanel.c1 * 2) + (NewPlayerFeedbackPanel.d1 * (list.size() - 2))) / (list.size() - 1);
             i1 = list.size() - 1;
             i2 = 0;
             while (i2 < i1) {
                if (!i2) {
                   c1 = NewPlayerFeedbackPanel.c1;
                   list.get(i2).M(c1);
                   c1 = i - c1;
                   list.get(i2).N(c1);
                }else {
                   int i3 = list.size() - 2;
                   if (i2 == i3) {
                      c1 = NewPlayerFeedbackPanel.c1;
                      i4 = i - c1;
                      list.get(i2).M(i4);
                      list.get(i2).N(c1);
                   }else {
                      i4 = i2 - 1;
                      c1 = NewPlayerFeedbackPanel.d1 - list.get(i4).s();
                      list.get(i2).M(c1);
                      c1 = i - list.get(i2).r();
                      list.get(i2).N(c1);
                   }
                }
                i2 = i2 + 1;
             }
             this.W0.addAll(list);
             this.G = list.size() - 1;
          }
          Iterator iterator1 = list1.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                obj2 = iterator1.next();
                if (a.g(obj2.A(), "send_panel")) {
                   objArray = obj2;
                }
             }
             if (objArray != null) {
                list1.remove(objArray);
                if (!this.X0.contains(objArray)) {
                   this.X0.add(objArray);
                }
             }
             if (f.f()) {
                y.K0(list1, NewPlayerFeedbackPanel$dealOperationList$2.INSTANCE);
             }
             i = list1.size();
             int i5 = 0;
             while (i5 < i) {
                if (i5) {
                   int i6 = i5 - 1;
                   if (i6 < 0 || !a.g(list1.get(i6).A(), "space")) {
                      ow0 = null;
                   label_02c5 :
                      i1 = i5 + 1;
                      if (i1 >= list1.size() || !a.g(list1.get(i1).A(), "space")) {
                         i2 = list1.size() - 1;
                         if (i5 != i2) {
                            obj3 = null;
                         label_02f0 :
                            if (ow0 && obj3) {
                               list1.get(i5).I(3);
                            }
                            if (i5) {
                               i6 = list1.size() - 1;
                               if (i5 == i6) {
                               label_0307 :
                                  if (!a.g(list1.get(i5).A(), "space")) {
                                  label_0317 :
                                     if (!this.W0.contains(list1.get(i5)) || a.g(list1.get(i5).A(), "space")) {
                                        i6 = i5 - 1;
                                        if (i6 >= 0 && (!a.g(list1.get(i6).A(), "space") || !a.g(list1.get(i5).A(), "space"))) {
                                           this.W0.add(list1.get(i5));
                                        }
                                     }
                                  }
                               }else {
                                  goto label_0317 ;
                               }
                            }else {
                               goto label_0307 ;
                            }
                            i5 = i1;
                         }
                      }
                      list1.get(i5).I(2);
                      obj3 = 1;
                      goto label_02f0 ;
                   }
                }
                list1.get(i5).I(1);
                ow0 = 1;
                goto label_02c5 ;
             }
             tW0 = (this.V0 == 1)? this.W0: this.X0;
          }
          return tW0;
       }
    }
    public int l(){
       return 0x7f0d0853;
    }
    public int m(){
       return 0x7f0d0858;
    }
    public int w(){
       return 10;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, NewPlayerFeedbackPanel.class, "12")) {
          return;
       }
       if (this.p()) {
          this.y();
       }
       boolean b = (this.u().d().size() > 0)? true: false;
       this.A = b;
       if (b) {
          this.u().d().clear();
          this.o().onNext(Boolean.TRUE);
          this.D(1);
          return;
       }else {
          this.dismiss();
          return;
       }
    }
    public void z(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "7";
       if (PatchProxy.applyVoid(objArray, this, NewPlayerFeedbackPanel.class, str)) {
          return;
       }
       PresenterV2 presenterV2 = new PresenterV2();
       this.V = presenterV2;
       a.m(presenterV2);
       presenterV2.U7(new n());
       NewPlayerFeedbackPanel tV = this.V;
       a.m(tV);
       l ol = PatchProxy.apply(objArray, this, l.class, str);
       if (ol != patchProxyRe) {
       }else {
          ol = this.u;
          if (ol == null) {
             a.S("mHeaderView");
          }
       }
       tV.f(ol);
       tV = this.V;
       a.m(tV);
       Object[] objArray1 = new Object[3];
       e0 uoe0 = PatchProxy.apply(objArray, this, NewPlayerFeedbackPanel.class, "16");
       if (uoe0 != patchProxyRe) {
       }else {
          uoe0 = new e0();
          uoe0.b = this.l;
          uoe0.c = this.a1;
          uoe0.d = this.r();
          uoe0.e = this.n();
          uoe0.f = this.X;
          uoe0.g = this.Y;
          uoe0.k = this.W;
          uoe0.i = this.o();
          uoe0.h = new t(this);
          uoe0.j = this.Z;
       }
       objArray1[0] = uoe0;
       objArray1[1] = this.u();
       objArray1[2] = this;
       tV.i(objArray1);
       return;
    }
}
