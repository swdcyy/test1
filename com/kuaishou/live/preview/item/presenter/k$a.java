package com.kuaishou.live.preview.item.presenter.k$a;
import sfc.a;
import com.kuaishou.live.preview.item.presenter.k;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class k$a extends a	// class@000e2c
{
    public final k c;

    public void k$a(k p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
          return;
       }
       this.c.X8();
       return;
    }
}
