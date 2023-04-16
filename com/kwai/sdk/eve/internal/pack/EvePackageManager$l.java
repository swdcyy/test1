package com.kwai.sdk.eve.internal.pack.EvePackageManager$l;
import erd.a;
import com.kwai.sdk.eve.internal.pack.EvePackageManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EvePackageManager$l implements a	// class@001589
{
    public final EvePackageManager b;

    public void EvePackageManager$l(EvePackageManager p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EvePackageManager$l.class, "1")) {
          return;
       }
       EveLog.w$default("EPM#requestServerPackage : onComplete ===>", false, 2, null);
       this.b.c = false;
       return;
    }
}
