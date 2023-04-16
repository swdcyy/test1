package ad3.e;
import z1.a;
import ad3.j;
import java.lang.Object;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarItemChangeReason;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import oy.a;
import com.kuaishou.commercial.reporter.data.SignalMessageData;
import com.kuaishou.commercial.reporter.data.ApiResponseMessageData;
import com.kuaishou.commercial.reporter.data.CommercialRecruitLiveShowClickReportMessageData;

public final class e implements a	// class@00008b
{
    public final j a;

    public void e(j p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       e ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, j.class, "9")) {
       }else if(ta.r == null){
          p0 = ta.p;
          p0.W((System.currentTimeMillis() - ta.q));
          p0.A(true);
          ta.s.V();
          p0.mRecruitCompleteActionTimePeriodMs = System.currentTimeMillis() - ta.q;
          p0.mRecruitHttpCompleteActionTimePeriodMs = System.currentTimeMillis() - ta.q;
          p0 = ta.y;
          p0.mActionType = 1;
          ta.x.x(p0);
          ta.r = true;
       }
       return;
    }
}
