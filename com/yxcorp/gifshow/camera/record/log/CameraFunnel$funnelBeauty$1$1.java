package com.yxcorp.gifshow.camera.record.log.CameraFunnel$funnelBeauty$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class CameraFunnel$funnelBeauty$1$1 extends Lambda implements l	// class@000e1c
{
    public static final CameraFunnel$funnelBeauty$1$1 INSTANCE;

    static {
       CameraFunnel$funnelBeauty$1$1.INSTANCE = new CameraFunnel$funnelBeauty$1$1();
    }
    public void CameraFunnel$funnelBeauty$1$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraFunnel$funnelBeauty$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return "funnelBeauty";
    }
}
