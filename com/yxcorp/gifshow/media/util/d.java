package com.yxcorp.gifshow.media.util.d;
import io.reactivex.g;
import com.yxcorp.gifshow.media.util.g;
import java.lang.String;
import com.yxcorp.gifshow.media.util.g$b;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import android.content.Context;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import android.util.Pair;
import java.lang.Integer;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.yxcorp.gifshow.media.util.g$a;
import com.kwai.sdk.switchconfig.a;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import hxc.a;
import com.yxcorp.gifshow.media.util.f;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.kwai.video.editorsdk2.ExportTask;
import pca.l1;
import erd.f;

public final class d implements g	// class@001d21
{
    public final g b;
    public final String c;
    public final g$b d;
    public final EncodeConfig e;
    public final Context f;
    public final String g;

    public void d(g p0,String p1,g$b p2,EncodeConfig p3,Context p4,String p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void subscribe(v p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       d tg = this.g;
       Objects.requireNonNull(tb);
       String[] stringArray = new String[]{tc};
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2UtilsV2.createProjectWithFileArray(stringArray);
       EditorSdk2$ExportOptions uExportOptio = g$a.a(this.e, new Pair(Integer.valueOf(td.a), Integer.valueOf(td.b)));
       uExportOptio.setNoFastStart(a.t().d("editorExportDisableFastStart", 0));
       ExportTaskNoQueueing uExportTaskN = new ExportTaskNoQueueing(this.f.getApplicationContext(), videoEditorP, tg, uExportOptio);
       g.b(tb.a, uExportOptio, (long)(EditorSdk2UtilsV2.getComputedDuration(videoEditorP) * 0x408f400000000000));
       uExportTaskN.setExportEventListener(new f(tb, p0, tg, tc));
       uExportTaskN.run();
       p0.setCancellable(new l1(uExportTaskN));
    }
}
