package com.kwai.nearby.tab.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.kwai.nearby.tab.presenter.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup;
import qvb.q;
import qvb.a;
import pd7.r;
import erd.g;
import crd.b;
import brd.t;
import qvb.n0;
import android.view.ViewParent;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import i2b.a;
import java.util.Random;
import android.view.ViewGroup$LayoutParams;
import uh5.e;
import java.lang.Integer;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.utility.n;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.lang.CharSequence;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;
import java.lang.Math;
import java.lang.Boolean;
import com.kwai.component.feedstaggercard.model.CardStyle;
import com.kwai.library.widget.refresh.RefreshLayout;

public class a extends PresenterV2	// class@001037
{
    public int A;
    public int B;
    public int C;
    public boolean D;
    public final q E;
    public RefreshLayout p;
    public n0 q;
    public t r;
    public int s;
    public CardStyle t;
    public View u;
    public View v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public void a(){
       super(false);
    }
    public void a(boolean p0){
       super();
       this.w = false;
       this.x = a1.e(180.00f);
       this.y = a1.e(151.00f);
       this.z = a1.e(100.00f);
       this.A = a1.e(20.00f);
       this.B = a1.e(142.00f);
       this.C = a1.e(4.00f);
       this.E = new a$a(this);
       this.D = p0;
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       this.R8();
       if (!PatchProxy.applyVoid(objArray, this, uoa, "9") && this.w == null) {
          uoa = this.u;
          int i = 0;
          if (uoa != null) {
             uoa.setVisibility(i);
          }
          this.p.setEnabled(i);
          this.w = true;
       }
       this.q.h(this.E);
       this.X7(this.r.subscribe(new r(this)));
       if (this.q.isLoading()) {
          this.S8();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.q.f(this.E);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       this.p.setEnabled(true);
       a tu = this.u;
       if (tu != null) {
          tu.getParent().removeView(this.u);
          this.u = null;
       }
       return;
    }
    public final void R8(){
       int i;
       View view1;
       View view = this;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, view, uoa, "3")) {
          return;
       }
       ViewGroup parent = view.p.getParent();
       if (view.u == null) {
          Activity activity = this.getActivity();
          a obj = PatchProxy.apply(objArray, view, uoa, "6");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(this.X8()){
             i = 0x7f0d05cd;
          }else if(view.D != null){
             i = 0x7f0d05d1;
          }else {
             i = 0x7f0d05cb;
          }
          boolean b = true;
          a.d(activity, i, parent, b);
          view.u = parent.findViewById(0x7f0a12b2);
          int i1 = 0;
          if (!PatchProxy.applyVoidOneRefs(parent, view, uoa, "5") && view.D == null) {
             view1 = parent.findViewById(R.id.item_1);
             View view2 = parent.findViewById(R.id.item_2);
             View view3 = parent.findViewById(R.id.item_3);
             View view4 = parent.findViewById(R.id.item_4);
             if (this.X8()) {
                View[] viewArray1 = new View[8];
                viewArray1[i1] = view1;
                viewArray1[b] = view2;
                viewArray1[2] = view3;
                viewArray1[3] = view4;
                viewArray1[4] = parent.findViewById(0x7f0a1470);
                viewArray1[5] = parent.findViewById(0x7f0a1471);
                viewArray1[6] = parent.findViewById(0x7f0a1472);
                viewArray1[7] = parent.findViewById(0x7f0a1473);
                view.W8(new Random(), viewArray1);
             }else {
                View[] viewArray2 = new View[4];
                viewArray2[i1] = view1;
                viewArray2[b] = view2;
                viewArray2[2] = view3;
                viewArray2[3] = view4;
                view.W8(new Random(), viewArray2);
             }
          }
          if (view.D != null) {
             view.v = view.u.findViewById(0x7f0a169d);
          }else {
             view1 = new View(this.getContext());
             view.v = view1;
             view1.setBackgroundResource(R.drawable.arg_RES_7f0823bc);
             parent.addView(view.v, new ViewGroup$LayoutParams(-1, -1));
          }
          if (e.f()) {
             obj = view.s;
             View[] viewArray = new View[2];
             viewArray[i1] = view.u;
             viewArray[b] = view.v;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(obj), viewArray, view, uoa, "14")) {
                for (; i1 < 2; i1 = i1 + 1) {
                   object oobject = viewArray[i1];
                   ViewGroup$MarginLayoutParams layoutParams = oobject.getLayoutParams();
                   layoutParams.topMargin = obj;
                   oobject.setLayoutParams(layoutParams);
                }
             }
          }else if(this.X8()){
             view.u.setPadding(view.C, view.s, view.C, view.C);
          }else {
             view.u.setPadding(i1, view.s, i1, i1);
          }
       }
       return;
    }
    public void S8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "11")) {
          return;
       }
       a tu = this.u;
       if (tu != null && !tu.getVisibility()) {
          int i = 0;
          this.v.setVisibility(i);
          Context context = this.getContext();
          a tv = this.v;
          if (!PatchProxy.applyVoidTwoRefs(context, tv, this, uoa, "12")) {
             int i1 = (this.getActivity() != null)? n.k(this.getActivity()): 0;
             if (i1 <= 0) {
                i1 = n.z(context);
             }
             if (tv instanceof KwaiLoadingView) {
                tv.setVisibility(i);
                tv.g(true, "");
             }else {
                TranslateAnimation translateAni = new TranslateAnimation((float)(- i1), (float)i1, 0, 0);
                translateAni.setDuration(1300);
                translateAni.setRepeatCount(-1);
                translateAni.setInterpolator(new LinearInterpolator());
                tv.startAnimation(translateAni);
             }
          }
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       a tv = this.v;
       if (tv instanceof KwaiLoadingView) {
          tv.g(false, null);
          this.v.setVisibility(8);
       }else if(tv != null){
          tv.clearAnimation();
          this.v.setVisibility(8);
       }
       return;
    }
    public final void W8(Random p0,View[] p1){
       ViewGroup$LayoutParams layoutParams;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "8")) {
          return;
       }
       a tB = (this.X8())? this.B: this.y;
       int i = this.x + p0.nextInt(tB);
       int i1 = this.x + p0.nextInt(tB);
       int i2 = 0;
       p1[i2].getLayoutParams().height = i;
       int i3 = 1;
       p1[i3].getLayoutParams().height = i1;
       int i4 = (i > i1)? 1: 0;
       int i5 = Math.abs((i - i1));
       a tz = this.z;
       if (i5 < tz) {
          int i6 = tz - i5;
          if (i4) {
             layoutParams = p1[i2].getLayoutParams();
             layoutParams.height = layoutParams.height + i6;
          }else {
             layoutParams = p1[i3].getLayoutParams();
             layoutParams.height = layoutParams.height + i6;
          }
       }
       i2 = this.x + p0.nextInt(tB);
       int i7 = (i4)? this.A + i2: i2;
       if (!i4) {
          i2 = i2 + this.A;
       }
       p1[2].getLayoutParams().height = i7;
       p1[3].getLayoutParams().height = i2;
       if (p1.length == 8) {
          p1[4].getLayoutParams().height = i;
          p1[5].getLayoutParams().height = i1;
          p1[6].getLayoutParams().height = i2;
          p1.height = i7;
       }
       return;
    }
    public final boolean X8(){
       boolean b;
       a obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.D == null) {
          obj = this.t;
          if (obj != null && CardStyle.isV4Bottom(obj.mBottomType)) {
             b = true;
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(RefreshLayout.class);
       this.q = this.r8("PAGE_LIST");
       this.r = this.r8("SHOW_SCANNING_LOADING");
       this.s = this.r8("HOME_LOAD_SCAN_PADDING").intValue();
       this.t = this.t8("PAGE_CARD_STYLE");
       return;
    }
}
