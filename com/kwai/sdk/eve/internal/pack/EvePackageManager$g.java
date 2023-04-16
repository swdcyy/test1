package com.kwai.sdk.eve.internal.pack.EvePackageManager$g;
import erd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EvePackageManager$g implements a	// class@001584
{
    public static final EvePackageManager$g b;

    static {
       EvePackageManager$g.b = new EvePackageManager$g();
    }
    public void EvePackageManager$g(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EvePackageManager$g.class, "1")) {
          return;
       }
       EveLog.w$default("EPM#requestServerPackage : onComplete ===>", false, 2, null);
       return;
    }
}
