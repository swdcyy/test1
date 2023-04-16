package com.yxcorp.gifshow.camera.record.followshoot.b;
import com.yxcorp.gifshow.camera.record.base.g;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.d;
import hd9.i;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import ed9.h;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import e17.s;
import oc9.b0;
import oc9.a0;
import java.util.List;
import oc9.z;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import com.yxcorp.gifshow.camera.record.magic.a;
import com.yxcorp.gifshow.camera.record.magic.a$a;
import com.kwai.video.player.KsMediaPlayer;
import hd9.p;
import mc6.j;
import android.view.View;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import hd9.m;
import erd.g;
import crd.b;
import eoc.f;
import jd9.g;
import hd9.k;
import com.yxcorp.gifshow.model.Lyrics;
import hd9.n;
import java.lang.Integer;
import vf9.j0;
import android.os.SystemClock;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.yxcorp.gifshow.activity.x;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import ed9.j;
import hd9.j;
import mc9.a;
import hd9.l;
import vf9.y1;

public class b extends d implements g	// class@000dc7
{
    public BaseFeed I;
    public String J;
    public boolean K;
    public long L;
    public boolean M;

    public void b(CameraPageType p0,b p1){
       super(p0, p1);
       this.M = false;
       this.d.n(g.class, new i(this));
    }
    public boolean H(){
       return true;
    }
    public long K1(){
       return 0;
    }
    public final void L2(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       String str = r1.E0(this.I);
       float f = (r1.W1(this.I) > 0 && r1.U0(this.I) > 0)? r1.C1(this.I): 0x3fe38e39;
       h oh = new h(f, this.J, str, null, this.K, false);
       this.s2(v0);
       return;
    }
    public boolean M2(){
       Object obj = PatchProxy.apply(null, this, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.J) ^ 0x01);
    }
    public void P0(){
       if (PatchProxy.applyVoid(null, this, b.class, "14")) {
          return;
       }
       if (!this.r2()) {
          return;
       }
       this.D2();
       this.E2(this.L);
       if (this.a2()) {
          this.y2();
       }else {
          this.z2();
       }
       return;
    }
    public boolean R0(){
       Object obj = PatchProxy.apply(null, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.M2()) {
          return a0.b(this);
       }
       s.b("资源加载中，暂不可拍摄");
       return true;
    }
    public g d(List p0){
       return z.a(this, p0);
    }
    public Object d(List p0){
       return z.b(this, p0);
    }
    public boolean d1(){
       return false;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, b.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("UseSampleController", "previewStart", objArray);
       if (!this.r2()) {
          return;
       }
       if (this.l2() != null) {
          this.L = this.l2().getCurrentPosition();
          this.l2().setVolume(0x3f800000, 0x3f800000);
       }
       return;
    }
    public boolean g2(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d.d(a.d.a()).b()) {
          return false;
       }
       if (this.M != null) {
          return false;
       }
       return super.g2();
    }
    public KsMediaPlayer h1(){
       Object obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l2() == null) {
          return null;
       }
       return this.l2().h();
    }
    public f i2(){
       Object[] objArray = null;
       p obj = PatchProxy.apply(objArray, this, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.J)) {
          return objArray;
       }
       obj = new p();
       obj.setVolume(0, 0);
       obj.k(j.c(r1.H0(this.I), this.I.getId()));
       obj.i(this.J);
       return obj;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       super.k(p0);
       this.L2();
       this.Y1(f.a(PanelShowEvent.class, new m(this)));
       this.d.l(g.class, new k(this));
       return;
    }
    public Lyrics m1(){
       Object obj = PatchProxy.apply(null, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.d(n.j).c;
    }
    public void m2(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "16")) {
          return;
       }
       super.m2(p0, p1);
       if (p0 == 0x2712 || (p0 == 0x2714 && (this.h1() != null && this.d.d(n.j).g != null))) {
          Object[] objArray = new Object[0];
          a.D().s("UseSampleController", "postEvent MusicRenderingStartEvent", objArray);
          this.d.m(new j0((int)(this.h1().getAudioRawLatencySeconds() * 1000.00f), 0, SystemClock.uptimeMillis()));
       }
    label_0061 :
       return;
    }
    public void o2(){
       if (PatchProxy.applyVoid(null, this, b.class, "15")) {
          return;
       }
       super.o2();
       if (!this.a2()) {
          this.E2(0);
          this.z2();
       }else if(this.a2()){
          this.D2();
          this.E2(this.k2());
       }
       if (this.l2() != null) {
          this.l2().j(this.E, this.I.a(PhotoMeta.class).mPhotoId, this.e.N2().b());
       }
       return;
    }
    public KsMediaPlayer r(){
       Object obj = PatchProxy.apply(null, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l2() == null) {
          return null;
       }
       return this.l2().h();
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.w1(p0);
       this.I = SerializableHook.getSerializableExtra(p0, "source_photo_origin_photo");
       this.J = p0.getStringExtra("source_photo_origin_file");
       this.K = p0.getBooleanExtra("show_follow_shoot_sample", true);
       this.d.l(j.class, new j(this));
       this.d.l(a.class, new l(this));
       return;
    }
    public boolean w2(){
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d.d(n.j).g == null) {
          return false;
       }
       return this.d.d(y1.c).b;
    }
}
