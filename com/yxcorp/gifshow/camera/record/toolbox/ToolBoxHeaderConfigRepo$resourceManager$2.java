package com.yxcorp.gifshow.camera.record.toolbox.ToolBoxHeaderConfigRepo$resourceManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import jb7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import jb7.a;
import com.yxcorp.gifshow.camera.record.toolbox.ToolBoxHeaderConfig;
import kb7.a;

public final class ToolBoxHeaderConfigRepo$resourceManager$2 extends Lambda implements a	// class@000f61
{
    public static final ToolBoxHeaderConfigRepo$resourceManager$2 INSTANCE;

    static {
       ToolBoxHeaderConfigRepo$resourceManager$2.INSTANCE = new ToolBoxHeaderConfigRepo$resourceManager$2();
    }
    public void ToolBoxHeaderConfigRepo$resourceManager$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, ToolBoxHeaderConfigRepo$resourceManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ResourceSdk.d(ResourceSdk.f, new a("TOOLBOX", 1, ToolBoxHeaderConfig.class), null, 2, null);
    }
}
