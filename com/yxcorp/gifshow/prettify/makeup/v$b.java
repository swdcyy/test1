package com.yxcorp.gifshow.prettify.makeup.v$b;
import ekd.f$j;
import com.yxcorp.gifshow.prettify.makeup.v;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;

public class v$b extends f$j	// class@00119a
{
    public final v a;

    public void v$b(v p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$b.class, "1")) {
          return;
       }
       n.Y(this.a.g, 4, false);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$b.class, "2")) {
          return;
       }
       n.Y(this.a.g, 4, false);
       return;
    }
}
