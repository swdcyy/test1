package com.yxcorp.gifshow.commercial.pendant.NeoLiveCountDown$SCENE;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NeoLiveCountDown$SCENE extends Enum	// class@001153
{
    public static final NeoLiveCountDown$SCENE[] $VALUES;
    public static final NeoLiveCountDown$SCENE DETAIL_VIDEO;
    public static final NeoLiveCountDown$SCENE LIVE;
    public static final NeoLiveCountDown$SCENE NONE;

    static {
       NeoLiveCountDown$SCENE sCENE;
       NeoLiveCountDown$SCENE[] sCENEArray = new NeoLiveCountDown$SCENE[]{sCENE,sCENE,sCENE};
       sCENE = new NeoLiveCountDown$SCENE("DETAIL_VIDEO", 0);
       NeoLiveCountDown$SCENE.DETAIL_VIDEO = sCENE;
       sCENE = new NeoLiveCountDown$SCENE("LIVE", 1);
       NeoLiveCountDown$SCENE.LIVE = sCENE;
       sCENE = new NeoLiveCountDown$SCENE("NONE", 2);
       NeoLiveCountDown$SCENE.NONE = sCENE;
       NeoLiveCountDown$SCENE.$VALUES = sCENEArray;
    }
    public void NeoLiveCountDown$SCENE(String p0,int p1){
       super(p0, p1);
    }
    public static NeoLiveCountDown$SCENE valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NeoLiveCountDown$SCENE.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NeoLiveCountDown$SCENE.class, p0);
    }
    public static NeoLiveCountDown$SCENE[] values(){
       Object obj = PatchProxy.apply(null, null, NeoLiveCountDown$SCENE.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NeoLiveCountDown$SCENE.$VALUES.clone();
    }
}
