package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$n0;
import t36.f$a;
import java.util.List;
import java.lang.Object;
import y80.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class KSDataManager$n0 implements f$a	// class@001a2a
{
    public final List a;

    public void KSDataManager$n0(List p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$n0.class, "1")) {
       }else if(p0 != null){
          p0.f4(this.a);
       }
       return;
    }
}
