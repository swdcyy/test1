package g82.g;
import erd.g;
import g82.v;
import java.lang.Object;
import com.kuaishou.live.common.core.component.fansgroup.model.LiveFansGroupAudienceStatusResponse;
import java.util.List;
import g82.q0;
import java.lang.Boolean;
import brd.y;
import mrd.c;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import com.kuaishou.live.core.show.fansgroup.http.superFansGroup.LiveSuperFansGroupInfo;

public final class g implements g	// class@002a9f
{
    public final v b;

    public void g(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       tb.B9(p0);
       tb.q9();
       if (p0 != null) {
          tb.P8(p0.mIsInactiveSoon);
          tb.W0 = p0.mSuperFansGroupInfo;
          tb.Q = p0.mSuperFansGroupTagInfo;
          tb.V0 = p0.mHasSuperFansGroup;
          v x0 = tb.X0;
          if (x0 != null) {
             x0.a(p0.mLiveFansGroupDelayRequestTaskActionInfoList);
          }
          tb.d1.onNext(Boolean.valueOf(p0.mHasSuperFansGroup));
          tb.h9(p0.mSuperFansGroupInfo, tb.c1);
          tb.h9(p0.mSuperFansGroupTagInfo, tb.e1);
          tb.c9(p0.mIntimacyInfo, p0.mHasSuperFansGroup, p0.mSuperFansGroupInfo);
       }
       return;
    }
}
