package com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MicSeatStyle extends Enum	// class@00158b
{
    public static final MicSeatStyle[] $VALUES;
    public static final MicSeatStyle Media;
    public static final MicSeatStyle PK;
    public static final MicSeatStyle SixSeat;
    public static final MicSeatStyle Video;

    static {
       MicSeatStyle micSeatStyle1;
       MicSeatStyle[] micSeatStyle = new MicSeatStyle[]{micSeatStyle1,micSeatStyle1,micSeatStyle1,micSeatStyle1};
       micSeatStyle1 = new MicSeatStyle("SixSeat", 0);
       MicSeatStyle.SixSeat = micSeatStyle1;
       micSeatStyle1 = new MicSeatStyle("PK", 1);
       MicSeatStyle.PK = micSeatStyle1;
       micSeatStyle1 = new MicSeatStyle("Video", 2);
       MicSeatStyle.Video = micSeatStyle1;
       micSeatStyle1 = new MicSeatStyle("Media", 3);
       MicSeatStyle.Media = micSeatStyle1;
       MicSeatStyle.$VALUES = micSeatStyle;
    }
    public void MicSeatStyle(String p0,int p1){
       super(p0, p1);
    }
    public static MicSeatStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MicSeatStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MicSeatStyle.class, p0);
    }
    public static MicSeatStyle[] values(){
       Object obj = PatchProxy.apply(null, null, MicSeatStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MicSeatStyle.$VALUES.clone();
    }
}
