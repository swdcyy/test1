package com.yxcorp.gifshow.detail.article.imagepreview.r$c;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.article.imagepreview.r;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class r$c extends AnimatorListenerAdapter	// class@00135e
{
    public final r a;

    public void r$c(r p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$c.class, "1")) {
          return;
       }
       this.a.y.finish();
       return;
    }
}
