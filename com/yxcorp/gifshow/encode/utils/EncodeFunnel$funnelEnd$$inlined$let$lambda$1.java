package com.yxcorp.gifshow.encode.utils.EncodeFunnel$funnelEnd$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
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
import rca.a;
import java.lang.Enum;
import com.kuaishou.protobuf.photo.funnel.EncodeStat$Status;

public final class EncodeFunnel$funnelEnd$$inlined$let$lambda$1 extends Lambda implements l	// class@000d50
{
    public final EncodeInfo$Status $encode$inlined;

    public void EncodeFunnel$funnelEnd$$inlined$let$lambda$1(EncodeInfo$Status p0){
       this.$encode$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       EncodeStat$Status cANCEL;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       EncodeStat$b obj = PatchProxy.applyOneRefsWithListener(p0, this, EncodeFunnel$funnelEnd$$inlined$let$lambda$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       obj = p0.getEncode().toBuilder();
       a.o(obj, "builder");
       EncodeStat encode = p0.getEncode();
       a.o(encode, "it.encode");
       long l = System.currentTimeMillis() - encode.getStartTimeStamp();
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(EncodeStat$b.class) && PatchProxy.applyOneRefs(Long.valueOf(l), obj, EncodeStat$b.class, "5") != patchProxyRe) {
       }else {
          obj.copyOnWrite();
          obj.instance.setEncodeCost(l);
       }
       EncodeFunnel$funnelEnd$$inlined$let$lambda$1 t$encode$inl = this.$encode$inlined;
       if (t$encode$inl == null) {
       label_0071 :
          cANCEL = EncodeStat$Status.CANCEL;
       }else {
          int i = a.a[t$encode$inl.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   goto label_0071 ;
                }else {
                   cANCEL = EncodeStat$Status.SUCCESS;
                }
             }else {
                cANCEL = EncodeStat$Status.FAIL;
             }
          }else {
             cANCEL = EncodeStat$Status.CANCEL;
          }
       }
       if (PatchProxy.applyOneRefs(cANCEL, obj, EncodeStat$b.class, "10") != patchProxyRe) {
       }else {
          obj.copyOnWrite();
          obj.instance.setStatus(cANCEL);
       }
       p0.c(obj.build());
       PatchProxy.onMethodExit(EncodeFunnel$funnelEnd$$inlined$let$lambda$1.class, "1");
       return "funnelEnd";
    }
}
