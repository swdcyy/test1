package com.kwai.sdk.eve.EveManager$d;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$d;
import java.lang.Object;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.pack.EvePackageManager$d$a;
import tn7.b;
import com.kwai.sdk.eve.EveManager;
import com.kwai.sdk.eve.internal.task.EveTaskManager;

public final class EveManager$d implements EvePackageManager$d	// class@001439
{

    public void EveManager$d(){
       super();
    }
    public void a(EveServerPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveManager$d.class, "2")) {
          return;
       }
       a.p(p0, "serverPackage");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, EvePackageManager$d$a.class, "1")) {
          a.p(p0, "serverPackage");
       }
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveManager$d.class, "1")) {
          return;
       }
       a.p(p0, "taskPackage");
       EveManager.a(EveManager.p).h(p0);
       return;
    }
}
