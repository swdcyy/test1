package com.yxcorp.gifshow.encode.b0;
import io.reactivex.g;
import java.io.File;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Object;
import brd.v;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.media.watermark.g;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import hxc.a;
import tkd.b;
import tkd.d;
import h69.e;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.yxcorp.gifshow.media.util.g;
import com.yxcorp.gifshow.encode.s0;
import com.yxcorp.gifshow.util.PostUtils;
import qkd.b;
import com.kwai.sdk.switchconfig.a;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import pca.t1;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.kwai.video.editorsdk2.ExportTask;
import pca.l1;
import erd.f;
import java.lang.Exception;
import java.lang.Throwable;
import brd.g;
import java.io.IOException;

public final class b0 implements g	// class@000d0e
{
    public final File b;
    public final File c;
    public final VideoContext d;
    public final boolean e;
    public final File f;

    public void b0(File p0,File p1,VideoContext p2,boolean p3,File p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void subscribe(v p0){
       b0 tb = this.b;
       b0 tc = this.c;
       b0 td = this.d;
       b0 te = this.e;
       b0 tf = this.f;
       try{
          EditorSdk2V2$VideoEditorProject videoEditorP = g.a(tb, tc);
          if (!EditorSdk2UtilsV2.videoProjectPrivateDataLoaded(videoEditorP)) {
             videoEditorP = EditorSdk2UtilsV2.loadProject(videoEditorP);
          label_0018 :
             User user = new User(QCurrentUser.me().getId(), null, null, null, null);
             EditorSdk2$ExportOptions uExportOptio = d.a(0x1dd3f09e).g00(tc, videoEditorP, v13, td);
             g.b(new a(), uExportOptio, (long)(EditorSdk2UtilsV2.getComputedDuration(videoEditorP) * 0x408f400000000000));
             videoEditorP.setProjectOutputWidth(uExportOptio.width());
             videoEditorP.setProjectOutputHeight(uExportOptio.height());
             if (te != null) {
                s0.a(videoEditorP);
             }
             uExportOptio.setNoFastStart(a.t().d("editorExportDisableFastStart", false));
             ExportTaskNoQueueing uExportTaskN = new ExportTaskNoQueueing(a.a().a(), videoEditorP, b.X(PostUtils.g("[>|67|>]"), ".mp4").getAbsolutePath(), uExportOptio);
             uExportTaskN.setExportEventListener(new t1(tf, p0));
             uExportTaskN.run();
             p0.setCancellable(new l1(uExportTaskN));
          }else {
             goto label_0018 ;
          }
       }catch(java.io.IOException e0){
          e0.printStackTrace();
          p0.onError(e0);
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
          e0.printStackTrace();
          p0.onError(e0);
       }
       return;
    }
}
