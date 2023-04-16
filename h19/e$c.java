package h19.e$c;
import foc.m$d;
import h19.e;
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
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import d0a.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import ekd.i;
import androidx.fragment.app.Fragment;
import g59.m;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import tkd.b;
import tkd.d;
import vo5.o;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import sd5.h;
import android.graphics.Bitmap;
import joc.g;

public class e$c extends m$d	// class@00253d
{
    public final e b;

    public void e$c(e p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "6")) {
          return;
       }
       this.h();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "7")) {
          return;
       }
       this.h();
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$c.class, "2")) {
          return;
       }
       e a = this.b.A;
       if (a != null && !a.isFinishing()) {
          int i = 3;
          this.b.u.onNext(c.a(i));
          if (this.a != null) {
             this.b.t.get().setLeaveAction(i);
             u1.K0(7);
          }
          this.b.A.finish();
          this.b.A.overridePendingTransition(R.anim.arg_RES_7f0100e5, 0x7f0100e5);
          e$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, e.class, "11") && tb.R8()) {
             RxBus.f.b(new b(tb.p.getPhotoId()));
          }
       }
    label_0071 :
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$c.class, "4")) {
          return;
       }
       Activity activity = this.b.getActivity();
       e$c tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(objArray, tb, e.class, "9");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): tb.q.getDetailCommonParam().isFromProfile() ^ 0x01;
       i.h(activity, 0, b);
       this.b.u.onNext(c.a(2));
       return;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$c.class, "3")) {
          return;
       }
       if (m.b(this.b.r)) {
          a.d().k(new PlayEvent(this.b.p, PlayEvent$Status.RESUME, 13));
       }
       d.a(0x69ae4ec0).Re(this.b.getActivity(), objArray);
       this.b.u.onNext(c.a(5));
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "5")) {
          return;
       }
       this.b.u.onNext(c.a(4));
       return;
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$c.class, "1")) {
          return;
       }
       if (m.b(this.b.r) && !this.b.q.getDetailPlayConfig().isContinuePlayWhileExit()) {
          a.d().k(new PlayEvent(this.b.p, PlayEvent$Status.PAUSE, 13));
       }
       d.a(0x69ae4ec0).XM(this.b.getActivity(), objArray);
       this.b.u.onNext(c.a(1));
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "8")) {
          return;
       }
       e w = this.b.w;
       if (w != null && w.get() != null) {
          e$c tb = this.b;
          e x = tb.x;
          if (x == null || (x.mShrinkTypeOut == 2 || tb.q.getDetailPlayConfig().isSharePlayer())) {
             Bitmap uBitmap = this.b.w.get().a();
             if (uBitmap != null) {
                this.b.B.i(uBitmap);
             }
          }
       }
       return;
    }
}
