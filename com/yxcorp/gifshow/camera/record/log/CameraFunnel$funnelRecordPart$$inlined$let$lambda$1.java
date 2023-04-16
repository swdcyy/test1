package com.yxcorp.gifshow.camera.record.log.CameraFunnel$funnelRecordPart$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.List;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat;
import java.util.Collection;
import km6.d;

public final class CameraFunnel$funnelRecordPart$$inlined$let$lambda$1 extends Lambda implements l	// class@000e20
{
    public final List $list$inlined;

    public void CameraFunnel$funnelRecordPart$$inlined$let$lambda$1(List p0){
       this.$list$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, CameraFunnel$funnelRecordPart$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       Objects.requireNonNull(p0);
       if (PatchProxy.apply(null, p0, PostFunnelStat$c.class, "19") != PatchProxyResult.class) {
       }else {
          p0.copyOnWrite();
          p0.instance.clearSourcePath();
       }
       int i = this.$list$inlined.size();
       int i1 = 0;
       while (i1 < i) {
          d h = this.$list$inlined.get(i1).h;
          if (PatchProxy.applyOneRefs(h, p0, PostFunnelStat$c.class, "17") != PatchProxyResult.class) {
          }else {
             p0.copyOnWrite();
             p0.instance.addSourcePath(h);
          }
          i1 = i1 + 1;
       }
       p0.d(false);
       PatchProxy.onMethodExit(CameraFunnel$funnelRecordPart$$inlined$let$lambda$1.class, "1");
       return "funnelRecordPart";
    }
}
