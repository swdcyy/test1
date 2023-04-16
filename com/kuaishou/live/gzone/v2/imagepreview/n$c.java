package com.kuaishou.live.gzone.v2.imagepreview.n$c;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class n$c extends AnimatorListenerAdapter	// class@001cd5
{
    public final n a;

    public void n$c(n p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$c.class, "1")) {
          return;
       }
       this.a.x.finish();
       return;
    }
}
