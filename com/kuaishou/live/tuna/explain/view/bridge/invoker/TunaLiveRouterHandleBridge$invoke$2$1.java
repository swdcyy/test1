package com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaLiveRouterHandleBridge$invoke$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaLiveRouterHandleBridge$invoke$2;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaLiveRouterHandleBridge$invoke$2$1 extends Lambda implements a	// class@000faf
{
    public final TunaLiveRouterHandleBridge$invoke$2 this$0;

    public void TunaLiveRouterHandleBridge$invoke$2$1(TunaLiveRouterHandleBridge$invoke$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaLiveRouterHandleBridge$invoke$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "tuna explain tk krouter route failed! url:"+this.this$0.c;
    }
}
