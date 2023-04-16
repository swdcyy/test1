package g19.c;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.side.a;
import java.lang.Object;
import java.lang.Boolean;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;

public final class c implements g	// class@0023b1
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       p0 = tb.r.getPlayer();
       if (p0 == null) {
       }else if(p0.isPaused()){
          p0 = PlayEvent$Status.RESUME;
       }else {
          p0 = PlayEvent$Status.PAUSE;
       }
       a.d().k(new PlayEvent(tb.p, p0, 1, "MilanoItemClick"));
       return;
    }
}
