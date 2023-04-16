package com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment$b;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class ShareTopicGuideFragment$b implements Animator$AnimatorListener	// class@00146f
{
    public final float a;
    public final ShareTopicGuideFragment b;

    public void ShareTopicGuideFragment$b(ShareTopicGuideFragment p0,float p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareTopicGuideFragment$b.class, "1")) {
          return;
       }
       this.b.u.setAlpha(this.a);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
