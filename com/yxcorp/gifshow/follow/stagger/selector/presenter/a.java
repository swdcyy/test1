package com.yxcorp.gifshow.follow.stagger.selector.presenter.a;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.c;
import java.lang.Object;
import com.yxcorp.gifshow.follow.stagger.selector.FollowFilterAction;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.lang.String;
import java.util.List;
import yga.b;
import java.lang.Enum;
import yga.c;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.c$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import rja.c;
import android.animation.Animator;
import vja.g;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import com.yxcorp.utility.n;
import ekd.i;
import lnc.a1;
import com.yxcorp.gifshow.panel.sizer.view.MaxHeightFrameLayout;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import uja.g;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import sja.c;
import androidx.fragment.app.Fragment;
import android.view.ViewStub;
import java.lang.StringBuilder;
import uja.o;
import android.view.View$OnClickListener;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import uja.n;
import android.animation.Animator$AnimatorListener;
import uja.h;
import uja.p;

public final class a implements g	// class@00123c
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Animator[] uAnimatorArr;
       AnimatorSet uAnimatorSet;
       c c;
       Animator[] uAnimatorArr1;
       Animator[] uAnimatorArr2;
       a b = this.b;
       Enum uEnum = p0;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       KsLogFollowTag fOLLOW_SELEC = KsLogFollowTag.FOLLOW_SELECTOR;
       String str = "FollowFilterAnimPresenter";
       fOLLOW_SELEC.appendTag(str);
       c.j(fOLLOW_SELEC, "watchSelectorActionSubject", "panelAction", uEnum.name());
       int i = c$c.a[uEnum.ordinal()];
       if (i != 1) {
          Object[] objArray = null;
          if (i != 2 && i != 3) {
             if (i == 4 && (!PatchProxy.applyVoid(objArray, b, uoc, "12") && QCurrentUser.ME.isLogined())) {
                if (!b.r.g()) {
                   uAnimatorArr = new Animator[]{b.z,b.A};
                   if (!g.a(uAnimatorArr)) {
                      if (!PatchProxy.applyVoid(objArray, b, uoc, "13") && (b.getContext() != null && b.getActivity() != null)) {
                         double d = (double)n.u(b.getContext()) * 0x3fe8000000000000;
                         i = (!i.e(b.getActivity()))? n.A(b.getContext()): 0;
                         i = (int)(((d - (double)i) - (double)a1.d(0x7f070313)) - (double)0);
                         if (i != b.y.getMaxHeight()) {
                            b.y.setMaxHeight(i);
                         }
                      }
                   label_00b9 :
                      if (b.z == null) {
                         uAnimatorSet = PatchProxy.apply(objArray, b, uoc, "5");
                         if (uAnimatorSet != patchProxyRe) {
                         }else {
                            uAnimatorSet = new AnimatorSet();
                            ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                            valueAnimato.setTarget(b.y);
                            valueAnimato.addUpdateListener(new g(b));
                            ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(b.x, View.ALPHA, new float[2]{0,0x3f800000});
                            if (b.C == null && !PatchProxy.applyVoid(objArray, b, uoc, "7")) {
                               uoc = b.q;
                               View view = PatchProxy.applyOneRefs(uoc, objArray, c.class, "1");
                               if (view != patchProxyRe) {
                               }else {
                                  View view1 = uoc.getView();
                                  if (view1 == null) {
                                     fOLLOW_SELEC.appendTag("FollowSelectorViewHelper");
                                     c.i(fOLLOW_SELEC, "mFragment.getView\(\) == null");
                                  }else {
                                     view1 = view1.getRootView();
                                     int i1 = 0x7f0a0f81;
                                     view = view1.findViewById(i1);
                                     if (view == null) {
                                        ViewStub viewStub = view1.findViewById(R.id.follow_selector_bottom_mask_view_stub_nasa);
                                        if (viewStub != null && !viewStub.getLayoutResource()) {
                                           viewStub.setLayoutResource(R.layout.arg_RES_7f0d046b);
                                           viewStub.setInflatedId(i1);
                                           view = viewStub.inflate();
                                        }
                                     }
                                  }
                                  view = objArray;
                               }
                               b.C = view;
                               fOLLOW_SELEC.appendTag(str);
                               c.i(fOLLOW_SELEC, "nasa bottom mask view is "+b.C);
                               c = b.C;
                               if (c != null) {
                                  c.setOnClickListener(new o(b));
                               }
                            }
                         label_0176 :
                            c = b.C;
                            if (c != null) {
                               objArray = ObjectAnimator.ofFloat(c, View.ALPHA, new float[2]{0,0x3f800000});
                            }
                            if (objArray != null) {
                               uAnimatorArr1 = new Animator[]{valueAnimato,objectAnimat,objArray};
                               uAnimatorSet.playTogether(uAnimatorArr1);
                            }else {
                               uAnimatorArr1 = new Animator[]{valueAnimato,objectAnimat};
                               uAnimatorSet.playTogether(uAnimatorArr1);
                            }
                            uAnimatorSet.setDuration(150);
                            uAnimatorSet.setInterpolator(new LinearInterpolator());
                            uAnimatorSet.addListener(new n(b));
                         }
                         b.z = uAnimatorSet;
                         fOLLOW_SELEC.appendTag(str);
                         c.i(fOLLOW_SELEC, "initExpandAnimatorSet");
                      }
                      b.z.start();
                      fOLLOW_SELEC.appendTag(str);
                      c.i(fOLLOW_SELEC, "start expand anim");
                   }
                }
                fOLLOW_SELEC.appendTag(str);
                c.i(fOLLOW_SELEC, "stop expand");
             }
          }else if(!PatchProxy.applyVoid(objArray, b, uoc, "14") && b.r.g()){
             uAnimatorArr = new Animator[]{b.z,b.A};
             if (!g.a(uAnimatorArr)) {
                if (b.A == null) {
                   uAnimatorSet = PatchProxy.apply(objArray, b, uoc, "8");
                   if (uAnimatorSet != patchProxyRe) {
                   }else {
                      uAnimatorSet = new AnimatorSet();
                      ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                      valueAnimato1.setTarget(b.y);
                      valueAnimato1.addUpdateListener(new h(b));
                      ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(b.x, View.ALPHA, new float[2]{0x3f800000,0});
                      c c1 = b.C;
                      if (c1 != null) {
                         objArray = ObjectAnimator.ofFloat(c1, View.ALPHA, new float[2]{0x3f800000,0});
                      }
                      if (objArray != null) {
                         uAnimatorArr2 = new Animator[]{valueAnimato1,objectAnimat1,objArray};
                         uAnimatorSet.playTogether(uAnimatorArr2);
                      }else {
                         uAnimatorArr2 = new Animator[]{valueAnimato1,objectAnimat1};
                         uAnimatorSet.playTogether(uAnimatorArr2);
                      }
                      uAnimatorSet.setDuration(150);
                      uAnimatorSet.setInterpolator(new LinearInterpolator());
                      uAnimatorSet.addListener(new p(b));
                   }
                   b.A = uAnimatorSet;
                }
                b.A.start();
             }
          }
       }else {
          b.P8();
       }
       return;
    }
}
