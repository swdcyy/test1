package com.kwai.live.gzone.bridge.function.LiveGzoneThirdPlatformParams$ThirdPlatform;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveGzoneThirdPlatformParams$ThirdPlatform extends Enum	// class@000c83
{
    public int mValue;
    public static final LiveGzoneThirdPlatformParams$ThirdPlatform[] $VALUES;
    public static final LiveGzoneThirdPlatformParams$ThirdPlatform LIVELINK;

    static {
       LiveGzoneThirdPlatformParams$ThirdPlatform thirdPlatfor = new LiveGzoneThirdPlatformParams$ThirdPlatform("LIVELINK", 0, 1);
       LiveGzoneThirdPlatformParams$ThirdPlatform.LIVELINK = thirdPlatfor;
       LiveGzoneThirdPlatformParams$ThirdPlatform[] thirdPlatfor1 = new LiveGzoneThirdPlatformParams$ThirdPlatform[]{thirdPlatfor};
       LiveGzoneThirdPlatformParams$ThirdPlatform.$VALUES = thirdPlatfor1;
    }
    public void LiveGzoneThirdPlatformParams$ThirdPlatform(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static LiveGzoneThirdPlatformParams$ThirdPlatform valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneThirdPlatformParams$ThirdPlatform.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneThirdPlatformParams$ThirdPlatform.class, p0);
    }
    public static LiveGzoneThirdPlatformParams$ThirdPlatform[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneThirdPlatformParams$ThirdPlatform.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneThirdPlatformParams$ThirdPlatform.$VALUES.clone();
    }
}
