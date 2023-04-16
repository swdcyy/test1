package com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterGuidePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterGuidePresenter$a;
import nsd.u;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterGuidePresenter$b;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterGuidePresenter$c;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterGuidePresenter$mLifecycleObserver$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import uja.r;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import kotlin.jvm.internal.a;
import java.util.Set;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import com.kwai.library.widget.popup.common.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import sja.b;
import java.util.Objects;
import kha.a;
import xf6.i;
import com.yxcorp.gifshow.follow.common.selector.FollowFilterHelper;
import wkd.b;
import tjc.c;
import wa5.e;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterGuidePresenter$d;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterGuidePresenter$e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import ro5.a;
import java.lang.Integer;
import bo5.a;
import com.google.gson.JsonObject;
import co5.g;
import androidx.fragment.app.Fragment;
import zq6.p;
import as6.a;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;

public final class FollowFilterGuidePresenter extends PresenterV2	// class@001239
{
    public HomeFollowFragment p;
    public Set q;
    public c r;
    public boolean s;
    public final FollowFilterGuidePresenter$b t;
    public final o u;
    public final DefaultLifecycleObserver v;
    public static final FollowFilterGuidePresenter$a w;

    static {
       FollowFilterGuidePresenter.w = new FollowFilterGuidePresenter$a(null);
    }
    public void FollowFilterGuidePresenter(){
       super();
       this.t = new FollowFilterGuidePresenter$b(this);
       this.u = new FollowFilterGuidePresenter$c(this);
       this.v = new FollowFilterGuidePresenter$mLifecycleObserver$1(this);
    }
    public void E8(){
       Activity activity;
       Object[] objArray1;
       FollowFilterGuidePresenter uFollowFilte = FollowFilterGuidePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uFollowFilte, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uFollowFilte, "14")) {
          this.X7(RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(new r(this), Functions.d()));
       }
       if (!PatchProxy.applyVoid(objArray, this, uFollowFilte, "8")) {
          activity = this.getActivity();
          if (!activity instanceof FragmentActivity) {
             objArray1 = objArray;
          }
          if (objArray1 != null) {
             q.p0(objArray1).v0(this.t);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uFollowFilte, "12")) {
          activity = this.getActivity();
          if (!activity instanceof FragmentActivity) {
             activity = objArray;
          }
          if (activity != null) {
             Lifecycle lifecycle = activity.getLifecycle();
             if (lifecycle != null) {
                lifecycle.addObserver(this.v);
             }
          }
       }
    label_006f :
       if (!PatchProxy.applyVoid(objArray, this, uFollowFilte, "10")) {
          uFollowFilte = this.q;
          if (uFollowFilte == null) {
             a.S("mFragmentSelectListeners");
          }
          uFollowFilte.add(this.u);
       }
       this.R8();
       return;
    }
    public void J8(){
       FollowFilterGuidePresenter uFollowFilte = FollowFilterGuidePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uFollowFilte, "15")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uFollowFilte, "9")) {
          Activity activity1 = this.getActivity();
          if (!activity1 instanceof FragmentActivity) {
             activity1 = objArray;
          }
          if (activity1 != null) {
             q.p0(activity1).C0(this.t);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uFollowFilte, "11")) {
          FollowFilterGuidePresenter tq = this.q;
          if (tq == null) {
             a.S("mFragmentSelectListeners");
          }
          tq.remove(this.u);
       }
       if (!PatchProxy.applyVoid(objArray, this, uFollowFilte, "13")) {
          Activity activity = this.getActivity();
          if (activity instanceof FragmentActivity) {
             objArray = activity;
          }
          if (objArray != null) {
             Lifecycle lifecycle = objArray.getLifecycle();
             if (lifecycle != null) {
                lifecycle.removeObserver(this.v);
             }
          }
       }
    label_0064 :
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, FollowFilterGuidePresenter.class, "16")) {
          return;
       }
       if (this.s != null) {
          c.i(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowFilterGuidePresenter"), "hideGuide");
          FollowFilterGuidePresenter tr = this.r;
          if (tr != null) {
             tr.o();
          }
          this.r = null;
       }
       return;
    }
    public final void R8(){
       boolean b1;
       FollowFilterGuidePresenter uFollowFilte = FollowFilterGuidePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uFollowFilte, "17")) {
          return;
       }
       if (this.getActivity() != null) {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          b obj = PatchProxy.apply(objArray, this, uFollowFilte, "18");
          String str = "mFragment";
          int i = 0;
          boolean b = true;
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             b obj1 = PatchProxy.apply(objArray, this, uFollowFilte, "6");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                uFollowFilte = this.p;
                if (uFollowFilte == null) {
                   a.S(str);
                }
                b1 = uFollowFilte.Vg().c();
             }
             if (b1) {
                obj1 = b.a;
                Objects.requireNonNull(obj1);
                obj = b.class;
                Object obj2 = PatchProxy.apply(objArray, obj1, obj, "3");
                if (obj2 != patchProxyRe) {
                   b1 = obj2.booleanValue();
                }else {
                   obj2 = PatchProxy.apply(objArray, obj1, obj, "1");
                   boolean b2 = (obj2 != patchProxyRe)? obj2.booleanValue(): a.c();
                   if (b2) {
                      Object obj3 = PatchProxy.apply(objArray, obj1, obj, "2");
                      b1 = (obj3 != patchProxyRe)? obj3.booleanValue(): i.j();
                      if (!b1) {
                         b1 = false;
                      }
                   }
                   b1 = true;
                }
                if (b1 && (FollowFilterHelper.a() && (!b.a(-1608526086).S() && e.b()))) {
                   b1 = true;
                }
             }
          label_00ab :
             b1 = false;
          }
          if (b1) {
             c.i(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowFilterGuidePresenter"), "showGuide");
             Activity activity = this.getActivity();
             a.m(activity);
             a uoa = new a(activity);
             uoa.I0(0x27dc);
             uoa.K0(KwaiBubbleOption.g);
             int i1 = 0x7f101022;
             uoa.F0(a1.p(i1));
             uoa.C0((- a1.d(R.dimen.arg_RES_7f07030a)));
             uoa.D0(BubbleInterface$Position.BOTTOM);
             uoa.P(b);
             uoa.z(b);
             uoa.A(b);
             uoa.T(3000);
             uoa.L(FollowFilterGuidePresenter$d.b);
             uoa.M(new FollowFilterGuidePresenter$e(this));
             a uoa1 = uoa;
             uFollowFilte = this.p;
             if (uFollowFilte == null) {
                a.S(str);
             }
             int i2 = 0x27d9;
             String str1 = a1.p(i1);
             a uoa2 = a.class;
             if (PatchProxy.isSupport(uoa2)) {
                Object[] objArray1 = new Object[]{uFollowFilte,uoa1,"TopFollow",Integer.valueOf(i2),Boolean.TRUE,objArray,Integer.valueOf(2),str1};
                if (!PatchProxy.applyVoid(objArray1, objArray, uoa2, "16")) {
                }
             }else {
             }
          }
       }
    label_015b :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FollowFilterGuidePresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.r8("FRAGMENT_SELECT_LISTENER");
       a.o(obj, "inject\(AccessIds.FRAGMENT_SELECT_LISTENER\)");
       this.q = obj;
       return;
    }
}
