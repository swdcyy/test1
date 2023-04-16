package com.kuaishou.live.common.core.component.hotspot.detail.model.MediaType;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.live.common.core.component.hotspot.detail.model.MediaType$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MediaType extends Enum	// class@0013d2
{
    public final String loggerType;
    public final int type;
    public static final MediaType[] $VALUES;
    public static final MediaType$a Companion;
    public static final MediaType LIVE;
    public static final MediaType PHOTO;
    public static final MediaType UNKNOWN;

    static {
       MediaType mediaType;
       MediaType[] mediaTypeArr = new MediaType[]{mediaType,mediaType,mediaType};
       mediaType = new MediaType("UNKNOWN", 0, 0, "UNKNOWN");
       MediaType.UNKNOWN = mediaType;
       mediaType = new MediaType("LIVE", 1, 1, "LIVE");
       MediaType.LIVE = mediaType;
       mediaType = new MediaType("PHOTO", 2, 2, "VIDEO");
       MediaType.PHOTO = mediaType;
       MediaType.$VALUES = mediaTypeArr;
       MediaType.Companion = new MediaType$a(null);
    }
    public void MediaType(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.type = p2;
       this.loggerType = p3;
    }
    public static MediaType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MediaType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MediaType.class, p0);
    }
    public static MediaType[] values(){
       Object obj = PatchProxy.apply(null, null, MediaType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MediaType.$VALUES.clone();
    }
    public final String getLoggerType(){
       return this.loggerType;
    }
    public final int getType(){
       return this.type;
    }
}
