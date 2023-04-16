package com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo$mResourceManager$2;
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
import com.yxcorp.gifshow.v3.editor.frame_v2.model.EditCanvasConfigExtraV2;
import kb7.a;

public final class EditFrameRepo$mResourceManager$2 extends Lambda implements a	// class@000fa1
{
    public static final EditFrameRepo$mResourceManager$2 INSTANCE;

    static {
       EditFrameRepo$mResourceManager$2.INSTANCE = new EditFrameRepo$mResourceManager$2();
    }
    public void EditFrameRepo$mResourceManager$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, EditFrameRepo$mResourceManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ResourceSdk.d(ResourceSdk.f, new a("CANVAS", 1, EditCanvasConfigExtraV2.class), null, 2, null);
    }
}
