package com.yxcorp.gifshow.camera.record.music.d;
import ui9.b;
import oc9.d0;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.d;
import qc9.a;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import vf9.r;
import vf9.h;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vf9.f0;
import com.kuaishou.android.model.music.Music;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import java.lang.Boolean;
import ce9.l;
import vf9.b;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camerasdk.q;
import j8c.a;
import q87.c;
import wkd.b;
import rfc.a;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.camera.record.music.c;
import vf9.m;
import vf9.o;
import erd.g;
import crd.b;
import ssb.g;
import ssb.h;
import java.lang.Long;
import vf9.l;
import vf9.n;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.rx.RxBus;
import vf9.g;
import com.kwai.feature.post.api.music.data.MusicSource;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import q2b.h$b;
import k2b.e0;
import k2b.u1;
import androidx.fragment.app.Fragment;
import tkd.b;
import tkd.d;
import a46.c;
import lnc.s;
import android.app.Activity;
import android.widget.ImageView;
import yf9.b;
import hd9.n;
import wd9.a;
import wd9.b;
import ug9.c;
import wc9.v;
import bh9.s;
import nc9.b;
import lnc.s6;
import fe9.a;
import hc9.e;
import ic9.b;
import xi9.n;
import com.yxcorp.gifshow.model.response.MagicMusicsResponse;
import java.util.List;
import android.view.View;
import qxc.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import vf9.k;
import eoc.f;
import vf9.g0;
import vf9.j;
import bn8.a;
import zb9.p0;
import vf9.i;
import vf9.p;
import java.lang.Runnable;
import zb9.p0$a;
import com.kwai.library.widget.popup.bubble.a$c;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.camera.record.music.d$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public class d extends d0 implements b	// class@000e71
{
    public String o;
    public String p;
    public boolean q;
    public String r;
    public int[] s;
    public View t;
    public KwaiImageView u;
    public Music v;
    public AbsRecordBottomBarViewBinder w;
    public boolean x;
    public boolean y;
    public a z;
    public static final BubbleInterface$Position A;

    static {
       d.A = BubbleInterface$Position.TOP;
    }
    public void d(CameraPageType p0,b p1){
       super(p0, p1);
       this.v = null;
       d tf = this.f;
       if (tf instanceof a) {
          this.w = tf.zb();
       }
       this.d.n(r.class, new h(this));
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       f0 uof0 = this.d.d(f0.k);
       if (this.x != null && uof0.f != null) {
          this.g2(null);
       }
       return;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       Object[] objArray1;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, d.class, "4")) {
          return;
       }
       l a = this.d.d(l.i).a;
       b uob = this.d.c(b.class);
       Object[] objArray = null;
       CharSequence uCharSequenc = (a == null)? objArray: a.mId;
       if (TextUtils.n(this.p, uCharSequenc) && (uob == null || uob.e == null)) {
          return;
       }else {
          d obj = PatchProxy.apply(objArray, this, uod, "13");
          if (obj != PatchProxyResult.class) {
             obj = obj.booleanValue();
          }else {
             obj = this.h;
             obj = (obj != null && (obj.isRecording() || this.a2()))? true: false;
          }
          if (!obj) {
             this.v = objArray;
          }
          this.p = uCharSequenc;
          if (!PatchProxy.applyVoidTwoRefs(uCharSequenc, uob, this, uod, "5")) {
             String str = "MagicMusicPpCtrl";
             if (!this.h2()) {
                objArray1 = new Object[0];
                a.D().w(str, "can\'t show bubble", objArray1);
                this.g2(objArray);
             }else if(uCharSequenc == null){
                objArray1 = new Object[0];
                a.D().w(str, "no magic", objArray1);
                this.g2(objArray);
             }else {
                this.o = uCharSequenc;
                if (uob != null) {
                   Object[] objArray2 = new Object[0];
                   a.D().A(str, "request custom data", objArray2);
                   if (TextUtils.x(uob.a())) {
                      objArray1 = new Object[0];
                      a.D().A(str, "Custom musicId is empty", objArray1);
                      this.g2(objArray);
                   }else {
                      this.Y1(b.a(0x4a533fa).h(uob.a(), uob.c).subscribeOn(d.c).observeOn(d.a).map(new e()).map(c.b).subscribe(new m(this, uCharSequenc), new o(uCharSequenc, uob)));
                   }
                }else {
                   objArray = new Object[0];
                   a.D().A(str, "request server data", objArray);
                   this.Y1(h.a().a(Long.parseLong(uCharSequenc)).subscribeOn(d.c).observeOn(d.a).map(new e()).subscribe(new l(this, uCharSequenc), new n(uCharSequenc)));
                }
             }
          }
          return;
       }
    }
    public final void g2(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "10")) {
          return;
       }
       String str = "MagicMusicPpCtrl";
       int i = 0;
       if (p0 != null) {
          Object[] objArray = new Object[i];
          a.D().w(str, "auto apply music:"+p0.mName+"  "+p0.mId, objArray);
          RxBus.f.b(new g(p0, MusicSource.MAGIC_FACE, true));
          d tp = this.p;
          Music mId = p0.mId;
          p0 = p0.mExpTag;
          BaseFragment uBaseFragmen = this.d.f();
          if (!PatchProxy.applyVoidFourRefs(tp, mId, p0, uBaseFragmen, null, CameraLogger.class, "48")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MAGIC_FACE_RECO_MUSIC_USE";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("magic_face_id", tp);
             jsonObject.c0("music_id", mId);
             jsonObject.c0("exptag", p0);
             uElementPack.params = jsonObject.toString();
             h$b uob = h$b.e(7, "MAGIC_FACE_RECO_MUSIC_USE");
             uob.k(uElementPack);
             u1.p0(null, uBaseFragmen, uob);
          }
          this.x = true;
       }else if(this.x != null && !this.a2()){
          Object[] objArray1 = new Object[i];
          a.D().w(str, "revert music", objArray1);
          RxBus.f.b(new g());
          this.x = i;
       }
       return;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public final boolean h2(){
       boolean b;
       a a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, d.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int i = 0;
       if (!this.d.f().isResumed()) {
          obj = new Object[i];
          a.D().w("MagicMusicPpCtrl", "not resumed", obj);
          return i;
       }else if(!d.a(-93013550).isAvailable()){
          obj = new Object[i];
          a.D().w("MagicMusicPpCtrl", "music is not available", obj);
          return i;
       }else if(!this.f2()){
          obj = new Object[i];
          a.D().w("MagicMusicPpCtrl", "not video mode", obj);
          return i;
       }else if(!this.e.isFinishing() && this.f != null){
          d tu = this.u;
          if (tu != null && !tu.getVisibility()) {
             if (this.d.d(b.b).a != null) {
                obj = new Object[i];
                a.D().w("MagicMusicPpCtrl", "music panel is showing", obj);
                return i;
             }else if(this.d.d(n.j).a == null && (this.d.d(a.i).a == null && (this.d.d(b.b).a == null && (this.d.d(c.c).a != null || this.d.d(v.e).b != null)))){
                obj = new Object[i];
                a.D().w("MagicMusicPpCtrl", "record mode don\'t support", obj);
                return i;
             }else {
                f0 uof0 = this.d.d(f0.k);
                if (uof0.a != MusicSource.MAGIC_FACE && (uof0.b != null || uof0.f != null)) {
                   objArray = new Object[i];
                   a.D().w("MagicMusicPpCtrl", "had music, source:"+uof0.a+"   fetching:"+uof0.f, objArray);
                   return i;
                }else if(this.d.d(s.c).b != null){
                   obj = new Object[i];
                   a.D().w("MagicMusicPpCtrl", "had panel", obj);
                   return i;
                }else {
                   tu = this.d;
                   Object obj1 = PatchProxy.applyOneRefs(tu, objArray, b.class, "4");
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else if(!s6.H()){
                      a = tu.d(a.c).a;
                      if (a != null && a.f() instanceof b) {
                         b = a.f().a("music");
                      }
                   }
                   b = false;
                   if (b) {
                      obj = new Object[i];
                      a.D().w("MagicMusicPpCtrl", "has music in auto download bar.", obj);
                      return i;
                   }else {
                      d th = this.h;
                      if (th != null && (!th.isRecording() && !this.a2())) {
                         th = this.g;
                         if (th != null && !th.y()) {
                            i = true;
                         }
                      }
                   label_0194 :
                      return i;
                   }
                }
             }
          }
       }
       obj = new Object[i];
       a.D().w("MagicMusicPpCtrl", "no music button", obj);
       return i;
    }
    public final void i2(MagicMusicsResponse p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "7")) {
          return;
       }
       Object[] objArray = 1;
       int i = 0;
       if (!TextUtils.n(p1, this.p)) {
          objArray = new Object[i];
          a.D().w("MagicMusicPpCtrl", "Not curId, abort", objArray);
       }else {
          MagicMusicsResponse mMusics = p0.mMusics;
          if (mMusics != null && (!mMusics.size() || p0.mMusics.get(i) == null)) {
             objArray = new Object[i];
             a.D().w("MagicMusicPpCtrl", "Response null", objArray);
          }else if(!this.h2()){
             objArray = new Object[i];
             a.D().w("MagicMusicPpCtrl", "Response cannot show", objArray);
          }else if(objArray == null){
             this.g2(null);
             return;
          }else {
             Music music = p0.mMusics.get(i);
             this.v = music;
             music.mLlsid = p0.mLlsid;
             d tg = this.g;
             if (tg != null && tg.D()) {
                objArray = new Object[i];
                a.D().w("MagicMusicPpCtrl", "magic has music", objArray);
                this.g2(null);
                return;
             }else {
                this.g2(this.v);
                return;
             }
          }
       }
       objArray = null;
       goto label_0055 ;
    }
    public void k(View p0){
       KwaiImageView kwaiImageVie;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.k(p0);
       d tw = this.w;
       View view = (tw == null)? null: tw.G();
       this.t = b.a(view, p0, 0x7f0a05de);
       tw = this.w;
       view = (tw == null)? null: tw.H();
       this.u = b.a(view, p0, 0x7f0a05db);
       this.Y1(f.a(PanelShowEvent.class, new k(this)));
       this.Y1(this.d.l(g0.class, new j(this)));
       if (!a.f()) {
          this.Y1(this.d.l(p0.class, new i(this)));
       }
       if (this.t != null && !PatchProxy.applyVoid(null, this, d.class, "3")) {
          this.b2(new p(this));
       }
       return;
    }
    public final void k2(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "9")) {
          return;
       }
       if (CameraLogger.d(this.d)) {
          objArray = new Object[0];
          a.D().w("MagicMusicPpCtrl", "music auto apply bubble blocked by panel", objArray);
          this.y = true;
          return;
       }else if(this.d.d(p0.j.a()).c()){
          objArray = new Object[0];
          a.D().w("MagicMusicPpCtrl", "music auto apply bubble blocked by AssistantMode", objArray);
          this.y = true;
          return;
       }else if(!a.f()){
          Object[] objArray1 = new Object[0];
          a.D().w("MagicMusicPpCtrl", "show music auto apply bubble", objArray1);
          int[] ointArray = PatchProxy.apply(objArray, this, uod, "14");
          if (ointArray != PatchProxyResult.class) {
          }else if(this.t.getTag() != null && this.t.getTag() instanceof int[]){
             ointArray = this.t.getTag();
          }else {
             ointArray = this.s;
          }
          if (ointArray == null) {
             objArray = new Object[0];
             a.D().w("MagicMusicPpCtrl", "no anchor, can\'t show bubble", objArray);
             u1.Q("music_auto_apply_popup_crash", "NPE");
             return;
          }else {
             a$c uoc = new a$c(this.e);
             uoc.n0(ointArray[0], ointArray[1]);
             int i = (PostExperimentUtils.p())? 0x7f103154: 0x7f103153;
             uoc.F0(a1.p(i));
             uoc.A(true);
             uoc.T(3000);
             uoc.P(true);
             uoc.M(new d$a(this));
             this.z = p.o(uoc);
          }
       }
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
}
