package com.yxcorp.gifshow.encode.p;
import com.yxcorp.gifshow.encode.EncodeManager$c;
import com.yxcorp.gifshow.encode.EncodeManager;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.postwork.a;
import r26.a;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import com.yxcorp.gifshow.upload.UploadInfo;
import dnc.x0;
import com.yxcorp.gifshow.postwork.e;
import gq.a;
import q87.c;
import f0c.i;
import java.lang.Runnable;

public final class p implements EncodeManager$c	// class@000d37
{
    public final EncodeManager a;

    public void p(EncodeManager p0){
       this.a = p0;
    }
    public final void a(ExportTask p0,int p1){
       p ta = this.a;
       Objects.requireNonNull(ta);
       EncodeManager uEncodeManag = EncodeManager.class;
       if (!PatchProxy.isSupport(uEncodeManag) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), ta, uEncodeManag, "63")) {
          a uoa = ta.r().g4(p1);
          if (uoa != null) {
             IUploadInfo uploadInfo = uoa.getUploadInfo();
             if (uploadInfo != null) {
                uploadInfo.mStreamPauseTime = uploadInfo.mStreamPauseTime + 1;
             }
             ta.q().m(uoa.getId());
          }
       }
       e uoe = e.a();
       Objects.requireNonNull(uoe);
       if (!PatchProxy.applyVoid(null, uoe, e.class, "26")) {
          Object[] objArray = new Object[0];
          a.D().w("PostStuckDetector", "onEncodeSuspendAll: ", objArray);
          uoe.g(new i(uoe));
       }
       return;
    }
}
