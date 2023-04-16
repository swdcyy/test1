package com.yxcorp.gifshow.camerasdk.videosourcelayout.VideoSourceLayoutFactory$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VideoSourceLayoutFactory$Type extends Enum	// class@001050
{
    public static final VideoSourceLayoutFactory$Type[] $VALUES;
    public static final VideoSourceLayoutFactory$Type BottomCameraTopVideoLayout;
    public static final VideoSourceLayoutFactory$Type LeftCameraRightVideoLayout;
    public static final VideoSourceLayoutFactory$Type LeftTopVideoLayout;
    public static final VideoSourceLayoutFactory$Type RightCameraLeftVideoLayout;
    public static final VideoSourceLayoutFactory$Type TopCameraBottomVideoLayout;

    static {
       VideoSourceLayoutFactory$Type type = new VideoSourceLayoutFactory$Type("LeftCameraRightVideoLayout", 0);
       VideoSourceLayoutFactory$Type.LeftCameraRightVideoLayout = type;
       VideoSourceLayoutFactory$Type type1 = new VideoSourceLayoutFactory$Type("RightCameraLeftVideoLayout", 1);
       VideoSourceLayoutFactory$Type.RightCameraLeftVideoLayout = type1;
       VideoSourceLayoutFactory$Type type2 = new VideoSourceLayoutFactory$Type("TopCameraBottomVideoLayout", 2);
       VideoSourceLayoutFactory$Type.TopCameraBottomVideoLayout = type2;
       VideoSourceLayoutFactory$Type type3 = new VideoSourceLayoutFactory$Type("BottomCameraTopVideoLayout", 3);
       VideoSourceLayoutFactory$Type.BottomCameraTopVideoLayout = type3;
       VideoSourceLayoutFactory$Type type4 = new VideoSourceLayoutFactory$Type("LeftTopVideoLayout", 4);
       VideoSourceLayoutFactory$Type.LeftTopVideoLayout = type4;
       VideoSourceLayoutFactory$Type[] typeArray = new VideoSourceLayoutFactory$Type[]{type,type1,type2,type3,type4};
       VideoSourceLayoutFactory$Type.$VALUES = typeArray;
    }
    public void VideoSourceLayoutFactory$Type(String p0,int p1){
       super(p0, p1);
    }
    public static VideoSourceLayoutFactory$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VideoSourceLayoutFactory$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VideoSourceLayoutFactory$Type.class, p0);
    }
    public static VideoSourceLayoutFactory$Type[] values(){
       Object obj = PatchProxy.apply(null, null, VideoSourceLayoutFactory$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VideoSourceLayoutFactory$Type.$VALUES.clone();
    }
}
