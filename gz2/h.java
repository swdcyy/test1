package gz2.h;
import cz2.a;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGiftEffectLocalRenderTextureView;
import dz2.c;
import java.lang.Object;
import gz2.h$d;
import gz2.h$a;
import gz2.h$b;
import hz2.c;
import com.kuaishou.live.effect.engine.render.local.drawer.a$a;
import pz2.c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gz2.e;
import java.lang.Runnable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import pz2.a;
import java.lang.Long;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView;
import android.view.TextureView;
import e93.f;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceTransDataMessage;
import java.lang.Boolean;
import gz2.f;
import ta3.a$b;
import com.kuaishou.live.effect.resource.download.common.e;
import vz2.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Collection;
import ekd.q;
import cz2.d;
import bz2.a;
import android.view.View;
import com.kuaishou.live.livestage.VideoScaleMode;
import java.lang.Integer;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.StringBuilder;
import xf6.g;
import com.kwai.robust.PatchProxyResult;
import my2.a$a;
import tkd.b;
import tkd.d;
import my2.a;
import gz2.h$c;
import ly2.g;
import gz2.b;
import ly2.h;
import java.util.Objects;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$k;
import java.util.ArrayList;
import android.view.View$OnTouchListener;
import gz2.c;

public class h implements a	// class@002bdf
{
    public final LiveGiftEffectLocalRenderTextureView a;
    public MagicEmoji$MagicFace b;
    public c c;
    public d d;
    public a$a e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final int k;
    public final c l;
    public c m;
    public final h$d n;
    public final View$OnTouchListener o;
    public final a$a p;

