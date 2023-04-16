package com.kwai.component.saber.executor.e$a;
import pg5.c;
import com.kwai.component.saber.executor.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import rg5.c;

public class e$a implements c	// class@000b2f
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void onFailure(Throwable p0){
       PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2");
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       RxBus.f.b(new c());
       return;
    }
}
