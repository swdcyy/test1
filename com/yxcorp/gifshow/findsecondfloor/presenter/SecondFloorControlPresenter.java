package com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter$mSecondFloorThreshold$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter$mRefreshViewGoneThreshold$2;
import com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter$b;
import com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter$c;
import com.yxcorp.gifshow.findsecondfloor.widget.SecondFloorRefreshLayout;
import java.lang.String;
import kotlin.jvm.internal.a;
import pfa.a;
import pfa.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import nfa.a;
import q87.c;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.kwai.library.widget.refresh.RefreshLayout;
import java.util.Objects;
import java.util.HashSet;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import xl8.b;
import ofa.c;
import mfa.b;
import erd.g;
import crd.b;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import java.lang.Boolean;
import android.app.Activity;
import ib5.q;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Number;
import java.lang.Long;
import android.view.ViewGroup;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter$d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter$e;
import android.animation.Animator$AnimatorListener;
import ekd.m1;

public final class SecondFloorControlPresenter extends PresenterV2	// class@001007
{
    public final RefreshLayout$h A;
    public final SecondFloorRefreshLayout$b B;
    public final int C;
    public final int D;
    public View p;
    public SecondFloorRefreshLayout q;
    public b r;
    public a s;
    public BaseFragment t;
    public boolean u;
    public boolean v;
    public boolean w;
    public float x;
    public final p y;
    public final p z;
    public static final SecondFloorControlPresenter$a E;

