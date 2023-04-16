package com.yxcorp.gifshow.activity.share.util.PublishFunnel$funnelSaveToDraft$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.photo.funnel.PublishStat;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.PublishStat$b;
import java.util.Objects;
import java.lang.Boolean;

public final class PublishFunnel$funnelSaveToDraft$1 extends Lambda implements l	// class@00148a
{
    public static final PublishFunnel$funnelSaveToDraft$1 INSTANCE;

    static {
       PublishFunnel$funnelSaveToDraft$1.INSTANCE = new PublishFunnel$funnelSaveToDraft$1();
    }
    public void PublishFunnel$funnelSaveToDraft$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PublishStat$b obj = PatchProxy.applyOneRefs(p0, this, PublishFunnel$funnelSaveToDraft$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       obj = p0.getPublish().toBuilder();
       a.o(obj, "builder");
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(PublishStat$b.class) && PatchProxy.applyOneRefs(Boolean.TRUE, obj, PublishStat$b.class, "8") != patchProxyRe) {
       }else {
          obj.copyOnWrite();
          obj.instance.setSaveToDraft(true);
       }
       p0.f(obj.build());
       return "funnelSaveToDraft";
    }
}
