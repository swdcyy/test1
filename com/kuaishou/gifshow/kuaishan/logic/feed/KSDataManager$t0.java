package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$t0;
import t36.f$a;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import y80.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class KSDataManager$t0 implements f$a	// class@001a36
{
    public final KSTemplateDetailInfo a;
    public final int b;

    public void KSDataManager$t0(KSTemplateDetailInfo p0,int p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$t0.class, "1")) {
       }else if(p0 != null){
          p0.R(this.a, this.b);
       }
       return;
    }
}
