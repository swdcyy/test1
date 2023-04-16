package com.kuaishou.live.core.show.luckystar.pendant.LiveLuckyStarNewPendantV2View$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.luckystar.pendant.LiveLuckyStarNewPendantV2View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.animation.Animator;

public class LiveLuckyStarNewPendantV2View$a extends AnimatorListenerAdapter	// class@000ced
{
    public final LiveLuckyStarNewPendantV2View a;

    public void LiveLuckyStarNewPendantV2View$a(LiveLuckyStarNewPendantV2View p0){
       this.a = p0;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveLuckyStarNewPendantV2View$a.class, "4")) {
          return;
       }
       this.a.e.setVisibility(0);
       this.a.d.setVisibility(8);
       return;
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLuckyStarNewPendantV2View$a.class, "3")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a();
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLuckyStarNewPendantV2View$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLuckyStarNewPendantV2View$a.class, "1")) {
          return;
       }
       this.a.d.setVisibility(0);
       this.a.e.setVisibility(8);
       return;
    }
}
