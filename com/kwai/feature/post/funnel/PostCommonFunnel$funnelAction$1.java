package com.kwai.feature.post.funnel.PostCommonFunnel$funnelAction$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.post.funnel.PostCommonFunnel$a;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.List;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat;
import java.util.Collections;
import java.util.Collection;
import ekd.q;
import java.lang.Number;
import com.kuaishou.protobuf.photo.funnel.Action$b;
import com.kuaishou.protobuf.photo.funnel.Action;
import java.lang.System;
import com.google.protobuf.GeneratedMessageLite;

public final class PostCommonFunnel$funnelAction$1 extends Lambda implements l	// class@0014a1
{
    public final PostCommonFunnel$a $action;

    public void PostCommonFunnel$funnelAction$1(PostCommonFunnel$a p0){
       this.$action = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       Action$b obj1;
       List obj = PatchProxy.applyOneRefs(p0, this, PostCommonFunnel$funnelAction$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       obj = PatchProxy.apply(objArray, p0, PostFunnelStat$c.class, "128");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = Collections.unmodifiableList(p0.instance.getActionsList());
       }
       if (!q.f(obj)) {
          obj1 = PatchProxy.apply(objArray, p0, PostFunnelStat$c.class, "129");
          int i = (obj1 != PatchProxyResult.class)? obj1.intValue(): p0.instance.getActionsCount();
          if (i > 100) {
             return "funnelAction_full";
          }
       }
       obj1 = Action.newBuilder();
       a.o(obj1, "builder");
       String str = this.$action.a();
       Objects.requireNonNull(obj1);
       if (PatchProxy.applyOneRefs(str, obj1, Action$b.class, "3") != PatchProxyResult.class) {
       }else {
          obj1.copyOnWrite();
          obj1.instance.setName(str);
       }
       str = String.valueOf(System.currentTimeMillis());
       if (PatchProxy.applyOneRefs(str, obj1, Action$b.class, "8") != PatchProxyResult.class) {
       }else {
          obj1.copyOnWrite();
          obj1.instance.setTime(str);
       }
       Action uAction = obj1.build();
       if (PatchProxy.applyOneRefs(uAction, p0, PostFunnelStat$c.class, "133") != PatchProxyResult.class) {
       }else {
          p0.copyOnWrite();
          p0.instance.addActions(uAction);
       }
       return "funnelAction";
    }
}
