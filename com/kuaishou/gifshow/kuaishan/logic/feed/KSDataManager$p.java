package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$p;
import erd.a;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashSet;

public final class KSDataManager$p implements a	// class@001a2f
{
    public final KSDataManager b;
    public final String c;

    public void KSDataManager$p(KSDataManager p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KSDataManager$p.class, "1")) {
          return;
       }
       this.b.i.remove(this.c);
       return;
    }
}
