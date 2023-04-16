package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$m0;
import t36.f$a;
import java.lang.String;
import java.lang.Object;
import y80.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class KSDataManager$m0 implements f$a	// class@001a28
{
    public final String a;
    public final boolean b;

    public void KSDataManager$m0(String p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$m0.class, "1")) {
       }else if(p0 != null){
          p0.w4(this.a, this.b);
       }
       return;
    }
}
