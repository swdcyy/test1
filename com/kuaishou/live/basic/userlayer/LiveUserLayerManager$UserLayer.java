package com.kuaishou.live.basic.userlayer.LiveUserLayerManager$UserLayer;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager$UserLayer$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveUserLayerManager$UserLayer extends Enum	// class@000d23
{
    public final int value;
    public static final LiveUserLayerManager$UserLayer[] $VALUES;
    public static final LiveUserLayerManager$UserLayer$a Companion;
    public static final LiveUserLayerManager$UserLayer HIGH_FREQUENCY;
    public static final LiveUserLayerManager$UserLayer LOW_FREQUENCY;
    public static final LiveUserLayerManager$UserLayer MEDIUM_FREQUENCY;
    public static final LiveUserLayerManager$UserLayer NEW;
    public static final LiveUserLayerManager$UserLayer SILENT;
    public static final LiveUserLayerManager$UserLayer UNKNOWN;
    public static final LiveUserLayerManager$UserLayer UNSET;

    static {
       LiveUserLayerManager$UserLayer userLayer;
       LiveUserLayerManager$UserLayer[] userLayerArr = new LiveUserLayerManager$UserLayer[]{userLayer,userLayer,userLayer,userLayer,userLayer,userLayer,userLayer};
       userLayer = new LiveUserLayerManager$UserLayer("UNSET", 0, -1);
       LiveUserLayerManager$UserLayer.UNSET = userLayer;
       userLayer = new LiveUserLayerManager$UserLayer("UNKNOWN", 1, 0);
       LiveUserLayerManager$UserLayer.UNKNOWN = userLayer;
       userLayer = new LiveUserLayerManager$UserLayer("HIGH_FREQUENCY", 2, 1);
       LiveUserLayerManager$UserLayer.HIGH_FREQUENCY = userLayer;
       userLayer = new LiveUserLayerManager$UserLayer("MEDIUM_FREQUENCY", 3, 2);
       LiveUserLayerManager$UserLayer.MEDIUM_FREQUENCY = userLayer;
       userLayer = new LiveUserLayerManager$UserLayer("LOW_FREQUENCY", 4, 3);
       LiveUserLayerManager$UserLayer.LOW_FREQUENCY = userLayer;
       userLayer = new LiveUserLayerManager$UserLayer("SILENT", 5, 4);
       LiveUserLayerManager$UserLayer.SILENT = userLayer;
       userLayer = new LiveUserLayerManager$UserLayer("NEW", 6, 5);
       LiveUserLayerManager$UserLayer.NEW = userLayer;
       LiveUserLayerManager$UserLayer.$VALUES = userLayerArr;
       LiveUserLayerManager$UserLayer.Companion = new LiveUserLayerManager$UserLayer$a(null);
    }
    public void LiveUserLayerManager$UserLayer(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LiveUserLayerManager$UserLayer valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveUserLayerManager$UserLayer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveUserLayerManager$UserLayer.class, p0);
    }
    public static LiveUserLayerManager$UserLayer[] values(){
       Object obj = PatchProxy.apply(null, null, LiveUserLayerManager$UserLayer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveUserLayerManager$UserLayer.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
