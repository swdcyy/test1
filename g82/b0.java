package g82.b0;
import erd.g;
import g82.v$b;
import java.lang.Object;
import njd.a;
import com.kuaishou.live.common.core.component.fansgroup.model.LiveFansGroupAudienceStatusResponse;
import g82.v;
import java.util.List;
import g82.q0;
import java.lang.Boolean;
import brd.y;
import mrd.c;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import com.kuaishou.live.core.show.fansgroup.http.superFansGroup.LiveSuperFansGroupInfo;

public final class b0 implements g	// class@002a94
{
    public final v$b b;

    public void b0(v$b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b0 tb = this.b;
       tb.b.B9(p0.a());
       if (p0.a() != null) {
          tb.b.P8(p0.a().mIsInactiveSoon);
          tb.b.W0 = p0.a().mSuperFansGroupInfo;
          tb.b.Q = p0.a().mSuperFansGroupTagInfo;
          tb.b.V0 = p0.a().mHasSuperFansGroup;
          v x0 = tb.b.X0;
          if (x0 != null) {
             x0.a(p0.a().mLiveFansGroupDelayRequestTaskActionInfoList);
          }
          v$b b = tb.b;
          b.d1.onNext(Boolean.valueOf(b.V0));
          b = tb.b;
          b.h9(b.W0, b.c1);
          tb.b.h9(p0.a().mSuperFansGroupTagInfo, tb.b.e1);
          tb.b.c9(p0.a().mIntimacyInfo, p0.a().mHasSuperFansGroup, p0.a().mSuperFansGroupInfo);
       }
       return;
    }
}
