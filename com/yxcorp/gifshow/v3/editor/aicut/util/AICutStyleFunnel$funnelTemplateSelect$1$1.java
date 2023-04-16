package com.yxcorp.gifshow.v3.editor.aicut.util.AICutStyleFunnel$funnelTemplateSelect$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import eca.g;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.protobuf.photo.funnel.TemplateStat;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.TemplateStat$b;
import com.yxcorp.gifshow.aicut.VideoTemplate;

public final class AICutStyleFunnel$funnelTemplateSelect$1$1 extends Lambda implements l	// class@000da6
{
    public final g $item;

    public void AICutStyleFunnel$funnelTemplateSelect$1$1(g p0){
       this.$item = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TemplateStat obj = PatchProxy.applyOneRefs(p0, this, AICutStyleFunnel$funnelTemplateSelect$1$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       Objects.requireNonNull(p0);
       obj = PatchProxy.apply(null, p0, PostFunnelStat$c.class, "91");
       if (obj != patchProxyRe) {
       }else {
          obj = p0.instance.getTemplate();
       }
       TemplateStat$b uob = obj.toBuilder();
       a.o(uob, "builder");
       String id = this.$item.f().getId();
       Objects.requireNonNull(uob);
       if (PatchProxy.applyOneRefs(id, uob, TemplateStat$b.class, "3") != patchProxyRe) {
       }else {
          uob.copyOnWrite();
          uob.instance.setId(id);
       }
       id = this.$item.f().getName();
       if (PatchProxy.applyOneRefs(id, uob, TemplateStat$b.class, "8") != patchProxyRe) {
       }else {
          uob.copyOnWrite();
          uob.instance.setName(id);
       }
       p0.j(uob.build());
       return "funnelTemplateSelect";
    }
}
