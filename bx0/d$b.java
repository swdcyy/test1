package bx0.d$b;
import java.lang.Runnable;
import bx0.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import e17.i;

public class d$b implements Runnable	// class@000427
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       d$b tb = this.b;
       LivePlayLogger.logResolutionToastShow(tb.u, tb.v.mIndexInAdapter);
       i.a(R.style.arg_RES_7f11066a, 0x7f102afc);
       return;
    }
}
