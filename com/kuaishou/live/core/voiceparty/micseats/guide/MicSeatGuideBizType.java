package com.kuaishou.live.core.voiceparty.micseats.guide.MicSeatGuideBizType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MicSeatGuideBizType extends Enum	// class@0015b2
{
    public static final MicSeatGuideBizType[] $VALUES;
    public static final MicSeatGuideBizType FOLLOW;
    public static final MicSeatGuideBizType UNION;

    static {
       MicSeatGuideBizType micSeatGuide1;
       MicSeatGuideBizType[] micSeatGuide = new MicSeatGuideBizType[]{micSeatGuide1,micSeatGuide1};
       micSeatGuide1 = new MicSeatGuideBizType("UNION", 0);
       MicSeatGuideBizType.UNION = micSeatGuide1;
       micSeatGuide1 = new MicSeatGuideBizType("FOLLOW", 1);
       MicSeatGuideBizType.FOLLOW = micSeatGuide1;
       MicSeatGuideBizType.$VALUES = micSeatGuide;
    }
    public void MicSeatGuideBizType(String p0,int p1){
       super(p0, p1);
    }
    public static MicSeatGuideBizType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MicSeatGuideBizType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MicSeatGuideBizType.class, p0);
    }
    public static MicSeatGuideBizType[] values(){
       Object obj = PatchProxy.apply(null, null, MicSeatGuideBizType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MicSeatGuideBizType.$VALUES.clone();
    }
}
