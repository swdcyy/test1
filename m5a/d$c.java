package m5a.d$c;
import foc.m$d;
import m5a.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import ge5.c;
import brd.y;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import k2b.u1;
import oe6.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import d0a.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import zf6.l;
import w85.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import ekd.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import uw9.t3;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import uw9.m3;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import sd5.h;
import android.graphics.Bitmap;
import joc.g;

public class d$c extends m$d	// class@002f3d
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "6")) {
          return;
       }
       this.h();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "7")) {
          return;
       }
       this.h();
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$c.class, "2")) {
          return;
       }
       d e = this.b.E;
       if (e != null && !e.isFinishing()) {
          int i = 3;
          this.b.v.onNext(c.a(i));
          if (this.a != null) {
             this.b.u.get().setLeaveAction(i);
             u1.K0(7);
             if (!e.L()) {
                e.y0(2);
             }
          }
          this.b.E.finish();
          this.b.E.overridePendingTransition(R.anim.arg_RES_7f0100e5, 0x7f0100e5);
          d$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, d.class, "11") && tb.R8()) {
             RxBus.f.b(new b(tb.p.getPhotoId()));
          }
       }
    label_007b :
       return;
    }
    public void d(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$c.class, "4")) {
          return;
       }
       Activity activity = this.b.getActivity();
       d$c tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(objArray, tb, d.class, "9");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tb.s != null){
          if (l.r() && tb.s.l()) {
          label_003e :
             b = true;
          }
       }else if(l.r() && !tb.q.getDetailCommonParam().isFromProfile()){
          goto label_003e ;
       }
       b = false;
       i.h(activity, 0, b);
       this.b.v.onNext(c.a(2));
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "3")) {
          return;
       }
       if (t3.b(this.b.r)) {
          d$c tb = this.b;
          a.d().k(new PlayEvent(tb.p, PlayEvent$Status.RESUME, 13, tb.E.hashCode()));
       }
       m3.g(this.b.getActivity(), this.b.p);
       this.b.v.onNext(c.a(5));
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "5")) {
          return;
       }
       this.b.v.onNext(c.a(4));
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "1")) {
          return;
       }
       if (t3.b(this.b.r) && !this.b.q.getDetailPlayConfig().isContinuePlayWhileExit()) {
          d$c tb = this.b;
          a.d().k(new PlayEvent(tb.p, PlayEvent$Status.PAUSE, 13, tb.E.hashCode()));
       }
       m3.a(this.b.getActivity(), this.b.p);
       this.b.v.onNext(c.a(1));
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "8")) {
          return;
       }
       d x = this.b.x;
       if (x != null && x.get() != null) {
          d$c tb = this.b;
          d y = tb.y;
          if (y == null || (y.mShrinkTypeOut == 2 || tb.q.getDetailPlayConfig().isSharePlayer())) {
             Bitmap uBitmap = this.b.x.get().a();
             if (uBitmap != null) {
                this.b.G.i(uBitmap);
             }
          }
       }
       return;
    }
}
