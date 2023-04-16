package com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper;
import android.view.View;
import k2b.e0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper$AuthorFollowState;
import com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper$mFollowTextView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper$mFollowIconView$2;
import com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper$mFollowedView$2;
import com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper$mFollowingAnimationView$2;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import s5b.b;
import q87.c;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import r5b.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import e17.i;
import com.yxcorp.gifshow.magic.ui.magicemoji.platform.AuthorFollowHelper$b;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import w46.b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import com.yxcorp.gifshow.model.MagicFaceAuthor;
import x4b.a;
import java.lang.Enum;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import x4b.c;
import android.animation.Animator$AnimatorListener;
import x4b.e;
import android.animation.Animator;
import x4b.d;

public final class AuthorFollowHelper	// class@001be6
{
    public final String a;
    public AuthorFollowHelper$AuthorFollowState b;
    public MagicFaceAuthor c;
    public int d;
    public final View e;
    public final p f;
    public final p g;
    public final p h;
    public final p i;
    public AnimatorSet j;
    public ObjectAnimator k;
    public final ArrayList l;
    public final ArrayList m;
    public final View n;
    public final e0 o;

    public void AuthorFollowHelper(View p0,e0 p1){
       a.p(p0, "mAuthorView");
       super();
       this.n = p0;
       this.o = p1;
       this.a = "AuthorFollowStyleHelper";
       this.b = AuthorFollowHelper$AuthorFollowState.NOT_AVAILABLE;
       p0 = p0.findViewById(R.id.follow_panel);
       a.o(p0, "mAuthorView.findViewById\(R.id.follow_panel\)");
       this.e = p0;
       this.f = s.c(new AuthorFollowHelper$mFollowTextView$2(this));
       this.g = s.c(new AuthorFollowHelper$mFollowIconView$2(this));
       this.h = s.c(new AuthorFollowHelper$mFollowedView$2(this));
       this.i = s.c(new AuthorFollowHelper$mFollowingAnimationView$2(this));
       this.l = new ArrayList();
       this.m = new ArrayList();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, AuthorFollowHelper.class, "19")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w(this.a, "cancelFollowPanelRecoverAnimation invoked", objArray);
       AuthorFollowHelper tk = this.k;
       if (tk != null) {
          tk.cancel();
       }
       tk = this.k;
       if (tk != null) {
          tk.removeAllListeners();
       }
       this.k = null;
       return;
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AuthorFollowHelper.class, "18")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       b.D().w(this.a, "cancelFollowingAnimation invoked", objArray1);
       AuthorFollowHelper tj = this.j;
       if (tj != null) {
          tj.cancel();
       }
       tj = this.j;
       if (tj != null) {
          tj.removeAllListeners();
       }
       this.j = objArray;
       tj = this.d;
       if (tj == 4 || tj == 3) {
          this.f().f();
          this.f().t();
          this.f().setFrame(0);
          this.f().setVisibility(4);
       }
       return;
    }
    public final ImageView c(){
       Object obj = PatchProxy.apply(null, this, AuthorFollowHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final TextView d(){
       Object obj = PatchProxy.apply(null, this, AuthorFollowHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final ImageView e(){
       Object obj = PatchProxy.apply(null, this, AuthorFollowHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final LottieAnimationView f(){
       Object obj = PatchProxy.apply(null, this, AuthorFollowHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuthorFollowHelper.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w(this.a, "onError invoked", objArray);
       AuthorFollowHelper tb = this.b;
       if (tb == AuthorFollowHelper$AuthorFollowState.FOLLOWED) {
          this.b = AuthorFollowHelper$AuthorFollowState.RECOVER_TO_AVAILABLE_TO_FOLLOW;
          this.j();
          if (!TextUtils.x(p0)) {
             AuthorFollowHelper to = this.o;
             if (!PatchProxy.applyVoidTwoRefs(to, p0, null, e.class, "23")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "FOLLOW_FAIL_TOAST";
                i3 oi3 = i3.f();
                oi3.d("follow_fail_reason", p0);
                uElementPack.params = oi3.e();
                u1.D0("", to, 4, uElementPack, null, null);
             }
             a.m(p0);
             i.e(R.style.arg_RES_7f110668, p0, 1);
          }
       }else if(tb == AuthorFollowHelper$AuthorFollowState.FOLLOWING){
          this.l.add(new AuthorFollowHelper$b(this, p0));
       }
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, AuthorFollowHelper.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w(this.a, "onFollowed invoked", objArray);
       if (this.b != AuthorFollowHelper$AuthorFollowState.FOLLOWING) {
          b.D().e(this.a, "Illegal state, current state is "+this.b.getStateName()+", "+"cannot jump to FOLLOWED", new IllegalStateException());
          return;
       }else {
          this.b = AuthorFollowHelper$AuthorFollowState.FOLLOWED;
          this.j();
          return;
       }
    }
    public final void i(MagicEmoji$MagicFace p0){
       MagicFaceAuthor mEffectCreat;
       MagicFaceAuthor mEffectCreat1;
       MagicFaceExtraParams mAuthor3;
       if (PatchProxy.applyVoidOneRefs(p0, this, AuthorFollowHelper.class, "7")) {
          return;
       }
       b uob = b.D();
       AuthorFollowHelper ta = this.a;
       StringBuilder str = "onMagicFaceChanged invoked with author = ";
       String str1 = null;
       if (p0 != null) {
          MagicEmoji$MagicFace mExtraParams = p0.mExtraParams;
          if (mExtraParams != null) {
             MagicFaceExtraParams mAuthor = mExtraParams.mAuthor;
             if (mAuthor != null) {
                mEffectCreat = mAuthor.mEffectCreatorId;
             label_002b :
                int i = 0;
                Object[] objArray = new Object[i];
                uob.w(ta, str+mEffectCreat, objArray);
                this.b();
                if (p0 != null) {
                   MagicEmoji$MagicFace mExtraParams1 = p0.mExtraParams;
                   if (mExtraParams1 != null) {
                      MagicFaceExtraParams mAuthor1 = mExtraParams1.mAuthor;
                      if (mAuthor1 != null) {
                         mEffectCreat1 = mAuthor1.mEffectCreatorId;
                      label_0049 :
                         if (mEffectCreat1 - str1 <= 0) {
                            this.b = AuthorFollowHelper$AuthorFollowState.NOT_AVAILABLE;
                            this.j();
                            return;
                         }else {
                            AuthorFollowHelper tc = this.c;
                            MagicFaceAuthor mEffectCreat2 = (tc != null)? tc.mEffectCreatorId: str1;
                            if (p0 != null) {
                               MagicEmoji$MagicFace mExtraParams2 = p0.mExtraParams;
                               if (mExtraParams2 != null) {
                                  MagicFaceExtraParams mAuthor2 = mExtraParams2.mAuthor;
                                  if (mAuthor2 != null) {
                                     i = mAuthor2.mFollowingState;
                                  }
                               }
                            }
                            AuthorFollowHelper$AuthorFollowState fOLLOWED = (i == 1 || this.m.contains(String.valueOf(mEffectCreat1)))? AuthorFollowHelper$AuthorFollowState.FOLLOWED: AuthorFollowHelper$AuthorFollowState.AVAILABLE_TO_FOLLOW;
                            if (mEffectCreat2 - str1 && (!mEffectCreat2 - mEffectCreat1 && this.b == fOLLOWED)) {
                               return;
                            }else if(p0 != null){
                               p0 = p0.mExtraParams;
                               if (p0 != null) {
                                  mAuthor3 = p0.mAuthor;
                               label_0096 :
                                  this.c = mAuthor3;
                                  this.b = fOLLOWED;
                                  if (fOLLOWED == AuthorFollowHelper$AuthorFollowState.AVAILABLE_TO_FOLLOW) {
                                     AuthorFollowHelper to = this.o;
                                     if (!PatchProxy.applyVoidOneRefs(to, null, e.class, "21")) {
                                        ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                                        uElementPack.action2 = "FOLLOW_EFFECT_DESIGNER";
                                        u1.D0("", to, 6, uElementPack, null, null);
                                     }
                                  }
                                  this.j();
                                  return;
                               }
                            }
                            mAuthor3 = null;
                            goto label_0096 ;
                         }
                      }
                   }
                }
                mEffectCreat1 = str1;
                goto label_0049 ;
             }
          }
       }
       mEffectCreat = str1;
       goto label_002b ;
    }
    public final void j(){
       Object[] objArray3;
       ObjectAnimator objectAnimat;
       AuthorFollowHelper uAuthorFollo = AuthorFollowHelper.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAuthorFollo, "11")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       b.D().w(this.a, "updateState invoked, current state is "+this.b.getStateName(), objArray1);
       AuthorFollowHelper td = this.d;
       String str = 2;
       int i = 1;
       String str1 = (td == i || td == str)? 1: null;
       int i1 = 3;
       int i2 = 4;
       StringBuilder str2 = (td == i1 || td == i2)? 1: null;
       int i3 = a.a[this.b.ordinal()];
       if (i3 != i) {
          if (i3 != str) {
             if (i3 != i1) {
                if (i3 != i2) {
                   if (i3 != 5) {
                      Object[] objArray2 = new Object[0];
                      b.D().t(this.a, "updateState invoked under invalid state: "+this.b.getStateName(), objArray2);
                   }else if(str1){
                      this.d().setVisibility(0);
                      this.c().setVisibility(i2);
                   }else if(str2 != null){
                      this.d().setVisibility(i2);
                      this.c().setVisibility(0);
                   }
                   this.f().setVisibility(i2);
                   if (!PatchProxy.applyVoid(objArray, this, uAuthorFollo, "17")) {
                      objArray3 = new Object[0];
                      b.D().w(this.a, "startFollowPanelRecoverAnimation invoked", objArray3);
                      this.b();
                      this.a();
                      this.e.setAlpha(0);
                      this.e.setVisibility(0);
                      objectAnimat = ObjectAnimator.ofFloat(this.e, View.ALPHA, new float[str]{0,0x3f800000});
                      this.k = objectAnimat;
                      if (objectAnimat != null) {
                         objectAnimat.setInterpolator(new LinearInterpolator());
                      }
                      uAuthorFollo = this.k;
                      if (uAuthorFollo != null) {
                         uAuthorFollo.setDuration(150);
                      }
                      uAuthorFollo = this.k;
                      if (uAuthorFollo != null) {
                         uAuthorFollo.addListener(new c(this));
                      }
                      uAuthorFollo = this.k;
                      if (uAuthorFollo != null) {
                         uAuthorFollo.start();
                      }
                   }
                }else if(str1){
                   if (!PatchProxy.applyVoid(objArray, this, uAuthorFollo, "15")) {
                      objArray3 = new Object[0];
                      b.D().w(this.a, "startFollowingAnimationInTextStyle invoked", objArray3);
                      this.b();
                      this.a();
                      this.e().setAlpha(0);
                      this.e().setVisibility(0);
                      objectAnimat = ObjectAnimator.ofFloat(this.d(), View.ALPHA, new float[str]{0x3f800000,0});
                      a.o(objectAnimat, "followTextFadeout");
                      objectAnimat.setInterpolator(new LinearInterpolator());
                      objectAnimat.setDuration(130);
                      ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.e(), View.ALPHA, new float[str]{0,0x3f800000});
                      a.o(objectAnimat1, "followedIconFadein");
                      objectAnimat1.setInterpolator(new LinearInterpolator());
                      objectAnimat1.setDuration(130);
                      ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(this.e, View.ALPHA, new float[str]{0x3f800000,0});
                      a.o(objectAnimat2, "panelFadeout");
                      objectAnimat2.setInterpolator(new LinearInterpolator());
                      objectAnimat2.setStartDelay(400);
                      objectAnimat2.setDuration(150);
                      AnimatorSet uAnimatorSet = new AnimatorSet();
                      this.j = uAnimatorSet;
                      uAnimatorSet.addListener(new e(this));
                      td = this.j;
                      if (td != null) {
                         Animator[] uAnimatorArr = new Animator[i1];
                         uAnimatorArr[0] = objectAnimat;
                         uAnimatorArr[i] = objectAnimat1;
                         uAnimatorArr[str] = objectAnimat2;
                         td.playSequentially(uAnimatorArr);
                      }
                      uAuthorFollo = this.j;
                      if (uAuthorFollo != null) {
                         uAuthorFollo.start();
                      }
                   }
                }else if(str2 == null || PatchProxy.applyVoid(objArray, this, uAuthorFollo, "16")){
                   objArray3 = new Object[0];
                   b.D().w(this.a, "startFollowingAnimationInIconStyle invoked", objArray3);
                   this.b();
                   this.a();
                   this.e.setVisibility(i2);
                   this.f().setVisibility(0);
                   this.f().a(new d(this));
                   this.f().s();
                }
             }else {
                this.e.setVisibility(i2);
                this.f().setVisibility(i2);
             }
          }else {
             this.e.setAlpha(0x3f800000);
             this.e.setVisibility(0);
             this.d().setAlpha(0x3f800000);
             if (str1 != null) {
                this.d().setVisibility(0);
                this.c().setVisibility(i2);
             }else if(str2 != null){
                this.d().setVisibility(i2);
                this.c().setVisibility(0);
             }
             this.e().setVisibility(i2);
             this.f().setVisibility(i2);
          }
       }else {
          this.e.setVisibility(i2);
          this.f().setVisibility(i2);
       }
    label_0256 :
       return;
    }
}
