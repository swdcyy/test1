package k99.k$a;
import com.kwai.library.widget.imageview.scale.ScaleHelpView$a;
import k99.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import d6a.u;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.p1;
import android.view.MotionEvent;
import java.lang.Boolean;
import com.facebook.drawee.view.DraweeView;
import android.view.View;
import qf5.b;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import io.reactivex.subjects.PublishSubject;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;

public class k$a implements ScaleHelpView$a	// class@002b85
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void a(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "4")) {
          return;
       }
       this.a.t.getLocationOnScreen(p0);
       p0[2] = this.a.t.getMeasuredWidth();
       p0[3] = this.a.t.getMeasuredHeight();
       if (u.a()) {
          p0[1] = p0[1] + p1.f(this.a.getContext());
       }
       return;
    }
    public void b(MotionEvent p0,boolean p1){
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (!p1) {
          this.a.t.onTouchEvent(p0);
       }
       return;
    }
    public void c(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
          return;
       }
       this.a.u.setVisibility(0);
       this.a.S8();
       k$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, k.class, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ZOOM";
          i3 oi3 = i3.f();
          oi3.d("atlas_type", "IMAGE_ATLAS_HORIZONTAL");
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(ta.v.getEntity());
          u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack));
       }
       k r = this.a.r;
       if (r != null) {
          r.onNext(Boolean.TRUE);
       }
       return;
    }
    public void d(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "3")) {
          return;
       }
       this.a.u.setVisibility(8);
       this.a.R8();
       k r = this.a.r;
       if (r != null) {
          r.onNext(Boolean.FALSE);
       }
       return;
    }
    public Bitmap getBitmap(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k$a uoa = k$a.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoa, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       b uob = PatchProxy.apply(objArray, this, uoa, "6");
       if (uob != patchProxyRe) {
       }else {
          k$a ta = this.a;
          uob = ta.q;
          if (uob == null) {
             if (ta.x == null) {
                this.a.t.setVisibility(0);
                uoa = this.a;
                uoa.x = Bitmap.createBitmap(uoa.t.getMeasuredWidth(), this.a.t.getMeasuredHeight(), Bitmap$Config.ARGB_8888);
                this.a.t.draw(new Canvas(this.a.x));
                this.a.t.setVisibility(ta.t.getVisibility());
             }
             uob = this.a.x;
          }
       }
       return uob;
    }
}
