package com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$d;
import erd.r;
import java.lang.Object;
import hn1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import hn1.b$a;

public final class LiveHotSpotDetailCoreMediaAdapter$d implements r	// class@00137a
{
    public static final LiveHotSpotDetailCoreMediaAdapter$d b;

    static {
       LiveHotSpotDetailCoreMediaAdapter$d.b = new LiveHotSpotDetailCoreMediaAdapter$d();
    }
    public void LiveHotSpotDetailCoreMediaAdapter$d(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveHotSpotDetailCoreMediaAdapter$d.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = p0 instanceof b$a;
       }
       return b;
    }
}
