package com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1$2;
import msd.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import yx.j0;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView;
import android.widget.FrameLayout;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.widget.ImageView;
import android.animation.PropertyValuesHolder;
import android.animation.Keyframe;
import android.util.Property;
import android.animation.ObjectAnimator;
import ky8.a;
import android.animation.TimeInterpolator;
import tl0.a;
import android.animation.Animator$AnimatorListener;

public final class LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1$2 extends FunctionReferenceImpl implements a	// class@000993
{

    public void LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1$2(LiveMultiTriggeringNeoPendantPresenter p0){
       super(0, p0, LiveMultiTriggeringNeoPendantPresenter.class, "onCountDownEnd", "onCountDownEnd\(\)V", 0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1$2.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoid(objArray, treceiver, LiveMultiTriggeringNeoPendantPresenter.class, "15")) {
          treceiver.Z8();
          int i = 0;
          if (treceiver.z != null) {
             Object[] objArray1 = new Object[i];
             j0.c("LiveMultiTriggeringNeoPendantPresenter", "Duplicate count down end events", objArray1);
          }else {
             boolean b = true;
             treceiver.z = b;
             LiveAdNeoEnhancePendantView liveAdNeoEnh = treceiver.W8();
             Objects.requireNonNull(liveAdNeoEnh);
             if (!PatchProxy.applyVoid(objArray, liveAdNeoEnh, LiveAdNeoEnhancePendantView.class, "12")) {
                liveAdNeoEnh.clearAnimation();
                LiveAdNeoEnhancePendantView k = liveAdNeoEnh.k;
                String str = "mPendentBgImg";
                if (k == null) {
                   a.S(str);
                }
                float f = 15.00f;
                k.setPivotY((float)a1.e(f));
                k = liveAdNeoEnh.k;
                if (k == null) {
                   a.S(str);
                }
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[b];
                Keyframe[] keyframeArra = new Keyframe[]{Keyframe.ofFloat(0, 0),Keyframe.ofFloat(0.20f, 0x41f00000),Keyframe.ofFloat(0.40f, 0xc1f00000),Keyframe.ofFloat(0x3f19999a, f),Keyframe.ofFloat(0x3f4ccccd, -15.00f),Keyframe.ofFloat(0x3f800000, 0)};
                propertyValu[i] = PropertyValuesHolder.ofKeyframe(FrameLayout.ROTATION, keyframeArra);
                ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(k, propertyValu);
                a.o(objectAnimat, "shakeAnim");
                objectAnimat.setStartDelay(1000);
                objectAnimat.setDuration(1500);
                objectAnimat.setRepeatCount(2);
                objectAnimat.setInterpolator(new a(0.25f, 0.10f, 0.25f, 0.10f));
                objectAnimat.addListener(new a(liveAdNeoEnh));
                objectAnimat.start();
                liveAdNeoEnh.n = objectAnimat;
             }
          }
       }
       return;
    }
}
