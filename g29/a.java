package g29.a;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import g29.a$a;
import nsd.u;
import hs7.d;
import rp7.a;
import jh5.a;
import g29.a$b;
import android.app.Activity;
import java.lang.String;
import kotlin.jvm.internal.a;
import qp7.a;
import w19.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import ls7.d;
import java.lang.Boolean;
import g59.i;
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
import g29.a$c;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import zz5.d;
import g29.a$d;
import qp7.b1;
import qp7.d;
import ls7.b;

public final class a extends DispatchBaseElement	// class@0023ed
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
    public void a(){
       super(d.b, null);
       this.t = "";
       this.x = new a$b(this);
    }
    public static final Activity n0(a p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mActivity");
       }
       return p0;
    }
    public void P(a p0){
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
       }else {
          a.p(p0, "callerContext");
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.u = mPhoto;
          a = p0.a;
          a.o(a, "callerContext.mActivity");
          this.v = a;
          d b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.w = b;
       }
       return;
    }
    public a f0(a p0){
       d uod = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d();
       }
       return uod;
    }
    public void j0(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       InternalNegativeFeedbackConfig internalNega = i.c.get();
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
    public d q(){
       b uob = PatchProxy.apply(null, this, a.class, "5");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b();
       }
       return uob;
    }
    public c r(){
       c uoc = PatchProxy.apply(null, this, a.class, "6");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c();
       }
       return uoc;
    }
}