    static {
       SecondFloorControlPresenter.E = new SecondFloorControlPresenter$a(null);
    }
    public void SecondFloorControlPresenter(int p0,int p1){
       super();
       this.C = p0;
       this.D = p1;
       this.y = s.c(new SecondFloorControlPresenter$mSecondFloorThreshold$2(this));
       this.z = s.c(SecondFloorControlPresenter$mRefreshViewGoneThreshold$2.INSTANCE);
       this.A = new SecondFloorControlPresenter$b(this);
       this.B = new SecondFloorControlPresenter$c(this);
    }
    public static final SecondFloorRefreshLayout P8(SecondFloorControlPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mRefreshLayout");
       }
       return p0;
    }
    public static final a R8(SecondFloorControlPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mSecondFloorConfig");
       }
       return p0;
    }
    public static final b S8(SecondFloorControlPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mSecondFloorState");
       }
       return p0;
    }
    public static final View V8(SecondFloorControlPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mTargetContainer");
       }
       return p0;
    }
    public void E8(){
       SecondFloorControlPresenter secondFloorC = SecondFloorControlPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, secondFloorC, "5")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.C().w("SecondFloorControlPresenter", "onBind", objArray1);
       if (!PatchProxy.applyVoid(objArray, this, secondFloorC, "6")) {
          SecondFloorControlPresenter tq = this.q;
          String str1 = "mRefreshLayout";
          if (tq == null) {
             a.S(str1);
          }
          tq.c(this.A);
          tq = this.q;
          if (tq == null) {
             a.S(str1);
          }
          SecondFloorControlPresenter tB = this.B;
          Objects.requireNonNull(tq);
          if (!PatchProxy.applyVoidOneRefs(tB, tq, SecondFloorRefreshLayout.class, "34")) {
             a.p(tB, "onTouchEventListener");
             tq.o1.add(tB);
          }
       }
       String str = "7";
       if (!PatchProxy.applyVoid(objArray, this, secondFloorC, str)) {
          secondFloorC = this.r;
          if (secondFloorC == null) {
             a.S("mSecondFloorState");
          }
          Objects.requireNonNull(secondFloorC);
          t ot = PatchProxy.apply(objArray, secondFloorC, b.class, str);
          if (ot != PatchProxyResult.class) {
          }else if(secondFloorC.h.isDetached() || secondFloorC.h.getActivity() == null){
             ot = t.empty();
             a.o(ot, "Observable.empty\(\)");
          }else {
             ot = secondFloorC.d.b();
             a.o(ot, "mSecondFloorCollapse.observe\(\)");
          }
          this.X7(ot.subscribe(new c(this), b.a));
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SecondFloorControlPresenter.class, "8")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.C().w("SecondFloorControlPresenter", "onUnbind", objArray1);
       SecondFloorControlPresenter tq = this.q;
       String str = "mRefreshLayout";
       if (tq == null) {
          a.S(str);
       }
       tq.setOnRefreshListener(objArray);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq.E(this.A);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       SecondFloorControlPresenter tB = this.B;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoidOneRefs(tB, tq, SecondFloorRefreshLayout.class, "35")) {
          a.p(tB, "onTouchEventListener");
          tq.o1.remove(tB);
       }
       return;
    }
    public final boolean W8(){
       Object[] objArray = null;
       Activity obj = PatchProxy.apply(objArray, this, SecondFloorControlPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getActivity();
       if (obj instanceof FragmentActivity) {
          objArray = obj;
       }
       boolean b = true;
       if (objArray != null) {
          q oq = q.p0(objArray);
          a.o(oq, "MenuViewModel.get\(it\)");
          boolean b1 = (oq.s0() || oq.t0())? true: false;
          this.w = b1;
       }
       a uoa = a.C();
       StringBuilder str = "canEnterSecondFloor "+"enterSecondFloorPullThreshold: ";
       boolean b2 = (this.x - (float)this.Y8() >= 0)? true: false;
       String str1 = ", ";
       str = str+b2+str1+"isInSecondFloor: ";
       SecondFloorControlPresenter tq = this.q;
       if (tq == null) {
          a.S("mRefreshLayout");
       }
       str = str+tq.O()+str1+"isGuideMode: ";
       SecondFloorControlPresenter tq1 = this.q;
       if (tq1 == null) {
          a.S("mRefreshLayout");
       }
       Object[] objArray1 = new Object[0];
       uoa.w("SecondFloorControlPresenter", str+tq1.N(), objArray1);
       if (this.x - (float)this.Y8() >= 0) {
          SecondFloorControlPresenter tq2 = this.q;
          if (tq2 == null) {
             a.S("mRefreshLayout");
          }
          if (!tq2.O()) {
             tq2 = this.q;
             if (tq2 == null) {
                a.S("mRefreshLayout");
             }
             if (!tq2.N()) {
                tq2 = this.t;
                if (tq2 == null) {
                   a.S("mFragment");
                }
                if (tq2.Vg().c() && this.w == null) {
                label_00dc :
                   return b;
                }
             }
          }
       }
    label_00db :
       b = false;
       goto label_00dc ;
    }
    public final int X8(){
       Object obj = PatchProxy.apply(null, this, SecondFloorControlPresenter.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = this.z.getValue();
       }
       return obj.intValue();
    }
    public final int Y8(){
       Object obj = PatchProxy.apply(null, this, SecondFloorControlPresenter.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.y.getValue();
       }
       return obj.intValue();
    }
    public final void Z8(long p0){
       SecondFloorControlPresenter secondFloorC = SecondFloorControlPresenter.class;
       if (PatchProxy.isSupport(secondFloorC) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, secondFloorC, "12")) {
          return;
       }
       if (this.u != null) {
          return;
       }
       secondFloorC = this.r;
       if (secondFloorC == null) {
          a.S("mSecondFloorState");
       }
       secondFloorC.f(4);
       float[] uofloatArray = new float[2];
       int i = 0;
       SecondFloorControlPresenter tq = this.q;
       if (tq == null) {
          a.S("mRefreshLayout");
       }
       uofloatArray[i] = (float)tq.getMeasuredHeight();
       uofloatArray[1] = 0;
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       valueAnimato.setDuration(p0);
       valueAnimato.addUpdateListener(new SecondFloorControlPresenter$d(this, p0));
       valueAnimato.addListener(new SecondFloorControlPresenter$e(this, p0));
       valueAnimato.start();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SecondFloorControlPresenter.class, "3")) {
          return;
       }
       View view = m1.f(p0, this.C);
       a.o(view, "ViewBindUtils.bindWidget¡­otView, mRefreshLayoutId\)");
       this.q = view;
       p0 = m1.f(p0, this.D);
       a.o(p0, "ViewBindUtils.bindWidget¡­View, mTargetContainerId\)");
       this.p = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SecondFloorControlPresenter.class, "4")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.t = obj;
       obj = this.r8("HOT_SECOND_HOT_STATE");
       a.o(obj, "inject\(SecondFloorAccessIds.HOT_SECOND_HOT_STATE\)");
       this.r = obj;
       obj = this.r8("HOT_SECOND_FLOOR_CONFIG");
       a.o(obj, "inject\(SecondFloorAccess¡­.HOT_SECOND_FLOOR_CONFIG\)");
       this.s = obj;
       return;
    }
}
