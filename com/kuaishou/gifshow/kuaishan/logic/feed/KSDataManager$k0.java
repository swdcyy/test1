package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$k0;
import erd.o;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import java.lang.StringBuilder;

public final class KSDataManager$k0 implements o	// class@001a24
{
    public final String b;

    public void KSDataManager$k0(String p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       KSTemplateDetailInfo kSTemplateDe = PatchProxy.applyOneRefs(p0, this, KSDataManager$k0.class, "1");
       if (kSTemplateDe != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          if (!p0.isEmpty()) {
             kSTemplateDe = p0.get(0).toKSTemplateDetailInfo();
          }else {
             throw new KSException(-12, "cant find template "+this.b);
          }
       }
       return kSTemplateDe;
    }
}
