package com.kuaishou.live.core.show.clearscreen.c$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.clearscreen.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.Set;
import dt5.b;

public class c$b extends AnimatorListenerAdapter	// class@000a23
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "2")) {
          return;
       }
       Iterator iterator = this.a.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       this.a.d(0);
       Iterator iterator = this.a.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().g();
       }
       return;
    }
}
