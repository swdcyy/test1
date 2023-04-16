package com.kuaishou.post.story.edit.d$a;
import android.view.animation.Animation$AnimationListener;
import com.kuaishou.post.story.edit.d;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;

public class d$a implements Animation$AnimationListener	// class@000ac8
{
    public final boolean b;
    public final d c;

    public void d$a(d p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       if (this.b != null) {
          this.c.r.setVisibility(0);
       }else {
          this.c.r.setVisibility(8);
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "2")) {
          return;
       }
       if (this.b != null) {
          this.c.r.setVisibility(0);
       }else {
          this.c.r.setVisibility(8);
       }
       return;
    }
    public void onAnimationStart(Animation p0){
    }
}
