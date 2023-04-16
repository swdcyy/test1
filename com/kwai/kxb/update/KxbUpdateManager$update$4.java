package com.kwai.kxb.update.KxbUpdateManager$update$4;
import erd.a;
import com.kwai.kxb.update.KxbUpdateManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.kxb.update.KxbUpdateManager$update$4$1;
import msd.a;
import ev6.f;

public final class KxbUpdateManager$update$4 implements a	// class@000806
{
    public final KxbUpdateManager b;
    public final String c;

    public void KxbUpdateManager$update$4(KxbUpdateManager p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KxbUpdateManager$update$4.class, "1")) {
          return;
       }
       f.c(new KxbUpdateManager$update$4$1(this));
       return;
    }
}
