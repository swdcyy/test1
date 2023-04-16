package com.kuaishou.rtc.model.SnowRtcConstants$DirectorMixMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class SnowRtcConstants$DirectorMixMode extends Enum	// class@000efb
{
    public final int mArya5Value;
    public static final SnowRtcConstants$DirectorMixMode[] $VALUES;
    public static final SnowRtcConstants$DirectorMixMode FILL;
    public static final SnowRtcConstants$DirectorMixMode FIT;
    public static final SnowRtcConstants$DirectorMixMode HIDDEN;
    public static final SnowRtcConstants$DirectorMixMode UNKNOWN;

    static {
       SnowRtcConstants$DirectorMixMode uDirectorMix = new SnowRtcConstants$DirectorMixMode("UNKNOWN", 0, -1);
       SnowRtcConstants$DirectorMixMode.UNKNOWN = uDirectorMix;
       SnowRtcConstants$DirectorMixMode uDirectorMix1 = new SnowRtcConstants$DirectorMixMode("HIDDEN", 1, 1);
       SnowRtcConstants$DirectorMixMode.HIDDEN = uDirectorMix1;
       SnowRtcConstants$DirectorMixMode uDirectorMix2 = new SnowRtcConstants$DirectorMixMode("FIT", 2, 2);
       SnowRtcConstants$DirectorMixMode.FIT = uDirectorMix2;
       SnowRtcConstants$DirectorMixMode uDirectorMix3 = new SnowRtcConstants$DirectorMixMode("FILL", 3, 3);
       SnowRtcConstants$DirectorMixMode.FILL = uDirectorMix3;
       SnowRtcConstants$DirectorMixMode[] uDirectorMix4 = new SnowRtcConstants$DirectorMixMode[]{uDirectorMix,uDirectorMix1,uDirectorMix2,uDirectorMix3};
       SnowRtcConstants$DirectorMixMode.$VALUES = uDirectorMix4;
    }
    public void SnowRtcConstants$DirectorMixMode(String p0,int p1,int p2){
       super(p0, p1);
       this.mArya5Value = p2;
    }
    public static SnowRtcConstants$DirectorMixMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SnowRtcConstants$DirectorMixMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SnowRtcConstants$DirectorMixMode.class, p0);
    }
    public static SnowRtcConstants$DirectorMixMode[] values(){
       Object obj = PatchProxy.apply(null, null, SnowRtcConstants$DirectorMixMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SnowRtcConstants$DirectorMixMode.$VALUES.clone();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SnowRtcConstants$DirectorMixMode.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DirectorMixMode{, mArya5Value="+this.mArya5Value+'}';
    }
}
