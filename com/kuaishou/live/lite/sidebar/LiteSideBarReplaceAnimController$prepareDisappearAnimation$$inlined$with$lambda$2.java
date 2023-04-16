package com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController$prepareDisappearAnimation$$inlined$with$lambda$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController;
import java.util.List;
import android.animation.AnimatorSet;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.animation.Animator;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import fd3.g;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorSet$Builder;

public final class LiteSideBarReplaceAnimController$prepareDisappearAnimation$$inlined$with$lambda$2 extends Lambda implements l	// class@000b2f
{
    public final AnimatorSet $animator$inlined;
    public final List $recoverActions$inlined;
    public final LiteSideBarReplaceAnimController this$0;

    public void LiteSideBarReplaceAnimController$prepareDisappearAnimation$$inlined$with$lambda$2(LiteSideBarReplaceAnimController p0,List p1,AnimatorSet p2){
       this.this$0 = p0;
       this.$recoverActions$inlined = p1;
       this.$animator$inlined = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiteSideBarReplaceAnimController$prepareDisappearAnimation$$inlined$with$lambda$2.class, "1")) {
          return;
       }
       a.p(p0, "view");
       LiteSideBarReplaceAnimController$prepareDisappearAnimation$$inlined$with$lambda$2 t$animator$i = this.$animator$inlined;
       LiteSideBarReplaceAnimController$prepareDisappearAnimation$$inlined$with$lambda$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(p0, tthis$0, LiteSideBarReplaceAnimController.class, "10");
       if (objectAnimat != PatchProxyResult.class) {
       }else {
          objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0x3f800000,0});
          objectAnimat.setInterpolator(new LinearInterpolator());
          objectAnimat.setDuration(300);
          objectAnimat.setStartDelay(100);
          objectAnimat.addListener(new g(p0));
          a.o(objectAnimat, "ObjectAnimator.ofFloat\(v¡­         }\)\n            }");
       }
       t$animator$i.play(objectAnimat);
       PatchProxy.onMethodExit(LiteSideBarReplaceAnimController$prepareDisappearAnimation$$inlined$with$lambda$2.class, "1");
       return;
    }
}
