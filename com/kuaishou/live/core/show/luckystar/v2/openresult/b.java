package com.kuaishou.live.core.show.luckystar.v2.openresult.b;
import erd.g;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveAudienceLuckyStarOpenResultPresenterV2;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.util.List;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kuaishou.live.core.show.luckystar.util.b;
import jc2.o;
import java.lang.Runnable;

public final class b implements g	// class@000d0c
{
    public final LiveAudienceLuckyStarOpenResultPresenterV2 b;

    public void b(LiveAudienceLuckyStarOpenResultPresenterV2 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       b.y(LiveAudienceLuckyStarOpenResultPresenterV2.R, "requestRollingInfo failed", p0);
       tb.K = false;
       b[] uobArray = new b[]{b.g};
       c.d(tb.E, uobArray);
       b[] uobArray1 = new b[]{b.d};
       c.d(tb.E, uobArray1);
       b.j(tb.E, b.f(p0), new o(tb));
    }
}
