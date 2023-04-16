package com.kwai.feature.post.funnel.PostCommonFunnel$funnelPerf$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.photo.funnel.Performance$b;
import com.kuaishou.protobuf.photo.funnel.Performance;
import java.lang.System;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.utility.SystemUtil;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat;

public final class PostCommonFunnel$funnelPerf$1 extends Lambda implements l	// class@0014a2
{
    public static final PostCommonFunnel$funnelPerf$1 INSTANCE;

    static {
       PostCommonFunnel$funnelPerf$1.INSTANCE = new PostCommonFunnel$funnelPerf$1();
    }
    public void PostCommonFunnel$funnelPerf$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       Performance$b obj = PatchProxy.applyOneRefs(p0, this, PostCommonFunnel$funnelPerf$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       obj = Performance.newBuilder();
       a.o(obj, "builder");
       String str = String.valueOf(System.currentTimeMillis());
       Objects.requireNonNull(obj);
       if (PatchProxy.applyOneRefs(str, obj, Performance$b.class, "3") != PatchProxyResult.class) {
       }else {
          obj.copyOnWrite();
          obj.instance.setTime(str);
       }
       str = String.valueOf(SystemUtil.y());
       if (PatchProxy.applyOneRefs(str, obj, Performance$b.class, "18") != PatchProxyResult.class) {
       }else {
          obj.copyOnWrite();
          obj.instance.setDiskMemory(str);
       }
       str = String.valueOf(SystemUtil.s(a.b()));
       if (PatchProxy.applyOneRefs(str, obj, Performance$b.class, "8") != PatchProxyResult.class) {
       }else {
          obj.copyOnWrite();
          obj.instance.setMemory(str);
       }
       Performance performance = obj.build();
       Objects.requireNonNull(p0);
       if (PatchProxy.applyOneRefs(performance, p0, PostFunnelStat$c.class, "169") != PatchProxyResult.class) {
       }else {
          p0.copyOnWrite();
          p0.instance.addPerfs(performance);
       }
       return "funnelPerf";
    }
}
