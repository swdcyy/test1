package com.kuaishou.live.basic.userlayer.LiveUserLayerManager$b;
import erd.g;
import java.lang.Object;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager$UserLayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager;
import kotlin.jvm.internal.a;

public final class LiveUserLayerManager$b implements g	// class@000d25
{
    public static final LiveUserLayerManager$b b;

    static {
       LiveUserLayerManager$b.b = new LiveUserLayerManager$b();
    }
    public void LiveUserLayerManager$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveUserLayerManager$b.class, "1")) {
       }else {
          a.o(p0, "it");
          LiveUserLayerManager.d.c(p0, true);
       }
       return;
    }
}
