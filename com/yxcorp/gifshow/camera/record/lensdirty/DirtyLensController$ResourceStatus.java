package com.yxcorp.gifshow.camera.record.lensdirty.DirtyLensController$ResourceStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DirtyLensController$ResourceStatus extends Enum	// class@000e11
{
    public static final DirtyLensController$ResourceStatus[] $VALUES;
    public static final DirtyLensController$ResourceStatus DETECTED;
    public static final DirtyLensController$ResourceStatus DETECTING;
    public static final DirtyLensController$ResourceStatus DOWNLOADING;
    public static final DirtyLensController$ResourceStatus UNDETECTED;

    static {
       DirtyLensController$ResourceStatus resourceStat = new DirtyLensController$ResourceStatus("UNDETECTED", 0);
       DirtyLensController$ResourceStatus.UNDETECTED = resourceStat;
       DirtyLensController$ResourceStatus resourceStat1 = new DirtyLensController$ResourceStatus("DETECTED", 1);
       DirtyLensController$ResourceStatus.DETECTED = resourceStat1;
       DirtyLensController$ResourceStatus resourceStat2 = new DirtyLensController$ResourceStatus("DETECTING", 2);
       DirtyLensController$ResourceStatus.DETECTING = resourceStat2;
       DirtyLensController$ResourceStatus resourceStat3 = new DirtyLensController$ResourceStatus("DOWNLOADING", 3);
       DirtyLensController$ResourceStatus.DOWNLOADING = resourceStat3;
       DirtyLensController$ResourceStatus[] resourceStat4 = new DirtyLensController$ResourceStatus[]{resourceStat,resourceStat1,resourceStat2,resourceStat3};
       DirtyLensController$ResourceStatus.$VALUES = resourceStat4;
    }
    public void DirtyLensController$ResourceStatus(String p0,int p1){
       super(p0, p1);
    }
    public static DirtyLensController$ResourceStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DirtyLensController$ResourceStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DirtyLensController$ResourceStatus.class, p0);
    }
    public static DirtyLensController$ResourceStatus[] values(){
       Object obj = PatchProxy.apply(null, null, DirtyLensController$ResourceStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DirtyLensController$ResourceStatus.$VALUES.clone();
    }
}
