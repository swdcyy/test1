package iy1.d;
import ok.x;
import iy1.l;
import java.lang.Object;
import jy1.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class d implements x	// class@0029c1
{
    public final l b;

    public void d(l p0){
       this.b = p0;
    }
    public final Object get(){
       d tb = this.b;
       b uob = tb.a();
       b.d0(LiveLogTag.LIVE_ENHANCE_MESSAGE, "getMessageFrequencyStrategy", "configBizId", tb, "strategy", uob);
       return uob;
    }
}
