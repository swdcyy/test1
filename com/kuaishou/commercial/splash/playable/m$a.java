package com.kuaishou.commercial.splash.playable.m$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.commercial.splash.playable.m;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public class m$a extends AnimatorListenerAdapter	// class@0015c7
{
    public final View a;
    public final m b;

    public void m$a(m p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashFullsOnWebPres", "alpha anim end", objArray);
       this.a.setVisibility(8);
       return;
    }
}
