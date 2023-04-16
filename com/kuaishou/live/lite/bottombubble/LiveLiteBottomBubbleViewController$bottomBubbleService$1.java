package com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController$bottomBubbleService$1;
import n93.b;
import com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController;
import java.lang.Object;
import n93.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.Lifecycle$State;
import android.animation.ObjectAnimator;
import com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController$bottomBubbleService$1$a;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import qrd.l1;
import com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController$bottomBubbleService$1$addItemViewController$1;
import androidx.lifecycle.LifecycleOwner;
import msd.a;
import com.kuaishou.live.lite.framework.utils.LivecycleUtilsKt;

public final class LiveLiteBottomBubbleViewController$bottomBubbleService$1 implements b	// class@001edc
{
    public final LiveLiteBottomBubbleViewController a;

    public void LiveLiteBottomBubbleViewController$bottomBubbleService$1(LiveLiteBottomBubbleViewController p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBottomBubbleViewController$bottomBubbleService$1.class, "2")) {
          return;
       }
       a.p(p0, "itemViewController");
       if (!p0.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.CREATED)) {
          return;
       }
       LiveLiteBottomBubbleViewController$bottomBubbleService$1 ta = this.a;
       if (ta.l != null) {
          return;
       }
       ObjectAnimator objectAnimat = ta.X2(false, p0);
       objectAnimat.addListener(new LiveLiteBottomBubbleViewController$bottomBubbleService$1$a(this, p0));
       objectAnimat.start();
       ta.l = objectAnimat;
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBottomBubbleViewController$bottomBubbleService$1.class, "1")) {
          return;
       }
       a.p(p0, "itemViewController");
       Lifecycle$State cREATED = Lifecycle$State.CREATED;
       if (!this.a.getLifecycle().getCurrentState().isAtLeast(cREATED)) {
          LivecycleUtilsKt.a(this.a, cREATED, new LiveLiteBottomBubbleViewController$bottomBubbleService$1$addItemViewController$1(this, p0));
       }else {
          this.a.V2(p0);
       }
       return;
    }
}
