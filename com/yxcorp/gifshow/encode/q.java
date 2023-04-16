package com.yxcorp.gifshow.encode.q;
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
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import dnc.x0;
import com.yxcorp.gifshow.postwork.e;
import gq.a;
import q87.c;
import f0c.j;
import java.lang.Runnable;

public final class q implements EncodeManager$c	// class@000d47
{
    public final EncodeManager a;

    public void q(EncodeManager p0){
       this.a = p0;
    }
    public final void a(ExportTask p0,int p1){
       q ta = this.a;
       Objects.requireNonNull(ta);
       EncodeManager uEncodeManag = EncodeManager.class;
       if (!PatchProxy.isSupport(uEncodeManag) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), ta, uEncodeManag, "64")) {
          a uoa = ta.r().g4(p1);
          if (uoa != null) {
             if (PostExperimentUtils.h()) {
                uoa.resetPauseProgress();
                float f = 0;
                if (uoa.getEncodeInfo() != null) {
                   uoa.getEncodeInfo().mProgress = f;
                }
                if (uoa.getUploadInfo() != null) {
                   uoa.getUploadInfo().setProgress(f);
                }
             }
             ta.q().p(uoa.getId());
          }
       }
       e uoe = e.a();
       Objects.requireNonNull(uoe);
       if (!PatchProxy.applyVoid(null, uoe, e.class, "27")) {
          Object[] objArray = new Object[0];
          a.D().w("PostStuckDetector", "onEncodeResumeAll: ", objArray);
          uoe.g(new j(uoe));
       }
       return;
    }
}
