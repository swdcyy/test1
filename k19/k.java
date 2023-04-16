package k19.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import crd.a;
import k19.g;
import k19.h;
import k19.k$a;
import k19.k$b;
import k19.k$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo;
import tw.j;
import yx.j0;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.x;
import brd.t;
import t45.d;
import brd.z;
import k19.c;
import erd.g;
import crd.b;
import java.util.List;
import vq4.c;
import java.lang.Integer;
import ekd.q;
import vq4.d;
import java.lang.Number;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo;
import android.view.View;
import com.yxcorp.gifshow.ad.util.i$c;
import com.yxcorp.gifshow.ad.util.i;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import n49.s;
import lnc.a1;
import g59.k0;
import android.view.ViewGroup;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.StringBuilder;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.kwai.framework.model.feed.BaseFeed;
import k19.e;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import ekd.m1;
import android.view.ViewStub;
import io.reactivex.subjects.PublishSubject;
import java.lang.Runnable;
import com.kuaishou.android.model.ads.SplashInfo;
import tw.l;
import java.util.concurrent.TimeUnit;

public class k extends PresenterV2	// class@002a87
{
    public b A;
    public List B;
    public int C;
    public int D;
    public int E;
    public a F;
    public Runnable G;
    public Runnable H;
    public List I;
    public final RecyclerViewPager$b J;
    public final c$b K;
    public final a L;
    public QPhoto p;
    public List q;
    public PublishSubject r;
    public PhotoDetailParam s;
    public SwipeLayout t;
    public ViewGroup u;
    public ViewStub v;
    public ViewGroup w;
    public ViewGroup x;
    public RecyclerViewPager y;
    public RecyclerViewPagerIndicator z;

    public void k(){
       super();
       this.B = new ArrayList();
       this.F = new a();
       this.G = new g(this);
       this.H = new h(this);
       this.I = new ArrayList();
       this.J = new k$a(this);
       this.K = new k$b(this);
       this.L = new k$c(this);
    }
    public void E8(){
       boolean b;
       k ok = k.class;
       if (PatchProxy.applyVoid(null, this, ok, "5")) {
          return;
       }
       k tp = this.p;
       Object[] obj = PatchProxy.applyOneRefs(tp, this, ok, "18");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(j.r(tp) != null){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          obj = new Object[0];
          j0.f("AdDetailECommercePresenter", "not merchandise", obj);
          return;
       }else {
          this.X7(RxBus.f.f(x.class).observeOn(d.a).subscribe(new c(this)));
          this.q.add(this.L);
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "6")) {
          return;
       }
       k tB = this.B;
       if (tB != null) {
          tB.clear();
       }
       this.q.remove(this.L);
       return;
    }
    public void P8(c p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ok, "3")) {
          return;
       }
       int i = this.S8(q.e(this.B, p1));
       if (i == 2) {
          p0.F.C = 49;
       }else if(i == 1){
          p0.F.C = 50;
       }
       p0.M0 = (long)(p1 + 1);
       return;
    }
    public long R8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (k.B(p0) == null || k.B(p0).mAdData.mMerchandiseInfo == null) {
          return 500;
       }
       return k.B(p0).mAdData.mMerchandiseInfo.mCardDelayTime;
    }
    public final int S8(Object p0){
       if (p0 instanceof PhotoAdvertisement$MerchandiseInfo$DiscountInfo) {
          return 1;
       }
       if (p0 instanceof PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo) {
          return 2;
       }
       return 0;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, k.class, "15")) {
          return;
       }
       if (!this.Z8()) {
          Object[] objArray = new Object[0];
          j0.a("AdDetailECommercePresenter", "hideECommerceInfo info outside screen", objArray);
          return;
       }else {
          i.b(this.w, 200, this.x, 300, this.E, null);
          return;
       }
    }
    public final void W8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "9")) {
          return;
       }
       if (s.H(this.s.getBizType())) {
          k0.f(p0, a1.d(R.dimen.arg_RES_7f070464));
       }else {
          k0.f(p0, a1.d(R.dimen.arg_RES_7f0702cc));
       }
       return;
    }
    public final void X8(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "8")) {
          return;
       }
       if (p0) {
          k0.f(this.y, 0);
          this.W8(this.z);
       }else {
          this.W8(this.y);
       }
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, k.class, "14")) {
          return;
       }
       int width = this.u.getWidth();
       int height = this.u.getHeight();
       this.E = width;
       if (!width) {
          this.E = k0.b(this.getActivity());
       }
       if (this.getActivity() != null && (this.getActivity() instanceof GifshowActivity && (n.P(this.getActivity(), (float)k0.b(this.getActivity())) <= 360 && (width && height)))) {
          this.w.setScaleX(0x3f5c28f6);
          this.w.setScaleY(0x3f5c28f6);
          this.w.setPivotX(0);
          this.w.setPivotY((float)height);
       }
    label_0066 :
       Object[] objArray = new Object[0];
       j0.a("AdDetailECommercePresenter", "contentWidth: "+this.E, objArray);
       this.w.setTranslationX((float)(- this.E));
       this.w.setVisibility(0);
       return;
    }
    public final boolean Z8(){
       Object obj = PatchProxy.apply(null, this, k.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return k0.d(this.w);
    }
    public final void a9(int p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ok, "12")) {
          return;
       }
       int i = 2;
       if (p0 == 3) {
          i = 243;
       }
       o.z().e(i, this.p.mEntity).d(new e(this, p0, p1)).a();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.t = w9.c(this.getActivity());
       this.u = m1.f(p0, 0x7f0a0110);
       this.v = m1.f(p0, 0x7f0a0111);
       this.x = m1.f(p0, 0x7f0a3ea3);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_ATTACH_LISTENERS");
       this.r = this.r8("AD_PLAY_END_VIEW_STATE");
       this.s = this.q8(PhotoDetailParam.class);
       return;
    }
    public void onHomeSplashStateEvent(x p0){
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "19")) {
          return;
       }
       if (this.p.equals(p0.a)) {
          this.Y8();
          this.w.removeCallbacks(this.H);
          SplashInfo splashInfo = l.e(this.p.getEntity());
          l = this.R8(this.p);
          if (splashInfo != null) {
             l = l - TimeUnit.SECONDS.toMillis((long)splashInfo.mSplashAdDuration);
          }
          k ok = null;
          if (l - ok < 0) {
             l = ok;
          }
          this.w.postDelayed(this.H, l);
       }
       return;
    }
}
