package com.yxcorp.gifshow.upload.r1$b$b;
import erd.g;
import com.yxcorp.gifshow.upload.r1$b;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ojd.f;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.yxcorp.gifshow.upload.r1;
import com.kwai.robust.PatchProxyResult;
import brd.a0;
import com.yxcorp.gifshow.upload.p1;
import erd.o;
import t45.d;
import brd.z;
import dnc.o2;
import dnc.n2;
import com.yxcorp.gifshow.upload.v1;
import erd.a;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.upload.w1;
import crd.b;

public class r1$b$b implements g	// class@001ea0
{
    public final r1$b b;

    public void r1$b$b(r1$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r1$b$b.class, "1")) {
       }else {
          r1$b d = this.b.d;
          if (d != null) {
             d.a(100, 100, this);
          }
          this.b.b.mUploadResult = p0.a();
          if (PostExperimentUtils.J0()) {
             p0.mStatus = IUploadInfo$Status.SUCCEED;
             p0 = this.b;
             p0.o.m(p0.b);
          }else {
             p0.mStatus = IUploadInfo$Status.COMPLETE;
          }
          p0 = this.b.b;
          a0 uoa0 = PatchProxy.applyOneRefs(p0, null, r1.class, "20");
          if (uoa0 != PatchProxyResult.class) {
          }else {
             uoa0 = a0.B(p0).C(p1.b).T(d.c);
          }
          uoa0.G(d.c).u(new o2(this)).u(new n2(this)).G(d.a).m(new v1(this)).R(Functions.d(), w1.b);
       }
       return;
    }
}
