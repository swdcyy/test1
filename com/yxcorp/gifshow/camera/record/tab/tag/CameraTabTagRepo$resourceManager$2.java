package com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagRepo$resourceManager$2;
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
import com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagConfig;
import kb7.a;

public final class CameraTabTagRepo$resourceManager$2 extends Lambda implements a	// class@000f55
{
    public static final CameraTabTagRepo$resourceManager$2 INSTANCE;

    static {
       CameraTabTagRepo$resourceManager$2.INSTANCE = new CameraTabTagRepo$resourceManager$2();
    }
    public void CameraTabTagRepo$resourceManager$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, CameraTabTagRepo$resourceManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ResourceSdk.d(ResourceSdk.f, new a("CAMERA_TAB_GUIDENCE", 0, CameraTabTagConfig.class), null, 2, null);
    }
}
