package f72.b0;
import k51.c;
import f72.b0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t99.y;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import android.animation.ObjectAnimator;
import android.view.View;
import com.kuaishou.live.common.core.basic.degrade.j;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import t99.w;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b0 extends c	// class@0028c2
{
    public View p;
    public View q;
    public ObjectAnimator r;
    public ObjectAnimator s;
    public QPhoto t;
    public LiveAutoPlayModule u;
    public final y v;
    public static String sLivePresenterClassName = "LiveDoubleListFeedRightBottomLabelPresenter";

    public void b0(){
       super();
       this.v = new b0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "3")) {
          return;
       }
       this.u.O(this.v);
       return;
    }
    public void J8(){
       b0 uob0 = b0.class;
       if (PatchProxy.applyVoid(null, this, uob0, "4")) {
          return;
       }
       this.u.e0(this.v);
       if (!PatchProxy.applyVoid(null, this, uob0, "9")) {
          uob0 = this.r;
          if (uob0 != null) {
             uob0.removeAllListeners();
             this.s.removeAllListeners();
          }
       }
       return;
    }
    public final void P8(){
       ObjectAnimator objectAnimat;
       if (PatchProxy.applyVoid(null, this, b0.class, "8")) {
          return;
       }
       int i = 2;
       if (this.r == null) {
          objectAnimat = j.a(this.q, new float[i]{0,0x3f800000});
          this.r = objectAnimat;
          objectAnimat.setDuration(600);
       }
       if (this.s == null) {
          objectAnimat = j.a(this.q, new float[i]{0x3f800000,0});
          this.s = objectAnimat;
          objectAnimat.setDuration(600);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "7")) {
          return;
       }
       if (this.q == null) {
          this.q = this.p.findViewById(0x7f0a363e);
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "6")) {
          return;
       }
       this.R8();
       if (this.q == null) {
          return;
       }
       this.P8();
       this.s.start();
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "5")) {
          return;
       }
       if (w.b(this.t.mEntity)) {
          return;
       }
       this.R8();
       if (this.q == null) {
          return;
       }
       this.P8();
       this.r.start();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "1")) {
          return;
       }
       this.p = p0;
       this.q = m1.f(p0, 0x7f0a363e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "2")) {
          return;
       }
       this.t = this.q8(QPhoto.class);
       this.u = this.r8("AUTO_PLAY_LIVE_MODULE");
       return;
    }
}
