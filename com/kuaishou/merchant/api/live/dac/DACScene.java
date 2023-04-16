package com.kuaishou.merchant.api.live.dac.DACScene;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DACScene extends Enum	// class@001568
{
    public static final DACScene[] $VALUES;
    public static final DACScene LITE_LIVE;
    public static final DACScene LIVE;

    static {
       DACScene uDACScene;
       DACScene[] uDACSceneArr = new DACScene[]{uDACScene,uDACScene};
       uDACScene = new DACScene("LITE_LIVE", 0);
       DACScene.LITE_LIVE = uDACScene;
       uDACScene = new DACScene("LIVE", 1);
       DACScene.LIVE = uDACScene;
       DACScene.$VALUES = uDACSceneArr;
    }
    public void DACScene(String p0,int p1){
       super(p0, p1);
    }
    public static DACScene valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DACScene.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DACScene.class, p0);
    }
    public static DACScene[] values(){
       Object obj = PatchProxy.apply(null, null, DACScene.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DACScene.$VALUES.clone();
    }
}
