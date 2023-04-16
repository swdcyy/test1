package com.kwai.sdk.eve.internal.pack.EvePackageManager$f;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EvePackageManager$f implements g	// class@001583
{
    public static final EvePackageManager$f b;

    static {
       EvePackageManager$f.b = new EvePackageManager$f();
    }
    public void EvePackageManager$f(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EvePackageManager$f.class, "1")) {
       }else {
          a.o(p0, "error");
          EveLog.e$default("EPM#requestServerPackage : onError = ", p0, false, 4, null);
       }
       return;
    }
}
