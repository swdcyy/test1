package com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$mAvatarScaleAnimator$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tyc.p;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$mAvatarScaleAnimator$2$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$mAvatarScaleAnimator$2$$special$$inlined$apply$lambda$2;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$mAvatarScaleAnimator$2$b;
import android.animation.Animator$AnimatorListener;

public final class NotifyBaseAvatarAction$mAvatarScaleAnimator$2 extends Lambda implements a	// class@0010ef
{
    public final NotifyBaseAvatarAction this$0;

    public void NotifyBaseAvatarAction$mAvatarScaleAnimator$2(NotifyBaseAvatarAction p0){
       this.this$0 = p0;
       super(0);
    }
    public final ValueAnimator invoke(){
       ValueAnimator obj = PatchProxy.apply(null, this, NotifyBaseAvatarAction$mAvatarScaleAnimator$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ValueAnimator.ofFloat(new float[4]{0x3f800000,0x3f900000,0x3f755326,0x3f800000});
       obj.setDuration(1050);
       obj.setInterpolator(new p(0.35f, 0, 0x3f266666, 0x3f800000));
       obj.addUpdateListener(new NotifyBaseAvatarAction$mAvatarScaleAnimator$2$a(this));
       obj.addListener(new NotifyBaseAvatarAction$mAvatarScaleAnimator$2$b(new NotifyBaseAvatarAction$mAvatarScaleAnimator$2$$special$$inlined$apply$lambda$2(this), this));
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
