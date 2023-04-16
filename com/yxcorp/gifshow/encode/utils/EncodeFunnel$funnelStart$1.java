package com.yxcorp.gifshow.encode.utils.EncodeFunnel$funnelStart$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.photo.funnel.EncodeStat;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.EncodeStat$b;
import java.lang.System;
import java.util.Objects;
import java.lang.Long;

public final class EncodeFunnel$funnelStart$1 extends Lambda implements l	// class@000d51
{
    public static final EncodeFunnel$funnelStart$1 INSTANCE;

    static {
       EncodeFunnel$funnelStart$1.INSTANCE = new EncodeFunnel$funnelStart$1();
    }
    public void EncodeFunnel$funnelStart$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       EncodeStat$b obj = PatchProxy.applyOneRefs(p0, this, EncodeFunnel$funnelStart$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       obj = p0.getEncode().toBuilder();
       a.o(obj, "builder");
       long l = System.currentTimeMillis();
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(EncodeStat$b.class) && PatchProxy.applyOneRefs(Long.valueOf(l), obj, EncodeStat$b.class, "2") != patchProxyRe) {
       }else {
          obj.copyOnWrite();
          obj.instance.setStartTimeStamp(l);
       }
       p0.c(obj.build());
       return "funnelStart";
    }
}
