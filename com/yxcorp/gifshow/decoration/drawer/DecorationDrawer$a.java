package com.yxcorp.gifshow.decoration.drawer.DecorationDrawer$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import java.lang.Runnable;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer$b;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class DecorationDrawer$a extends AnimatorListenerAdapter	// class@0012a9
{
    public final Runnable a;
    public final DecorationDrawer$b b;
    public final View c;
    public final DecorationDrawer d;

    public void DecorationDrawer$a(DecorationDrawer p0,Runnable p1,DecorationDrawer$b p2,View p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationDrawer$a.class, "1")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.d.animationEnd(this.a, this.b, this.c);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationDrawer$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.d.animationEnd(this.a, this.b, this.c);
       return;
    }
}
