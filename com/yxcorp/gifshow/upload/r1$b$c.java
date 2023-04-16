package com.yxcorp.gifshow.upload.r1$b$c;
import erd.g;
import com.yxcorp.gifshow.upload.r1$b;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ojd.f;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.upload.r1;
import z30.n0;
import com.kuaishou.edit.draft.Workspace;
import z30.o0;
import qq.a;
import q87.c;
import java.io.File;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.u0;

public class r1$b$c implements g	// class@001ea1
{
    public final r1$b b;

    public void r1$b$c(r1$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r1$b$c.class, "1")) {
       }else {
          p0 = this.b.d;
          if (p0 != null) {
             p0.a(100, 100, this);
          }
          if (PostExperimentUtils.J0()) {
             p0.mStatus = IUploadInfo$Status.SUCCEED;
             p0 = this.b;
             p0.o.m(p0.b);
          }
          p0.mStatus = IUploadInfo$Status.COMPLETE;
          if (o0.a(this.b.b.getWorkSpace()) != null) {
             int i = 0;
             Object[] objArray = new Object[i];
             a.D().w("UploadManager", "accept: remove workspace\(\)", objArray);
             u0.b(new File(this.b.b.getWorkspacePath()), i, true, null);
          }
          p0 = this.b;
          p0.o.m(p0.b);
       }
       return;
    }
}
