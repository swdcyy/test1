package com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$d;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController;
import msd.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveLiteInteractiveMessageViewController$d extends AnimatorListenerAdapter	// class@0009c2
{
    public final LiveLiteInteractiveMessageViewController a;
    public final a b;

    public void LiveLiteInteractiveMessageViewController$d(LiveLiteInteractiveMessageViewController p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteInteractiveMessageViewController$d.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       p0.o = null;
       LiveLiteInteractiveMessageViewController$d tb = this.b;
       if (tb != null) {
          tb.invoke();
       }
       return;
    }
}
