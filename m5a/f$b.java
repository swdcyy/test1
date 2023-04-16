package m5a.f$b;
import foc.m$d;
import m5a.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import ge5.c;
import brd.y;
import k2b.u1;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
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
import sd5.h;
import android.graphics.Bitmap;
import joc.m;

public class f$b extends m$d	// class@002f43
{
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "6")) {
          return;
       }
       this.h();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "7")) {
          return;
       }
       this.h();
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$b.class, "2")) {
          return;
       }
       f z = this.b.z;
       if (z != null && !z.isFinishing()) {
          int i = 3;
          this.b.w.onNext(c.a(i));
          if (this.a != null) {
             u1.K0(i);
             this.b.v.get().setLeaveAction(5);
             if (!e.L()) {
                e.y0(2);
             }
          }
          this.b.z.finish();
          this.b.z.overridePendingTransition(R.anim.arg_RES_7f0100e5, 0x7f0100e5);
          f$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, f.class, "7") && tb.P8()) {
             RxBus.f.b(new b(tb.q.getPhotoId()));
          }
       }
    label_007b :
       return;
    }
    public void d(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$b.class, "4")) {
          return;
       }
       Activity activity = this.b.getActivity();
       f$b tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(objArray, tb, f.class, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tb.s != null){
          if (l.r() && tb.s.l()) {
          label_003e :
             b = true;
          }
       }else if(l.r() && !tb.r.getDetailCommonParam().isFromProfile()){
          goto label_003e ;
       }
       b = false;
       i.h(activity, 0, b);
       this.b.w.onNext(c.a(2));
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "3")) {
          return;
       }
       if (t3.b(this.b.t)) {
          f$b tb = this.b;
          a.d().k(new PlayEvent(tb.q, PlayEvent$Status.RESUME, 13, tb.z.hashCode()));
       }
       m3.g(this.b.getActivity(), this.b.q);
       this.b.w.onNext(c.a(5));
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "5")) {
          return;
       }
       this.b.w.onNext(c.a(4));
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "1")) {
          return;
       }
       if (t3.b(this.b.t) && !this.b.r.getDetailPlayConfig().isContinuePlayWhileExit()) {
          f$b tb = this.b;
          a.d().k(new PlayEvent(tb.q, PlayEvent$Status.PAUSE, 13, tb.z.hashCode()));
       }
       m3.a(this.b.getActivity(), this.b.q);
       this.b.w.onNext(c.a(1));
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "8")) {
          return;
       }
       f x = this.b.x;
       if (x != null && x.get() != null) {
          Bitmap uBitmap = this.b.x.get().a();
          if (uBitmap != null) {
             this.b.A.j(uBitmap);
          }
       }
       return;
    }
}
