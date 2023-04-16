package a5a.a;
import nd5.b;
import android.app.Activity;
import joc.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a5a.a$b;
import java.lang.Number;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import uw9.b0;
import uw9.m3;
import android.content.Context;
import ekd.l1;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import id5.o;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import joc.g;
import ge5.d;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import foc.t;
import foc.y;
import joc.m;
import joc.l;
import android.view.View;
import com.yxcorp.gifshow.util.c;
import a5a.a$a;
import com.kwai.feature.api.feed.detail.router.biz.normal.ToProfilePlan;
import joc.i;
import qrd.p;
import com.yxcorp.gifshow.widget.SwipeLayout$Direction;
import com.yxcorp.gifshow.widget.SwipeLayout;

public class a extends b	// class@000034
{
    public NormalDetailBizParam u;
    public QPhoto v;

    public void a(boolean p0){
       super(p0);
    }
    public o P8(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$b(this, p0, p0);
    }
    public int R8(){
       b obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.t;
       if (obj != -1) {
          return obj;
       }
       Activity activity = this.getActivity();
       int i = 0;
       if (activity != null) {
          PhotoDetailParam mPhoto = this.p.mPhoto;
          if (mPhoto != null) {
             if (!b0.c(activity, mPhoto)) {
                i = m3.f(activity, this.p.mPhoto);
             }
             this.t = i;
             if (l1.a(activity)) {
                this.t = this.t + n.A(activity);
             }
             return this.t;
          }
       }
       return i;
    }
    public void S8(Activity p0){
       a tu;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NasaExperimentUtils nasaExperime = NasaExperimentUtils.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       if (this.r == null && !o.a()) {
          tu = this.u;
          if (tu.mFromSlidePlayPhotoClick == null) {
             this.q.c = new g(p0, tu.mShrinkTypeOut, this.R8());
             t ot = y.a(this.p.getDetailCommonParam().getUnserializableBundleId());
             b uob = (ot != null && ot.h())? 1: null;
             if (uob) {
                this.q.d = new m(p0, this.u.mShrinkTypeOut, this.R8());
             }else {
                this.q.e = new l(this.s);
                this.q.e.m(new c(p0));
             }
          }else {
             a$a uoa = new a$a(this, p0, p0);
             b tq1 = this.q;
             tq1.i = uoa;
             tq1.h = uoa;
          }
       }
       if (this.u.mToProfilePlan.isSmooth()) {
          i oi = new i();
          tu = this.v;
          if (tu != null && (tu.isLongPhotos() || this.v.isAtlasPhotos())) {
             Number number = PatchProxy.apply(null, null, nasaExperime, "27");
             if (number == patchProxyRe) {
                number = NasaExperimentUtils.A.getValue();
             }
             float f = number.floatValue();
             if (f > 0) {
                oi.d = f;
             }
             Number number1 = PatchProxy.apply(null, null, nasaExperime, "28");
             if (number1 == patchProxyRe) {
                number1 = NasaExperimentUtils.B.getValue();
             }
             float f1 = number1.floatValue();
             if (f1 > 0) {
                oi.e = f1;
             }
          }
       label_00d9 :
          b tq = this.q;
          tq.g = oi;
          tq.f = new l();
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       if (this.r != null) {
          this.s.setDirection(SwipeLayout$Direction.BOTH);
       }else if(!this.u.mToProfilePlan.isSmooth()){
          this.s.setDirection(SwipeLayout$Direction.LEFT);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       this.u = this.q8(NormalDetailBizParam.class);
       this.v = this.s8(QPhoto.class);
       return;
    }
}