    public void h(LiveGiftEffectLocalRenderTextureView p0,int p1,c p2){
       super();
       this.f = 0;
       this.n = new h$d();
       this.o = new h$a(this);
       h$b uob = new h$b(this);
       this.p = uob;
       this.k = p1;
       this.l = new c(p1);
       this.a = p0;
       p0.setGiftEffectDrawCallback(uob);
       this.m = p2;
    }
    public void C0(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "4")) {
          return;
       }
       this.l(new e(this, p0, p1));
       return;
    }
    public synchronized void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "3")) {
          return;
       }
       List list = LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectLocalRenderer");
       String str = "clearEffect";
       h tc = this.c;
       long trackId = (tc != null)? tc.getTrackId(): 0;
       b.S(list, str, "trackId", Long.valueOf(trackId));
       this.l.a();
       this.f = 0;
       this.b = objArray;
       this.c = objArray;
       if (this.a.getRenderMode()) {
          this.a.setRenderMode(0);
          this.a.g();
       }
       if (this.a.getVisibility() != 8) {
          this.a.setVisibility(8);
       }
       this.h = false;
       f.g(this);
       return;
    }
    public void c(LiveFlvStream$LiveFaceTransDataMessage p0,boolean p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oh, "6")) {
          return;
       }
       this.l(new f(this, p0, p1));
       return;
    }
    public void d(a$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "9")) {
          return;
       }
       this.n.a = p0;
       this.n("updateStreamRectInfo");
       return;
    }
    public synchronized void e(c p0){
       h td;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       int i = 0;
       this.f = i;
       this.c = p0;
       this.b = e.b().he().g(String.valueOf(p0.b()));
       LiveLogTag lIVE_EFFECT = LiveLogTag.LIVE_EFFECT;
       lIVE_EFFECT.appendTag("LiveEffectLocalRenderer");
       LiveLogTag liveLogTag = lIVE_EFFECT;
       String str = "bindEffect";
       String str1 = p0.toString();
       h tb = this.b;
       String str2 = 1;
       boolean b = (!q.f(p0.u()))? true: false;
       b.U(liveLogTag, str, "effectTask", str1, "mMagicFace", tb, "hasCustomImage", Boolean.valueOf(b));
       if (this.b == null) {
          td = this.d;
          if (td != null) {
             td.c(p0, "NO_EFFECT_RESOURCE");
             this.d.g(this.c, i, "NO_EFFECT_RESOURCE", this.l);
             this.c = null;
          }
          return;
       }else if(!a.b()){
          a.d(40);
          td = this.d;
          if (td != null) {
             td.c(p0, "EFFECT_PLUGIN_NOT_READY");
             this.d.g(this.c, i, "EFFECT_PLUGIN_NOT_READY", this.l);
             this.c = null;
          }
          return;
       }else if(this.a.getVisibility()){
          this.a.setVisibility(i);
       }
       this.a.setRenderMode(str2);
       this.h = i;
       h td1 = this.d;
       if (td1 != null) {
          td1.b(p0);
       }
       return;
    }
    public a$b f(){
       return this.n.a;
    }
    public void g(d p0){
       this.d = p0;
    }
    public View getRenderView(){
       return this.a;
    }
    public void h(int p0,int p1,int p2,int p3,VideoScaleMode p4){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, oh, "8")) {
             return;
          }
       }
       a$b uob = new a$b(p0, p1, p2, p3, n.z(a.b()), n.v(a.b()), p4);
       this.d(oh);
       return;
    }
    public void i(){
       boolean b;
       a$a uoa1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "10")) {
          return;
       }
       if (!a.b()) {
          b.P(LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectLocalRenderer"), "[initDrawerIfNecessary]effect plugin not load"+this.k);
          return;
       }else if(this.e == null){
          b.Z(LiveLogTag.LIVE_EFFECT, "[LiveEffectLocalRenderer#initDrawerIfNecessary]drawer renderType ="+this.k);
          b = g.g1();
          h tk = this.k;
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             uoa1 = PatchProxy.applyTwoRefs(Integer.valueOf(tk), Boolean.valueOf(b), objArray, uoa, "1");
             if (uoa1 != PatchProxyResult.class) {
             label_007d :
                this.e = uoa1;
                uoa1.f(new h$c(this));
                this.e.g(new b(this));
                this.n("initDrawerIfNecessary");
             }
          }
          uoa1 = d.a(0x669878e).FC(tk, b);
          goto label_007d ;
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, h.class, "14")) {
          return;
       }
       this.l.c();
       return;
    }
    public void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "11")) {
          return;
       }
       if (this.j != null) {
          return;
       }
       this.j = true;
       b.S(LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectLocalRenderer"), "[LocalEffectLog-live-cancel]internalReleaseEffectResource", "reason", p0);
       h te = this.e;
       if (te != null) {
          te.a();
       }
       return;
    }
    public void l(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "12")) {
          return;
       }
       h ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, LiveGLTextureView.class, "18")) {
          LiveGLTextureView c = ta.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(p0, c, LiveGLTextureView$k.class, "16")) {
             LiveGLTextureView$l p = LiveGLTextureView.p;
             _monitor_enter(p);
             c.s.add(p0);
             p.notifyAll();
             _monitor_exit(p);
          }
       }
       return;
    }
    public void m(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "1")) {
          return;
       }
       this.i = p0;
       oh = this.a;
       h to = (p0)? this.o: null;
       oh.setOnTouchListener(to);
       return;
    }
    public final void n(String p0){
       a$b streamWidth;
       a$b streamHeight;
       a$b xStreamInScr;
       a$b yStreamInScr;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "13")) {
          return;
       }
       h tn = this.n;
       h ta = this.a;
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoidOneRefs(ta, tn, h$d.class, "1")) {
          int width = ta.getWidth();
          int height = ta.getHeight();
          h$d f = tn.f;
          int i = 0;
          f[i] = i;
          f[1] = i;
          ta.getLocationOnScreen(f);
          h$d a = tn.a;
          if (a != null) {
             streamWidth = a.streamWidth;
             streamHeight = a.streamHeight;
             xStreamInScr = a.xStreamInScreen;
             yStreamInScr = a.yStreamInScreen;
          }else {
             yStreamInScr = 0;
             streamWidth = null;
             streamHeight = null;
             xStreamInScr = 0;
          }
          float f1 = (streamWidth == null || !width)? 0: (float)(xStreamInScr - tn.f[i]) / (float)width;
          tn.b = f1;
          float f2 = (streamHeight == null || !height)? 0: (float)(yStreamInScr - tn.f[1]) / (float)height;
          tn.c = f2;
          f2 = (!width)? 0: (float)streamWidth / (float)width;
          tn.d = f2;
          float f3 = (!height)? 0: (float)streamHeight / (float)height;
          tn.e = f3;
          if (!f2) {
             tn.d = 0x3f800000;
          }
          if (!f3) {
             tn.e = 0x3f800000;
          }
       }
       this.l(new c(this));
       return;
    }
}
