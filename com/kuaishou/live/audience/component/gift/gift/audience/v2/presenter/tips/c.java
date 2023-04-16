package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.c;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.LiveGiftBoxBatchTipsView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n01.f;
import java.lang.Runnable;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;

public class c extends AnimatorListenerAdapter	// class@000b66
{
    public final int a;
    public final LiveGiftBoxBatchTipsView b;

    public void c(LiveGiftBoxBatchTipsView p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.b.postDelayed(new f(this), (long)this.a);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.b.F.setVisibility(0);
       return;
    }
}
