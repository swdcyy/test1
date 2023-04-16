package com.kuaishou.krn.bridges.kds.event.BridgeEventManager$a;
import java.lang.ref.WeakReference;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.facebook.react.bridge.CatalystInstance;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BridgeEventManager$a	// class@000820
{
    public final WeakReference a;
    public final WeakReference b;
    public final String c;
    public final String d;

    public void BridgeEventManager$a(WeakReference p0,WeakReference p1,String p2,String p3){
       a.p(p0, "contextRef");
       a.p(p1, "catalystInstanceRef");
       a.p(p2, "type");
       a.p(p3, "listener");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final CatalystInstance a(){
       Object obj = PatchProxy.apply(null, this, BridgeEventManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.get();
    }
    public final String b(){
       return this.d;
    }
    public final String c(){
       return this.c;
    }
}
