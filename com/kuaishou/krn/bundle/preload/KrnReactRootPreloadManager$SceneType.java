package com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager$SceneType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KrnReactRootPreloadManager$SceneType extends Enum	// class@00083e
{
    public static final KrnReactRootPreloadManager$SceneType[] $VALUES;
    public static final KrnReactRootPreloadManager$SceneType BUNDLE_INFO_UPDATED;
    public static final KrnReactRootPreloadManager$SceneType ENTER_BACKGROUND;
    public static final KrnReactRootPreloadManager$SceneType OTHER;

    static {
       KrnReactRootPreloadManager$SceneType sceneType = new KrnReactRootPreloadManager$SceneType("ENTER_BACKGROUND", 0);
       KrnReactRootPreloadManager$SceneType.ENTER_BACKGROUND = sceneType;
       KrnReactRootPreloadManager$SceneType sceneType1 = new KrnReactRootPreloadManager$SceneType("BUNDLE_INFO_UPDATED", 1);
       KrnReactRootPreloadManager$SceneType.BUNDLE_INFO_UPDATED = sceneType1;
       KrnReactRootPreloadManager$SceneType sceneType2 = new KrnReactRootPreloadManager$SceneType("OTHER", 2);
       KrnReactRootPreloadManager$SceneType.OTHER = sceneType2;
       KrnReactRootPreloadManager$SceneType[] sceneTypeArr = new KrnReactRootPreloadManager$SceneType[]{sceneType,sceneType1,sceneType2};
       KrnReactRootPreloadManager$SceneType.$VALUES = sceneTypeArr;
    }
    public void KrnReactRootPreloadManager$SceneType(String p0,int p1){
       super(p0, p1);
    }
    public static KrnReactRootPreloadManager$SceneType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KrnReactRootPreloadManager$SceneType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KrnReactRootPreloadManager$SceneType.class, p0);
    }
    public static KrnReactRootPreloadManager$SceneType[] values(){
       Object obj = PatchProxy.apply(null, null, KrnReactRootPreloadManager$SceneType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KrnReactRootPreloadManager$SceneType.$VALUES.clone();
    }
}
