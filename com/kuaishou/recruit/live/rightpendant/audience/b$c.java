package com.kuaishou.recruit.live.rightpendant.audience.b$c;
import sfc.a;
import com.kuaishou.recruit.live.rightpendant.audience.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import oy.a;
import com.yxcorp.retrofit.model.KwaiException;
import androidx.fragment.app.KwaiDialogFragment;
import et4.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public class b$c extends a	// class@000ed6
{
    public final long c;
    public final b d;

    public void b$c(b p0,long p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       super.b(p0);
       b g = this.d.G;
       g.a0((System.currentTimeMillis() - this.c));
       int i = 0;
       g.b0(i);
       g.E(i);
       g.F(p0.getMessage());
       if (p0 instanceof KwaiException) {
          KwaiException kwaiExceptio = p0;
          b g1 = this.d.G;
          g1.E(kwaiExceptio.getErrorCode());
          g1.F(kwaiExceptio.getMessage());
       }
       this.d.G.u(i);
       a.a(this.d.R);
       b.y(LiveLogTag.LIVE_RECRUIT.appendTag("AudienceRecruitRightBottomPendant"), "getWidgetUrl failed ", p0);
       return;
    }
}
