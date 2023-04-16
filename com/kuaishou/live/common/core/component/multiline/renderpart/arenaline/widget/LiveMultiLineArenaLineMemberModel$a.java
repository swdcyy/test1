package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel$a;
import z0.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dr1.d;
import java.util.Map;
import dr1.e;

public final class LiveMultiLineArenaLineMemberModel$a implements a	// class@001539
{
    public final LiveMultiLineArenaLineMemberModel a;

    public void LiveMultiLineArenaLineMemberModel$a(LiveMultiLineArenaLineMemberModel p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiLineArenaLineMemberModel$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          p0 = p0.c();
          if (p0 != null) {
             p0 = p0.get(this.a.d());
          label_0025 :
             return p0;
          }
       }
       p0 = null;
       goto label_0025 ;
    }
}
