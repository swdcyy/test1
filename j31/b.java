package j31.b;
import ms5.c;
import k31.a$a;
import java.lang.Runnable;
import ms5.a$b;
import xq5.c;
import oq5.c;
import lp3.a;
import android.content.Context;
import ok.x;
import ms5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j31.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import k2b.e0;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import s51.c;
import java.lang.System;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import e93.f;
import lp3.c;
import bt5.b;
import oq5.a;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import g31.o;
import lp3.e;
import k31.a;
import java.lang.Math;
import xq5.b;
import java.util.Objects;
import java.util.Set;
import java.util.Queue;
import android.content.res.Configuration;
import java.util.Collection;
import ekd.q;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class b extends a implements c, a$a, Runnable, a$b, c, c	// class@002a45
{
    public final x d;
    public final Context e;
    public a f;
    public boolean g;
    public boolean h;
    public long i;
    public a j;
    public LiveSlidePlayService k;
    public i l;
    public c m;

    public void b(Context p0,x p1){
       super();
       this.e = p0;
       this.d = p1;
    }
    public void Ee(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       a c = p0.c;
       b tl = this.l;
       if (!PatchProxy.applyVoidTwoRefs(c, tl, null, a.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AUTHOR_INFORMATION_CARD";
          uElementPack.params = a.a(c);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = tl.Bb();
          u1.C0("", tl.getPage(), 0, uElementPack, uContentPack);
       }
       c = p0.i;
       if (c != null) {
          c.Ee(p0);
       }
       return;
    }
    public boolean Kc(a p0){
       a obj = PatchProxy.applyOneRefs(p0, this, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.c;
       b tl = this.l;
       if (!PatchProxy.applyVoidTwoRefs(obj, tl, null, a.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AUTHOR_INFORMATION_CARD";
          uElementPack.params = a.a(obj);
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = tl.Bb();
          u1.L("", tl.getPage(), true, uElementPack, uContentPack);
       }
       obj = p0.i;
       if (obj != null && obj.Kc(p0)) {
          return true;
       }else {
          b tm = this.m;
          if (!TextUtils.x(p0.j) && tm.P0(p0.j)) {
             tm.r4(p0.j, this.e);
             return true;
          }else {
             return false;
          }
       }
    }
    public void Lc(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "14")) {
          return;
       }
       a i = p0.i;
       if (i != null) {
          i.Lc(p0);
       }
       this.i = System.currentTimeMillis();
       this.g = false;
       this.Uo();
       return;
    }
    public void Lg(a p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "17")) {
          return;
       }
       a i = p0.i;
       if (i != null) {
          i.Lg(p0, p1);
       }
       this.g = false;
       this.Uo();
       b.H(LiveLogTag.TOP_USER, "showReinforceItemError", "biz", p0.c, p1);
       return;
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       f.g(this);
       this.f = null;
       this.g = false;
       this.i = 0;
       return;
    }
    public void Qo(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.To();
       this.m = this.So(c.class);
       this.l = this.So(i.class);
       this.h = this.So(b.class).v();
       a uoa = this.So(a.class);
       this.j = uoa;
       uoa.W0(this, true);
       if (this.h != null) {
          LiveSlidePlayService liveSlidePla = this.So(LiveSlidePlayService.class);
          this.k = liveSlidePla;
          liveSlidePla.P4(this);
       }
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.d.get().stop();
       this.f = null;
       f.g(this);
       this.j.Q0(this);
       b tk = this.k;
       if (tk != null) {
          tk.d5(this);
       }
       return;
    }
    public final c So(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Po().a(p0);
    }
    public final void To(){
       if (PatchProxy.applyVoid(null, this, b.class, "20")) {
          return;
       }
       if (this.f == null) {
          this.f = new a(this);
       }
       return;
    }
    public final void Uo(){
       if (PatchProxy.applyVoid(null, this, b.class, "19")) {
          return;
       }
       if (this.g == null && this.f != null) {
          this.g = true;
          f.k("showTopBarSlideItem", this, this, Math.max(0, (0x2710 - (System.currentTimeMillis() - this.i))));
       }
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void da(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "15")) {
          return;
       }
       a i = p0.i;
       if (i != null) {
          i.da(p0);
       }
       this.g = false;
       this.Uo();
       return;
    }
    public void m0(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       this.d.get().m0();
       return;
    }
    public void mi(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       b tf = this.f;
       if (tf != null) {
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoidOneRefs(p0, tf, a.class, "1") && tf.b.isEmpty()) {
             tf.a.add(p0);
             tf.c.onNotify();
          }
       }
       return;
    }
    public void n8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       b tf = this.f;
       if (tf != null) {
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoidOneRefs(p0, tf, a.class, "3")) {
             tf.a.remove(p0);
          }
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       if (this.j.H2()) {
          this.pause("landscape");
       }else {
          this.resume("landscape");
       }
       return;
    }
    public void onNotify(){
       if (PatchProxy.applyVoid(null, this, b.class, "12")) {
          return;
       }
       this.Uo();
       return;
    }
    public void pause(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       f.g(this);
       b tf = this.f;
       if (tf != null) {
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoidOneRefs(p0, tf, a.class, "5")) {
             tf.b.add(p0);
          }
       }
       return;
    }
    public void pb(Collection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       b tf = this.f;
       if (tf != null) {
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoidOneRefs(p0, tf, a.class, "2") && (tf.b.isEmpty() && !q.f(p0))) {
             tf.a.addAll(p0);
             tf.c.onNotify();
          }
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.To();
       return;
    }
    public void resume(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       b tf = this.f;
       if (tf != null) {
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoidOneRefs(p0, tf, a.class, "6")) {
             tf.b.remove(p0);
             if (tf.b.isEmpty()) {
                tf.c.onNotify();
             }
          }
       }
       return;
    }
    public void run(){
       a obj;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "18")) {
          return;
       }
       b tf = this.f;
       if (tf != null) {
          obj = PatchProxy.apply(objArray, tf, a.class, "4");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else if(!tf.b.isEmpty()){
             objArray = tf.a.poll();
          }
       }
       tf = null;
       if (objArray != null) {
          obj = objArray.h;
          obj = (obj != null && obj.length > 0)? 1: 0;
          if (obj) {
             this.d.get().F5(objArray, this);
          label_004f :
             return;
          }
       }
       this.g = tf;
       goto label_004f ;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
