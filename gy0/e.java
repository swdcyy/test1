package gy0.e;
import mq5.h;
import com.kuaishou.live.audience.component.comments.send.e;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import ft5.b;

public final class e implements h	// class@0025a8
{
    public final e b;

    public void e(e p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       e tb = this.b;
       if (e.s(tb.getActivity())) {
          tb.P.J0();
       }
       return;
    }
}
