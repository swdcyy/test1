package a29.k;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import xq7.d;
import rp7.a;
import jh5.a;
import a29.j;
import a29.k$a;
import a29.k$b;
import qp7.a;
import w19.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.music.Music;
import lnc.d6;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import dkc.b;
import com.kwai.component.photo.detail.core.tag.TagPackageListHelper;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import lr7.e0;
import java.lang.Boolean;
import tw.j;
import qp7.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import lr7.e0$a;
import qp7.x0;
import qp7.b1;
import p5a.e;
import de5.a;
import a29.a;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import lr7.a;
import a29.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import qp7.t0;
import w19.e;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import com.kwai.feature.api.danmaku.DanmakuUtil;
import a29.g;
import a29.f;
import qp7.g;
import xq7.e;
import a29.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm5.e;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import a29.h;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import androidx.viewpager.widget.ViewPager$i;
import com.trello.rxlifecycle3.components.support.RxFragment;
import a29.c;
import java.lang.Runnable;
import ekd.k1;
import uy6.f;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import a29.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.music.utils.o;
import mm5.c;
import k2b.e0;
import java.lang.Integer;
import qp7.d;
import lr7.b;
import qp7.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.music.MusicType;
import java.lang.StringBuilder;
import lnc.a1;

public class k extends DispatchBaseElement	// class@000039
{
    public GrootViewPager A;
    public SlidePlayViewModel B;
    public final Runnable C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final b1 G;
    public ViewPager$i H;
    public QPhoto t;
    public Music u;
    public PhotoDetailParam v;
    public a w;
    public BaseFragment x;
    public TagPackageListHelper y;
    public boolean z;
    public static final int I;

    public void k(){
       super(d.n, null);
       this.z = false;
       this.C = new j(this);
       this.D = false;
       this.E = false;
       this.F = false;
       this.G = new k$a(this);
       this.H = new k$b(this);
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
       }else {
          this.t = p0.j;
          this.v = p0.c;
          this.w = p0.f;
          d b = p0.b;
          this.x = b;
          this.B = SlidePlayViewModel.B0(b.getParentFragment());
          this.y = p0.o;
          this.u = d6.c(this.t);
       }
       return;
    }
    public void S(){
       if (PatchProxy.applyVoid(null, this, k.class, "17")) {
          return;
       }
       Music music = d6.c(this.t);
       if (music == null) {
          return;
       }
       ClientContent$TagPackage tagPackage = b.c(music);
       k ty = this.y;
       if (ty != null) {
          ty.a(tagPackage);
       }
       return;
    }
    public a f0(a p0){
       e0 uoe0 = PatchProxy.applyOneRefs(p0, this, k.class, "19");
       if (uoe0 != PatchProxyResult.class) {
       }else {
          uoe0 = new e0(p0);
       }
       return uoe0;
    }
    public void j0(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "8")) {
          return;
       }
       if (j.f(this.t, 128)) {
          this.b0();
          return;
       }else {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, ok, "11")) {
             Music music = d6.c(this.t);
             this.u = music;
             if (this.z != null) {
                this.n0(music);
             }else {
                k tv = this.v;
                if (tv != null && tv.getBizType() == 4) {
                   e0$a uoa = new e0$a();
                   uoa.a = 0x3f800000;
                   uoa.b = 30;
                   this.E().n(uoa);
                }
                this.i(this.G);
                tv = this.w;
                if (tv != null) {
                   tv.getPlayer().w(new a(this));
                }
                this.j(this.i.d(new d(this), Functions.d()));
                if (!PatchProxy.applyVoid(objArray, this, ok, "12")) {
                   if (!this.H().z() || !DanmakuSwitchUtil.b(this.t)) {
                      this.E().g(false);
                   }else {
                      this.E().i(DanmakuUtil.h(this.t));
                      this.j(this.i.c(new g(this), Functions.d()));
                      this.j(this.i.e(new f(this), Functions.d()));
                      this.j(this.D().r(new e(this)));
                      this.j(RxBus.f.f(e.class).observeOn(a.c()).subscribe(new h(this), Functions.d()));
                   }
                }
             }
          }
          if (this.H().l()) {
             GrootViewPager grootViewPag = this.B.d1(GrootViewPager.class);
             this.A = grootViewPag;
             grootViewPag.i0(this.H);
             this.j(this.x.m().subscribe(new c(this), Functions.e));
          }
          return;
       }
    }
    public void m0(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "15")) {
          return;
       }
       k1.m(this.C);
       this.t0();
       this.u0();
       k tw = this.w;
       if (tw != null) {
          tw.getPlayer().O(new a(this));
       }
       return;
    }
    public void n0(Music p0){
       boolean b;
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ok, "1")) {
          return;
       }
       e0 uoe0 = this.E();
       Object obj = PatchProxy.apply(null, this, ok, "7");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(SlidePerformanceExp.d().a()){
          b = false;
       }else if(this.v != null){
          b = b.a(-404437045).g() ^ 1;
       }else {
          b = true;
       }
       uoe0.m(Boolean.valueOf(b));
       this.r0(p0);
       o.n(this.x, this.t.getSoundTrack(), new b(this));
       return;
    }
    public void o0(){
       if (PatchProxy.applyVoid(null, this, k.class, "13")) {
          return;
       }
       this.E = true;
       this.F = false;
       c.a.e(this.x, this.t);
       return;
    }
    public void p0(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "16")) {
          return;
       }
       if (p0 == 3) {
          k1.r(this.C, 100);
       }else {
          this.q0();
       }
       return;
    }
    public d q(){
       b uob = PatchProxy.apply(null, this, k.class, "21");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b();
       }
       return uob;
    }
    public void q0(){
       if (PatchProxy.applyVoid(null, this, k.class, "5")) {
          return;
       }
       this.E().o(Integer.valueOf(2));
       return;
    }
    public c r(){
       a uoa = PatchProxy.apply(null, this, k.class, "20");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public void r0(Music p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       if (p0 == null || TextUtils.x(p0.mName)) {
          str = j.j(this.t)+a1.p(0x7f10372e);
       }else if(p0.mType != MusicType.SOUNDTRACK && (!TextUtils.x(p0.mArtist) || !TextUtils.x(p0.mArtistName))){
          StringBuilder str1 = p0.mName+" - ";
          p0 = (TextUtils.x(p0.mArtist))? p0.mArtistName: p0.mArtist;
          str = str1+p0;
       }else {
          p0 = p0.mName;
       }
       this.E().p(str);
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       this.E().o(Integer.valueOf(1));
       return;
    }
    public void t0(){
       if (PatchProxy.applyVoid(null, this, k.class, "6")) {
          return;
       }
       this.E().o(Integer.valueOf(4));
       return;
    }
    public final void u0(){
       if (PatchProxy.applyVoid(null, this, k.class, "10")) {
          return;
       }
       k tA = this.A;
       if (tA != null) {
          tA.m0(this.H);
       }
       return;
    }
}
