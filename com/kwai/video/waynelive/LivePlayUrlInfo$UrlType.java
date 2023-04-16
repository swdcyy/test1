package com.kwai.video.waynelive.LivePlayUrlInfo$UrlType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePlayUrlInfo$UrlType extends Enum	// class@000dcd
{
    public String mType;
    public static final LivePlayUrlInfo$UrlType[] $VALUES;
    public static final LivePlayUrlInfo$UrlType FLV;
    public static final LivePlayUrlInfo$UrlType HDR;
    public static final LivePlayUrlInfo$UrlType HLS;
    public static final LivePlayUrlInfo$UrlType PANORAMIC;

    static {
       LivePlayUrlInfo$UrlType urlType = new LivePlayUrlInfo$UrlType("FLV", 0, "flv");
       LivePlayUrlInfo$UrlType.FLV = urlType;
       LivePlayUrlInfo$UrlType urlType1 = new LivePlayUrlInfo$UrlType("HLS", 1, "hls");
       LivePlayUrlInfo$UrlType.HLS = urlType1;
       LivePlayUrlInfo$UrlType urlType2 = new LivePlayUrlInfo$UrlType("PANORAMIC", 2, "panoramic");
       LivePlayUrlInfo$UrlType.PANORAMIC = urlType2;
       LivePlayUrlInfo$UrlType urlType3 = new LivePlayUrlInfo$UrlType("HDR", 3, "hdr");
       LivePlayUrlInfo$UrlType.HDR = urlType3;
       LivePlayUrlInfo$UrlType[] urlTypeArray = new LivePlayUrlInfo$UrlType[]{urlType,urlType1,urlType2,urlType3};
       LivePlayUrlInfo$UrlType.$VALUES = urlTypeArray;
    }
    public void LivePlayUrlInfo$UrlType(String p0,int p1,String p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static LivePlayUrlInfo$UrlType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayUrlInfo$UrlType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePlayUrlInfo$UrlType.class, p0);
    }
    public static LivePlayUrlInfo$UrlType[] values(){
       Object obj = PatchProxy.apply(null, null, LivePlayUrlInfo$UrlType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePlayUrlInfo$UrlType.$VALUES.clone();
    }
    public String type(){
       return this.mType;
    }
}
