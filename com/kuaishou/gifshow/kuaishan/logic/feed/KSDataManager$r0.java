package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$r0;
import t36.f$a;
import java.lang.String;
import java.lang.Object;
import y80.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class KSDataManager$r0 implements f$a	// class@001a32
{
    public final String a;

    public void KSDataManager$r0(String p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$r0.class, "1")) {
       }else if(p0 != null){
          p0.A6(this.a);
       }
       return;
    }
}
