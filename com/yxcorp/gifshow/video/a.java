package com.yxcorp.gifshow.video.a;
import io.reactivex.g;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.String;
import java.lang.Object;
import brd.v;
import com.kwai.sdk.switchconfig.a;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import exc.i;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.kwai.video.editorsdk2.ExportTask;
import pca.l1;
import erd.f;

public final class a implements g	// class@001682
{
    public final EditorSdk2$ExportOptions b;
    public final EditorSdk2V2$VideoEditorProject c;
    public final String d;

    public void a(EditorSdk2$ExportOptions p0,EditorSdk2V2$VideoEditorProject p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       a tb = this.b;
       tb.setNoFastStart(a.t().d("editorExportDisableFastStart", false));
       ExportTaskNoQueueing uExportTaskN = new ExportTaskNoQueueing(a.a().a(), this.c, this.d, tb);
       uExportTaskN.setExportEventListener(new i(p0));
       uExportTaskN.run();
       p0.setCancellable(new l1(uExportTaskN));
    }
}
