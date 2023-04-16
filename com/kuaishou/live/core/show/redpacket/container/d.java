package com.kuaishou.live.core.show.redpacket.container.d;
import android.content.DialogInterface$OnShowListener;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment$e;
import uw1.f;
import java.util.List;
import ia1.b;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.common.core.basic.resource.c;
import java.util.ArrayList;
import com.kuaishou.live.core.show.redpacket.container.c$a;
import rg2.m;
import com.kuaishou.live.core.show.redpacket.container.c;
import android.animation.AnimatorSet;
import java.util.Iterator;
import android.animation.ValueAnimator;
import rg2.d;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.Interpolator;
import android.animation.TimeInterpolator;
import rg2.c;
import android.animation.Animator;
import rg2.e;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;

public final class d implements DialogInterface$OnShowListener	// class@000e71
{
    public final LiveRedPacketContainerDialogFragment b;

    public void d(LiveRedPacketContainerDialogFragment p0){
       this.b = p0;
    }
    public final void onShow(DialogInterface p0){
       ValueAnimator valueAnimato;
       d b = this.b;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, LiveRedPacketContainerDialogFragment.class, "24")) {
       }else {
          b.wh();
          if (b.P.a(b.Bh())) {
             f uof = PatchProxy.applyOneRefs(b.Bh(), b, LiveRedPacketContainerDialogFragment.class, "21");
             if (uof != patchProxyRe) {
             }else {
                int i = b.Eh(b.Bh());
                uof = (i != -1)? b.y.get(i): objArray;
             }
             if (uof != null) {
                b uob = uof.e();
                if (uob != null) {
                   b.F.setVisibility(0);
                   c.a(b.F, uob);
                }
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, b, LiveRedPacketContainerDialogFragment.class, "26")) {
          b.xh();
          ArrayList uArrayList = new ArrayList();
          c$a uoa = new c$a(new float[2]{0,0x3f800000}, new float[2]{0x3f000000,0x3f8ccccd}, new float[4]{0x3e99999a,0,0x3f333333,0x3f800000}, 300);
          uArrayList.add(objArray);
          c$a uoa1 = new c$a(null, new float[2]{0x3f8ccccd,0x3f7851ec}, new float[4]{0x3e99999a,0,0x3f333333,0x3f800000}, 150);
          uArrayList.add(objArray);
          c$a uoa2 = new c$a(null, new float[2]{0x3f7851ec,0x3f8147ae}, new float[4]{0x3e99999a,0,0x3f333333,0x3f800000}, 150);
          uArrayList.add(objArray);
          uoa = new c$a(null, new float[2]{0x3f8147ae,0x3f800000}, new float[4]{0x3e99999a,0,0x3f333333,0x3f800000}, 100);
          uArrayList.add(objArray);
          m om = new m(b);
          LiveRedPacketContainerDialogFragment s = b.s;
          AnimatorSet uAnimatorSet = PatchProxy.applyThreeRefs(s, uArrayList, om, null, c.class, "1");
          if (uAnimatorSet != patchProxyRe) {
          }else {
             ArrayList uArrayList1 = new ArrayList();
             ArrayList uArrayList2 = new ArrayList();
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                c$a uoa3 = iterator.next();
                c$a b1 = uoa3.b;
                if (b1 != null && b1.length > 0) {
                   valueAnimato = ValueAnimator.ofFloat(b1);
                   valueAnimato.addUpdateListener(new d(s));
                   valueAnimato.setDuration(uoa3.d);
                   valueAnimato.setInterpolator(c.a(uoa3.c));
                   uArrayList1.add(valueAnimato);
                }
                b1 = uoa3.a;
                if (b1 != null && b1.length > 0) {
                   valueAnimato = ValueAnimator.ofFloat(b1);
                   valueAnimato.addUpdateListener(new c(s));
                   valueAnimato.setDuration(uoa3.d);
                   valueAnimato.setInterpolator(c.a(uoa3.c));
                   uArrayList2.add(valueAnimato);
                }
             }
             AnimatorSet uAnimatorSet1 = new AnimatorSet();
             AnimatorSet uAnimatorSet2 = new AnimatorSet();
             uAnimatorSet1.playSequentially(uArrayList1);
             uAnimatorSet2.playSequentially(uArrayList2);
             uAnimatorSet = new AnimatorSet();
             Animator[] uAnimatorArr = new Animator[]{uAnimatorSet1,uAnimatorSet2};
             uAnimatorSet.playTogether(uAnimatorArr);
             uAnimatorSet.addListener(new e(om));
          }
          b.t = uAnimatorSet;
          uAnimatorSet.start();
          b.s.setVisibility(0);
       }
       LiveRedPacketContainerDialogFragment j = b.J;
       if (j != null) {
          j.onShow(p0);
       }
       return;
    }
}
