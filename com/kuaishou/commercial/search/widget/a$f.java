package com.kuaishou.commercial.search.widget.a$f;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$f extends AnimatorListenerAdapter	// class@00157b
{
    public final View a;

    public void a$f(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(8);
       return;
    }
}
