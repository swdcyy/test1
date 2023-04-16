package com.kuaishou.live.core.voiceparty.playway.video.livestage.VideoLegacyLayoutConfigDelegate$Companion$factory$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.util.Set;
import ts2.f;
import com.kuaishou.live.core.voiceparty.playway.video.livestage.VideoLegacyLayoutConfigDelegate;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class VideoLegacyLayoutConfigDelegate$Companion$factory$1 extends Lambda implements p	// class@0018dd
{
    public final Set $forceOpenVideoUsers;

    public void VideoLegacyLayoutConfigDelegate$Companion$factory$1(Set p0){
       this.$forceOpenVideoUsers = p0;
       super(2);
    }
    public final VideoLegacyLayoutConfigDelegate invoke(f p0,p p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, VideoLegacyLayoutConfigDelegate$Companion$factory$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "micSeatStateService");
       a.p(p1, "layoutConfigBuilder");
       return new VideoLegacyLayoutConfigDelegate(p0, p1, this.$forceOpenVideoUsers);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
