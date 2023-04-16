package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$a;
import z0.a;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ut1.f;
import java.util.Map;
import ut1.l;
import cu1.d;

public final class LiveMultiPkRenderCellViewModel$a implements a	// class@001687
{
    public final LiveMultiPkRenderCellViewModel a;

    public void LiveMultiPkRenderCellViewModel$a(LiveMultiPkRenderCellViewModel p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkRenderCellViewModel$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.d(this.a.getUserId(), p0.l());
    }
}
