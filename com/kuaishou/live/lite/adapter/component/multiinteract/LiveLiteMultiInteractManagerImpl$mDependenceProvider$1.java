package com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$mDependenceProvider$1;
import d02.b;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl;
import java.lang.Object;
import msd.a;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$mDependenceProvider$1$commonEngineSupplier$1;
import com.kuaishou.live.common.core.component.livestage.a;
import d02.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1;

public final class LiveLiteMultiInteractManagerImpl$mDependenceProvider$1 implements b	// class@001e05
{
    public final LiveLiteMultiInteractManagerImpl a;

    public void LiveLiteMultiInteractManagerImpl$mDependenceProvider$1(LiveLiteMultiInteractManagerImpl p0){
       this.a = p0;
       super();
    }
    public a a(){
       return LiveLiteMultiInteractManagerImpl$mDependenceProvider$1$commonEngineSupplier$1.INSTANCE;
    }
    public a b(){
       return this.a.C;
    }
    public a c(){
       Object obj = PatchProxy.apply(null, this, LiveLiteMultiInteractManagerImpl$mDependenceProvider$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1(this);
    }
}
