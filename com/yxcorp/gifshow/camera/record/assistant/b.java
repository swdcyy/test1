package com.yxcorp.gifshow.camera.record.assistant.b;
import com.yxcorp.gifshow.camera.record.base.g;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.assistant.a;
import dc9.b;
import com.yxcorp.gifshow.camera.record.base.d;
import zb9.h1;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate;
import ce9.l;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import zb9.k1;
import java.lang.Runnable;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import java.util.List;
import oc9.z;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import com.yxcorp.gifshow.camera.record.magic.a;
import com.yxcorp.gifshow.camera.record.magic.a$a;
import com.kwai.video.player.KsMediaPlayer;
import hd9.p;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.CDNUrl;
import kp.r1;
import mc6.j;
import android.view.View;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import zb9.j1;
import erd.g;
import crd.b;
import eoc.f;
import zb9.j;
import zb9.i1;
import com.yxcorp.gifshow.camera.record.assistant.a$b;
import zb9.g1;
import cc9.i;
import com.yxcorp.gifshow.model.Lyrics;
import hd9.n;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.yxcorp.gifshow.activity.x;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class b extends d implements g	// class@001cf7
{
    public BaseFeed I;
    public String J;
    public long K;
    public MagicEmoji$MagicFace L;
    public a M;
    public b N;
    public q O;
    public MagicAssistantTemplate P;
    public boolean Q;

    public void b(CameraPageType p0,b p1,a p2,b p3){
       super(p0, p1);
       this.Q = true;
       this.M = p2;
       this.N = p3;
       this.d.n(g.class, new h1(this));
    }
    public boolean H(){
       Object obj = PatchProxy.apply(null, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.L2();
    }
    public long K1(){
       return 0;
    }
    public void K2(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       super.K2();
       this.Q = this.v2();
       return;
    }
    public final boolean L2(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (!this.M.B()) {
          return b;
       }
       obj = this.P;
       MagicEmoji$MagicFace magicFace = (obj != null)? obj.getMagicFace(): this.d.d(l.i).a;
       if (this.I != null && (!TextUtils.x(this.J) && this.O != null)) {
          b tL = this.L;
          if (tL != null && (magicFace != null && (!MagicEmoji$MagicFace.isImmerseMagicFace(tL) && TextUtils.n(this.L.mId, magicFace.mId)))) {
             b = true;
          }
       }
    label_005c :
       return b;
    }
    public final void M2(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "3")) {
          return;
       }
       if (this.L2()) {
          if (!this.r2() && !PatchProxy.applyVoid(null, this, uob, "5")) {
             this.b2(new k1(this));
          }
       }else if(this.r2()){
          if (this.u2()) {
             this.I2();
          }
          this.h2();
       }
       return;
    }
    public void P0(){
       if (PatchProxy.applyVoid(null, this, b.class, "17")) {
          return;
       }
       if (!this.r2()) {
          return;
       }
       this.D2();
       this.E2(this.K);
       if (this.a2()) {
          this.y2();
       }else {
          this.z2();
       }
       return;
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, b.class, "4")) {
          return;
       }
       super.X0(p0, p1, p2, p3);
       this.M2();
       return;
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
       if (PatchProxy.applyVoid(null, this, b.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("UseSampleController", "previewStart", objArray);
       if (!this.r2()) {
          return;
       }
       if (this.l2() != null) {
          this.K = this.l2().getCurrentPosition();
          this.l2().setVolume(0x3f800000, 0x3f800000);
       }
       return;
    }
    public boolean g2(){
       Object obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d.d(a.d.a()).b()) {
          return false;
       }
       return super.g2();
    }
    public KsMediaPlayer h1(){
       Object obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l2() == null) {
          return null;
       }
       return this.l2().h();
    }
    public f i2(){
       p obj = PatchProxy.apply(null, this, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
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
       if (this.I != null && !TextUtils.x(this.J)) {
          this.Y1(f.a(PanelShowEvent.class, new j1(this)));
          this.Y1(this.d.l(j.class, new i1(this)));
          this.M.q().c(new g1(this));
       }
       return;
    }
    public Lyrics m1(){
       Object obj = PatchProxy.apply(null, this, b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.d(n.j).c;
    }
    public void o2(){
       if (PatchProxy.applyVoid(null, this, b.class, "18")) {
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
       Object obj = PatchProxy.apply(null, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l2() == null) {
          return null;
       }
       return this.l2().h();
    }
    public boolean v2(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (super.v2() && this.L2())? true: false;
       return b;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.w1(p0);
       this.I = SerializableHook.getSerializableExtra(p0, "source_photo_origin_photo");
       this.J = p0.getStringExtra("source_photo_origin_file");
       if (p0.hasExtra("magic_face")) {
          this.L = SerializableHook.getSerializableExtra(p0, "magic_face");
       }
       return;
    }
    public boolean w2(){
       return false;
    }
}
