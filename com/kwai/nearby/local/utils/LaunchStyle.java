package com.kwai.nearby.local.utils.LaunchStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LaunchStyle extends Enum	// class@001005
{
    public static final LaunchStyle[] $VALUES;
    public static final LaunchStyle COLD;
    public static final LaunchStyle HOT;

    static {
       LaunchStyle launchStyle = new LaunchStyle("COLD", 0);
       LaunchStyle.COLD = launchStyle;
       LaunchStyle launchStyle1 = new LaunchStyle("HOT", 1);
       LaunchStyle.HOT = launchStyle1;
       LaunchStyle[] launchStyleA = new LaunchStyle[]{launchStyle,launchStyle1};
       LaunchStyle.$VALUES = launchStyleA;
    }
    public void LaunchStyle(String p0,int p1){
       super(p0, p1);
    }
    public static LaunchStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LaunchStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LaunchStyle.class, p0);
    }
    public static LaunchStyle[] values(){
       Object obj = PatchProxy.apply(null, null, LaunchStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LaunchStyle.$VALUES.clone();
    }
}
