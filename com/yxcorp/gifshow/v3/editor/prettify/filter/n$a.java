package com.yxcorp.gifshow.v3.editor.prettify.filter.n$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.prettify.filter.n;

public class n$a extends AnimatorListenerAdapter	// class@00117d
{
    public final VideoSDKPlayerView a;

    public void n$a(VideoSDKPlayerView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.clearOverlyFilter();
       n.h();
       return;
    }
}
