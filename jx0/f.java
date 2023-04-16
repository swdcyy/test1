package jx0.f;
import erd.g;
import jx0.i;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant;

public final class f implements g	// class@002c26
{
    public final i b;

    public void f(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       tb.U0 = true;
       b.g0(LiveCommonLogTag.BLIND_DATE, "on audience status result error", p0);
       p0 = tb.V;
       if (p0 != null) {
          tb.j9(p0);
       }
       return;
    }
}
