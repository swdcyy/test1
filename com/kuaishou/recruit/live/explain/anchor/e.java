package com.kuaishou.recruit.live.explain.anchor.e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class e implements g	// class@000ebb
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_RECRUIT_EXPLAIN, "LiveAnchorRecruitExplainPanelStateManager.tryStartRecruitExplain failed", p0);
    }
}
