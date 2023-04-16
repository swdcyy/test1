package com.kwai.feature.api.live.musicstation.b$a;
import android.animation.AnimatorListenerAdapter;
import com.kwai.feature.api.live.musicstation.b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ns5.a;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kwai.feature.api.live.musicstation.b$b;

public class b$a extends AnimatorListenerAdapter	// class@000fe9
{
    public final float a;
    public final b b;

    public void b$a(b p0,float p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       b s = this.b.s;
       if (s != null) {
          s.a(this.a);
       }
       if (!q.f(this.b.t)) {
          Iterator iterator = this.b.t.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(this.a);
          }
       }
       return;
    }
}
