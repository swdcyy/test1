package com.yxcorp.gifshow.camera.record.log.CameraFunnel$funnelTaskId$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class CameraFunnel$funnelTaskId$1 extends Lambda implements l	// class@000e21
{
    public final String $taskId;

    public void CameraFunnel$funnelTaskId$1(String p0){
       this.$taskId = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraFunnel$funnelTaskId$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       p0.i(this.$taskId);
       return "funnelTaskId";
    }
}
