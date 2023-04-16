package com.yxcorp.gifshow.encode.x;
import io.reactivex.g;
import java.io.File;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.Object;
import brd.v;
import qkd.b;
import java.lang.String;
import lnc.i1;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import brd.g;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.sdk.switchconfig.a;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import pca.s1;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.kwai.video.editorsdk2.ExportTask;
import pca.l1;
import erd.f;

public final class x implements g	// class@000d59
{
    public final File b;
    public final EditorSdk2$ExportOptions c;
    public final EditorSdk2V2$VideoEditorProject d;

    public void x(File p0,EditorSdk2$ExportOptions p1,EditorSdk2V2$VideoEditorProject p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       x tb = this.b;
       x tc = this.c;
       x td = this.d;
       if (!b.N(tb)) {
          i1.a("EncodingUtils", "createVideoFile but file is null or not video File ");
          p0.onError(new IllegalArgumentException("createVideoFile but file is null or not video File "));
       }else {
          tc.setNoFastStart(a.t().d("editorExportDisableFastStart", false));
          ExportTaskNoQueueing uExportTaskN = new ExportTaskNoQueueing(a.a().a(), td, b.X(PostUtils.g("[>|66|>]"), ".mp4").getAbsolutePath(), tc);
          uExportTaskN.setExportEventListener(new s1(tb, p0));
          uExportTaskN.run();
          p0.setCancellable(new l1(uExportTaskN));
       }
       return;
    }
}
