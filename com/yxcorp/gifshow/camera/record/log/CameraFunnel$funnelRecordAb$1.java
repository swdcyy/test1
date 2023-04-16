package com.yxcorp.gifshow.camera.record.log.CameraFunnel$funnelRecordAb$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.s6;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat;
import java.util.Map;

public final class CameraFunnel$funnelRecordAb$1 extends Lambda implements l	// class@000e1e
{
    public static final CameraFunnel$funnelRecordAb$1 INSTANCE;

    static {
       CameraFunnel$funnelRecordAb$1.INSTANCE = new CameraFunnel$funnelRecordAb$1();
    }
    public void CameraFunnel$funnelRecordAb$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraFunnel$funnelRecordAb$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       String str = (s6.A())? "true": "false";
       Objects.requireNonNull(p0);
       if (PatchProxy.applyTwoRefs("supportShootUpdatePriority", str, p0, PostFunnelStat$c.class, "183") != PatchProxyResult.class) {
       }else {
          p0.copyOnWrite();
          p0.instance.getMutableAbValuesMap().put("supportShootUpdatePriority", str);
       }
       return "recordAb";
    }
}
