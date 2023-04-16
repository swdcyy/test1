package com.yxcorp.gifshow.camera.record.photo.g;
import com.yxcorp.gifshow.camera.record.magic.e;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.photo.g$a;
import ed9.f;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import j8c.a;
import q87.c;
import java.lang.Runnable;
import yb7.p;
import q16.a$a;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import oc9.q;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import w3b.l;
import android.view.View;
import j4b.e;
import hg9.q;
import erd.g;
import crd.b;
import eoc.f;
import java.lang.StringBuilder;
import android.content.Intent;
import java.lang.Integer;
import l5b.a;
import xi9.n;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig$b;
import gg9.p;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import w46.b;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import java.io.Serializable;
import ekd.j0;
import tkd.b;
import tkd.d;
import uyb.c;

public class g extends e	// class@000eac
{
    public boolean A;
    public Runnable B;
    public final f y;
    public MagicEmoji$MagicFace z;

    public void g(CameraPageType p0,b p1){
       super(p0, p1);
       this.B = new g$a(this);
       this.y = new f(p0);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, g.class, "4")) {
          return;
       }
       super.X0(p0, p1, p2, p3);
       if (this.A != null) {
          if (this.t2(p0)) {
             int i = 0;
             Object[] objArray = new Object[i];
             a.D().w("PhotoMagicController", "showMagicEmoji by presetMagicFace with MagicEmojiFragmentExtraView", objArray);
             this.s2(i);
          }
          p.b(this.B);
          p.e(this.B, 0);
       }
       return;
    }
    public void de(a$a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "7")) {
          return;
       }
       super.de(p0, p1);
       MagicEmoji$MagicFace magicFace = this.E();
       if (magicFace != null) {
          p0.J(magicFace);
       }
       return;
    }
    public MagicBusinessId g2(){
       d obj = PatchProxy.apply(null, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       boolean b = (obj == CameraPageType.LIVE_COVER)? true: false;
       return l.d(l.f(obj, false, b, true));
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       super.k(p0);
       this.Y1(f.a(e.class, new q(this)));
       return;
    }
    public String k2(){
       String obj = PatchProxy.apply(null, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.c == CameraPageType.PHOTO)? "magic-"+this.e: super.k2();
       return obj;
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, g.class, "6")) {
          return;
       }
       super.onActivityCallback(p0, p1, p2);
       if (p0 == 551) {
          a.c(true);
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       super.onDestroy();
       p.b(this.B);
       return;
    }
    public void onResume(){
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, og, "1")) {
          return;
       }
       super.onResume();
       if (!PatchProxy.applyVoid(null, this, og, "12") && (this.g != null && this.E() != null)) {
          this.g.K();
          this.g.V();
       }
    label_002c :
       return;
    }
    public void p2(PanelShowEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "13")) {
          return;
       }
       super.p2(p0);
       if (p0.b != this.c) {
          return;
       }
       if (!PanelShowEvent.a(this.e, p0)) {
          return;
       }
       if (p0.c == PanelShowEvent$PanelType.MORE_OPTION) {
          return;
       }
       this.y.c(p0);
       return;
    }
    public void s2(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "9")) {
          return;
       }
       MagicEmojiPageConfig$b uob = this.i2();
       if (uob != null) {
          uob.g(false);
          g tz = this.z;
          if (tz != null) {
             uob.m(tz);
          }
       }
       super.s2(p0);
       return;
    }
    public final boolean t2(EffectDescription p0){
       g obj = PatchProxy.applyOneRefs(p0, this, g.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.d.d(p.c).a != null) {
          return b;
       }
       if (this.y.a()) {
          return b;
       }
       obj = this.z;
       if (obj != null && (obj.equals(this.E()) && this.l2(p0, this.z))) {
          b = true;
       }
    label_0043 :
       return b;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       super.w1(p0);
       MagicEmojiPageConfig$b uob = this.i2();
       if (uob == null) {
          Object[] objArray = new Object[0];
          a.D().t("PhotoMagicController", "MagicHandler.getMagicEmojiBuilder is null  !!!", objArray);
          return;
       }else {
          uob.i(true);
          if (this.c == CameraPageType.LIVE_COVER) {
             uob.i = true;
          }
          if (!this.e instanceof CameraActivity) {
             MagicEmoji$MagicFace magicFace = j0.e(p0, "magic_face");
             d.a(-314635782).Di(uob.b(), magicFace);
             this.z = magicFace;
             this.A = true;
          }
          return;
       }
    }
}
