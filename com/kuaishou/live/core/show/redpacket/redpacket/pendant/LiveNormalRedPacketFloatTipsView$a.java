package com.kuaishou.live.core.show.redpacket.redpacket.pendant.LiveNormalRedPacketFloatTipsView$a;
import android.os.Handler;
import com.kuaishou.live.core.show.redpacket.redpacket.pendant.LiveNormalRedPacketFloatTipsView;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tw1.f;
import com.kwai.feature.api.live.service.show.redpacket.redpacket.model.RedPacket;
import java.util.Objects;
import android.animation.AnimatorSet;
import android.view.View;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import fh2.f;
import android.animation.Animator$AnimatorListener;

public class LiveNormalRedPacketFloatTipsView$a extends Handler	// class@000eee
{
    public final LiveNormalRedPacketFloatTipsView a;

    public void LiveNormalRedPacketFloatTipsView$a(LiveNormalRedPacketFloatTipsView p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       LiveNormalRedPacketFloatTipsView$a ta;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNormalRedPacketFloatTipsView$a.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       p0 = p0.what;
       if (p0 == 1001) {
          if (this.a.f != null) {
             ta = this.a;
             ta.m(f.a(), ta.k.mOpenTime);
          }
       }else if(p0 == 1002){
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, LiveNormalRedPacketFloatTipsView.class, "23")) {
             AnimatorSet uAnimatorSet = new AnimatorSet();
             ObjectAnimator objectAnimat = j.a(ta, new float[2]{0x3f800000,0});
             objectAnimat.setDuration(100);
             objectAnimat.setInterpolator(new LinearInterpolator());
             uAnimatorSet.play(objectAnimat);
             uAnimatorSet.addListener(new f(ta));
             uAnimatorSet.start();
          }
       }
       return;
    }
}
