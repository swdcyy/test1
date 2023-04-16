package com.kuaishou.live.common.core.component.multipk.game.vc.anim.a$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.a;
import java.lang.Object;
import kt1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kt1.e;
import fg6.a;
import kt1.c;
import com.google.gson.Gson;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.Throwable;
import pp.c;
import com.kuaishou.android.live.log.b;
import pu1.d;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameWithBottomAreaAnimController$onCreate$1$2;
import java.util.Objects;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameWithBottomAreaAnimView;
import kt1.m;
import msd.a;
import hc.b;
import ht1.a;
import pu1.k;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkResourceTypes;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.ImageView;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import kotlin.jvm.internal.a;
import java.lang.IllegalStateException;
import t45.d;
import brd.z;
import pu1.l;
import erd.o;
import kt1.i;
import kt1.j;
import erd.g;
import android.animation.PropertyValuesHolder;
import android.view.ViewGroup;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import kt1.k;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;

public final class a$b implements Observer	// class@0015f7
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       t ot1;
       Object obj = this;
       a obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a$b.class, "1")) {
       }else {
          c uoc = null;
          e uoe = obj1.a();
          if (uoe != null) {
             uoe = uoe.b;
             if (uoe != null) {
                uoc = a.a.h(uoe, c.class);
             }
          }
          obj.b.W2(0);
          a$b b = obj.b;
          d uod = obj1.b();
          LiveMultiPkGameWithBottomAreaAnimController$onCreate$1$2 oonCreate$1$ = new LiveMultiPkGameWithBottomAreaAnimController$onCreate$1$2(obj, obj1);
          Objects.requireNonNull(b);
          obj1 = a.class;
          if (!PatchProxy.applyVoidThreeRefs(uod, uoc, oonCreate$1$, b, a.class, "3")) {
             b.X2();
             b.k = 0;
             if (!PatchProxy.applyVoidTwoRefs(uod, oonCreate$1$, b, obj1, "6")) {
                b.p.c(b.j.getMainAnimView(), uod, b.l, new m(b, oonCreate$1$));
             }
             if (!PatchProxy.applyVoidTwoRefs(uoc, oonCreate$1$, b, obj1, "7")) {
                int i = 2;
                int i1 = 8;
                if (uoc != null) {
                   k b1 = k.b;
                   if (b1.f(uoc.a(), b.p)) {
                      c b2 = uoc.b;
                      if (b2 == null) {
                         b.j.getBottomTextView().setPadding(a1.e(12.00f), 0, a1.e(12.00f), a1.e(10.00f));
                      }
                      b.j.getBottomTextView().setVisibility(0);
                      b.j.getBottomTextView().setText(uoc.c);
                      b.j.getBottomTextView().setAlpha(0);
                      b.j.getBottomLeftTopIconView().setVisibility(i1);
                      b9.a(b.n);
                      LiveMultiPkResourceTypes liveMultiPkR = uoc.a();
                      a p = b.p;
                      t ot = PatchProxy.applyTwoRefs(liveMultiPkR, p, b1, k.class, "2");
                      if (ot != PatchProxyResult.class) {
                      }else {
                         a.p(liveMultiPkR, "ninePatchResource");
                         a.p(p, "skinManager");
                         if (!b1.f(liveMultiPkR, p)) {
                            ot1 = t.error(new IllegalStateException("getNinePatchDrawable fail cause of resource invalid"));
                            a.o(ot1, "Observable.error<Drawabl¡­nvalid\"\n        \)\n      \)");
                         }else {
                            ot1 = t.just(p.a(liveMultiPkR)).observeOn(d.c).flatMap(l.b).observeOn(d.a);
                            a.o(ot1, "Observable.just<String>\(¡­veOn\(KwaiSchedulers.MAIN\)");
                         }
                         ot = ot1;
                      }
                      b.n = ot.subscribe(new i(b, b2, oonCreate$1$), new j(b, oonCreate$1$));
                      if (!PatchProxy.applyVoidTwoRefs(b2, oonCreate$1$, b, obj1, "9")) {
                         PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(ViewGroup.ALPHA, new float[i]{0,0x3f800000})};
                         ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(b.j.getBottomTextView(), propertyValu);
                         a.o(objectAnimat, "ObjectAnimator.ofPropert¡­yout.ALPHA, 0f, 1f\)\n    \)");
                         objectAnimat.setStartDelay(160);
                         objectAnimat.setDuration(200);
                         PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(ViewGroup.ALPHA, new float[i]{0,0x3f800000})};
                         ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(b.j.getBottomLeftTopIconView(), propertyValu1);
                         a.o(objectAnimat1, "ObjectAnimator.ofPropert¡­yout.ALPHA, 0f, 1f\)\n    \)");
                         objectAnimat1.setStartDelay(160);
                         objectAnimat1.setDuration(200);
                         PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(ViewGroup.ALPHA, new float[i]{0x3f800000,0})};
                         ObjectAnimator objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(b.j.getBottomTextView(), propertyValu2);
                         a.o(objectAnimat2, "ObjectAnimator.ofPropert¡­yout.ALPHA, 1f, 0f\)\n    \)");
                         objectAnimat2.setStartDelay(1840);
                         objectAnimat2.setDuration(200);
                         PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(ViewGroup.ALPHA, new float[i]{0x3f800000,0})};
                         ObjectAnimator objectAnimat3 = ObjectAnimator.ofPropertyValuesHolder(b.j.getBottomLeftTopIconView(), propertyValu3);
                         a.o(objectAnimat3, "ObjectAnimator.ofPropert¡­yout.ALPHA, 1f, 0f\)\n    \)");
                         objectAnimat3.setStartDelay(1840);
                         objectAnimat3.setDuration(200);
                         AnimatorSet uAnimatorSet = new AnimatorSet();
                         b.m = uAnimatorSet;
                         uAnimatorSet.addListener(new k(b, oonCreate$1$));
                         if (b2 != null) {
                            a m = b.m;
                            if (m != null) {
                               Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat2,objectAnimat1,objectAnimat3};
                               m.playTogether(uAnimatorArr);
                            }
                         }else {
                            a m2 = b.m;
                            if (m2 != null) {
                               Animator[] uAnimatorArr1 = new Animator[i];
                               uAnimatorArr1[0] = objectAnimat;
                               uAnimatorArr1[1] = objectAnimat2;
                               m2.playTogether(uAnimatorArr1);
                            }
                         }
                         a m1 = b.m;
                         if (m1 != null) {
                            m1.start();
                         }
                      }
                   }
                }
                b.j.getBottomTextView().setVisibility(i1);
                b.j.getBottomLeftTopIconView().setVisibility(i1);
                b.V2(i, oonCreate$1$);
                b.V2(4, oonCreate$1$);
             }
          }
       }
    label_0241 :
       return;
    }
}
