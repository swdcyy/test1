package com.tachikoma.component.common.refresh.TKRefreshControl2$a;
import java.lang.Runnable;
import com.tachikoma.component.common.refresh.TKRefreshControl2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKRefreshControl2$a implements Runnable	// class@000ce4
{
    public final TKRefreshControl2 b;

    public void TKRefreshControl2$a(TKRefreshControl2 p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKRefreshControl2$a.class, "1")) {
          return;
       }
       this.b.destroyOnMainThread();
       return;
    }
}
