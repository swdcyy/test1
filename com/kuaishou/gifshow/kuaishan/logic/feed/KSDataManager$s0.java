package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$s0;
import t36.f$a;
import java.lang.String;
import java.lang.Object;
import y80.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class KSDataManager$s0 implements f$a	// class@001a34
{
    public final String a;
    public final int b;

    public void KSDataManager$s0(String p0,int p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$s0.class, "1")) {
       }else if(p0 != null){
          p0.R3(this.a, this.b);
       }
       return;
    }
}
