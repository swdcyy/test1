package com.kuaishou.live.tuna.util.LiveTunaUtils$routeForLive$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import vq5.d;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LiveTunaUtils$routeForLive$1 extends Lambda implements a	// class@000fde
{
    public final d $liveRouterManager;
    public final String $scheme;

    public void LiveTunaUtils$routeForLive$1(d p0,String p1){
       this.$liveRouterManager = p0;
       this.$scheme = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, LiveTunaUtils$routeForLive$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "jump live route failed! liveRouterService:"+this.$liveRouterManager+", url:"+this.$scheme;
    }
}
