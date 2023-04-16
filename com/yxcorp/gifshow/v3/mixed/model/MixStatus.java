package com.yxcorp.gifshow.v3.mixed.model.MixStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MixStatus extends Enum	// class@001553
{
    public static final MixStatus[] $VALUES;
    public static final MixStatus EDITING;
    public static final MixStatus PREVIEWING;

    static {
       MixStatus mixStatus = new MixStatus("PREVIEWING", 0);
       MixStatus.PREVIEWING = mixStatus;
       MixStatus mixStatus1 = new MixStatus("EDITING", 1);
       MixStatus.EDITING = mixStatus1;
       MixStatus[] mixStatusArr = new MixStatus[]{mixStatus,mixStatus1};
       MixStatus.$VALUES = mixStatusArr;
    }
    public void MixStatus(String p0,int p1){
       super(p0, p1);
    }
    public static MixStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MixStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MixStatus.class, p0);
    }
    public static MixStatus[] values(){
       Object obj = PatchProxy.apply(null, null, MixStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MixStatus.$VALUES.clone();
    }
}
