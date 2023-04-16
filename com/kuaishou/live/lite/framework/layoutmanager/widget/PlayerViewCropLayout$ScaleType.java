package com.kuaishou.live.lite.framework.layoutmanager.widget.PlayerViewCropLayout$ScaleType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PlayerViewCropLayout$ScaleType extends Enum	// class@00091f
{
    public static final PlayerViewCropLayout$ScaleType[] $VALUES;
    public static final PlayerViewCropLayout$ScaleType CENTER_CROP;
    public static final PlayerViewCropLayout$ScaleType CENTER_INSIDE;
    public static final PlayerViewCropLayout$ScaleType NONE;
    public static final PlayerViewCropLayout$ScaleType UNKNOWN;

    static {
       PlayerViewCropLayout$ScaleType scaleType;
       PlayerViewCropLayout$ScaleType[] scaleTypeArr = new PlayerViewCropLayout$ScaleType[]{scaleType,scaleType,scaleType,scaleType};
       scaleType = new PlayerViewCropLayout$ScaleType("UNKNOWN", 0);
       PlayerViewCropLayout$ScaleType.UNKNOWN = scaleType;
       scaleType = new PlayerViewCropLayout$ScaleType("NONE", 1);
       PlayerViewCropLayout$ScaleType.NONE = scaleType;
       scaleType = new PlayerViewCropLayout$ScaleType("CENTER_INSIDE", 2);
       PlayerViewCropLayout$ScaleType.CENTER_INSIDE = scaleType;
       scaleType = new PlayerViewCropLayout$ScaleType("CENTER_CROP", 3);
       PlayerViewCropLayout$ScaleType.CENTER_CROP = scaleType;
       PlayerViewCropLayout$ScaleType.$VALUES = scaleTypeArr;
    }
    public void PlayerViewCropLayout$ScaleType(String p0,int p1){
       super(p0, p1);
    }
    public static PlayerViewCropLayout$ScaleType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlayerViewCropLayout$ScaleType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PlayerViewCropLayout$ScaleType.class, p0);
    }
    public static PlayerViewCropLayout$ScaleType[] values(){
       Object obj = PatchProxy.apply(null, null, PlayerViewCropLayout$ScaleType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PlayerViewCropLayout$ScaleType.$VALUES.clone();
    }
}
