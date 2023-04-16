package com.kuaishou.rtc.model.SnowRtcConstants$MetadataType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SnowRtcConstants$MetadataType extends Enum	// class@000efc
{
    public final int mArya5Value;
    public static final SnowRtcConstants$MetadataType[] $VALUES;
    public static final SnowRtcConstants$MetadataType AUDIO;
    public static final SnowRtcConstants$MetadataType LIVE_STREAM;
    public static final SnowRtcConstants$MetadataType UNKNOWN;
    public static final SnowRtcConstants$MetadataType VIDEO;

    static {
       SnowRtcConstants$MetadataType metadataType = new SnowRtcConstants$MetadataType("UNKNOWN", 0, -1);
       SnowRtcConstants$MetadataType.UNKNOWN = metadataType;
       SnowRtcConstants$MetadataType metadataType1 = new SnowRtcConstants$MetadataType("VIDEO", 1, 0);
       SnowRtcConstants$MetadataType.VIDEO = metadataType1;
       SnowRtcConstants$MetadataType metadataType2 = new SnowRtcConstants$MetadataType("AUDIO", 2, 1);
       SnowRtcConstants$MetadataType.AUDIO = metadataType2;
       SnowRtcConstants$MetadataType metadataType3 = new SnowRtcConstants$MetadataType("LIVE_STREAM", 3, 2);
       SnowRtcConstants$MetadataType.LIVE_STREAM = metadataType3;
       SnowRtcConstants$MetadataType[] metadataType4 = new SnowRtcConstants$MetadataType[]{metadataType,metadataType1,metadataType2,metadataType3};
       SnowRtcConstants$MetadataType.$VALUES = metadataType4;
    }
    public void SnowRtcConstants$MetadataType(String p0,int p1,int p2){
       super(p0, p1);
       this.mArya5Value = p2;
    }
    public static SnowRtcConstants$MetadataType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SnowRtcConstants$MetadataType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SnowRtcConstants$MetadataType.class, p0);
    }
    public static SnowRtcConstants$MetadataType[] values(){
       Object obj = PatchProxy.apply(null, null, SnowRtcConstants$MetadataType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SnowRtcConstants$MetadataType.$VALUES.clone();
    }
}
