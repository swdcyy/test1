package com.kuaishou.live.core.show.clearscreen.c$a;
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

public class c$a extends AnimatorListenerAdapter	// class@000a22
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       c$a ta = this.a;
       ta.d(ta.d);
       Iterator iterator = this.a.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().c();
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       Iterator iterator = this.a.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().d();
       }
       return;
    }
}
