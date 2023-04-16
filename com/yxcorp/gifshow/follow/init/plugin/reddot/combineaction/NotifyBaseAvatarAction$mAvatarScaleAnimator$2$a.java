package com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$mAvatarScaleAnimator$2$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$mAvatarScaleAnimator$2;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction;
import androidx.fragment.app.FragmentActivity;
import pr6.d;
import wa5.e;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import ro5.c0;
import java.lang.NullPointerException;

public final class NotifyBaseAvatarAction$mAvatarScaleAnimator$2$a implements ValueAnimator$AnimatorUpdateListener	// class@0010ed
{
    public final NotifyBaseAvatarAction$mAvatarScaleAnimator$2 a;

    public void NotifyBaseAvatarAction$mAvatarScaleAnimator$2$a(NotifyBaseAvatarAction$mAvatarScaleAnimator$2 p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NotifyBaseAvatarAction$mAvatarScaleAnimator$2$a.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          float f = p0.floatValue();
          if (this.a.this$0.f.g() != null && e.b()) {
             c0.e(this.a.this$0.f, b.c, f);
          }
          PatchProxy.onMethodExit(NotifyBaseAvatarAction$mAvatarScaleAnimator$2$a.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(NotifyBaseAvatarAction$mAvatarScaleAnimator$2$a.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}
