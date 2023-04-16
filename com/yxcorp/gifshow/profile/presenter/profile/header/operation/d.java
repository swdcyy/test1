package com.yxcorp.gifshow.profile.presenter.profile.header.operation.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.e;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.util.o;
import android.animation.Animator;
import ekd.f;
import k2b.e0;
import z5c.y1;
import android.view.View;
import com.yxcorp.utility.n;
import android.view.ViewStub;
import a3c.e;
import z5c.g3;
import z5c.b2;
import android.animation.AnimatorSet;
import s4c.o;
import android.animation.Animator$AnimatorListener;
import s4c.p;
import android.animation.ValueAnimator;
import s4c.q;
import s4c.n;
import java.lang.CharSequence;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Integer;
import k2b.f3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import u3c.h;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.model.UserProfileMeta;
import u3c.i;
import com.yxcorp.gifshow.profile.widget.AnimationNumberTextView;
import s4c.r;
import android.view.View$OnClickListener;
import android.text.SpannableStringBuilder;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.System;
import s4c.m;
import java.lang.StringBuilder;

public final class d implements Runnable	// class@001500
{
    public final e b;
    public final UserProfile c;

    public void d(e p0,UserProfile p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       View[] viewArray;
       AnimatorSet uAnimatorSet1;
       boolean b2;
       SpannableStringBuilder spannableStr;
       d uod = this;
       d b = uod.b;
       d c = uod.c;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(c, b, uoe, "15")) {
       }else {
          b.K = b.s.getMeasuredWidth();
          e c1 = b.C;
          int i = o.m(c1.mUser, c1.mUserProfile);
          f.a(b.O);
          int i1 = 8;
          Object[] objArray = null;
          int i2 = 100;
          int i3 = 15;
          int i4 = 1;
          if (i >= i2) {
             b.I = false;
             y1.t(b.B, "profile_edit", c, false);
             if (!PatchProxy.applyVoid(objArray, b, uoe, "7")) {
                viewArray = new View[i4];
                viewArray[0] = b.x;
                n.Z(i1, viewArray);
                b.s.setVisibility(false);
                if (b.N < i2) {
                   if (b.t == null) {
                      b.t = b.w.inflate();
                      if (!e.a(b.F)) {
                         g3.e(b.t, i3);
                      }
                   }
                   b2.b(b.F, b.t);
                   b2.c(b.F, b.t);
                   f.a(b.O);
                   e t = b.t;
                   AnimatorSet uAnimatorSet = PatchProxy.applyOneRefs(t, b, uoe, "8");
                   if (uAnimatorSet != patchProxyRe) {
                   }else {
                      e uoe1 = t;
                      uAnimatorSet1 = b.P8(uoe1, 0x3f800000, 0, 165);
                      uAnimatorSet1.addListener(new o(b, t));
                      AnimatorSet uAnimatorSet2 = uAnimatorSet1;
                      uAnimatorSet1 = b.P8(uoe1, 0, 0x3f800000, 165);
                      uAnimatorSet1.addListener(new p(b, t));
                      c = b;
                      uoe1 = t;
                      AnimatorSet uAnimatorSet3 = uAnimatorSet1;
                      AnimatorSet uAnimatorSet4 = c.P8(uoe1, 0x3f800000, 0, 165);
                      uAnimatorSet = c.P8(uoe1, 0, 0x3f800000, 165);
                      uAnimatorSet.addListener(new q(b, t));
                      AnimatorSet uAnimatorSet5 = new AnimatorSet();
                      Animator[] uAnimatorArr = new Animator[]{uAnimatorSet2,uAnimatorSet3,ValueAnimator.ofFloat(new float[2]{0,0x3f800000}).setDuration(1600),uAnimatorSet4,uAnimatorSet};
                      uAnimatorSet5.playSequentially(uAnimatorArr);
                      uAnimatorSet = uAnimatorSet5;
                   }
                   b.O = uAnimatorSet;
                   uAnimatorSet.addListener(new n(b));
                   b.O.start();
                }else {
                   b.s.setText(b.S8());
                }
             }
             b.N = i2;
          }else {
             b.N = i;
             b.I = i4;
             y1.t(b.B, String.valueOf(i), c, false);
             e b1 = b.B;
             String id = QCurrentUser.ME.getId();
             if (!PatchProxy.isSupport(y1.class) || !PatchProxy.applyVoidThreeRefs(b1, id, Integer.valueOf(i), null, y1.class, "44")) {
                f3 uof3 = f3.i(0x7777);
                uof3.d(String.valueOf(i));
                uof3.n(6);
                uof3.b(b0.f(id));
                uof3.h(b1);
             }
             Object obj = PatchProxy.applyOneRefs(c, objArray, h.class, "5");
             if (obj != patchProxyRe) {
                b2 = obj.booleanValue();
             }else {
                a.p(c, "profile");
                UserProfileMeta userProfileM = i.c(c);
                b2 = (userProfileM != null && userProfileM.mDisplayProfileIntegrityDynamicEffect == i4)? true: false;
             }
             String str = " ";
             i2 = 0x7f10481a;
             if (!b2 || !b.V8()) {
                if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), b, uoe, "12")) {
                   spannableStr = new SpannableStringBuilder();
                   spannableStr.append(b.n8(i2));
                   if (b.V8()) {
                      spannableStr.append(str);
                   }
                   spannableStr.append(i+"%");
                   b.s.setText(spannableStr);
                   b.s.setVisibility(false);
                   viewArray = new View[i4];
                   viewArray[0] = b.x;
                   n.Z(i1, viewArray);
                }
             }else if(b.x == null){
                View view = b.v.inflate();
                b.x = view;
                b.y = view.findViewById(0x7f0a326b);
                b.z = b.x.findViewById(0x7f0a328b);
                b.A = b.x.findViewById(0x7f0a326c);
                b2.b(b.F, b.x);
                b2.c(b.F, b.y);
                b2.c(b.F, b.z);
                b2.c(b.F, b.A);
                if (!e.a(b.F)) {
                   g3.e(b.y, i3);
                   g3.e(b.z, i3);
                   g3.e(b.A, i3);
                }
                b.x.setOnClickListener(new r(b));
             }
             b.x.setVisibility(false);
             b.s.setVisibility(i1);
             if (!PatchProxy.applyVoid(objArray, b, uoe, "13")) {
                spannableStr = new SpannableStringBuilder();
                spannableStr.append(b.n8(i2));
                if (b.V8()) {
                   spannableStr.append(str);
                }
                b.y.setText(spannableStr);
             }
             long l = System.currentTimeMillis() - b.J;
             uAnimatorSet1 = 0;
             if (l - uAnimatorSet1 < 0) {
                l = uAnimatorSet1;
             }
             long l1 = 260;
             if (l - l1 > 0) {
                b.z.setText(String.valueOf(i));
                b.z.d();
             }else {
                b.x.postDelayed(new m(b, i), (l1 - l));
             }
          }
       }
       return;
    }
}
