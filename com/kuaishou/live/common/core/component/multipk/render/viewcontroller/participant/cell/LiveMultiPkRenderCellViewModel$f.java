package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$f;
import z0.a;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ut1.f;
import java.util.Map;
import com.kwai.framework.model.user.UserInfo;
import cu1.d;

public final class LiveMultiPkRenderCellViewModel$f implements a	// class@00168c
{
    public final LiveMultiPkRenderCellViewModel a;

    public void LiveMultiPkRenderCellViewModel$f(LiveMultiPkRenderCellViewModel p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       String obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkRenderCellViewModel$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getUserId();
       p0 = (p0 != null)? p0.l(): null;
       return d.i(obj, p0);
    }
}
