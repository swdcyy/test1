package com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$a;
import erd.r;
import java.lang.Object;
import hn1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import hn1.b$b;

public final class LiveHotSpotDetailCoreMediaAdapter$a implements r	// class@001377
{
    public static final LiveHotSpotDetailCoreMediaAdapter$a b;

    static {
       LiveHotSpotDetailCoreMediaAdapter$a.b = new LiveHotSpotDetailCoreMediaAdapter$a();
    }
    public void LiveHotSpotDetailCoreMediaAdapter$a(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveHotSpotDetailCoreMediaAdapter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = p0 instanceof b$b;
       }
       return b;
    }
}
