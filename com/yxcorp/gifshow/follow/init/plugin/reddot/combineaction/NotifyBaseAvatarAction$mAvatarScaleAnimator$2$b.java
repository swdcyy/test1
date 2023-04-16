package com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$mAvatarScaleAnimator$2$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$mAvatarScaleAnimator$2$$special$$inlined$apply$lambda$2;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$mAvatarScaleAnimator$2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction;

public final class NotifyBaseAvatarAction$mAvatarScaleAnimator$2$b extends AnimatorListenerAdapter	// class@0010ee
{
    public final NotifyBaseAvatarAction$mAvatarScaleAnimator$2$$special$$inlined$apply$lambda$2 a;
    public final NotifyBaseAvatarAction$mAvatarScaleAnimator$2 b;

    public void NotifyBaseAvatarAction$mAvatarScaleAnimator$2$b(NotifyBaseAvatarAction$mAvatarScaleAnimator$2$$special$$inlined$apply$lambda$2 p0,NotifyBaseAvatarAction$mAvatarScaleAnimator$2 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NotifyBaseAvatarAction$mAvatarScaleAnimator$2$b.class, "2")) {
          return;
       }
       this.a.invoke();
       PatchProxy.onMethodExit(NotifyBaseAvatarAction$mAvatarScaleAnimator$2$b.class, "2");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NotifyBaseAvatarAction$mAvatarScaleAnimator$2$b.class, "1")) {
          return;
       }
       this.a.invoke();
       this.b.this$0.f();
       PatchProxy.onMethodExit(NotifyBaseAvatarAction$mAvatarScaleAnimator$2$b.class, "1");
       return;
    }
}
