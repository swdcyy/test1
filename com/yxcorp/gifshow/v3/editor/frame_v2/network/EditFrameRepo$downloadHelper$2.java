package com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo$downloadHelper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditCanvasBackgroundDownloadHelperV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditFrameRepo$downloadHelper$2 extends Lambda implements a	// class@000fa0
{
    public static final EditFrameRepo$downloadHelper$2 INSTANCE;

    static {
       EditFrameRepo$downloadHelper$2.INSTANCE = new EditFrameRepo$downloadHelper$2();
    }
    public void EditFrameRepo$downloadHelper$2(){
       super(0);
    }
    public final EditCanvasBackgroundDownloadHelperV2 invoke(){
       Object obj = PatchProxy.apply(null, this, EditFrameRepo$downloadHelper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EditCanvasBackgroundDownloadHelperV2();
    }
    public Object invoke(){
       return this.invoke();
    }
}
