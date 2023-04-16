package com.kuaishou.merchant.marketing.platform.skyfallcoupon.SkyFallDataExplorationScene;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SkyFallDataExplorationScene extends Enum	// class@001b33
{
    public static final SkyFallDataExplorationScene[] $VALUES;
    public static final SkyFallDataExplorationScene DATA_SCENE;
    public static final SkyFallDataExplorationScene ENTRY_SCENE;
    public static final SkyFallDataExplorationScene LOGICAL_SCENE;
    public static final SkyFallDataExplorationScene SHOWING_SCENE;

    static {
       SkyFallDataExplorationScene skyFallDataE = new SkyFallDataExplorationScene("ENTRY_SCENE", 0);
       SkyFallDataExplorationScene.ENTRY_SCENE = skyFallDataE;
       SkyFallDataExplorationScene skyFallDataE1 = new SkyFallDataExplorationScene("DATA_SCENE", 1);
       SkyFallDataExplorationScene.DATA_SCENE = skyFallDataE1;
       SkyFallDataExplorationScene skyFallDataE2 = new SkyFallDataExplorationScene("LOGICAL_SCENE", 2);
       SkyFallDataExplorationScene.LOGICAL_SCENE = skyFallDataE2;
       SkyFallDataExplorationScene skyFallDataE3 = new SkyFallDataExplorationScene("SHOWING_SCENE", 3);
       SkyFallDataExplorationScene.SHOWING_SCENE = skyFallDataE3;
       SkyFallDataExplorationScene[] skyFallDataE4 = new SkyFallDataExplorationScene[]{skyFallDataE,skyFallDataE1,skyFallDataE2,skyFallDataE3};
       SkyFallDataExplorationScene.$VALUES = skyFallDataE4;
    }
    public void SkyFallDataExplorationScene(String p0,int p1){
       super(p0, p1);
    }
    public static SkyFallDataExplorationScene valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SkyFallDataExplorationScene.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SkyFallDataExplorationScene.class, p0);
    }
    public static SkyFallDataExplorationScene[] values(){
       Object obj = PatchProxy.apply(null, null, SkyFallDataExplorationScene.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SkyFallDataExplorationScene.$VALUES.clone();
    }
}
