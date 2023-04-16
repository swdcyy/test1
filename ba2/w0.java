package ba2.w0;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.LiveNormalRankNoticeViewV2;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.view.animation.AlphaAnimation;
import ba2.x0;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;

public final class w0 implements Runnable	// class@0003b2
{
    public final LiveNormalRankNoticeViewV2 b;

    public void w0(LiveNormalRankNoticeViewV2 p0){
       this.b = p0;
    }
    public final void run(){
       w0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveNormalRankNoticeViewV2.class, "5")) {
       }else if(!tb.getVisibility()){
          AlphaAnimation uAlphaAnimat = new AlphaAnimation(0x3f800000, 0);
          uAlphaAnimat.setDuration(300);
          uAlphaAnimat.setAnimationListener(new x0(tb));
          tb.startAnimation(uAlphaAnimat);
       }
       return;
    }
}
