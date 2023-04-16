package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.teamframe.LiveMultiLineArenaLineTeamFrameViewModel$a;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dr1.e;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatWindowFrameColor;

public final class LiveMultiLineArenaLineTeamFrameViewModel$a implements a	// class@001542
{

    public void LiveMultiLineArenaLineTeamFrameViewModel$a(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiLineArenaLineTeamFrameViewModel$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          p0 = p0.i;
          if (p0 != null) {
             p0 = p0.startColor;
          label_0019 :
             return p0;
          }
       }
       p0 = null;
       goto label_0019 ;
    }
}
