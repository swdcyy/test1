package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$a;
import nsd.u;
import hs7.d;
import rp7.a;
import jh5.a;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$mLowPhone$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$d;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$b;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$c;
import de5.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import p1a.a;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.a;
import w19.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kuaishou.android.model.music.Music;
import lnc.d6;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$h;
import java.lang.Runnable;
import k2b.n;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import ss7.r;
import java.lang.Boolean;
import qp7.b1;
import qp7.b;
import qp7.t0;
import w19.e;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import androidx.viewpager.widget.ViewPager$i;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$onBind$1;
import j29.a;
import msd.l;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$e;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$f;
import qp7.c;
import ss7.p;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$g;
import qp7.d;
import com.kwai.slide.play.detail.rightactionbar.music.wheel.MusicWheelElementView;
import qp7.x0;
import tw.j;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;

public final class AdMusicWheelElement extends DispatchBaseElement	// class@001732
{
    public Music A;
    public final p B;
    public boolean C;
    public final b$b D;
    public final AdMusicWheelElement$b E;
    public final ViewPager$i F;
    public QPhoto t;
    public BaseFragment u;
    public Activity v;
    public a w;
    public a x;
    public SlidePlayViewModel y;
    public GrootViewPager z;
    public static final AdMusicWheelElement$a G;

    static {
       AdMusicWheelElement.G = new AdMusicWheelElement$a(null);
    }
    public void AdMusicWheelElement(){
       super(d.j, null);
       this.B = s.c(AdMusicWheelElement$mLowPhone$2.INSTANCE);
       this.D = new AdMusicWheelElement$d(this);
       this.E = new AdMusicWheelElement$b(this);
       this.F = new AdMusicWheelElement$c(this);
    }
    public static final a n0(AdMusicWheelElement p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mDetailPlayModule");
       }
       return p0;
    }
    public static final a o0(AdMusicWheelElement p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mLogListener");
       }
       return p0;
    }
    public static final QPhoto p0(AdMusicWheelElement p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdMusicWheelElement.class, "2")) {
       }else {
          a.p(p0, "callerContext");
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.t = mPhoto;
          d b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.u = b;
          if (b == null) {
             a.S("mFragment");
          }
          this.y = SlidePlayViewModel.B0(b.getParentFragment());
          b = p0.a;
          a.o(b, "callerContext.mActivity");
          this.v = b;
          b = p0.h;
          a.o(b, "callerContext.mLogListener");
          this.w = b;
          d f = p0.f;
          a.o(f, "callerContext.mPlayModule");
          this.x = f;
          AdMusicWheelElement tt = this.t;
          if (tt == null) {
             a.S("mPhoto");
          }
          this.A = d6.c(tt);
       }
       return;
    }
    public void S(){
       if (PatchProxy.applyVoid(null, this, AdMusicWheelElement.class, "9")) {
          return;
       }
       AdMusicWheelElement tu = this.u;
       if (tu == null) {
          a.S("mFragment");
       }
       n.a(tu, new AdMusicWheelElement$h(this));
       return;
    }
    public a f0(a p0){
       r or = PatchProxy.applyOneRefs(p0, this, AdMusicWheelElement.class, "3");
       if (or != PatchProxyResult.class) {
       }else {
          or = new r();
       }
       return or;
    }
    public void j0(boolean p0){
       AdMusicWheelElement ty;
       b uob;
       AdMusicWheelElement uAdMusicWhee = AdMusicWheelElement.class;
       if (PatchProxy.isSupport(uAdMusicWhee) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdMusicWhee, "6")) {
          return;
       }
       this.i(this.E);
       if (this.H().l()) {
          ty = this.y;
          GrootViewPager grootViewPag = (ty != null)? ty.d1(GrootViewPager.class): null;
          this.z = grootViewPag;
          if (grootViewPag != null) {
             grootViewPag.i0(this.F);
          }
          ty = this.u;
          if (ty == null) {
             a.S("mFragment");
          }
          uob = ty.m().subscribe(new a(new AdMusicWheelElement$onBind$1(this)), Functions.e);
          a.o(uob, "mFragment.lifecycle\(\).su¡­Functions.ERROR_CONSUMER\)");
          this.j(uob);
       }
       ty = this.t;
       if (ty == null) {
          a.S("mPhoto");
       }
       uob = ty.observePostChange().subscribe(new AdMusicWheelElement$e(this), AdMusicWheelElement$f.b);
       a.o(uob, "mPhoto.observePostChange¡­ror\(throwable\)\n        }\)");
       this.j(uob);
       g og = Functions.d();
       a.o(og, "Functions.emptyConsumer\(\)");
       this.j(this.A().a(new AdMusicWheelElement$g(this), og));
       return;
    }
    public void m0(boolean p0){
       if (PatchProxy.isSupport(AdMusicWheelElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AdMusicWheelElement.class, "13")) {
          return;
       }
       this.r0();
       return;
    }
    public d q(){
       MusicWheelElementView musicWheelEl = PatchProxy.apply(null, this, AdMusicWheelElement.class, "5");
       if (musicWheelEl != PatchProxyResult.class) {
       }else {
          musicWheelEl = new MusicWheelElementView();
       }
       return musicWheelEl;
    }
    public final String q0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdMusicWheelElement.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = p0.hashCode();
       if (i != -1759391705) {
          if (i != -376581425) {
             if (i == 0x7c1cd672 && p0.equals("is_turn")) {
                return "TRUE";
             }
          }else if(p0.equals("is_unfold")){
             return "FALSE";
          }
       }else if(p0.equals("button_type")){
          return "TYPE1";
       }
       return "";
    }
    public c r(){
       p op = PatchProxy.apply(null, this, AdMusicWheelElement.class, "4");
       if (op != PatchProxyResult.class) {
       }else {
          op = new p();
       }
       return op;
    }
    public final void r0(){
       if (PatchProxy.applyVoid(null, this, AdMusicWheelElement.class, "8")) {
          return;
       }
       AdMusicWheelElement tz = this.z;
       if (tz != null) {
          tz.m0(this.F);
       }
       this.E().g();
       return;
    }
    public final void s0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdMusicWheelElement.class, "10")) {
          return;
       }
       AdMusicWheelElement tt = this.t;
       String str = "mPhoto";
       if (tt == null) {
          a.S(str);
       }
       String str1 = j.s(tt);
       if (TextUtils.x(str1)) {
          r or = this.E();
          AdMusicWheelElement tt1 = this.t;
          if (tt1 == null) {
             a.S(str);
          }
          User user = tt1.getUser();
          CDNUrl[] avatars = (user != null)? user.getAvatars(): objArray;
          AdMusicWheelElement tt2 = this.t;
          if (tt2 == null) {
             a.S(str);
          }
          User user1 = tt2.getUser();
          if (user1 != null) {
             objArray = user1.getAvatar();
          }
          String[] stringArray = e0.b(avatars, objArray);
          a.o(stringArray, "CDNUtil.convertToUrls\(mP\x20\x02ars, mPhoto.user?.avatar\)\x00");
          or.k(stringArray);
       }else {
          String[] stringArray1 = new String[]{str1};
          a.m(str1);
          this.E().k(stringArray1);
       }
       return;
    }
}
