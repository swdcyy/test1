package com.yxcorp.gifshow.camera.record.CameraLogger$VideoRecStartType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CameraLogger$VideoRecStartType extends Enum	// class@001c8b
{
    public final String mElementName;
    public static final CameraLogger$VideoRecStartType[] $VALUES;
    public static final CameraLogger$VideoRecStartType LongClickRecord;
    public static final CameraLogger$VideoRecStartType SingleClickRecord;
    public static final CameraLogger$VideoRecStartType VolumeRecord;

    static {
       CameraLogger$VideoRecStartType videoRecStar = new CameraLogger$VideoRecStartType("SingleClickRecord", 0, "video_rec_click");
       CameraLogger$VideoRecStartType.SingleClickRecord = videoRecStar;
       CameraLogger$VideoRecStartType videoRecStar1 = new CameraLogger$VideoRecStartType("LongClickRecord", 1, "video_rec_click_log_press");
       CameraLogger$VideoRecStartType.LongClickRecord = videoRecStar1;
       CameraLogger$VideoRecStartType videoRecStar2 = new CameraLogger$VideoRecStartType("VolumeRecord", 2, "volume_button_start");
       CameraLogger$VideoRecStartType.VolumeRecord = videoRecStar2;
       CameraLogger$VideoRecStartType[] videoRecStar3 = new CameraLogger$VideoRecStartType[]{videoRecStar,videoRecStar1,videoRecStar2};
       CameraLogger$VideoRecStartType.$VALUES = videoRecStar3;
    }
    public void CameraLogger$VideoRecStartType(String p0,int p1,String p2){
       super(p0, p1);
       this.mElementName = p2;
    }
    public static CameraLogger$VideoRecStartType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CameraLogger$VideoRecStartType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CameraLogger$VideoRecStartType.class, p0);
    }
    public static CameraLogger$VideoRecStartType[] values(){
       Object obj = PatchProxy.apply(null, null, CameraLogger$VideoRecStartType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CameraLogger$VideoRecStartType.$VALUES.clone();
    }
}
