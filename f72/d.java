package f72.d;
import erd.g;
import f72.f;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.System;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kuaishou.live.core.show.liveexplore.LiveExploreFragment;

public final class d implements g	// class@0028c8
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       if (tb.r == null) {
          tb.t = System.currentTimeMillis();
       }else if(-1 - tb.t && (System.currentTimeMillis() - tb.t) - 0x927c0 > 0){
          tb.q.X(RefreshType.PROGRAM, false);
       }
       tb.t = -1;
       return;
    }
}
