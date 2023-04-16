package com.kwai.kxb.update.KxbUpdateManager$b;
import erd.g;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import zu6.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.a0;
import io.reactivex.subjects.SingleSubject;

public final class KxbUpdateManager$b implements g	// class@000802
{
    public final Ref$ObjectRef b;

    public void KxbUpdateManager$b(Ref$ObjectRef p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KxbUpdateManager$b.class, "1")) {
       }else {
          this.b.element.onSuccess(p0);
       }
       return;
    }
}
