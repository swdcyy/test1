package com.kuaishou.live.livestage.videopipe.renderarea.VideoRenderDataFlow$a;
import erd.g;
import com.kuaishou.live.livestage.videopipe.renderarea.VideoRenderDataFlow;
import java.lang.Object;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class VideoRenderDataFlow$a implements g	// class@000c08
{
    public final VideoRenderDataFlow b;

    public void VideoRenderDataFlow$a(VideoRenderDataFlow p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoRenderDataFlow$a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.a(p0, "PlayerFlv");
       }
       return;
    }
}
