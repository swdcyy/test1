package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$q0;
import t36.f$a;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.Object;
import y80.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;

public final class KSDataManager$q0 implements f$a	// class@001a30
{
    public final KSDataManager a;
    public final int b;

    public void KSDataManager$q0(KSDataManager p0,int p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$q0.class, "1")) {
       }else if(p0 != null){
          KSDataManager n = this.a.n;
          a.m(n);
          p0.R(n, this.b);
       }
       return;
    }
}
