package com.kuaishou.live.core.show.redpacket.f$b;
import rq5.a;
import com.kuaishou.live.core.show.redpacket.f;
import android.view.View;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import java.util.Arrays;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;

public class f$b extends a	// class@000e7e
{
    public final f h;

    public void f$b(f p0){
       this.h = p0;
       super();
    }
    public View H(){
       return this.h.r;
    }
    public List c(){
       LivePendantRelation[] obj = PatchProxy.apply(null, this, f$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LivePendantRelation[]{LivePendantRelation.LIVE_PK_SMALL_WINDOW};
       return Arrays.asList(obj);
    }
    public LivePendantPriority f(){
       return LivePendantPriority.RED_PACKET;
    }
    public LivePendantRelation h(){
       return LivePendantRelation.RED_PACKET;
    }
}
