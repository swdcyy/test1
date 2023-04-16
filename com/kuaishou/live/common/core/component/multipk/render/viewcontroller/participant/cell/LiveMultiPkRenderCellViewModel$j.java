package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$j;
import z0.a;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import du1.d;

public final class LiveMultiPkRenderCellViewModel$j implements a	// class@001690
{
    public final LiveMultiPkRenderCellViewModel a;

    public void LiveMultiPkRenderCellViewModel$j(LiveMultiPkRenderCellViewModel p0){
       this.a = p0;
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, LiveMultiPkRenderCellViewModel$j.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else if(this.a.C.e()){
          p0 = Boolean.TRUE;
       }
       uBoolean = p0;
       return uBoolean;
    }
}
