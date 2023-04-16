package com.kwai.sdk.eve.internal.pack.EvePackageManager$k;
import erd.g;
import com.kwai.sdk.eve.internal.pack.EvePackageManager;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EvePackageManager$k implements g	// class@001588
{
    public final EvePackageManager b;

    public void EvePackageManager$k(EvePackageManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EvePackageManager$k.class, "1")) {
       }else {
          EveLog.e$default("EPM#requestServerPackage : onError = "+p0, false, 2, null);
          p0.c = false;
       }
       return;
    }
}
