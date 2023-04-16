package com.kuaishou.live.lite.like.f$a$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.lite.like.f$a;
import com.kuaishou.live.lite.like.f;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class f$a$a extends AnimatorListenerAdapter	// class@0009f2
{
    public final f a;
    public final f$a b;

    public void f$a$a(f$a p0,f p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.b.b.setVisibility(0);
       this.b.d.setVisibility(4);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.b.b.setVisibility(4);
       this.b.d.setVisibility(0);
       return;
    }
}
