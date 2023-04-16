package com.kuaishou.commercial.search.widget.a$e;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public final class a$e extends AnimatorListenerAdapter	// class@00157a
{
    public final KwaiImageView a;

    public void a$e(KwaiImageView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(4);
       return;
    }
}
