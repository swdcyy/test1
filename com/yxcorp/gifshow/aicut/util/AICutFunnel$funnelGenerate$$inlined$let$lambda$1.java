package com.yxcorp.gifshow.aicut.util.AICutFunnel$funnelGenerate$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import o69.a;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.protobuf.photo.funnel.AiCutStat;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.AiCutStat$b;
import com.yxcorp.gifshow.aicut.api.AICutStyle;

public final class AICutFunnel$funnelGenerate$$inlined$let$lambda$1 extends Lambda implements l	// class@001976
{
    public final a $task$inlined;

    public void AICutFunnel$funnelGenerate$$inlined$let$lambda$1(a p0){
       this.$task$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AiCutStat obj = PatchProxy.applyOneRefsWithListener(p0, this, AICutFunnel$funnelGenerate$$inlined$let$lambda$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       Objects.requireNonNull(p0);
       obj = PatchProxy.apply(null, p0, PostFunnelStat$c.class, "85");
       if (obj != patchProxyRe) {
       }else {
          obj = p0.instance.getAiCut();
       }
       AiCutStat$b uob = obj.toBuilder();
       a.o(uob, "build");
       String id = this.$task$inlined.i().getId();
       Objects.requireNonNull(uob);
       if (PatchProxy.applyOneRefs(id, uob, AiCutStat$b.class, "3") != patchProxyRe) {
       }else {
          uob.copyOnWrite();
          uob.instance.setId(id);
       }
       AICutStyle mName = this.$task$inlined.i().mName;
       if (PatchProxy.applyOneRefs(mName, uob, AiCutStat$b.class, "8") != patchProxyRe) {
       }else {
          uob.copyOnWrite();
          uob.instance.setName(mName);
       }
       p0.a(uob.build());
       PatchProxy.onMethodExit(AICutFunnel$funnelGenerate$$inlined$let$lambda$1.class, "1");
       return "funnelGenerate";
    }
}
