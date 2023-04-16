package com.kuaishou.live.core.show.guestactivity.d;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kuaishou.live.core.show.guestactivity.h$f;

public class d extends AnimatorListenerAdapter	// class@000bd3
{
    public final LiveAudienceGuestActivityTopListPresenterV2 a;

    public void d(LiveAudienceGuestActivityTopListPresenterV2 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.N.setAlpha(0x3f800000);
       this.a.U0.c();
       return;
    }
}
