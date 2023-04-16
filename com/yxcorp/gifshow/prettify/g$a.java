package com.yxcorp.gifshow.prettify.g$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.prettify.g;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class g$a extends AnimatorListenerAdapter	// class@001155
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       this.a.h();
       return;
    }
}
