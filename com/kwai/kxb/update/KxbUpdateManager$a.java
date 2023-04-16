package com.kwai.kxb.update.KxbUpdateManager$a;
import erd.g;
import com.kwai.kxb.update.KxbUpdateManager;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.String;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.kxb.update.KxbUpdateManager$update$1$1;
import msd.a;
import ev6.f;

public final class KxbUpdateManager$a implements g	// class@000801
{
    public final KxbUpdateManager b;
    public final Ref$ObjectRef c;
    public final String d;

    public void KxbUpdateManager$a(KxbUpdateManager p0,Ref$ObjectRef p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KxbUpdateManager$a.class, "1")) {
       }else {
          f.c(new KxbUpdateManager$update$1$1(this));
       }
       return;
    }
}
