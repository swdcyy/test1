package com.yxcorp.gifshow.activity.share.util.PublishFunnel$funnelPublish$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.upload.UploadRequest$a;
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
import com.yxcorp.gifshow.upload.UploadRequest;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;

public final class PublishFunnel$funnelPublish$$inlined$let$lambda$1 extends Lambda implements l	// class@001489
{
    public final UploadRequest$a $uploadBuilder$inlined;

    public void PublishFunnel$funnelPublish$$inlined$let$lambda$1(UploadRequest$a p0){
       this.$uploadBuilder$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(PostFunnelStat$c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PublishStat$b obj = PatchProxy.applyOneRefsWithListener(p0, this, PublishFunnel$funnelPublish$$inlined$let$lambda$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       obj = p0.getPublish().toBuilder();
       UploadRequest uploadReques = this.$uploadBuilder$inlined.a();
       a.o(obj, "builder");
       String str = 1;
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(PublishStat$b.class) && PatchProxy.applyOneRefs(Boolean.TRUE, obj, PublishStat$b.class, "5") != patchProxyRe) {
       }else {
          obj.copyOnWrite();
          obj.instance.setHasPublished(str);
       }
       a.o(uploadReques, "request");
       str = uploadReques.getCaption();
       if (PatchProxy.applyOneRefs(str, obj, PublishStat$b.class, "12") != patchProxyRe) {
       }else {
          obj.copyOnWrite();
          obj.instance.setHashTags(str);
       }
       PhotoVisibility mName = uploadReques.getVisibility().mName;
       if (PatchProxy.applyOneRefs(mName, obj, PublishStat$b.class, "17") != patchProxyRe) {
       }else {
          obj.copyOnWrite();
          obj.instance.setPrivacy(mName);
       }
       p0.f(obj.build());
       PatchProxy.onMethodExit(PublishFunnel$funnelPublish$$inlined$let$lambda$1.class, "1");
       return "funnelPublish";
    }
}
