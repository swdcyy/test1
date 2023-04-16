package mz9.a;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import mz9.a$a;
import nsd.u;
import jh5.a;
import hs7.d;
import rp7.a;
import mz9.a$b;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import ls7.d;
import java.lang.Boolean;
import le5.f;
import ok.x;
import com.yxcorp.gifshow.model.config.InternalNegativeFeedbackConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qp7.c;
import qp7.b;
import ls7.c;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import mz9.a$c;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import zz5.d;
import mz9.a$d;
import qp7.b1;
import android.app.Activity;
import qp7.d;
import ls7.b;

public final class a extends DispatchBaseElement	// class@0030aa
{
    public String t;
    public QPhoto u;
    public Activity v;
    public BaseFragment w;
    public final g x;
    public static final a$a y;

    static {
       a.y = new a$a(null);
    }
    public void a(a p0){
       super(d.b, p0);
       this.t = "";
       this.x = new a$b(this);
    }
    public void P(a p0){
       a a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "13")) {
       }else {
          a.p(p0, "callerContext");
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.u = mPhoto;
          a = p0.a;
          a.o(a, "callerContext.mActivity");
          this.v = a;
          p0 = p0.b;
          a.o(p0, "callerContext.mFragment");
          this.w = p0;
          PatchProxy.onMethodExit(a.class, "13");
       }
       return;
    }
    public a f0(a p0){
       d uod = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d();
       }
       return uod;
    }
    public void j0(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "7")) {
          return;
       }
       InternalNegativeFeedbackConfig internalNega = f.w.get();
       if (internalNega != null && !TextUtils.x(internalNega.mFeedBackUrl)) {
          internalNega = internalNega.mFeedBackUrl;
          a.o(internalNega, "negativeFeedbackConfig.mFeedBackUrl");
          this.t = internalNega;
       }
       g e = Functions.e;
       a.o(e, "Functions.ERROR_CONSUMER");
       this.j(this.A().a(this.x, e));
       a tu = this.u;
       if (tu == null) {
          a.S("mPhoto");
       }
       uoa = this.w;
       if (uoa == null) {
          a.S("mFragment");
       }
       d.b(tu, uoa, new a$c(this));
       this.i(new a$d(this));
       return;
    }
    public final Activity n0(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("mActivity");
       }
       return obj;
    }
    public d q(){
       b uob = PatchProxy.apply(null, this, a.class, "11");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b();
       }
       return uob;
    }
    public c r(){
       c uoc = PatchProxy.apply(null, this, a.class, "12");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c();
       }
       return uoc;
    }
}
