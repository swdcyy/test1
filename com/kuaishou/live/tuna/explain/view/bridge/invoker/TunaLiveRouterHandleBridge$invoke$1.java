package com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaLiveRouterHandleBridge$invoke$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaLiveRouterHandleBridge$invoke$1 extends Lambda implements a	// class@000fae
{
    public final String $scheme;

    public void TunaLiveRouterHandleBridge$invoke$1(String p0){
       this.$scheme = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, TunaLiveRouterHandleBridge$invoke$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "tk tuna explain handle router url: "+this.$scheme;
    }
}
