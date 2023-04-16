package com.yxcorp.gifshow.comment.image.viewpager.a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.comment.image.viewpager.PreviewViewPager;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.image.viewpager.PreviewViewPager$f;

public class a extends AnimatorListenerAdapter	// class@0010dc
{
    public final View a;
    public final PreviewViewPager b;

    public void a(PreviewViewPager p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.onAnimationCancel(p0);
       p0.g = 10;
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       a tb = this.b;
       tb.e = 0;
       tb.f = 0;
       tb.g = 10;
       PreviewViewPager l = tb.l;
       if (l != null) {
          l.a(this.a);
       }
       return;
    }
}
