package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$z;
import erd.a;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashSet;

public final class KSDataManager$z implements a	// class@001a3d
{
    public final KSDataManager b;
    public final String c;

    public void KSDataManager$z(KSDataManager p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KSDataManager$z.class, "1")) {
          return;
       }
       this.b.i.remove(this.c);
       return;
    }
}
