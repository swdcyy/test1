package com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceCameraLifecycleLogic$b;
import erd.o;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.video.camera.a;

public final class AudienceCameraLifecycleLogic$b implements o	// class@0018bb
{
    public static final AudienceCameraLifecycleLogic$b b;

    static {
       AudienceCameraLifecycleLogic$b.b = new AudienceCameraLifecycleLogic$b();
    }
    public void AudienceCameraLifecycleLogic$b(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, AudienceCameraLifecycleLogic$b.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = p0.flatMap(a.b);
       }
       return ot;
    }
}
