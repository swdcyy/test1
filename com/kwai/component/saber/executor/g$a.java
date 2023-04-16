package com.kwai.component.saber.executor.g$a;
import pg5.e;
import com.kwai.component.saber.executor.g;
import pg5.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class g$a implements e	// class@000b34
{
    public final c a;
    public final g b;

    public void g$a(g p0,c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onFailure(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "2")) {
          return;
       }
       this.a.onFailure(p0);
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       this.a.onSuccess();
       return;
    }
}
