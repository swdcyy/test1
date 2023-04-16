package com.yxcorp.gifshow.log.EditFunnel$funnelBody$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingViewModel;
import java.lang.Object;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat$c;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import x0c.c;
import java.util.Objects;
import com.kuaishou.protobuf.photo.funnel.BodyStat;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.photo.funnel.PostFunnelStat;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.photo.funnel.BodyStat$c;
import com.kuaishou.protobuf.photo.funnel.BodyStat$BodyItem$a;
import com.kuaishou.protobuf.photo.funnel.BodyStat$BodyItem;
import java.lang.Float;

public final class EditFunnel$funnelBody$1$1 extends Lambda implements l	// class@001ae6
{
    public final BodySlimmingViewModel $body;

    public void EditFunnel$funnelBody$1$1(BodySlimmingViewModel p0){
       this.$body = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c[] obj = PatchProxy.applyOneRefs(p0, this, EditFunnel$funnelBody$1$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       obj = this.$body.A0();
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       BodyStat uBodyStat = PatchProxy.apply(objArray, p0, PostFunnelStat$c.class, "49");
       if (uBodyStat != patchProxyRe) {
       }else {
          uBodyStat = p0.instance.getEditBody();
       }
       BodyStat$c uoc = uBodyStat.toBuilder();
       Objects.requireNonNull(uoc);
       if (PatchProxy.apply(objArray, uoc, BodyStat$c.class, "11") != patchProxyRe) {
       }else {
          uoc.copyOnWrite();
          uoc.instance.clearItem();
       }
       int i = 0;
       int len = obj.length;
       while (i < len) {
          BodyStat$BodyItem$a uBodyItem$a = BodyStat$BodyItem.newBuilder();
          a.o(uBodyItem$a, "b");
          String str = obj[i].a();
          Objects.requireNonNull(uBodyItem$a);
          if (PatchProxy.applyOneRefs(str, uBodyItem$a, BodyStat$BodyItem$a.class, "3") != patchProxyRe) {
          }else {
             uBodyItem$a.copyOnWrite();
             uBodyItem$a.instance.setName(str);
          }
          float f = obj[i].o();
          if (PatchProxy.isSupport(BodyStat$BodyItem$a.class) && PatchProxy.applyOneRefs(Float.valueOf(f), uBodyItem$a, BodyStat$BodyItem$a.class, "7") != patchProxyRe) {
          }else {
             uBodyItem$a.copyOnWrite();
             uBodyItem$a.instance.setValue(f);
          }
          BodyStat$BodyItem uBodyItem = uBodyItem$a.build();
          if (PatchProxy.applyOneRefs(uBodyItem, uoc, BodyStat$c.class, "6") != patchProxyRe) {
          }else {
             uoc.copyOnWrite();
             uoc.instance.addItem(uBodyItem);
          }
          i = i + 1;
       }
       p0.b(uoc.build());
       return "funnelBody";
    }
}
