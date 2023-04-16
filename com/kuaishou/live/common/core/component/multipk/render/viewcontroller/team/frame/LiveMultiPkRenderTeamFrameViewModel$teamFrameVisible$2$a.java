package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.team.frame.LiveMultiPkRenderTeamFrameViewModel$teamFrameVisible$2$a;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import java.lang.Boolean;

public final class LiveMultiPkRenderTeamFrameViewModel$teamFrameVisible$2$a implements a	// class@001699
{

    public void LiveMultiPkRenderTeamFrameViewModel$teamFrameVisible$2$a(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkRenderTeamFrameViewModel$teamFrameVisible$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (!p0.length())? 1: 0;
       return Boolean.valueOf((i ^ 1));
    }
}
