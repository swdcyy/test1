package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.LiveGiftBoxBatchTipsView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.LiveGiftBoxBatchTipsView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.constraintlayout.widget.Group;

public class LiveGiftBoxBatchTipsView$a extends AnimatorListenerAdapter	// class@000b60
{
    public final LiveGiftBoxBatchTipsView a;

    public void LiveGiftBoxBatchTipsView$a(LiveGiftBoxBatchTipsView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxBatchTipsView$a.class, "1")) {
          return;
       }
       this.a.F.setVisibility(8);
       return;
    }
}
