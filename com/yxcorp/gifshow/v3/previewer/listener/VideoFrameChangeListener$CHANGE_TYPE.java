package com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener$CHANGE_TYPE;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VideoFrameChangeListener$CHANGE_TYPE extends Enum	// class@0015e0
{
    public static final VideoFrameChangeListener$CHANGE_TYPE[] $VALUES;
    public static final VideoFrameChangeListener$CHANGE_TYPE AI_CUT;
    public static final VideoFrameChangeListener$CHANGE_TYPE FRAME_RATIO;
    public static final VideoFrameChangeListener$CHANGE_TYPE REVERT;
    public static final VideoFrameChangeListener$CHANGE_TYPE ROTATE;
    public static final VideoFrameChangeListener$CHANGE_TYPE SEGMENT_CHANGE;
    public static final VideoFrameChangeListener$CHANGE_TYPE VIDEO_ADD_DELETE;
    public static final VideoFrameChangeListener$CHANGE_TYPE VIDEO_CHANGE;

    static {
       VideoFrameChangeListener$CHANGE_TYPE uCHANGE_TYPE = new VideoFrameChangeListener$CHANGE_TYPE("FRAME_RATIO", 0);
       VideoFrameChangeListener$CHANGE_TYPE.FRAME_RATIO = uCHANGE_TYPE;
       VideoFrameChangeListener$CHANGE_TYPE uCHANGE_TYPE1 = new VideoFrameChangeListener$CHANGE_TYPE("ROTATE", 1);
       VideoFrameChangeListener$CHANGE_TYPE.ROTATE = uCHANGE_TYPE1;
       VideoFrameChangeListener$CHANGE_TYPE uCHANGE_TYPE2 = new VideoFrameChangeListener$CHANGE_TYPE("REVERT", 2);
       VideoFrameChangeListener$CHANGE_TYPE.REVERT = uCHANGE_TYPE2;
       VideoFrameChangeListener$CHANGE_TYPE uCHANGE_TYPE3 = new VideoFrameChangeListener$CHANGE_TYPE("SEGMENT_CHANGE", 3);
       VideoFrameChangeListener$CHANGE_TYPE.SEGMENT_CHANGE = uCHANGE_TYPE3;
       VideoFrameChangeListener$CHANGE_TYPE uCHANGE_TYPE4 = new VideoFrameChangeListener$CHANGE_TYPE("VIDEO_CHANGE", 4);
       VideoFrameChangeListener$CHANGE_TYPE.VIDEO_CHANGE = uCHANGE_TYPE4;
       VideoFrameChangeListener$CHANGE_TYPE uCHANGE_TYPE5 = new VideoFrameChangeListener$CHANGE_TYPE("VIDEO_ADD_DELETE", 5);
       VideoFrameChangeListener$CHANGE_TYPE.VIDEO_ADD_DELETE = uCHANGE_TYPE5;
       VideoFrameChangeListener$CHANGE_TYPE uCHANGE_TYPE6 = new VideoFrameChangeListener$CHANGE_TYPE("AI_CUT", 6);
       VideoFrameChangeListener$CHANGE_TYPE.AI_CUT = uCHANGE_TYPE6;
       VideoFrameChangeListener$CHANGE_TYPE[] uCHANGE_TYPE7 = new VideoFrameChangeListener$CHANGE_TYPE[]{uCHANGE_TYPE,uCHANGE_TYPE1,uCHANGE_TYPE2,uCHANGE_TYPE3,uCHANGE_TYPE4,uCHANGE_TYPE5,uCHANGE_TYPE6};
       VideoFrameChangeListener$CHANGE_TYPE.$VALUES = uCHANGE_TYPE7;
    }
    public void VideoFrameChangeListener$CHANGE_TYPE(String p0,int p1){
       super(p0, p1);
    }
    public static VideoFrameChangeListener$CHANGE_TYPE valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VideoFrameChangeListener$CHANGE_TYPE.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VideoFrameChangeListener$CHANGE_TYPE.class, p0);
    }
    public static VideoFrameChangeListener$CHANGE_TYPE[] values(){
       Object obj = PatchProxy.apply(null, null, VideoFrameChangeListener$CHANGE_TYPE.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VideoFrameChangeListener$CHANGE_TYPE.$VALUES.clone();
    }
}
