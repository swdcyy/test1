package com.yxcorp.gifshow.prettify.makeup.e0$a;
import android.view.animation.Animation$AnimationListener;
import android.view.View;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e0$a implements Animation$AnimationListener	// class@001174
{
    public final View b;
    public final View c;

    public void e0$a(View p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$a.class, "2")) {
          return;
       }
       this.c.setVisibility(8);
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$a.class, "1")) {
          return;
       }
       this.b.setVisibility(0);
       return;
    }
}
