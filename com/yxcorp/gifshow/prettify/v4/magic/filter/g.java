package com.yxcorp.gifshow.prettify.v4.magic.filter.g;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.animation.Animator;

public class g implements Animator$AnimatorListener	// class@0011bd
{
    public final j$c a;
    public final j b;

    public void g(j p0,j$c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.a.g.setVisibility(8);
       this.a.g.setScaleY(0x3f800000);
       this.a.g.setScaleX(0x3f800000);
       return;
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.a();
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.a();
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
