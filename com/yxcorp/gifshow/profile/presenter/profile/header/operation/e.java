package com.yxcorp.gifshow.profile.presenter.profile.header.operation.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import brd.t;
import xl8.b;
import s4c.l;
import erd.g;
import crd.b;
import j5c.c;
import s4c.j;
import z5c.l0;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.c;
import erd.r;
import s4c.k;
import com.kwai.library.widget.popup.common.c;
import qrd.l1;
import z5c.u;
import android.animation.Animator;
import ekd.f;
import android.widget.TextView;
import android.animation.AnimatorSet;
import java.lang.Float;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import android.animation.ObjectAnimator;
import tkd.b;
import tkd.d;
import gx5.c;
import android.app.Activity;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import android.content.Context;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.util.o;
import k2b.e0;
import z5c.y1;
import java.lang.CharSequence;
import com.yxcorp.gifshow.profile.model.ButtonStyle;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.e$a;
import android.view.View$OnClickListener;
import android.view.View;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.e$b;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.d;
import java.lang.Runnable;
import z5c.k0;
import com.yxcorp.utility.TextUtils;
import ekd.m1;
import android.view.ViewStub;
import java.util.Set;
import java.lang.Integer;

public class e extends PresenterV2	// class@001503
{
    public TextView A;
    public BaseFragment B;
    public ProfileParam C;
    public c D;
    public User E;
    public int F;
    public b G;
    public Set H;
    public boolean I;
    public long J;
    public int K;
    public int L;
    public int M;
    public int N;
    public AnimatorSet O;
    public a P;
    public ButtonStyle Q;
    public ViewStub p;
    public View q;
    public ImageView r;
    public SizeAdjustableTextView s;
    public TextView t;
    public View u;
    public ViewStub v;
    public ViewStub w;
    public View x;
    public TextView y;
    public AnimationNumberTextView z;
    public static final int R;
    public static final int S;

    static {
       e.R = a1.e(10.00f);
       e.S = a1.e(20.00f);
    }
    public void e(){
       super();
       this.N = 100;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.J = System.currentTimeMillis();
       this.I = false;
       this.G.observable().subscribe(new l(this));
       this.X7(this.D.e().skip(1).subscribe(new j(this), l0.a("MyProfileEditProfilePresenter")));
       this.X7(this.B.Vg().j().filter(c.b).subscribe(new k(this), l0.b));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       u.c(this.P);
       this.P = null;
       f.a(this.O);
       return;
    }
    public final AnimatorSet P8(TextView p0,float p1,float p2,long p3){
       AnimatorSet obj;
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Long.valueOf(p3), this, e.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new AnimatorSet();
       float[] uofloatArray = new float[]{p1,p2};
       float[] uofloatArray1 = new float[]{p1,p2};
       float[] uofloatArray2 = new float[]{p1,p2};
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p0, "scaleX", uofloatArray),ObjectAnimator.ofFloat(p0, "scaleY", uofloatArray1),ObjectAnimator.ofFloat(p0, "alpha", uofloatArray2)};
       obj.playTogether(uAnimatorArr);
       obj.setDuration(p3);
       return obj;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "16")) {
          return;
       }
       d.a(0x763547f8).pc(this.getActivity(), this.C.mUserProfile);
       if (this.I != null) {
          e tC = this.C;
          y1.s(this.B, String.valueOf(o.m(tC.mUser, tC.mUserProfile)), this.C.mUserProfile, 0);
       }else {
          y1.s(this.B, "profile_edit", this.C.mUserProfile, 0);
       }
       return;
    }
    public CharSequence S8(){
       Object obj = PatchProxy.apply(null, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f103edd);
    }
    public final boolean V8(){
       boolean b = (this.K > (this.M + e.R))? true: false;
       return b;
    }
    public final void W8(UserProfile p0){
       e tx;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "14")) {
          return;
       }
       e tq = this.q;
       if (tq == null) {
          return;
       }
       e tQ = this.Q;
       if (tQ == ButtonStyle.CIRCLE) {
          tq.setOnClickListener(new e$a(this));
          y1.t(this.B, "profile_edit", this.C.mUserProfile, 0);
       }else if(tQ == ButtonStyle.RECTANGLE){
          this.s.setOnClickListener(new e$b(this));
          this.s.post(new d(this, p0));
          if (!k0.c() && !TextUtils.x(this.C.mBanText)) {
             this.s.setEnabled(0);
             tx = this.x;
             if (tx != null) {
                tx.setEnabled(0);
             }
          }else {
             this.s.setEnabled(true);
             tx = this.x;
             if (tx != null) {
                tx.setEnabled(true);
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a32b3);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.B = this.r8("PROFILE_FRAGMENT");
       this.C = this.q8(ProfileParam.class);
       this.D = this.r8("PROFILE_LOAD_STATE");
       this.E = this.q8(User.class);
       this.G = this.r8("PROFILE_MY_OPERATION_BUTTONS");
       this.H = this.r8("PROFILE_BUBBLE_SHOW_TASK_LIST");
       this.F = this.r8("PROFILE_STYLE").intValue();
       return;
    }
}
