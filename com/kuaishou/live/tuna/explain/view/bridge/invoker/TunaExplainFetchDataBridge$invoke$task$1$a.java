package com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaExplainFetchDataBridge$invoke$task$1$a;
import java.lang.Runnable;
import com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaExplainFetchDataBridge$invoke$task$1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tx4.h;

public final class TunaExplainFetchDataBridge$invoke$task$1$a implements Runnable	// class@000fab
{
    public final TunaExplainFetchDataBridge$invoke$task$1 b;
    public final String c;

    public void TunaExplainFetchDataBridge$invoke$task$1$a(TunaExplainFetchDataBridge$invoke$task$1 p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TunaExplainFetchDataBridge$invoke$task$1$a.class, "1")) {
          return;
       }
       TunaExplainFetchDataBridge$invoke$task$1 e = this.b.e;
       if (e != null) {
          Object[] objArray = new Object[]{this.c};
          e.call(objArray);
       }
       return;
    }
}
