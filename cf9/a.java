package cf9.a;
import oc9.d0;
import cf9.a$a;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import hc9.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import cf9.a$c;
import cf9.a$b;
import cf9.a$e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.widget.CameraRootFrameLayout$a;
import com.yxcorp.gifshow.camera.record.widget.CameraRootFrameLayout;
import android.view.View;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import ze9.c;
import ze9.a;
import j4b.n;
import cf9.a$d;
import erd.g;
import crd.b;
import hc9.e$a;
import o56.c;
import o56.a;
import java.lang.CharSequence;
import e17.i;
import j8c.a;
import w46.b;
import com.yxcorp.gifshow.camerasdk.q;
import q87.c;
import qi9.t1;
import com.kwai.library.widget.popup.common.c;
import java.util.Timer;
import lnc.a1;
import ze9.d;
import java.util.TimerTask;
import android.content.Intent;
import ekd.j0;
import java.lang.StringBuilder;

public final class a extends d0	// class@0005df
{
    public c o;
    public e p;
    public CameraRootFrameLayout q;
    public int r;
    public int s;
    public final CameraRootFrameLayout$a t;
    public final a$b u;
    public final e$a v;
    public final e w;
    public static final a$a x;

    static {
       a.x = new a$a(null);
    }
    public void a(CameraPageType p0,b p1,e p2){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       a.p(p2, "magicAutoApplyStateManager");
       super(p0, p1);
       this.w = p2;
       this.t = a$c.a;
       this.u = new a$b(this);
       this.v = new a$e(this);
    }
    public final void g2(boolean p0){
       a tq;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "7")) {
          return;
       }
       if (p0) {
          tq = this.q;
          if (tq != null) {
             tq.setTouchEventListener(null);
          }
       }else {
          tq = this.q;
          if (tq != null) {
             tq.setTouchEventListener(this.t);
          }
       }
       return;
    }
    public void k(View p0){
       c uoc;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.k(p0);
       if (this.r <= null || this.s <= null) {
          uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (uoc.c()) {
             i.d(R.style.arg_RES_7f11066a, "特效师debug配置下发错误！");
          }
          Object[] objArray = new Object[0];
          a.D().t("PlatformMagicDebugController", "platform magic debug config is error!!!", objArray);
          return;
       }else {
          this.q = this.e.findViewById(0x7f0a369f);
          uoc = new c(this.r);
          this.o = uoc;
          uoc.d(this.u);
          this.Y1(this.d.l(n.class, new a$d(this)));
          this.w.b(this.v);
          return;
       }
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a.p(p0, "camera");
       super.nb(p0);
       Object[] objArray = new Object[0];
       a.D().w("PlatformMagicDebugController", "setCameraHelper", objArray);
       a to = this.o;
       if (to != null && !PatchProxy.applyVoidOneRefs(p0, to, c.class, "1")) {
          a.p(p0, "cameraHelper");
          p0.M0(to.i);
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       a.D().w("PlatformMagicDebugController", "onDestroyView", objArray);
       a tp = this.p;
       if (tp != null) {
          tp.o();
       }
       this.w.i(this.v);
       tp = this.o;
       if (tp != null) {
          tp.d(null);
       }
       tp = this.o;
       if (tp != null) {
          tp.e();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       super.onPause();
       Object[] objArray = new Object[0];
       a.D().w("PlatformMagicDebugController", "onPause", objArray);
       a to = this.o;
       if (to == null || (to.c() == true || this.a2())) {
          to = this.o;
          if (to != null) {
             to.e();
          }
       }
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, a.class, str)) {
          return;
       }
       super.onResume();
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("PlatformMagicDebugController", "onResume", objArray1);
       a to = this.o;
       if (to != null && !PatchProxy.applyVoid(objArray, to, c.class, str)) {
          if (to.g != null) {
             objArray = new Object[i];
             a.D().w("CameraMemoryMonitor", "采样已在进行中！", objArray);
          }else {
             Object[] objArray2 = new Object[i];
             a.D().w("CameraMemoryMonitor", "开始采样！", objArray2);
             to.g = new Timer();
             to.e = a1.k();
             c g = to.g;
             a.m(g);
             g.schedule(new d(to), 500, 500);
          }
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.w1(p0);
       d te = this.e;
       a.o(te, "mActivity");
       this.r = j0.b(te.getIntent(), "delayedTimeInSecond", 0);
       te = this.e;
       a.o(te, "mActivity");
       this.s = j0.b(te.getIntent(), "memoryThreshold", 0);
       Object[] objArray = new Object[0];
       a.D().w("PlatformMagicDebugController", "onCreate...magicDelay:"+this.r+", memoryThreshold:"+this.s, objArray);
       return;
    }
}
