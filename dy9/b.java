package dy9.b;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xq7.d;
import rp7.a;
import qp7.a;
import v6a.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import br7.c;
import java.lang.Boolean;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement$a;
import dy9.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import com.kuaishou.android.model.mix.PhotoAreaInfo;
import qp7.x0;
import java.util.Objects;
import pp7.b;
import brd.t;
import dy9.b$b;
import dy9.b$c;
import erd.g;
import crd.b;
import com.kwai.framework.model.user.User;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import dy9.b$a;
import dy9.b$d;
import qp7.g;
import xq7.e;
import dy9.b$e;
import io.reactivex.internal.functions.Functions;
import android.content.Context;
import java.lang.CharSequence;
import qp7.d;
import br7.b;
import qp7.c;

public final class b extends DispatchBaseElement	// class@001ffb
{
    public QPhoto t;
    public PhotoDetailParam u;
    public a v;
    public BaseFragment w;
    public b x;
    public final GifshowActivity y;

    public void b(GifshowActivity p0,a p1){
       a.p(p0, "activity");
       super(d.J.a(), p1);
       this.y = p0;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "1")) {
       }else {
          a.p(p0, "callerContext");
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.t = mPhoto;
          a c = p0.c;
          a.o(c, "callerContext.mPhotoDetailParam");
          this.u = c;
          m0 o = p0.o;
          a.o(o, "callerContext.mLogListener");
          this.v = o;
          p0 = p0.b;
          a.o(p0, "callerContext.mFragment");
          this.w = p0;
          PatchProxy.onMethodExit(b.class, "1");
       }
       return;
    }
    public a f0(a p0){
       c uoc = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c(p0);
       }
       return uoc;
    }
    public void j0(boolean p0){
       a a;
       b tt1;
       PhotoAreaInfo mAreaName;
       b uob = b.class;
       String str = "2";
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, str)) {
          return;
       }
       if (this.H().Y().b()) {
          a = a.a;
          b tt = this.t;
          if (tt == null) {
             a.S("mPhoto");
          }
          b tu = this.u;
          if (tu == null) {
             a.S("mPhotoDetailParam");
          }
          if (a.a(tt, tu)) {
             this.c0();
             this.n0();
             if (!PatchProxy.applyVoid(null, this, uob, "4")) {
                tt1 = this.t;
                if (tt1 == null) {
                   a.S("mPhoto");
                }
                CommonMeta mPhotoAreaIn = r1.w0(tt1.getEntity()).mPhotoAreaInfo;
                if (mPhotoAreaIn != null) {
                   mAreaName = mPhotoAreaIn.mAreaName;
                   if (mAreaName != null) {
                   label_0069 :
                      c uoc = this.E();
                      Objects.requireNonNull(uoc);
                      if (!PatchProxy.applyVoidOneRefs(mAreaName, uoc, c.class, str)) {
                         a.p(mAreaName, "v");
                         uoc.e.f(mAreaName);
                         uoc.g();
                      }
                   }
                }
                mAreaName = "";
                goto label_0069 ;
             }
             tt1 = this.t;
             if (tt1 == null) {
                a.S("mPhoto");
             }
             tt1 = tt1.observePostChange().subscribe(new b$b(this), b$c.b);
             a.o(tt1, "mPhoto.observePostChange¡­wable.printStackTrace\(\) }");
             this.j(tt1);
             if (this.H().N()) {
                tt1 = this.t;
                if (tt1 == null) {
                   a.S("mPhoto");
                }
                User user = tt1.getUser();
                if (user != null) {
                   uob = this.w;
                   if (uob == null) {
                      a.S("mFragment");
                   }
                   user.startSyncWithFragment(uob.m());
                   tt1 = user.observable().subscribe(new b$a(this), b$d.b);
                   if (tt1 != null) {
                      this.j(tt1);
                   }
                }
             }
          }else {
          label_00e4 :
             this.b0();
          }
       }else {
          goto label_00e4 ;
       }
    label_00e7 :
       g e = Functions.e;
       a.o(e, "Functions.ERROR_CONSUMER");
       this.j(this.D().t(new b$e(this), e));
       return;
    }
    public final void n0(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       a a = a.a;
       b ty = this.y;
       b tt = this.t;
       if (tt == null) {
          a.S("mPhoto");
       }
       b tu = this.u;
       if (tu == null) {
          a.S("mPhotoDetailParam");
       }
       String str = a.b(ty, tt, tu, this.H().O());
       c uoc = (str == null || !str.length())? 1: null;
       if (uoc) {
          this.b0();
       }else {
          uoc = this.E();
          Objects.requireNonNull(uoc);
          if (!PatchProxy.applyVoidOneRefs(str, uoc, c.class, "1")) {
             a.p(str, "v");
             uoc.d.f(str);
             uoc.g();
          }
       }
       return;
    }
    public d q(){
       b uob = PatchProxy.apply(null, this, b.class, "6");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b();
       }
       return uob;
    }
    public c r(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
}
