package com.yxcorp.gifshow.prettify.base.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.prettify.base.b$a;
import m0c.p;
import q0c.a1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p0c.d;
import p0c.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import m0c.s;
import m0c.o;
import android.widget.RadioGroup$OnCheckedChangeListener;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import com.kwai.library.widget.button.SizeAdjustableRadioButton;
import p0c.g;
import java.lang.Number;
import skd.a;
import p0c.e;
import com.yxcorp.gifshow.prettify.beauty.BeautifyFilterFragment;
import com.yxcorp.gifshow.prettify.v4.magic.filter.FilterFragment;
import com.yxcorp.gifshow.prettify.makeup.MakeupFragment;
import com.yxcorp.gifshow.prettify.body.ui.BodySlimmingFragment;
import android.widget.RadioButton;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.kwai.feature.post.api.widget.PostGroupWithIndicator;
import android.view.View;
import g16.c;
import o1c.t0;
import android.view.GestureDetector;
import android.content.Context;
import androidx.fragment.app.Fragment;
import o1c.s0;
import android.view.GestureDetector$OnGestureListener;
import o1c.r0;
import android.view.View$OnTouchListener;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.prettify.widget.SizeChangeNotifyFrameLayout;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import g16.c$a;
import m0c.q;
import erd.g;
import crd.b;
import brd.t;
import p0c.a;
import java.lang.Boolean;
import p0c.c;
import com.yxcorp.gifshow.prettify.utils.PrettifyBubbleItem;
import p0c.f;
import m0c.r;
import com.yxcorp.gifshow.prettify.base.a;
import android.graphics.Typeface;
import m0c.n;
import android.view.View$OnClickListener;
import java.lang.Integer;
import o0c.a;
import im8.f;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public class b extends PresenterV2	// class@0010ec
{
    public SizeAdjustableRadioButton A;
    public PostRadioGroupWithIndicator B;
    public SizeAdjustableRadioButton[] C;
    public View D;
    public int[] E;
    public BaseFragment F;
    public s G;
    public a H;
    public PostBubbleManager I;
    public PublishSubject J;
    public int K;
    public c$a L;
    public SizeChangeNotifyFrameLayout$a M;
    public BaseFragment p;
    public f q;
    public BaseFragment[] r;
    public a s;
    public PublishSubject t;
    public h u;
    public c v;
    public View w;
    public SizeAdjustableRadioButton x;
    public SizeAdjustableRadioButton y;
    public SizeAdjustableRadioButton z;

    public void b(){
       super();
       this.K = -1;
       this.L = new b$a(this);
       this.M = new p(this);
       this.U7(new a1());
    }
    public void E8(){
       boolean b;
       b tD;
       b tM;
       LinearLayout$LayoutParams obj1;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       this.K = -1;
       if (!TextUtils.x(this.u.g().b())) {
          this.G = new s(this.u.g().b());
       }
       String str = "2";
       b = true;
       if (this.r.length > 0 && !PatchProxy.applyVoid(objArray, this, uob, "5")) {
          this.B.setPostRadioGroupCheckChangedListener(new o(this));
          tD = this.r;
          SizeAdjustableRadioButton[] sizeAdjustab = new SizeAdjustableRadioButton[tD.length];
          this.C = sizeAdjustab;
          int[] ointArray = new int[tD.length];
          this.E = ointArray;
          d d = this.u.g().d;
          if (d == g.b) {
             tM = this.G;
             if (tM != null) {
                obj1 = PatchProxy.apply(objArray, tM, s.class, str);
                d = (obj1 != patchProxyRe)? obj1.intValue(): tM.a.getInt("last_show_prettify_tab", 0);
             }
          }
          int i = 3;
          if (this.u.h() != null) {
             i1 = this.u.h().c();
             if (i1 == b || i1 == 2) {
                d = 0;
             }else if(i1 == i){
                d = 1;
             }else if(i1 == 4){
                d = 3;
             }else if(i1 == 5){
                d = 2;
             }
          }
          i1 = 0;
          b uob1 = null;
          b tr = this.r;
          while (i1 < tr.length) {
             object oobject = tr[i1];
             if (oobject instanceof BeautifyFilterFragment) {
                this.C[i1] = this.x;
                this.E[i1] = 0;
             }else if(oobject instanceof FilterFragment){
                this.C[i1] = this.z;
                this.E[i1] = i;
                this.F = oobject;
             }else if(oobject instanceof MakeupFragment){
                this.C[i1] = this.y;
                this.E[i1] = b;
             }else if(oobject instanceof BodySlimmingFragment){
                this.C[i1] = this.A;
                this.E[i1] = 2;
             }
             this.C[i1].setVisibility(0);
             if (d == this.E[i1]) {
                this.P8(this.C[i1], b);
                uob1 = i1;
             }else {
                this.P8(this.C[i1], 0);
             }
             i1 = i1 + 1;
          }
          this.C[uob1].setChecked(b);
          if (this.r.length <= b) {
             i1 = 8;
             if (this.u.g().f == null) {
                this.B.setVisibility(i1);
             }else if(!this.u.d()){
                obj1 = this.C[0].getLayoutParams();
                obj1.leftMargin = 0;
                obj1.rightMargin = 0;
                this.C[0].setLayoutParams(obj1);
             }
             this.B.setIndicatorVisible(i1);
          }
          tD = this.E;
          i1 = tD.length;
          int i2 = 0;
          while (true) {
             if (i2 < i1) {
                if (tD[i2] == i) {
                   tD = 1;
                label_0160 :
                   if (tD && this.u.g().h != null) {
                      tD = this.v;
                      if (tD != null) {
                         tD.c(this.w);
                      }else {
                         this.R8();
                         tD = this.F;
                         tM = this.w;
                         if (!PatchProxy.applyVoidTwoRefs(tD, tM, objArray, t0.class, "1")) {
                            tM.setOnTouchListener(new r0(new GestureDetector(tD.getContext(), new s0(tD))));
                         }
                      }
                   }else {
                      this.R8();
                   }
                   n.Y(this.B, 0, 0);
                }else {
                   i2 = i2 + 1;
                }
             }else {
                tD = null;
                goto label_0160 ;
             }
          }
       }
       tD = this.D;
       if (tD instanceof SizeChangeNotifyFrameLayout) {
          tM = this.M;
          Objects.requireNonNull(tD);
          if (!PatchProxy.applyVoidOneRefs(tM, tD, SizeChangeNotifyFrameLayout.class, str)) {
             if (tD.b == null) {
                tD.b = new ArrayList();
             }
             if (!tD.b.contains(tM)) {
                tD.b.add(tM);
             }
          }
       }
       tD = this.v;
       if (tD != null) {
          tD.a(this.L);
       }
       this.X7(this.t.subscribe(new q(this)));
       if (!this.u.a().s()) {
          Object obj = PatchProxy.apply(objArray, this, uob, "10");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(this.u.c() == 2 && (this.u.d() && (this.u.c() == 2 && (this.u.e().c() && (PrettifyBubbleItem.RECO_FILTER.couldShow() || (this.u.i().c() && (PrettifyBubbleItem.RECO_MAKEUP.couldShow() || (this.u.c() == b && (this.u.e().c() && (PrettifyBubbleItem.RECORD_RECO_FILTER.couldShow() || (this.u.i().c() && PrettifyBubbleItem.RECORD_RECO_MAKEUP.couldShow()))))))))))){
             b = false;
          }
          if (b) {
             this.X7(this.J.subscribe(new r(this), a.b));
          }
       }
       return;
    }
    public void J8(){
       SizeChangeNotifyFrameLayout b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "4")) {
          return;
       }
       b tv = this.v;
       if (tv != null) {
          tv.b(this.L);
       }
       tv = this.D;
       if (tv instanceof SizeChangeNotifyFrameLayout) {
          b tM = this.M;
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoidOneRefs(tM, tv, SizeChangeNotifyFrameLayout.class, "3")) {
             b = tv.b;
             if (b != null) {
                b.remove(tM);
             }
          }
       }
       tv = this.w;
       if (tv != null) {
          tv.setOnTouchListener(objArray);
       }
       if (this.C != null && this.G != null) {
          int i = 0;
          b tC = this.C;
          while (i < tC.length) {
             if (tC[i].isChecked()) {
                this.G.a(this.E[i]);
                break ;
             }
             i = i + 1;
          }
       }
       return;
    }
    public final void P8(SizeAdjustableRadioButton p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "8")) {
          return;
       }
       if (p1) {
          p0.setTypeface(null, 1);
          p0.setTextSize(2, 17.00f);
       }else {
          p0.setTypeface(null, 0);
          p0.setTextSize(2, 16.00f);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.w.setOnClickListener(new n(this));
       return;
    }
    public final void S8(int p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "7")) {
          return;
       }
       if (this.K == p0) {
          return;
       }
       this.K = p0;
       uob = null;
       b = false;
       int i = 0;
       b uob1 = null;
       b tC = this.C;
       while (i < tC.length) {
          if (tC[i] != null) {
             if (tC[i].getId() == p0) {
                object oobject = this.r[i];
                this.P8(this.C[i], true);
                uob1 = i;
             }else {
                this.P8(this.C[i], b);
             }
          }
          i = i + 1;
       }
       this.s.q0(this.E[uob1]);
       if (uob != null && uob != this.q.get()) {
          e uoe = this.p.getChildFragmentManager().beginTransaction();
          if (this.q.get() != null) {
             uoe.s(this.q.get());
          }
          if (uob.isAdded()) {
             uoe.E(uob);
          }else {
             uoe.f(R.id.fragment_container, uob);
          }
          Bundle arguments = (uob.getArguments() != null)? uob.getArguments(): new Bundle();
          SerializableHook.putSerializable(arguments, "fragment_tab_key", this.E);
          uob.setArguments(arguments);
          uoe.l();
          this.q.set(uob);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a3cb7);
       this.A = m1.f(p0, 0x7f0a045d);
       this.w = m1.f(p0, 0x7f0a4030);
       this.x = m1.f(p0, 0x7f0a03f8);
       this.y = m1.f(p0, 0x7f0a2a64);
       this.z = m1.f(p0, 0x7f0a0e84);
       this.D = m1.f(p0, 0x7f0a0fe6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("PRETTIFY_FRAGMENT");
       this.q = this.x8("CURRENT_FRAGMENT");
       this.r = this.r8("PRETTIFY_CHILD_FRAGMENT");
       this.s = this.r8("TOUCH_VIEW_EVENT");
       this.t = this.r8("PRETTIFY_SWITCH_FRAGMENT");
       this.u = this.r8("PRETTIFY_OPTION");
       this.v = this.t8("DYNAMIC_GESTURE");
       this.I = this.r8("BUBBLE_MANAGER");
       this.J = this.r8("PRETTIFY_HIDDEN_CHANGED");
       return;
    }
}
