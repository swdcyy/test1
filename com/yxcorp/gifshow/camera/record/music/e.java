package com.yxcorp.gifshow.camera.record.music.e;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import java.lang.Integer;
import com.kwai.video.player.KsMediaPlayer;
import ekd.y0;
import java.lang.Throwable;
import w46.b;
import android.view.View;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import vf9.v;
import erd.g;
import crd.b;
import eoc.f;
import wc9.r;
import vf9.w;
import b46.a;
import vf9.x;
import java.lang.Boolean;
import oc9.b0;
import oc9.a0;

public class e extends d0	// class@000e72
{
    public boolean A;
    public final String o;
    public KsMediaPlayer p;
    public boolean q;
    public boolean r;
    public y0 s;
    public long t;
    public long u;
    public int v;
    public boolean w;
    public int x;
    public boolean y;
    public boolean z;

    public void e(CameraPageType p0,b p1){
       super(p0, p1);
       this.o = "MusicAutoPreviewController";
       this.r = true;
       this.z = false;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       this.g2(1);
       Object[] objArray = new Object[0];
       a.D().w("MusicAutoPreviewController", "start capture", objArray);
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       this.l2(true);
       Object[] objArray = new Object[0];
       a.D().w("MusicAutoPreviewController", "reset capture", objArray);
       return;
    }
    public void d5(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "10")) {
          return;
       }
       super.d5(p0);
       this.v = p0;
       if (p0 == 5 && this.w == null) {
          this.g2(0);
       }else if(this.z == null){
          this.g2(4);
       }else {
          this.k2();
       }
       return;
    }
    public final void g2(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "15")) {
          return;
       }
       uoe = this.p;
       if (uoe != null && uoe.isPlaying()) {
          Object[] objArray = new Object[0];
          a.D().w("MusicAutoPreviewController", "block playing previewer", objArray);
          this.p.pause();
          this.q = true;
       }
       this.r = false;
       this.x = p0;
       e ts = this.s;
       if (ts != null) {
          ts.e();
       }
       return;
    }
    public void h2(){
       e tp;
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       boolean b = false;
       try{
          tp = this.p;
          if (tp != null && tp.isPlaying()) {
             this.p.stop();
          label_001c :
             tp = this.s;
             if (tp != null) {
             }
          }else {
             goto label_001c ;
          }
          this.q = b;
          return;
       }catch(java.lang.IllegalStateException e1){
          Object[] objArray = new Object[b];
          a.D().u("MusicAutoPreviewController", e1, objArray);
          tp = this.s;
          if (tp != null) {
          }else {
             goto label_0023 ;
          }
       }
       tp.e();
       goto label_0023 ;
    }
    public final void i2(){
       if (PatchProxy.applyVoid(null, this, e.class, "18")) {
          return;
       }
       if (this.u) {
          e ts = this.s;
          if (ts != null) {
             ts.d();
          }
       }
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       super.k(p0);
       this.Y1(f.a(PanelShowEvent.class, new v(this)));
       this.Y1(this.d.l(r.class, new w(this)));
       this.Y1(f.a(a.class, new x(this)));
       return;
    }
    public final void k2(){
       if (PatchProxy.applyVoid(null, this, e.class, "16")) {
          return;
       }
       this.l2(false);
       return;
    }
    public final void l2(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "17")) {
          return;
       }
       if (!(this.A ^ 1)) {
          return;
       }
       if (this.q != null) {
          uoe = this.p;
          if (uoe != null && (!uoe.isPlaying() && !this.a2())) {
             try{
                if (p0) {
                   this.p.seekTo(this.t);
                }
                this.p.start();
                this.i2();
                Object[] objArray = new Object[0];
                a.D().w("MusicAutoPreviewController", "restart previewer", objArray);
             }catch(java.lang.IllegalStateException e5){
                a.D().e("MusicAutoPreviewController", "restart failed, player not ready", e5);
             }
          }
       }
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, e.class, "11")) {
          return;
       }
       super.onDestroyView();
       this.g2(3);
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       this.z = false;
       super.onPause();
       this.g2(2);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       if (this.v == 5 && this.w == null) {
          this.g2(0);
       }else {
          this.k2();
       }
       this.z = true;
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, e.class, "9")) {
          return;
       }
       a0.g(this);
       this.g2(1);
       Object[] objArray = new Object[0];
       a.D().w("MusicAutoPreviewController", "count down interrupt start, blocked", objArray);
       return;
    }
}
