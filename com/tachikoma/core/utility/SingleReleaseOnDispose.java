package com.tachikoma.core.utility.SingleReleaseOnDispose;
import brd.a0;
import brd.e0;
import erd.g;
import brd.d0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tachikoma.core.utility.SingleReleaseOnDispose$DoOnDisposeObserver;

public class SingleReleaseOnDispose extends a0	// class@000dd1
{
    public final e0 b;
    public final g c;

    public void SingleReleaseOnDispose(e0 p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SingleReleaseOnDispose.class, "1")) {
          return;
       }
       this.b.b(new SingleReleaseOnDispose$DoOnDisposeObserver(p0, this.c));
       return;
    }
}
