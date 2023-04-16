package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$c;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ut1.l;
import java.lang.Boolean;

public final class LiveMultiPkRenderCellViewModel$c implements a	// class@001689
{

    public void LiveMultiPkRenderCellViewModel$c(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkRenderCellViewModel$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = (p0 != null)? p0.a(): 1;
       return Boolean.valueOf((b ^ 1));
    }
}
