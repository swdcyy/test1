package m02.u;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import t02.a0;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;

public final class u implements Runnable	// class@0030e6
{
    public final LivePlayFragment b;

    public void u(LivePlayFragment p0){
       this.b = p0;
    }
    public final void run(){
       this.b.K.y2.u8();
    }
}
