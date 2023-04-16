package com.yxcorp.gifshow.camera.record.photo.event.TakePictureEvent$TakePictureStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TakePictureEvent$TakePictureStatus extends Enum	// class@000ea8
{
    public static final TakePictureEvent$TakePictureStatus[] $VALUES;
    public static final TakePictureEvent$TakePictureStatus BEGIN;
    public static final TakePictureEvent$TakePictureStatus FAILED;
    public static final TakePictureEvent$TakePictureStatus SUCCESS;

    static {
       TakePictureEvent$TakePictureStatus takePictureS = new TakePictureEvent$TakePictureStatus("BEGIN", 0);
       TakePictureEvent$TakePictureStatus.BEGIN = takePictureS;
       TakePictureEvent$TakePictureStatus takePictureS1 = new TakePictureEvent$TakePictureStatus("SUCCESS", 1);
       TakePictureEvent$TakePictureStatus.SUCCESS = takePictureS1;
       TakePictureEvent$TakePictureStatus takePictureS2 = new TakePictureEvent$TakePictureStatus("FAILED", 2);
       TakePictureEvent$TakePictureStatus.FAILED = takePictureS2;
       TakePictureEvent$TakePictureStatus[] takePictureS3 = new TakePictureEvent$TakePictureStatus[]{takePictureS,takePictureS1,takePictureS2};
       TakePictureEvent$TakePictureStatus.$VALUES = takePictureS3;
    }
    public void TakePictureEvent$TakePictureStatus(String p0,int p1){
       super(p0, p1);
    }
    public static TakePictureEvent$TakePictureStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TakePictureEvent$TakePictureStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TakePictureEvent$TakePictureStatus.class, p0);
    }
    public static TakePictureEvent$TakePictureStatus[] values(){
       Object obj = PatchProxy.apply(null, null, TakePictureEvent$TakePictureStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TakePictureEvent$TakePictureStatus.$VALUES.clone();
    }
}
