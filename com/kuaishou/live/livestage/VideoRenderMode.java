package com.kuaishou.live.livestage.VideoRenderMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VideoRenderMode extends Enum	// class@000bdb
{
    public static final VideoRenderMode[] $VALUES;
    public static final VideoRenderMode ALWAYS;
    public static final VideoRenderMode NONE;

    static {
       VideoRenderMode videoRenderM1;
       VideoRenderMode[] videoRenderM = new VideoRenderMode[]{videoRenderM1,videoRenderM1};
       videoRenderM1 = new VideoRenderMode("ALWAYS", 0);
       VideoRenderMode.ALWAYS = videoRenderM1;
       videoRenderM1 = new VideoRenderMode("NONE", 1);
       VideoRenderMode.NONE = videoRenderM1;
       VideoRenderMode.$VALUES = videoRenderM;
    }
    public void VideoRenderMode(String p0,int p1){
       super(p0, p1);
    }
    public static VideoRenderMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VideoRenderMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VideoRenderMode.class, p0);
    }
    public static VideoRenderMode[] values(){
       Object obj = PatchProxy.apply(null, null, VideoRenderMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VideoRenderMode.$VALUES.clone();
    }
}
