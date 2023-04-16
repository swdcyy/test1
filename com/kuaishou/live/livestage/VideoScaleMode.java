package com.kuaishou.live.livestage.VideoScaleMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VideoScaleMode extends Enum	// class@000bdc
{
    public static final VideoScaleMode[] $VALUES;
    public static final VideoScaleMode CENTER_CROP;
    public static final VideoScaleMode CENTER_INSIDE;
    public static final VideoScaleMode NONE;

    static {
       VideoScaleMode videoScaleMo1;
       VideoScaleMode[] videoScaleMo = new VideoScaleMode[]{videoScaleMo1,videoScaleMo1,videoScaleMo1};
       videoScaleMo1 = new VideoScaleMode("NONE", 0);
       VideoScaleMode.NONE = videoScaleMo1;
       videoScaleMo1 = new VideoScaleMode("CENTER_CROP", 1);
       VideoScaleMode.CENTER_CROP = videoScaleMo1;
       videoScaleMo1 = new VideoScaleMode("CENTER_INSIDE", 2);
       VideoScaleMode.CENTER_INSIDE = videoScaleMo1;
       VideoScaleMode.$VALUES = videoScaleMo;
    }
    public void VideoScaleMode(String p0,int p1){
       super(p0, p1);
    }
    public static VideoScaleMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VideoScaleMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VideoScaleMode.class, p0);
    }
    public static VideoScaleMode[] values(){
       Object obj = PatchProxy.apply(null, null, VideoScaleMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VideoScaleMode.$VALUES.clone();
    }
}
