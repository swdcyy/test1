package g12.y;
import java.lang.Runnable;
import g12.z;
import java.lang.Object;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import android.content.Context;
import android.graphics.Point;
import com.yxcorp.utility.n;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import android.view.View;

public final class y implements Runnable	// class@002a40
{
    public final z b;

    public void y(z p0){
       this.b = p0;
    }
    public final void run(){
       y tb = this.b;
       Activity activity = tb.getActivity();
       Objects.requireNonNull(activity);
       float f = (float)n.s(activity).x;
       b.P(LiveLogTag.LIVE_SQUARE.appendTag("LiveSlideSquareSideBarLayoutPresenter"), "setTranslationX for LANDSCAPE, translation = "+f);
       tb.p.setTranslationX(f);
    }
}
