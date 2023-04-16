package com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1;
import d02.a;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$mDependenceProvider$1;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl;
import msd.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1$playerViewLocator$1;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1$playerViewVisibilityListener$1;

public final class LiveLiteMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1 implements a	// class@001e04
{
    public final LiveLiteMultiInteractManagerImpl$mDependenceProvider$1 a;

    public void LiveLiteMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1(LiveLiteMultiInteractManagerImpl$mDependenceProvider$1 p0){
       this.a = p0;
       super();
    }
    public LivePlayerController a(){
       return this.a.a.J;
    }
    public l b(){
       Object obj = PatchProxy.apply(null, this, LiveLiteMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1$playerViewLocator$1(this);
    }
    public l c(){
       Object obj = PatchProxy.apply(null, this, LiveLiteMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1$playerViewVisibilityListener$1(this);
    }
}
