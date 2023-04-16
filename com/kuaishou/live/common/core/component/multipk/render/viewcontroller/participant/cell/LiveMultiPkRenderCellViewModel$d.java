package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$d;
import z0.a;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ut1.f;
import ut1.c;
import ut1.o;
import cu1.d;

public final class LiveMultiPkRenderCellViewModel$d implements a	// class@00168a
{
    public final LiveMultiPkRenderCellViewModel a;

    public void LiveMultiPkRenderCellViewModel$d(LiveMultiPkRenderCellViewModel p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkRenderCellViewModel$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b(this.a.getUserId(), p0.d());
    }
}
