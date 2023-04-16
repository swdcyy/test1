package com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.RedPacketSwordAnimView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.RedPacketSwordAnimView;
import android.net.Uri;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import kotlin.Pair;
import java.lang.Number;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Long;
import com.kuaishou.live.common.core.component.redpacket.LiveNewRedPacketLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import qrd.r0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.animation.PropertyValuesHolder;
import java.lang.Math;
import android.animation.ObjectAnimator;
import kotlin.jvm.internal.a;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.animation.RedPacketSwordAnimView$b;
import android.animation.TimeInterpolator;

public final class a implements Runnable	// class@000f3a
{
    public final RedPacketSwordAnimView$a b;

    public void a(RedPacketSwordAnimView$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       float f;
       float f1;
       double d1;
       PropertyValuesHolder[] obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, a.class, "1")) {
          return;
       }
       a b = obj.b;
       b.b.f.M(b.c.toString(), objArray);
       b = obj.b;
       b.b.g.M(b.c.toString(), objArray);
       b = obj.b;
       b.b.h.M(b.c.toString(), objArray);
       b = obj.b;
       b.b.i.M(b.c.toString(), objArray);
       b = obj.b;
       b.b.j.M(b.c.toString(), objArray);
       RedPacketSwordAnimView$a b1 = obj.b.b;
       boolean b2 = true;
       b1.c = b2;
       RedPacketSwordAnimView d = b1.d;
       if (d != null) {
          long l = d.getFirst().longValue();
          boolean b3 = d.getSecond().booleanValue();
          Objects.requireNonNull(b1);
          if (!PatchProxy.isSupport(RedPacketSwordAnimView.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), Boolean.valueOf(b3), b1, RedPacketSwordAnimView.class, "3")) {
             if (b1.c == null) {
                b.d0(LiveNewRedPacketLogTag.LIVE_NORMAL_RED_PACKET, "[SwordAnimView]WaitImageDownloadToFire:", "duration", Long.valueOf(l), "doSpread", Boolean.valueOf(b3));
                b1.d = r0.a(Long.valueOf(l), Boolean.valueOf(b3));
             }else {
                b.d0(LiveNewRedPacketLogTag.LIVE_NORMAL_RED_PACKET, "[SwordAnimView]StartFire:", "duration", Long.valueOf(l), "doSpread", Boolean.valueOf(b3));
                b1.setVisibility(0);
                b1.e.setVisibility(0);
                b1.f.setVisibility(0);
                b1.g.setVisibility(0);
                b1.h.setVisibility(0);
                b1.i.setVisibility(0);
                b1.j.setVisibility(0);
                float[] uofloatArray = new float[]{((float)(- b1.getWidth()) / 2.00f) - f,0};
                f = (float)b1.e.getWidth();
                PropertyValuesHolder propertyValu = PropertyValuesHolder.ofFloat("translationX", uofloatArray);
                float[] uofloatArray1 = new float[]{((float)b1.getWidth() / 2.00f) + f,0};
                PropertyValuesHolder propertyValu1 = PropertyValuesHolder.ofFloat("translationX", uofloatArray1);
                float[] uofloatArray2 = new float[]{((float)(- b1.getHeight()) / 2.00f) - f1,0};
                f1 = (float)b1.e.getHeight();
                uofloatArray1 = new float[]{((float)b1.getHeight() / 2.00f) + f1,0};
                PropertyValuesHolder propertyValu2 = PropertyValuesHolder.ofFloat("translationY", uofloatArray1);
                float[] uofloatArray3 = new float[]{(float)b1.g.getWidth() * (float)Math.tan(d1),0};
                d1 = (double)10.00f;
                PropertyValuesHolder propertyValu3 = PropertyValuesHolder.ofFloat("translationY", uofloatArray2);
                uofloatArray1 = new float[]{(float)(- b1.j.getWidth()) * (float)Math.tan(d1),0};
                PropertyValuesHolder[] propertyValu4 = new PropertyValuesHolder[]{propertyValu,propertyValu3};
                ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(b1.e, propertyValu4);
                a.o(objectAnimat, "ObjectAnimator.ofPropert¡­enterPVH, topToCenterPVH\)");
                PropertyValuesHolder[] propertyValu5 = new PropertyValuesHolder[]{propertyValu1,propertyValu3};
                ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(b1.f, propertyValu5);
                a.o(objectAnimat1, "ObjectAnimator.ofPropert¡­enterPVH, topToCenterPVH\)");
                propertyValu5 = new PropertyValuesHolder[]{propertyValu1,PropertyValuesHolder.ofFloat("translationY", uofloatArray1)};
                ObjectAnimator objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(b1.g, propertyValu5);
                a.o(objectAnimat2, "ObjectAnimator.ofPropert¡­H, verticalOffsetDownPVH\)");
                propertyValu5 = new PropertyValuesHolder[]{propertyValu1,propertyValu2};
                ObjectAnimator objectAnimat3 = ObjectAnimator.ofPropertyValuesHolder(b1.h, propertyValu5);
                a.o(objectAnimat3, "ObjectAnimator.ofPropert¡­erPVH, bottomToCenterPVH\)");
                obj = new PropertyValuesHolder[]{propertyValu,propertyValu2};
                ObjectAnimator objectAnimat4 = ObjectAnimator.ofPropertyValuesHolder(b1.i, obj);
                a.o(objectAnimat4, "ObjectAnimator.ofPropert¡­erPVH, bottomToCenterPVH\)");
                propertyValu4 = new PropertyValuesHolder[]{propertyValu,PropertyValuesHolder.ofFloat("translationY", uofloatArray3)};
                ObjectAnimator objectAnimat5 = ObjectAnimator.ofPropertyValuesHolder(b1.j, propertyValu4);
                a.o(objectAnimat5, "ObjectAnimator.ofPropert¡­PVH, verticalOffsetUpPVH\)");
                AnimatorSet uAnimatorSet = new AnimatorSet();
                Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2,objectAnimat3,objectAnimat4,objectAnimat5};
                uAnimatorSet.playTogether(uAnimatorArr);
                if (b3) {
                   uAnimatorSet.setInterpolator(new RedPacketSwordAnimView$b(b1));
                }
                uAnimatorSet.setDuration(l);
                uAnimatorSet.start();
             }
          }
          this.b.b.d = null;
       }
       return;
    }
}
