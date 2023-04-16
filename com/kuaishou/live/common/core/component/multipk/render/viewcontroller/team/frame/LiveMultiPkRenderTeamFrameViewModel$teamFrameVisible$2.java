package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.team.frame.LiveMultiPkRenderTeamFrameViewModel$teamFrameVisible$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.team.frame.LiveMultiPkRenderTeamFrameViewModel;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.team.frame.LiveMultiPkRenderTeamFrameViewModel$teamFrameVisible$2$a;
import z0.a;
import androidx.lifecycle.Transformations;
import kotlin.jvm.internal.a;

public final class LiveMultiPkRenderTeamFrameViewModel$teamFrameVisible$2 extends Lambda implements a	// class@00169a
{
    public final LiveMultiPkRenderTeamFrameViewModel this$0;

    public void LiveMultiPkRenderTeamFrameViewModel$teamFrameVisible$2(LiveMultiPkRenderTeamFrameViewModel p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveData invoke(){
       LiveData obj = PatchProxy.apply(null, this, LiveMultiPkRenderTeamFrameViewModel$teamFrameVisible$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Transformations.map(this.this$0.i(), new LiveMultiPkRenderTeamFrameViewModel$teamFrameVisible$2$a());
       a.h(obj, "Transformations.map\(this\) { transform\(it\) }");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
