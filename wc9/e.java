package wc9.e;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import wc9.v;
import wc9.a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.media.MediaPlayer;
import j8c.a;
import java.lang.String;
import java.lang.Throwable;
import w46.b;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import oa0.a;
import java.lang.Boolean;
import lnc.s6;
import android.view.View;
import qc9.a;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import android.view.ViewStub;
import com.kwai.library.widget.textview.StrokedTextView;
import uzc.b;
import wc9.d;
import java.lang.Runnable;
import qxc.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import wc9.e$b;
import q87.c;
import tg9.b;
import com.yxcorp.utility.n;
import ekd.t;
import wc9.e$a;
import wc9.w;
import wc9.r;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import wc9.b;
import t45.c;

public class e extends d	// class@0042f5
{
    public ViewStub n;
    public StrokedTextView o;
    public View p;
    public b q;
    public t r;
    public e$b s;
    public boolean t;
    public boolean u;
    public MediaPlayer v;
    public View w;
    public View x;
    public AbsRecordBottomBarViewBinder y;

    public void e(CameraPageType p0,b p1){
       super(p0, p1);
       this.t = false;
       this.u = false;
       this.v = null;
       this.d.n(v.class, new a(this));
    }
    public static void f2(e p0){
       p0.k2();
    }
    public static void g2(e p0){
       if (p0.u == null && p0.v == null) {
          try{
             p0.v = MediaPlayer.create(a.b(), 0x7f0f0096);
             if (p0.u != null) {
                p0.k2();
             }
          }catch(java.lang.Exception e3){
             a.D().e("BaseCountDownController", "Exception happens while creating the watch dog player.", e3);
             PostUtils.D("BaseCountDownController", "Exception happens while creating the watch dog player.", e3);
          }
       }
    }
    private synchronized void k2(){
       if (PatchProxy.applyVoid(null, this, e.class, "10")) {
          return;
       }
       if (this.v != null) {
          this.v.release();
          this.v = null;
       }
       return;
    }
    public int h2(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.i2()) {
          return a.h();
       }
       int i = (!a.f0())? 0: 3;
       return i;
    }
    public boolean i2(){
       Object obj = PatchProxy.apply(null, this, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return true;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.k(p0);
       d tf = this.f;
       if (tf instanceof a) {
          this.y = tf.zb();
       }
       this.n = p0.findViewById(0x7f0a13c9);
       this.o = p0.findViewById(0x7f0a09a9);
       e tn = this.n;
       View view = null;
       this.q = (tn != null)? new b(tn): view;
       this.u = false;
       this.b2(new d(this));
       tn = this.y;
       View view1 = (tn == null)? view: tn.D();
       this.x = b.a(view1, p0, 0x7f0a0622);
       tn = this.y;
       view1 = (tn == null)? view: tn.I();
       this.w = b.a(view1, p0, 0x7f0a05c9);
       tn = this.y;
       if (tn != null) {
          view = tn.y();
       }
       this.p = b.a(view, p0, 0x7f0a0086);
       return;
    }
    public void l2(e$b p0){
       this.s = p0;
    }
    public void m2(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("BaseCountDownController", "startTicker", objArray);
       e tq = this.q;
       int i1 = 0x7f0a09a9;
       if (tq != null) {
          if (!tq.b()) {
             this.o = this.q.a(i1);
             this.d.j().addView(this.o);
          }else {
             this.o = this.q.a(i1);
          }
       }else {
          this.o = this.l.findViewById(i1);
       }
       n.Y(this.o, i, i);
       tq = this.p;
       if (tq != null) {
          tq.bringToFront();
       }
       int i2 = this.h2();
       e tr = this.r;
       if (tr != null && tr.b()) {
          this.r.a();
       }
       this.t = true;
       e$a uoa = new e$a(this, i2, 1000);
       this.r = uoa;
       uoa.f();
       this.d.m(new w());
       return;
    }
    public void n2(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       e tr = this.r;
       if (tr != null && tr.b()) {
          this.r.a();
       }
       return;
    }
    public boolean onBackPressed(){
       e obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.r;
       boolean b = false;
       if (obj == null || !obj.b()) {
          return b;
       }
       this.n2();
       this.d.m(new r(b));
       CameraLogger.y(406, "click_cancel_count_down");
       return true;
    }
    public void onDestroy(){
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, uoe, "8")) {
          return;
       }
       super.onDestroy();
       this.u = true;
       if (!PatchProxy.applyVoid(null, this, uoe, "9")) {
          c.a(new b(this));
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("BaseCountDownController", "onPause", objArray);
       super.onPause();
       e tr = this.r;
       if (tr != null && tr.b()) {
          this.r.a();
       }
       return;
    }
}
