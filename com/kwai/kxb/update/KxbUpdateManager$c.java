package com.kwai.kxb.update.KxbUpdateManager$c;
import erd.g;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.a0;
import io.reactivex.subjects.SingleSubject;

public final class KxbUpdateManager$c implements g	// class@000803
{
    public final Ref$ObjectRef b;

    public void KxbUpdateManager$c(Ref$ObjectRef p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KxbUpdateManager$c.class, "1")) {
       }else {
          this.b.element.onError(p0);
       }
       return;
    }
}
