package com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaLiveRouterHandleBridge$callback$$inlined$let$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import com.kuaishou.live.tuna.explain.view.bridge.invoker.TunaLiveRouterHandleBridge;
import xp3.c$a;
import xp3.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Objects;

public final class TunaLiveRouterHandleBridge$callback$$inlined$let$lambda$1 extends Lambda implements a	// class@000fad
{
    public final b $jsParams$inlined;
    public final c$a $resultBuilder$inlined;
    public final String $resultString;
    public final TunaLiveRouterHandleBridge this$0;

    public void TunaLiveRouterHandleBridge$callback$$inlined$let$lambda$1(String p0,TunaLiveRouterHandleBridge p1,c$a p2,b p3){
       this.$resultString = p0;
       this.this$0 = p1;
       this.$resultBuilder$inlined = p2;
       this.$jsParams$inlined = p3;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.applyWithListener(null, this, TunaLiveRouterHandleBridge$callback$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(this.this$0);
       PatchProxy.onMethodExit(TunaLiveRouterHandleBridge$callback$$inlined$let$lambda$1.class, "1");
       return "execute bridge "+"handleTunaLiveScheme"+", params:"+this.$jsParams$inlined+", result:"+this.$resultString;
    }
}
