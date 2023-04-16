package com.kuaishou.live.basic.api.LiveApiParams$MediaType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveApiParams$MediaType extends Enum	// class@000ca2
{
    public static final LiveApiParams$MediaType[] $VALUES;
    public static final LiveApiParams$MediaType AUDIO;
    public static final LiveApiParams$MediaType UNKNOWN;
    public static final LiveApiParams$MediaType VIDEO;

    static {
       LiveApiParams$MediaType mediaType = new LiveApiParams$MediaType("UNKNOWN", 0);
       LiveApiParams$MediaType.UNKNOWN = mediaType;
       LiveApiParams$MediaType mediaType1 = new LiveApiParams$MediaType("AUDIO", 1);
       LiveApiParams$MediaType.AUDIO = mediaType1;
       LiveApiParams$MediaType mediaType2 = new LiveApiParams$MediaType("VIDEO", 2);
       LiveApiParams$MediaType.VIDEO = mediaType2;
       LiveApiParams$MediaType[] mediaTypeArr = new LiveApiParams$MediaType[]{mediaType,mediaType1,mediaType2};
       LiveApiParams$MediaType.$VALUES = mediaTypeArr;
    }
    public void LiveApiParams$MediaType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveApiParams$MediaType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveApiParams$MediaType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveApiParams$MediaType.class, p0);
    }
    public static LiveApiParams$MediaType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveApiParams$MediaType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveApiParams$MediaType.$VALUES.clone();
    }
}
