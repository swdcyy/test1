package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$k;
import t36.f$a;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import y80.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class KSDataManager$k implements f$a	// class@001a25
{
    public final KSTemplateDetailInfo a;

    public void KSDataManager$k(KSTemplateDetailInfo p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$k.class, "1")) {
       }else if(p0 != null){
          p0.Z0(this.a, false);
       }
       return;
    }
}
