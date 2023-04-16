package com.yxcorp.gifshow.v3.editor.frame_v2.network.EditCanvasBackgroundDownloadHelperV2;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditCanvasBackgroundDownloadHelperV2$costMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditCanvasBackgroundDownloadHelperV2$backgroundDownloader$2;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditCanvasBackgroundDownloadHelperV2	// class@000f9c
{
    public final p a;
    public final p b;

    public void EditCanvasBackgroundDownloadHelperV2(){
       super();
       this.a = s.c(EditCanvasBackgroundDownloadHelperV2$costMap$2.INSTANCE);
       this.b = s.c(EditCanvasBackgroundDownloadHelperV2$backgroundDownloader$2.INSTANCE);
    }
    public final HashMap a(){
       Object obj = PatchProxy.apply(null, this, EditCanvasBackgroundDownloadHelperV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
