package com.kuaishou.live.core.show.guestactivity.i;
import ekd.f$j;
import com.kuaishou.live.core.show.guestactivity.h;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2$d;

public class i extends f$j	// class@000bde
{
    public final h a;

    public void i(h p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.a.W.a();
       return;
    }
}
