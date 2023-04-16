package gz0.j;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.animation.ValueAnimator;
import android.view.View;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import gz0.s;
import android.animation.Animator$AnimatorListener;

public final class j implements Runnable	// class@0025cc
{
    public final LiveAudienceBottomBarGiftAnimationManger b;

    public void j(LiveAudienceBottomBarGiftAnimationManger p0){
       this.b = p0;
    }
    public final void run(){
       j tb = this.b;
       if (tb.m == null) {
          ObjectAnimator objectAnimat = PatchProxy.apply(null, tb, LiveAudienceBottomBarGiftAnimationManger.class, "13");
          if (objectAnimat != PatchProxyResult.class) {
          }else {
             objectAnimat = j.a(tb.g, new float[2]{0x3f800000,0});
             objectAnimat.setDuration(200);
          }
          tb.m = objectAnimat;
          objectAnimat.addListener(new s(tb));
          tb.m.start();
       }
       return;
    }
}
