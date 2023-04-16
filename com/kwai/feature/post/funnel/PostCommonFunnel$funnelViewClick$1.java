package com.kwai.feature.post.funnel.PostCommonFunnel$funnelViewClick$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.photo.funnel.ViewClick$b;
import com.kuaishou.protobuf.photo.funnel.ViewClick;
import java.lang.System;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.res.Resources;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat;

public final class PostCommonFunnel$funnelViewClick$1 extends Lambda implements l	// class@0014a3
{
    public final String $tag;
    public final View $view;

    public void PostCommonFunnel$funnelViewClick$1(String p0,View p1){
       this.$tag = p0;
       this.$view = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       PostCommonFunnel$funnelViewClick$1 t$tag;
       ViewClick$b obj = PatchProxy.applyOneRefs(p0, this, PostCommonFunnel$funnelViewClick$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       obj = ViewClick.newBuilder();
       a.o(obj, "builder");
       String str = String.valueOf(System.currentTimeMillis());
       Objects.requireNonNull(obj);
       if (PatchProxy.applyOneRefs(str, obj, ViewClick$b.class, "8") != PatchProxyResult.class) {
       }else {
          obj.copyOnWrite();
          obj.instance.setTime(str);
       }
       if (!TextUtils.x(this.$tag)) {
          t$tag = this.$tag;
       }else {
          t$tag = this.$view;
          t$tag = (t$tag != null)? t$tag.getResources().getResourceName(this.$view.getId()): "";
       }
       if (PatchProxy.applyOneRefs(t$tag, obj, ViewClick$b.class, "3") != PatchProxyResult.class) {
       }else {
          obj.copyOnWrite();
          obj.instance.setId(t$tag);
       }
       ViewClick viewClick = obj.build();
       Objects.requireNonNull(p0);
       if (PatchProxy.applyOneRefs(viewClick, p0, PostFunnelStat$c.class, "145") != PatchProxyResult.class) {
       }else {
          p0.copyOnWrite();
          p0.instance.addClickEvents(viewClick);
       }
       return "funnelViewClick";
    }
}
