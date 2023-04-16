package com.kuaishou.live.core.show.guestactivity.h$e;
import ekd.f$j;
import com.kuaishou.live.core.show.guestactivity.h;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n92.z;

public class h$e extends f$j	// class@000bdb
{
    public final h a;

    public void h$e(h p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$e.class, "1")) {
          return;
       }
       this.a.V.d();
       this.a.d9();
       p0.M = false;
       return;
    }
}
