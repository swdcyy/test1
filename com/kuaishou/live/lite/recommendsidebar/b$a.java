package com.kuaishou.live.lite.recommendsidebar.b$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.lite.recommendsidebar.b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$a extends AnimatorListenerAdapter	// class@000aea
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
       b$a tb = this.b;
       if (tb.t != null) {
          tb.n(this.a);
       }
       return;
    }
}
