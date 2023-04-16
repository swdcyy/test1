package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$h0;
import erd.a;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashSet;

public final class KSDataManager$h0 implements a	// class@001a1e
{
    public final KSDataManager b;
    public final String c;

    public void KSDataManager$h0(KSDataManager p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KSDataManager$h0.class, "1")) {
          return;
       }
       this.b.i.remove(this.c);
       return;
    }
}
