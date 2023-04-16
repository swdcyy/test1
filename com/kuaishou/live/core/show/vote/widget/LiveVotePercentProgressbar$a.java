package com.kuaishou.live.core.show.vote.widget.LiveVotePercentProgressbar$a;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.core.show.vote.widget.LiveVotePercentProgressbar;
import java.lang.Object;
import android.animation.Animator;

public class LiveVotePercentProgressbar$a implements Animator$AnimatorListener	// class@00124e
{
    public final LiveVotePercentProgressbar a;

    public void LiveVotePercentProgressbar$a(LiveVotePercentProgressbar p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       p0.j = null;
    }
    public void onAnimationEnd(Animator p0){
       p0.j = null;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
