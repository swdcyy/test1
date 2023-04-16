package com.kwai.video.waynelive.LivePlayUrlInfo$DataSourceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePlayUrlInfo$DataSourceType extends Enum	// class@000dcc
{
    public static final LivePlayUrlInfo$DataSourceType[] $VALUES;
    public static final LivePlayUrlInfo$DataSourceType ADAPTIVE_MANIFESTS;
    public static final LivePlayUrlInfo$DataSourceType MULTI_RESOLUTION;
    public static final LivePlayUrlInfo$DataSourceType NORMAL_CDN;

    static {
       LivePlayUrlInfo$DataSourceType uDataSourceT = new LivePlayUrlInfo$DataSourceType("NORMAL_CDN", 0);
       LivePlayUrlInfo$DataSourceType.NORMAL_CDN = uDataSourceT;
       LivePlayUrlInfo$DataSourceType uDataSourceT1 = new LivePlayUrlInfo$DataSourceType("ADAPTIVE_MANIFESTS", 1);
       LivePlayUrlInfo$DataSourceType.ADAPTIVE_MANIFESTS = uDataSourceT1;
       LivePlayUrlInfo$DataSourceType uDataSourceT2 = new LivePlayUrlInfo$DataSourceType("MULTI_RESOLUTION", 2);
       LivePlayUrlInfo$DataSourceType.MULTI_RESOLUTION = uDataSourceT2;
       LivePlayUrlInfo$DataSourceType[] uDataSourceT3 = new LivePlayUrlInfo$DataSourceType[]{uDataSourceT,uDataSourceT1,uDataSourceT2};
       LivePlayUrlInfo$DataSourceType.$VALUES = uDataSourceT3;
    }
    public void LivePlayUrlInfo$DataSourceType(String p0,int p1){
       super(p0, p1);
    }
    public static LivePlayUrlInfo$DataSourceType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayUrlInfo$DataSourceType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePlayUrlInfo$DataSourceType.class, p0);
    }
    public static LivePlayUrlInfo$DataSourceType[] values(){
       Object obj = PatchProxy.apply(null, null, LivePlayUrlInfo$DataSourceType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePlayUrlInfo$DataSourceType.$VALUES.clone();
    }
}
