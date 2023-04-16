package com.yxcorp.gifshow.encode.q0;
import io.reactivex.i;
import java.io.File;
import com.kwai.gifshow.post.api.feature.music.model.MusicClipInfo;
import java.lang.Object;
import brd.c0;
import java.lang.String;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.lang.Math;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import java.util.concurrent.TimeUnit;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.sdk.switchconfig.a;
import xf6.g;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.StringBuilder;
import android.content.Context;
import pca.p1;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.kwai.video.editorsdk2.ExportTask;
import pca.l1;
import erd.f;

public final class q0 implements i	// class@000d46
{
    public final File a;
    public final MusicClipInfo b;
    public final double c;
    public final float d;

    public void q0(File p0,MusicClipInfo p1,double p2,float p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(c0 p0){
       q0 ta = this.a;
       q0 tb = this.b;
       q0 tc = this.c;
       q0 td = this.d;
       String absolutePath = ta.getAbsolutePath();
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2UtilsV2.createProjectWithFile(absolutePath);
       boolean b = false;
       EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2UtilsV2.openAudioAsset(ta.getAbsolutePath(), 0x3ff0000000000000, b);
       if (tb == null) {
          videoEditorP.trackAssets(b).setClippedRange(EditorSdk2UtilsV2.createTimeRange(tc, Math.min(140.00f, (EditorSdk2Utils.getAudioTrackDuration(uAudioAsset.assetPath()) - tc))));
       }else {
          videoEditorP.trackAssets(b).setClippedRange(EditorSdk2UtilsV2.createTimeRange(tc, Math.min((double)TimeUnit.MILLISECONDS.toSeconds(tb.mClipResultDuration), (EditorSdk2Utils.getAudioTrackDuration(uAudioAsset.assetPath()) - tc))));
       }
       videoEditorP.trackAssets(b).setVolume((double)td);
       EditorSdk2$ExportOptions uExportOptio = EditorSdk2Utils.createDefaultExportOptions();
       uExportOptio.setDiscardVideoTrackInMediaFile(true);
       uExportOptio.setNoFastStart(a.t().d("editorExportDisableFastStart", b));
       if (a.t().d("enable_tvd_v2", b) || g.a0()) {
          b = true;
       }
       uExportOptio.setEnableTvdV2(b);
       ExportTaskNoQueueing uExportTaskN = new ExportTaskNoQueueing(a.a().a(), videoEditorP, absolutePath+".mp4", uExportOptio);
       uExportTaskN.setExportEventListener(new p1(absolutePath, p0));
       p0.setCancellable(new l1(uExportTaskN));
       uExportTaskN.run();
       return;
    }
}
