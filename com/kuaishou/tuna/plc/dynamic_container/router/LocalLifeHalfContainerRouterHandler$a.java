package com.kuaishou.tuna.plc.dynamic_container.router.LocalLifeHalfContainerRouterHandler$a;
import java.lang.Runnable;
import com.kuaishou.tuna.plc.dynamic_container.router.LocalLifeHalfContainerRouterHandler;
import android.content.Intent;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LocalLifeHalfContainerRouterHandler$a implements Runnable	// class@000ff5
{
    public final LocalLifeHalfContainerRouterHandler b;
    public final Intent c;
    public final Context d;

    public void LocalLifeHalfContainerRouterHandler$a(LocalLifeHalfContainerRouterHandler p0,Intent p1,Context p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LocalLifeHalfContainerRouterHandler$a.class, "1")) {
          return;
       }
       this.b.e(this.c, this.d);
       return;
    }
}
