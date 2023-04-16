package com.kwai.feature.post.funnel.PostCommonFunnel$pageLifecycle$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kwai.feature.post.funnel.IPostFunnelLifecycleCallBack$Stage;
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
import com.kuaishou.protobuf.photo.funnel.PageInfo$b;
import com.kuaishou.protobuf.photo.funnel.PageInfo;
import java.lang.System;
import v46.a;
import java.lang.Enum;
import com.google.protobuf.GeneratedMessageLite;

public final class PostCommonFunnel$pageLifecycle$1 extends Lambda implements l	// class@0014a4
{
    public final Object $page;
    public final IPostFunnelLifecycleCallBack$Stage $stage;

    public void PostCommonFunnel$pageLifecycle$1(Object p0,IPostFunnelLifecycleCallBack$Stage p1){
       this.$page = p0;
       this.$stage = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       PageInfo$b obj1;
       List obj = PatchProxy.applyOneRefs(p0, this, PostCommonFunnel$pageLifecycle$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       obj = PatchProxy.apply(objArray, p0, PostFunnelStat$c.class, "152");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = Collections.unmodifiableList(p0.instance.getPagesList());
       }
       if (!q.f(obj)) {
          obj1 = PatchProxy.apply(objArray, p0, PostFunnelStat$c.class, "153");
          int i = (obj1 != PatchProxyResult.class)? obj1.intValue(): p0.instance.getPagesCount();
          if (i > 100) {
             return "pageLifecycle_full";
          }
       }
       obj1 = PageInfo.newBuilder();
       a.o(obj1, "builder");
       PostCommonFunnel$pageLifecycle$1 t$page = this.$page;
       Objects.requireNonNull(t$page, "null cannot be cast to non-null type kotlin.String");
       Objects.requireNonNull(obj1);
       if (PatchProxy.applyOneRefs(t$page, obj1, PageInfo$b.class, "3") != PatchProxyResult.class) {
       }else {
          obj1.copyOnWrite();
          obj1.instance.setName(t$page);
       }
       String str = String.valueOf(System.currentTimeMillis());
       if (PatchProxy.applyOneRefs(str, obj1, PageInfo$b.class, "13") != PatchProxyResult.class) {
       }else {
          obj1.copyOnWrite();
          obj1.instance.setTime(str);
       }
       int i1 = a.a[this.$stage.ordinal()];
       if (i1 != 1) {
          if (i1 != 2) {
             if (i1 != 3) {
                if (i1 != 4) {
                   if (i1 == 5) {
                      obj1.a("ON_DESTROY");
                   }
                }else {
                   obj1.a("ON_STOP");
                }
             }else {
                obj1.a("ON_RESUME");
             }
          }else {
             obj1.a("ON_VIEW_CREATE");
          }
       }else {
          obj1.a("ON_CREATE");
       }
       PageInfo pageInfo = obj1.build();
       if (PatchProxy.applyOneRefs(pageInfo, p0, PostFunnelStat$c.class, "157") != PatchProxyResult.class) {
       }else {
          p0.copyOnWrite();
          p0.instance.addPages(pageInfo);
       }
       return "pageLifecycle";
    }
}
