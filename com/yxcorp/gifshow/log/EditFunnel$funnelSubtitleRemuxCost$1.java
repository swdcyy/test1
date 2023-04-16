package com.yxcorp.gifshow.log.EditFunnel$funnelSubtitleRemuxCost$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.SubtitleStat$b;
import java.lang.System;
import java.util.Objects;
import java.lang.Long;

public final class EditFunnel$funnelSubtitleRemuxCost$1 extends Lambda implements l	// class@001ae7
{
    public final long $stamp;

    public void EditFunnel$funnelSubtitleRemuxCost$1(long p0){
       this.$stamp = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SubtitleStat$b obj = PatchProxy.applyOneRefs(p0, this, EditFunnel$funnelSubtitleRemuxCost$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       obj = p0.getSubtitle().toBuilder();
       a.o(obj, "builder");
       long l = System.currentTimeMillis() - this.$stamp;
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(SubtitleStat$b.class) && PatchProxy.applyOneRefs(Long.valueOf(l), obj, SubtitleStat$b.class, "40") != patchProxyRe) {
       }else {
          obj.copyOnWrite();
          obj.instance.setRemuxCost(l);
       }
       p0.h(obj.build());
       return "funnelSubtitleRemuxCost";
    }
}
