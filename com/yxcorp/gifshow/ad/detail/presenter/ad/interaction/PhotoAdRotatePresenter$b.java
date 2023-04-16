package com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$b;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import mxb.f0;
import com.yxcorp.gifshow.entity.QPhoto;
import tz8.a;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import java.lang.Double;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import iz.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo;
import mxb.c;
import java.lang.Runnable;
import ekd.k1;

public final class PhotoAdRotatePresenter$b extends a	// class@0015ac
{
    public final PhotoAdRotatePresenter b;

    public void PhotoAdRotatePresenter$b(PhotoAdRotatePresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoAdRotatePresenter$b.class, "2")) {
          return;
       }
       PhotoAdRotatePresenter$b tb = this.b;
       boolean b = false;
       tb.A = b;
       if (tb.w != null) {
          f0 uof0 = b.a(-762347696);
          QPhoto mEntity = PhotoAdRotatePresenter.P8(this.b).mEntity;
          PhotoAdRotatePresenter q = this.b.q;
          if (q != null) {
             objArray = PatchProxy.apply(objArray, q, a.class, "8");
             if (objArray != PatchProxyResult.class) {
             }else {
                i3 oi3 = i3.f();
                oi3.c("x", Double.valueOf(q.c[b]));
                oi3.c("y", Double.valueOf(q.c[1]));
                oi3.c("z", Double.valueOf(q.c[2]));
                objArray = oi3.e();
                a.o(objArray, "JsonStringBuilder.newIns¡­\", mMaxDegree[2]\).build\(\)");
             }
          }
          uof0.r1(mEntity, "rotate_angle", objArray);
       }
       this.b.V8();
       return;
    }
    public void i2(){
       int i;
       if (PatchProxy.applyVoid(null, this, PhotoAdRotatePresenter$b.class, "1")) {
          return;
       }
       this.b.A = true;
       if (!a.b()) {
          PhotoAdRotatePresenter$b tb = this.b;
          PhotoAdRotatePresenter s = tb.s;
          PhotoAdvertisement$RotationInfo rotationInfo = c.y(PhotoAdRotatePresenter.P8(tb).mEntity);
          rotationInfo = (rotationInfo != null)? rotationInfo.mRotateEnableDelayTimeMs: 0;
          k1.r(s, (long)rotationInfo);
       }
       return;
    }
}
