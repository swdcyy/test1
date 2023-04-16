package com.kuaishou.bowl.event.LaunchEvent$DynamicType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LaunchEvent$DynamicType extends Enum	// class@0011fd
{
    public final String type;
    public static final LaunchEvent$DynamicType[] $VALUES;
    public static final LaunchEvent$DynamicType ERA;
    public static final LaunchEvent$DynamicType LINK;
    public static final LaunchEvent$DynamicType LIVE_DY;

    static {
       LaunchEvent$DynamicType uDynamicType = new LaunchEvent$DynamicType("ERA", 0, "era");
       LaunchEvent$DynamicType.ERA = uDynamicType;
       LaunchEvent$DynamicType uDynamicType1 = new LaunchEvent$DynamicType("LINK", 1, "link");
       LaunchEvent$DynamicType.LINK = uDynamicType1;
       LaunchEvent$DynamicType uDynamicType2 = new LaunchEvent$DynamicType("LIVE_DY", 2, "live-dy");
       LaunchEvent$DynamicType.LIVE_DY = uDynamicType2;
       LaunchEvent$DynamicType[] uDynamicType3 = new LaunchEvent$DynamicType[]{uDynamicType,uDynamicType1,uDynamicType2};
       LaunchEvent$DynamicType.$VALUES = uDynamicType3;
    }
    public void LaunchEvent$DynamicType(String p0,int p1,String p2){
       super(p0, p1);
       this.type = p2;
    }
    public static LaunchEvent$DynamicType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LaunchEvent$DynamicType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LaunchEvent$DynamicType.class, p0);
    }
    public static LaunchEvent$DynamicType[] values(){
       Object obj = PatchProxy.apply(null, null, LaunchEvent$DynamicType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LaunchEvent$DynamicType.$VALUES.clone();
    }
    public String getType(){
       return this.type;
    }
}
