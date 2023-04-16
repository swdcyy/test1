package com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSUploaderKitCommon$Status extends Enum	// class@000970
{
    public static final KSUploaderKitCommon$Status[] $VALUES;
    public static final KSUploaderKitCommon$Status Cancel;
    public static final KSUploaderKitCommon$Status Fail;
    public static final KSUploaderKitCommon$Status Pause;
    public static final KSUploaderKitCommon$Status Resume;
    public static final KSUploaderKitCommon$Status Start;
    public static final KSUploaderKitCommon$Status Success;

    static {
       KSUploaderKitCommon$Status status = new KSUploaderKitCommon$Status("Success", 0);
       KSUploaderKitCommon$Status.Success = status;
       KSUploaderKitCommon$Status status1 = new KSUploaderKitCommon$Status("Fail", 1);
       KSUploaderKitCommon$Status.Fail = status1;
       KSUploaderKitCommon$Status status2 = new KSUploaderKitCommon$Status("Cancel", 2);
       KSUploaderKitCommon$Status.Cancel = status2;
       KSUploaderKitCommon$Status status3 = new KSUploaderKitCommon$Status("Start", 3);
       KSUploaderKitCommon$Status.Start = status3;
       KSUploaderKitCommon$Status status4 = new KSUploaderKitCommon$Status("Pause", 4);
       KSUploaderKitCommon$Status.Pause = status4;
       KSUploaderKitCommon$Status status5 = new KSUploaderKitCommon$Status("Resume", 5);
       KSUploaderKitCommon$Status.Resume = status5;
       KSUploaderKitCommon$Status[] statusArray = new KSUploaderKitCommon$Status[]{status,status1,status2,status3,status4,status5};
       KSUploaderKitCommon$Status.$VALUES = statusArray;
    }
    public void KSUploaderKitCommon$Status(String p0,int p1){
       super(p0, p1);
    }
    public static KSUploaderKitCommon$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSUploaderKitCommon$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSUploaderKitCommon$Status.class, p0);
    }
    public static KSUploaderKitCommon$Status[] values(){
       Object obj = PatchProxy.apply(null, null, KSUploaderKitCommon$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSUploaderKitCommon$Status.$VALUES.clone();
    }
}
