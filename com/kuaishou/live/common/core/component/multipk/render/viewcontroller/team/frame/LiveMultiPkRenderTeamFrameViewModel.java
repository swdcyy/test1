package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.team.frame.LiveMultiPkRenderTeamFrameViewModel;
import ju1.a;
import zs1.b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.team.frame.LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.team.frame.LiveMultiPkRenderTeamFrameViewModel$teamFrameVisible$2;
import androidx.lifecycle.LiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiPkRenderTeamFrameViewModel extends a	// class@00169b
{
    public final p g;
    public final p h;

    public void LiveMultiPkRenderTeamFrameViewModel(b p0,String p1){
       a.p(p0, "pkCoreModel");
       a.p(p1, "viewKey");
       super(p0, p1);
       this.g = s.c(new LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2(this, p1));
       this.h = s.c(new LiveMultiPkRenderTeamFrameViewModel$teamFrameVisible$2(this));
    }
    public final LiveData i(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkRenderTeamFrameViewModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
}
