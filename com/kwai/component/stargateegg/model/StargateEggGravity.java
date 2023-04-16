package com.kwai.component.stargateegg.model.StargateEggGravity;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class StargateEggGravity extends Enum	// class@000b3f
{
    public static final StargateEggGravity[] $VALUES;
    public static final StargateEggGravity BOTTOM;
    public static final StargateEggGravity CENTER;

    static {
       StargateEggGravity stargateEggG1;
       StargateEggGravity[] stargateEggG = new StargateEggGravity[]{stargateEggG1,stargateEggG1};
       stargateEggG1 = new StargateEggGravity("BOTTOM", 0);
       StargateEggGravity.BOTTOM = stargateEggG1;
       stargateEggG1 = new StargateEggGravity("CENTER", 1);
       StargateEggGravity.CENTER = stargateEggG1;
       StargateEggGravity.$VALUES = stargateEggG;
    }
    public void StargateEggGravity(String p0,int p1){
       super(p0, p1);
    }
    public static StargateEggGravity valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StargateEggGravity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(StargateEggGravity.class, p0);
    }
    public static StargateEggGravity[] values(){
       Object obj = PatchProxy.apply(null, null, StargateEggGravity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StargateEggGravity.$VALUES.clone();
    }
}
