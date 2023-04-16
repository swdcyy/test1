package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.team.frame.LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.team.frame.LiveMultiPkRenderTeamFrameViewModel;
import java.lang.String;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.MutableLiveData;
import ju1.a;
import cu1.d;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.team.frame.LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2$a;
import z0.a;
import androidx.lifecycle.Transformations;
import kotlin.jvm.internal.a;

public final class LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2 extends Lambda implements a	// class@001698
{
    public final String $viewKey;
    public final LiveMultiPkRenderTeamFrameViewModel this$0;

    public void LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2(LiveMultiPkRenderTeamFrameViewModel p0,String p1){
       this.this$0 = p0;
       this.$viewKey = p1;
       super(0);
    }
    public final LiveData invoke(){
       LiveData obj = PatchProxy.apply(null, this, LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Transformations.map(d.a(this.this$0.w0()), new LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2$a(this));
       a.h(obj, "Transformations.map\(this\) { transform\(it\) }");
       obj = Transformations.distinctUntilChanged(obj);
       a.h(obj, "Transformations.distinctUntilChanged\(this\)");
       return d.a(obj);
    }
    public Object invoke(){
       return this.invoke();
    }
}
