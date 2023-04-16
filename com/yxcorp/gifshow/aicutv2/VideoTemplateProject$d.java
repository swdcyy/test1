package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$d;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import kotlin.jvm.internal.a;
import h69.g;
import q87.c;

public final class VideoTemplateProject$d implements o	// class@001980
{
    public static final VideoTemplateProject$d b;

    static {
       VideoTemplateProject$d.b = new VideoTemplateProject$d();
    }
    public void VideoTemplateProject$d(){
       super();
    }
    public Object apply(Object p0){
       AICutMusicInfo uAICutMusicI = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$d.class, "1");
       if (uAICutMusicI != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          g.D().z("VideoTemplateProject", "changeStyle music failed:", p0);
          uAICutMusicI = new AICutMusicInfo();
       }
       return uAICutMusicI;
    }
}
