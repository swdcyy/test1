package com.kuaishou.live.basic.userlayer.LiveUserLayerManager$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager$UserLayer;

public final class LiveUserLayerManager$c implements g	// class@000d26
{
    public static final LiveUserLayerManager$c b;

    static {
       LiveUserLayerManager$c.b = new LiveUserLayerManager$c();
    }
    public void LiveUserLayerManager$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveUserLayerManager$c.class, "1")) {
       }else {
          LiveUserLayerManager.d.c(LiveUserLayerManager$UserLayer.UNKNOWN, false);
       }
       return;
    }
}
