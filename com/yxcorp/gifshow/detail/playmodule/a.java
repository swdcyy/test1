package com.yxcorp.gifshow.detail.playmodule.a;
import de5.a;
import vy6.a;
import q3a.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.BitSet;
import q3a.b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import q3a.d;
import erd.g;
import crd.b;
import v5a.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import r3a.s;
import q3a.f;
import r3a.s$b;
import uw9.t3;
import q3a.c;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.framework.player.core.f;
import com.kwai.framework.player.core.b$b;
import q3a.h;
import p5a.c;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import java.lang.ref.WeakReference;
import oi5.a;
import v5a.a;
import java.lang.Long;
import java.lang.Integer;
import v5a.a$b;
import q3a.e;
import msd.l;
import v5a.f;
import e1a.p;
import com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager;
import java.lang.StringBuilder;
import com.kwai.framework.player.core.b;
import uw9.o;
import q87.c;
import com.kwai.framework.model.feed.BaseFeed;
import e1a.u;
import java.lang.Boolean;
import wkd.b;
import ho5.a;
import k2b.e0;
import e1a.n;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.Set;
import de5.b;
import r3a.p;
import p5a.e;
import p2b.d;
import androidx.collection.ArraySet;
import androidx.fragment.app.Fragment;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.util.Objects;
import com.kwai.component.photo.detail.core.log.vse.opt.b;
import com.kwai.video.player.IKwaiMediaPlayer;
import nc6.d;
import r3a.l;
import ai7.e;
import com.kwai.component.photo.detail.core.log.PhotoDetailLoggerEveHelper;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import wx6.d;
import java.lang.IllegalStateException;

public class a implements a, a, i	// class@001651
{
    public boolean b;
    public final Set c;
    public PhotoDetailLogger d;
    public final s e;
    public final b f;
    public final g g;
    public p h;
    public boolean i;
    public boolean j;
    public QPhoto k;
    public QPhoto l;
    public boolean m;
    public long n;
    public int o;
    public int p;
    public a q;
    public BitSet r;
    public boolean s;
    public final BaseFragment t;
    public final DetailPlayConfig u;
    public final boolean v;
    public boolean w;
    public final b$b x;
    public h y;

