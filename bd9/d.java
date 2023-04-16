package bd9.d;
import oc9.e0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager;
import cd9.k;
import dd9.g;
import com.yxcorp.gifshow.camera.record.duet.controller.a;
import oc9.t;
import com.yxcorp.gifshow.camera.record.base.d;
import vf9.y1;
import bd9.b;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import bd9.e;
import bd9.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camerasdk.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import com.kwai.video.player.KsMediaPlayer;
import java.lang.Integer;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager$LayoutMode;
import android.view.View;
import android.app.Activity;
import android.view.ViewStub;
import com.kwai.video.player.IMediaPlayer;
import qh9.c;
import android.view.MotionEvent;
import java.lang.Boolean;
import android.graphics.RectF;
import android.widget.ImageView;
import lnc.a1;
import android.content.Intent;
import com.kwai.framework.model.feed.BaseFeed;
import r8c.x;
import lnc.s6;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import java.lang.StringBuilder;
import mc9.a;
import bd9.c;
import erd.g;
import crd.b;

public abstract class d extends e0	// class@000471
{
    public BaseFeed q;
    public String r;
    public DuetLayoutManager s;
    public k t;
    public g u;
    public a v;
    public boolean w;
    public boolean x;

    public void d(CameraPageType p0,b p1){
       super(p0, p1);
       this.x = true;
       this.s = new DuetLayoutManager(p0, p1, this);
       this.t = new k(p0, p1, this);
       this.u = new g(p0, p1, this);
       this.v = new a(p0, p1, this);
       this.L0(this.u);
       this.L0(this.s);
       this.L0(this.t);
       this.L0(this.v);
       this.g2();
       this.d.n(y1.class, b.a);
       this.d.n(e.class, new a(this));
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       if (this.w != null) {
          super.A0();
       }
       return;
    }
    public q G2(){
       return this.h;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       if (this.w != null) {
          super.I7();
       }
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, d.class, "12")) {
          return;
       }
       if (this.w != null) {
          super.P1();
       }
       return;
    }
    public void g2(){
    }
    public int h2(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d.class, "16");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       if (this.w == null) {
          i = 0;
       }else {
          obj = this.u;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, g.class, "18");
          i = (obj1 != patchProxyRe)? obj1.intValue(): (int)obj.g2().getCurrentPosition();
       }
       return i;
    }
    public void i2(int p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "15")) {
          return;
       }
       uod = this.s;
       Objects.requireNonNull(uod);
       DuetLayoutManager uDuetLayoutM = DuetLayoutManager.class;
       if (!PatchProxy.isSupport(uDuetLayoutM) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), uod, uDuetLayoutM, "12")) {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("duet", "onGetOriginVideoSize", objArray);
          if (p0 >= p1) {
             i = true;
          }
          uod.w = i;
          uod.y = p0;
          uod.z = p1;
          DuetLayoutManager$LayoutMode uP = (i)? DuetLayoutManager$LayoutMode.UP: DuetLayoutManager$LayoutMode.LEFT;
          uod.v = uP;
          uod.h2();
       }
       return;
    }
    public long ie(){
       return 0;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       if (this.w != null) {
          ViewStub viewStub = this.e.findViewById(R.id.preview_control_layout_stub);
          if (viewStub != null) {
             viewStub.inflate();
          }
          super.k(p0);
       }
       return;
    }
    public void k2(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "14")) {
          return;
       }
       uod = this.s;
       Objects.requireNonNull(uod);
       DuetLayoutManager uDuetLayoutM = DuetLayoutManager.class;
       if (!PatchProxy.isSupport(uDuetLayoutM) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uod, uDuetLayoutM, "13") && uod.x != p0)) {
          uod.x = p0;
          uod.h2();
       }
       return;
    }
    public void l2(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "18")) {
          return;
       }
       if (this.w != null) {
          d tu = this.u;
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoidOneRefs(p0, tu, g.class, "19")) {
             tu.D = true;
             tu.v = (int)p0.getDuration();
             tu.r.seekTo(tu.w);
          }
          this.d.m(new c(this.x));
          this.x = false;
       }
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       super.nb(p0);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       if (this.w != null) {
          super.onDestroy();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       if (this.w != null) {
          super.onPause();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       if (this.w != null) {
          super.onResume();
       }
       return;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "4");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       boolean b = false;
       if (this.w == null) {
          return b;
       }
       if (!this.s.onBackPressed()) {
          d tu = this.u;
          Objects.requireNonNull(tu);
          g og = g.class;
          Object obj = PatchProxy.applyOneRefs(p1, tu, og, "25");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(tu.D == null || (tu.A == null || (!tu.u.contains(p1.getRawX(), p1.getRawY()) || (tu.B != null || tu.t.a2())))){
             int action = p1.getAction();
             if (action) {
                if (action != 1) {
                   if (action == 3) {
                      tu.s.setPressed(b);
                   }
                }else {
                   tu.s.setPressed(b);
                   if (!PatchProxy.applyVoid(null, tu, og, "31") && tu.D != null) {
                      if (tu.r.isPlaying()) {
                         tu.r.pause();
                         tu.z = b;
                      }else if(!tu.t.a2()){
                         tu.r.start();
                         tu.z = true;
                      }
                   }
                   tu.i2();
                }
             }else if(a1.o(tu.x) - 800 < 0){
                tu.s.setPressed(true);
                tu.x = a1.k();
             }
             b1 = true;
          }
       label_003d :
          b1 = false;
          if (!b1) {
          label_00c9 :
             return b;
          }
       }
       b = true;
       goto label_00c9 ;
    }
    public void qb(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       if (this.w != null) {
          this.u.qb();
          this.v.qb();
       }
       super.qb();
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, d.class, "13")) {
          return;
       }
       if (this.w != null) {
          super.s0();
       }
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       if (this.w != null) {
          super.w();
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.q = x.b(p0);
       this.r = x.a(p0);
       super.w1(p0);
       if (!s6.H()) {
          String str = "duet_enter_fail";
          if (this.q == null) {
             PostUtils.x(str, "photo null");
             return;
          }else if(TextUtils.x(this.r) || !new File(this.r).exists()){
             PostUtils.x(str, "file "+this.r);
             return;
          }
       }
       this.d.l(a.class, new c(this));
       this.w = true;
       return;
    }
}
