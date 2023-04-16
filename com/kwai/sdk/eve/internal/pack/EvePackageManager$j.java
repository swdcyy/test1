package com.kwai.sdk.eve.internal.pack.EvePackageManager$j;
import erd.g;
import com.kwai.sdk.eve.internal.pack.EvePackageManager;
import java.util.List;
import java.lang.Object;
import v97.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import xa7.c;
import rn7.d;
import java.lang.Throwable;

public final class EvePackageManager$j implements g	// class@001587
{
    public final EvePackageManager b;
    public final List c;

    public void EvePackageManager$j(EvePackageManager p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EvePackageManager$j.class, "1")) {
       }else {
          EveLog.i$default("EPM#requestServerPackage : updateTaskPackageByResponse ===> onResponse", false, 2, null);
          EvePackageManager$j tb = this.b;
          p0 = (p0 != null)? p0.data: null;
          tb.y(p0, this.c);
       }
       return;
    }
}
