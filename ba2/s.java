package ba2.s;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankTempViewV2;
import java.lang.Object;
import java.util.Objects;
import android.view.View;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import ba2.u;
import android.animation.Animator$AnimatorListener;

public final class s implements Runnable	// class@0003aa
{
    public final LiveHourlyRankTempViewV2 b;

    public void s(LiveHourlyRankTempViewV2 p0){
       this.b = p0;
    }
    public final void run(){
       s tb = this.b;
       Objects.requireNonNull(tb);
       ObjectAnimator objectAnimat = j.a(tb, new float[2]{0x3f800000,0});
       tb.i = objectAnimat;
       objectAnimat.setDuration(300);
       tb.i.addListener(new u(tb));
       tb.i.start();
    }
}
