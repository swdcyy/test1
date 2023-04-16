package com.kuaishou.recruit.live.rightpendant.audience.b$b;
import eu4.a;
import com.kuaishou.recruit.live.rightpendant.audience.b;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import lp3.e;
import lp3.c;
import lp3.b;

public class b$b implements a	// class@000ed5
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void A9(Context p0,String p1,int p2){
       if (PatchProxy.isSupport(b$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b$b.class, "2")) {
          return;
       }
       LiveLogTag lIVE_RECRUIT = LiveLogTag.LIVE_RECRUIT;
       lIVE_RECRUIT.appendTag("AudienceRecruitRightBottomPendant");
       b.T(lIVE_RECRUIT, "show recruit dialog success", "job id ", p1, "scene", Integer.valueOf(p2));
       this.b.l9(p0, p1, p2);
       return;
    }
    public void Ah(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       b.S(LiveLogTag.LIVE_RECRUIT.appendTag("AudienceRecruitRightBottomPendant"), "update job apply success", "job id ", p0);
       this.b.d9("APPLYED", p0);
       this.b.e9(p0);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
}
