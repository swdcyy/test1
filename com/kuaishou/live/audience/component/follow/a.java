package com.kuaishou.live.audience.component.follow.a;
import erd.g;
import com.kuaishou.live.audience.component.follow.d;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import mq5.b;
import java.lang.Boolean;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.ViewParent;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import android.view.ViewGroup;
import i2b.a;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import kg1.g;
import kg1.e;
import f82.c;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.plugin.live.widget.ShimmerTextView;
import oy0.n;
import android.view.View$OnClickListener;
import oy0.a;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import androidx.core.content.ContextCompat;
import android.animation.ArgbEvaluator;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import oy0.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.basic.degrade.j;
import oy0.o;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import com.kuaishou.live.audience.component.follow.e;
import oy0.f;
import oy0.m;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import androidx.fragment.app.Fragment;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.action.c;

public final class a implements g	// class@000ac1
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b2;
       ValueAnimator valueAnimato;
       AnimatorSet uAnimatorSet1;
       a uoa1;
       a b = this.b;
       Object obj = p0;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, uod, "7")) {
       }else {
          User user = b.y.c.getUser();
          if (obj.d == null && TextUtils.n(user.getId(), obj.a.getId())) {
             f.m(user, obj.a.getFollowStatus());
             if (b.W8()) {
                d uod1 = 8;
                Object[] objArray = null;
                if (b.I != null && (!b.y.c.isGRPRCustomizedLive() && !b.A.U0())) {
                   TextView obj1 = PatchProxy.apply(objArray, b, uod, "13");
                   boolean b1 = true;
                   int i = 0;
                   if (obj1 != patchProxyRe) {
                      b2 = obj1.booleanValue();
                   }else if(!b.p.getVisibility() || b.u.getVisibility() == uod1){
                      b2 = true;
                   }else {
                      b2 = false;
                   }
                   if (!b2) {
                      obj1 = PatchProxy.apply(objArray, b, uod, "8");
                      if (obj1 != patchProxyRe) {
                         b2 = obj1.booleanValue();
                      }else if(b.q.getParent() != null){
                         b2 = true;
                      }else {
                         b2 = false;
                      }
                      if (b2 && !PatchProxy.applyVoid(objArray, b, uod, "14")) {
                         if (!PatchProxy.applyVoid(objArray, b, uod, "15")) {
                            d r = b.r;
                            if (b.s == null) {
                               b.s = a.d(b.m8().getContext(), 0x7f0d0d23, r, i);
                               RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
                               layoutParams.addRule(7, R.id.live_follow_text_container);
                               layoutParams.addRule(15);
                               layoutParams.rightMargin = a1.d(0x7f0705cf);
                               r.addView(b.s, Math.max((r.indexOfChild(r.findViewById(R.id.live_top_bar_name_like_count_container)) + b1), i), layoutParams);
                            }
                         }
                         if (!PatchProxy.applyVoid(objArray, b, uod, "16") && b.t == null) {
                            b.t = b1;
                            b.u.setVisibility(4);
                            obj1 = b.s.findViewById(R.id.live_follow_text_new_style);
                            View view = b.s.findViewById(R.id.live_follow_background_new_style);
                            KwaiImageView kwaiImageVie = b.s.findViewById(R.id.live_fans_group_title_icon);
                            int i1 = (b.y.r1.Qi() == null)? 0: b.y.r1.Qi().mStatus;
                            kwaiImageVie.L(c.e(i1, b.y.r1.u3()));
                            View view1 = b.s.findViewById(0x7f0a1cec);
                            if (view1 != null) {
                               view1.setOnClickListener(new n(b));
                            }
                            a uoa = new a(view);
                            AnimatorSet uAnimatorSet = new AnimatorSet();
                            int[] ointArray = new int[]{a1.e(40.00f),a1.e(76.00f)};
                            long l = 400;
                            ObjectAnimator objectAnimat = ObjectAnimator.ofInt(uoa, a.b, ointArray).setDuration(l);
                            View obj2 = PatchProxy.applyOneRefs(view, b, uod, "26");
                            if (obj2 != patchProxyRe) {
                               valueAnimato = obj2;
                               uAnimatorSet1 = uAnimatorSet;
                               uoa1 = uoa;
                               obj2 = view1;
                            }else {
                               valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                               valueAnimato.setDuration(l);
                               uAnimatorSet1 = uAnimatorSet;
                               uoa1 = uoa;
                               obj2 = view1;
                               b uob = new b(new ArgbEvaluator(), ContextCompat.getColor(view.getContext(), 0x7f060751), ContextCompat.getColor(view.getContext(), 0x7f0620c7), a.r(view.getBackground().mutate()), view);
                               valueAnimato.addUpdateListener(l);
                            }
                            float[] uofloatArray = new float[]{obj1.getAlpha(),0};
                            ObjectAnimator objectAnimat1 = j.a(obj1, uofloatArray).setDuration(300);
                            objectAnimat1.addListener(new o(b, obj1, obj2));
                            Animator[] uAnimatorArr = new Animator[]{objectAnimat,valueAnimato,objectAnimat1};
                            uAnimatorSet1.playTogether(uAnimatorArr);
                            uAnimatorSet1.start();
                            uAnimatorSet1.addListener(new e(b, obj2, uoa1, kwaiImageVie));
                         }
                      }
                   }
                }else if(!PatchProxy.applyVoid(objArray, b, uod, "11") && (b.F != null || b.u.getVisibility() == uod1)){
                   ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[3]{0x3f800000,0x3f000000,0});
                   b.F = valueAnimato1;
                   valueAnimato1.setDuration(300);
                   b.F.addUpdateListener(new f(b, b.u.getWidth()));
                   b.F.addListener(new m(b));
                   b.F.start();
                }
             }else {
                b.Z8();
             }
          }
       label_026c :
          d y = b.y;
          a0 b3 = y.B;
          if (b3 != null) {
             b3.onFollowStateUpdate(obj, y.c);
          }
          if (obj.e != null && b.C.isResumed()) {
             ExceptionHandler.handleException(a.a().a(), obj.e);
          }
          if (obj.c != null && (obj.d == null && TextUtils.n(obj.b, b.y.c.getUserId()))) {
             c.d(b.C.o(), 12, b.y.c.mEntity);
          }
       }
    label_02b9 :
       return;
    }
}
