package com.kuaishou.live.core.voiceparty.playway.video.livestage.VideoLegacyLayoutConfigDelegate$Companion;
import java.lang.Object;
import nsd.u;
import java.util.Set;
import msd.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.video.livestage.VideoLegacyLayoutConfigDelegate$Companion$factory$1;

public final class VideoLegacyLayoutConfigDelegate$Companion	// class@0018de
{

    public void VideoLegacyLayoutConfigDelegate$Companion(){
       super();
    }
    public void VideoLegacyLayoutConfigDelegate$Companion(u p0){
       super();
    }
    public final p a(Set p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoLegacyLayoutConfigDelegate$Companion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "forceOpenVideoUsers");
       return new VideoLegacyLayoutConfigDelegate$Companion$factory$1(p0);
    }
}