    public void a(BaseFragment p0,QPhoto p1,DetailPlayConfig p2,boolean p3,boolean p4){
       super();
       this.c = new CopyOnWriteArraySet();
       this.r = new BitSet();
       this.w = false;
       b uob = new b(this);
       this.x = uob;
       this.l = p1;
       this.u = p2;
       this.v = p3;
       this.f = p0.m().subscribe(new d(this));
       this.t = p0;
       g og = new g();
       this.g = og;
       s os = PatchProxy.apply(null, this, a.class, "1");
       if (os != PatchProxyResult.class) {
       }else {
          os = new s(this, new f(this));
       }
       this.e = os;
       os.g(this.l);
       this.o = t3.a(p0, p1);
       this.F();
       if (!PatchProxy.applyVoid(null, this, a.class, "15")) {
          og.addOnPreparedListener(new c(this));
          og.w(uob);
          og.enableMediacodecDummy(p2.isSharePlayer());
       }
       h oh = new h(this);
       this.y = oh;
       oh.a();
       return;
    }
    public final void A(){
       if (PatchProxy.applyVoid(null, this, a.class, "38")) {
          return;
       }
       this.i = false;
       this.s = false;
       this.r.clear();
       this.j = false;
       return;
    }
    public final void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "29")) {
          return;
       }
       a tl = this.l;
       if (tl != null && (tl.isFusionVideo() && (this.q != null && p0.q() != null))) {
          this.q.b(new WeakReference(p0.q()));
       }
    label_002f :
       return;
    }
    public void B0(){
    }
    public final a C(long p0,int p1){
       a$b obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, uoa, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a$b(this.l);
       obj.b(new e(this, p0, p1));
       if (this.l.isFusionVideo()) {
          a uoa1 = new a(this.l);
          this.q = uoa1;
          obj.c(uoa1);
       }
       return obj.a();
    }
    public final void D(){
       if (PatchProxy.applyVoid(null, this, a.class, "27")) {
          return;
       }
       f uof = new f();
       this.g.h0(uof, this.l);
       uof.J(this.C(p.c(this.l, this.u.getContinuePlayStrategy()), 0));
       uof.prepareAsync();
       this.B(uof);
       return;
    }
    public final void E(){
       if (PatchProxy.applyVoid(null, this, a.class, "52")) {
          return;
       }
       this.J("doOnSharePlayer");
       this.g.i0();
       this.w = true;
       return;
    }
    public final void F(){
       if (PatchProxy.applyVoid(null, this, a.class, "16")) {
          return;
       }
       c uoc = QPhotoMediaPlayerCacheManager.d(this.l);
       if (uoc != null) {
          this.J("ensurePlayerInit hasCache,prepared="+uoc.isPrepared()+",preparing="+uoc.isPreparing());
       }
       if (uoc == null) {
          this.K();
       }else {
          this.g.h0(uoc, this.l);
       }
       if (this.n <= 0) {
          this.n = p.c(this.l, this.u.getContinuePlayStrategy());
       }
       return;
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       this.J("becomesDetachedOnPageSelected");
       if (this.b == null) {
          return;
       }
       this.b = false;
       this.J("becomesDetachedOnPageSelected really do stop");
       this.N();
       this.e.j();
       return;
    }
    public final void G(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       this.w = false;
       if (this.g.j0() == null) {
          this.J("firstTimeToPlay-createPlayerAndPrepare");
          this.D();
       }else {
          this.J("firstTimeToPlay-playerState:"+this.g.b());
          this.O();
       }
       return;
    }
    public final void H(){
       if (PatchProxy.applyVoid(null, this, a.class, "35")) {
          return;
       }
       c uoc = this.g.j0();
       if (uoc != null) {
          uoc.release();
       }
       return;
    }
    public final void I(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       this.J("liveWithSharePlayer");
       c uoc = this.g.j0();
       if (uoc != null) {
          QPhotoMediaPlayerCacheManager.f(this.l, uoc);
          this.E();
       }
       return;
    }
    public final void J(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "49")) {
          return;
       }
       if (this.l != null) {
          Object[] objArray = new Object[0];
          o.C().w("DetailPlayModuleImpl", this+" player "+this.g+" "+this.l.getUserId()+" "+this.l.getUserName()+"  need free traffic "+this.l.isNeedRetryFreeTraffic()+" "+this.l.getPhotoId()+" "+this.l.getListLoadSequenceID()+" "+this.l.getExpTag()+" : "+p0, objArray);
       }
       return;
    }
    public final void K(){
       if (PatchProxy.applyVoid(null, this, a.class, "18")) {
          return;
       }
       a tl = this.l;
       if (tl != null) {
          u.b(tl.getEntity(), this);
       }
       return;
    }
    public final void L(){
       if (PatchProxy.applyVoid(null, this, a.class, "28")) {
          return;
       }
       f uof = new f();
       this.H();
       c uoc = this.g.j0();
       int i = 0;
       if (uoc != null) {
          i = uoc.getRetryCount();
       }
       this.g.h0(uof, this.l);
       if (uof.J(this.C(this.n, i))) {
          uof.prepareAsync();
       }
       this.B(uof);
       return;
    }
    public final boolean M(){
       a obj = PatchProxy.apply(null, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.l;
       if (obj != null) {
          return u.c(obj.getEntity(), this);
       }
       return false;
    }
    public final void N(){
       if (PatchProxy.applyVoid(null, this, a.class, "39")) {
          return;
       }
       if (p.e(this.l, this.u.getSavePlayProgressStrategy(), this.u.getContinuePlayStrategy())) {
          this.n = this.g.getCurrentPosition();
          p.g(this.g, this.l);
       }
       if (this.l.getCacheType() == 3) {
          b.a(-607332832).H(this.g.getCurrentPosition(), this.l.getPhotoId());
       }
       return;
    }
    public final void O(){
       if (PatchProxy.applyVoid(null, this, a.class, "20")) {
          return;
       }
       this.e.d();
       n.a(this.l, this.g, this.t);
       return;
    }
    public final void P(boolean p0){
       Iterator iterator;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "30")) {
          return;
       }
       if (!q.f(this.c)) {
          if (p0) {
             iterator = this.c.iterator();
             while (iterator.hasNext()) {
                iterator.next().a();
             }
          }else {
             iterator = this.c.iterator();
             while (iterator.hasNext()) {
                iterator.next().c();
             }
          }
       }
       return;
    }
    public void a(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "31")) {
          return;
       }
       this.J("updateQPhotoAfterRetryFreeTraffic");
       if (this.i != null) {
          c uoc = QPhotoMediaPlayerCacheManager.d(this.l);
          if (uoc != null) {
             uoc.release();
          }
          this.H();
          this.g.i0();
          this.l = p0;
          this.G();
          this.i = false;
       }else if(this.b != null){
          this.k = p0;
          this.J("pending");
       }else {
          this.l = p0;
          if (this.g.j0() != null) {
             this.H();
             this.D();
          }
       }
       this.J("after updateQPhotoAfterRetryFreeTraffic");
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "32")) {
          return;
       }
       this.N();
       c uoc = this.g.j0();
       if (uoc != null) {
          uoc.stop();
       }
       return;
    }
    public String c(){
       a obj = PatchProxy.apply(null, this, a.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj == null) {
          return null;
       }
       return obj.b();
    }
    public c d(){
       Object obj = PatchProxy.apply(null, this, a.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.J("sharePlayer");
       this.E();
       return this.g.j0();
    }
    public void e(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "25")) {
          return;
       }
       this.n = this.g.getCurrentPosition();
       this.o = p0;
       c uoc = this.g.j0();
       if (uoc != null) {
          uoc.N(this.o);
       }else {
          this.J("setMultiRateMode null use recreatePlayer");
          this.L();
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "34")) {
          return;
       }
       this.m = false;
       this.L();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "23")) {
          return;
       }
       this.J("preLoad");
       this.H();
       this.j = true;
       this.D();
       return;
    }
    public e getPlayer(){
       return this.g;
    }
    public void h(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.c.remove(p0);
       return;
    }
    public int i(){
       return this.p;
    }
    public void i2(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "9")) {
          return;
       }
       this.J("becomesAttachedOnPageSelected");
       if (this.b != null) {
          return;
       }
       this.b = true;
       this.J("becomesAttachedOnPageSelected really do start");
       b.a(0x6a16ecdd).d(this.g.hashCode());
       a te = this.e;
       a td = this.d;
       ArraySet uArraySet = PatchProxy.apply(objArray, this, uoa, "10");
       if (uArraySet != PatchProxyResult.class) {
       }else {
          uArraySet = new ArraySet();
          if (!this.u.isSupportPlayInBackground() && !this.t.isResumed()) {
             uArraySet.add(Integer.valueOf(5));
          }
          if (this.u.isEnableSyncSharedPlayerStatus() && this.g.isPaused()) {
             uArraySet.add(Integer.valueOf(true));
          }
          if (this.u.getInitPauseFlags() != null) {
             uArraySet.addAll(this.u.getInitPauseFlags());
          }
       }
       te.i(td, uArraySet);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "11")) {
          this.M();
          uoa = this.l;
          if (uoa != null && uoa.isNeedRetryFreeTraffic()) {
             this.J("isNeedRetryFreeTraffic");
             this.i = true;
             c uoc = this.g.j0();
             if (uoc != null) {
                uoc.pause();
                QPhotoMediaPlayerCacheManager.f(this.l, uoc);
             }
             this.g.i0();
          }else {
             this.P(true);
             this.G();
             this.P(false);
          }
       }
       this.h.o();
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "41")) {
          return;
       }
       this.o(1);
       return;
    }
    public void k(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "42")) {
          return;
       }
       this.r.set(p0);
       if (!PatchProxy.applyVoid(null, this, uoa, "44")) {
          c uoc = this.g.j0();
          if (uoc != null && this.s == null) {
             this.n = this.g.getCurrentPosition();
             this.s = true;
             uoc.release();
          }
       }
       return;
    }
    public void k1(){
    }
    public void l(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "46")) {
          return;
       }
       this.n = p0;
       this.L();
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, a.class, "24")) {
          return;
       }
       this.J("releasePreloadPlayer");
       this.j = false;
       this.H();
       this.g.i0();
       this.K();
       return;
    }
    public void n(String p0,ClientEvent$UrlPackage p1){
       p a;
       Object[] objArray;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "36")) {
          return;
       }
       p0 = "finishLogAndReleasePlayer";
       this.J(p0);
       this.A();
       c uoc = this.g.j0();
       if (uoc == null) {
          if (this.w == null) {
             c uoc1 = QPhotoMediaPlayerCacheManager.d(this.l);
             if (uoc1 != null) {
                uoc1.release();
             }
          }
          this.g.i0();
          return;
       }else {
          a th = this.h;
          Objects.requireNonNull(th);
          if (!PatchProxy.applyVoidTwoRefs(p1, uoc, th, p.class, "18")) {
             th.g(p0);
             int i = 0;
             if (th.d != null && th.a.isEventStatLogEnable()) {
                th.t.b();
                th.n(th.a, uoc);
                a = th.a;
                boolean b = uoc.isPrepared();
                if (uoc.getIKwaiMediaPlayer() != null) {
                   objArray = new Object[i];
                   o.C().w("DetailPlayModuleImpl", "finishLogAndReleasePlayer finalPlayer releaseAsync", objArray);
                   uoc.x().f();
                   uoc.releaseAsync(new l(th, a, p1, b));
                }else {
                   objArray = new Object[i];
                   o.C().t("DetailPlayModuleImpl", "finishLogAndReleasePlayer sdkMediaPlayer == null", objArray);
                   uoc.release();
                   th.p(p1, a, b);
                }
                PhotoDetailLoggerEveHelper.b.b(a, th.d);
             }else {
                Object[] objArray1 = new Object[i];
                o.C().t("DetailPlayModuleImpl", "finishLogAndReleasePlayer finalPlayer release", objArray1);
                uoc.release();
             }
          }
          this.g.i0();
          if (!PatchProxy.applyVoid(null, this, uoa, "14")) {
             a tk = this.k;
             if (tk != null) {
                this.l = tk;
                this.h.l(tk);
                this.k = null;
             }
          }
          this.K();
          return;
       }
    }
    public void o(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "43")) {
          return;
       }
       if (!this.r.cardinality()) {
          return;
       }
       this.r.clear(p0);
       if (this.r.cardinality() || (!PatchProxy.applyVoid(null, this, a.class, "45") && this.s != null)) {
          this.L();
          this.s = false;
       }
    label_003f :
       return;
    }
    public void p(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "22")) {
          return;
       }
       this.l = p0;
       this.G();
       return;
    }
    public void q(int p0){
       this.p = p0;
    }
    public void r(BitSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "47")) {
          return;
       }
       this.e.f(p0);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, a.class, "37")) {
          return;
       }
       this.M();
       this.A();
       c uoc = this.g.j0();
       if (uoc != null) {
          Object[] objArray = new Object[0];
          o.C().A("DetailPlayModuleImpl", "should release before this", objArray);
          uoc.release();
       }
       this.g.i0();
       this.y.b();
       return;
    }
    public void s(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.c.add(p0);
       return;
    }
    public void t(PhotoDetailLogger p0){
       ClientStat$VideoStatEvent videoStatEve;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       this.d = p0;
       a th = this.h;
       if (th != null) {
          th.k();
       }
       th = null;
       if (this.g.j0() != null) {
          videoStatEve = this.g.j0().removeExtra("KEY_SHARE_IN_VSE");
       }
       p op = new p(this.t, this.d, this.g, videoStatEve, false);
       this.h = videoStatEve;
       videoStatEve.l(this.l);
       this.h.m(this.u.getPlayerSessionUuid());
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, a.class, "40")) {
          return;
       }
       this.k(1);
       return;
    }
    public void v(int p0){
       this.o = p0;
    }
    public d w(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new IllegalStateException("该类不支持这个功能，检查usePlayerKitPlayer的值");
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, a.class, "53")) {
          return;
       }
       int i = 0;
       if (this.l == null) {
          Object[] objArray = new Object[i];
          o.C().w("DetailPlayModuleImpl", "sharePlayerBackReget mCurrentPlayQPhoto null", objArray);
          return;
       }else {
          this.J("sharePlayerBackReget");
          this.F();
          this.w = i;
          return;
       }
    }
    public void y(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "33")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoa, "32")) {
          this.N();
          c uoc = this.g.j0();
          if (uoc != null) {
             uoc.stop();
          }
       }
       this.m = true;
       return;
    }
    public void z(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "21")) {
          return;
       }
       if (this.w != null) {
          this.J("Should not call retry when player shared, abort");
          return;
       }else {
          this.n = this.g.getCurrentPosition();
          this.l = p0;
          this.k = null;
          this.N();
          this.L();
          return;
       }
    }
}
