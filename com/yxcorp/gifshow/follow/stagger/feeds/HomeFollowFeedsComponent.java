package com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent;
import y0b.i;
import com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent$a;
import nsd.u;
import jb5.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import z0b.b;
import y0b.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import sia.c;
import pa5.l;
import com.yxcorp.gifshow.follow.stagger.d;
import pa5.n$d;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import java.lang.Number;
import y0b.j;
import com.kwai.component.feedstaggercard.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.IllegalStateException;
import a9c.e;
import elb.g0;
import com.yxcorp.gifshow.listcomponent.layoutmanager.a;
import x0b.f;
import com.kwai.component.feedstaggercard.experiment.HomeCardExperimentUtil;
import lnc.d2;
import rkd.b;
import vja.b;
import java.util.Objects;
import x0b.f$b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent$d;
import java.lang.Runnable;
import ekd.k1;
import eda.f;
import android.content.res.Configuration;
import z0b.c;
import com.yxcorp.gifshow.listcomponent.module.b;
import qvb.n0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tia.a;
import tia.i;
import qia.a;
import crd.b;
import com.yxcorp.gifshow.listcomponent.event.a;
import y0b.h;
import com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent$b;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent$c;
import com.yxcorp.gifshow.util.rx.RxBus;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent$bind$3;
import sia.a;
import msd.l;

public final class HomeFollowFeedsComponent extends i	// class@00118a
{
    public d C;
    public PhotoItemViewParam D;
    public b E;
    public l F;
    public b G;
    public final d H;
    public static final HomeFollowFeedsComponent$a I;

    static {
       HomeFollowFeedsComponent.I = new HomeFollowFeedsComponent$a(null);
    }
    public void HomeFollowFeedsComponent(d p0){
       a.p(p0, "internalPagelist");
       super();
       this.H = p0;
    }
    public static final b N(HomeFollowFeedsComponent p0){
       p0 = p0.E;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public m C(){
       l a;
       c uoc = PatchProxy.apply(null, this, HomeFollowFeedsComponent.class, "8");
       if (uoc != PatchProxyResult.class) {
       }else {
          HomeFollowFeedsComponent tC = this.C;
          if (tC == null) {
             a.S("mFactory");
          }
          HomeFollowFeedsComponent tF = this.F;
          if (tF == null) {
             a.S("mFactoryBridge");
          }
          a = tF.a;
          HomeFollowFeedsComponent tD = this.D;
          if (tD == null) {
             a.S("mParam");
          }
          uoc = new c(tC, a, tD);
       }
       return uoc;
    }
    public String D(Object p0){
       String str = PatchProxy.applyOneRefs(p0, this, HomeFollowFeedsComponent.class, "5");
       if (str != PatchProxyResult.class) {
       }else if(p0 != null){
          p0 = p0.getPhotoId();
          if (p0 != null) {
          label_001c :
             str = p0;
          }
       }
       p0 = "followPhoto";
       goto label_001c ;
       return str;
    }
    public int J(int p0){
       HomeFollowFeedsComponent homeFollowFe = HomeFollowFeedsComponent.class;
       if (PatchProxy.isSupport(homeFollowFe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, homeFollowFe, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       PhotoAdvertisement obj1 = this.r.u(p0);
       if (obj1 != null) {
          int i = a.d(obj1);
          if (obj1.isAd()) {
             obj1 = k.B(obj1);
             a.m(obj1);
             i = (i * 10000) + obj1.mTemplateType;
          }
          return i;
       }else {
          throw new IllegalStateException("Required value was null.".toString());
       }
    }
    public e L(){
       Object obj = PatchProxy.apply(null, this, HomeFollowFeedsComponent.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g0();
    }
    public a M(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HomeFollowFeedsComponent homeFollowFe = HomeFollowFeedsComponent.class;
       f uof = PatchProxy.apply(null, this, homeFollowFe, "6");
       if (uof != patchProxyRe) {
       }else {
          Object obj = PatchProxy.apply(null, this, homeFollowFe, "12");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else if(HomeCardExperimentUtil.h.a() && d2.k()){
             i = 3;
          }else if(b.g() && b.e()){
             i = 4;
          }else {
             i = 2;
          }
          b.j(i);
          uof = new f(i, 0);
       }
       return uof;
    }
    public final void O(int p0){
       HomeFollowFeedsComponent homeFollowFe = HomeFollowFeedsComponent.class;
       if (PatchProxy.isSupport(homeFollowFe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, homeFollowFe, "14")) {
          return;
       }
       i tx = this.x;
       if (tx instanceof f) {
          String str = "null cannot be cast to non-null type com.yxcorp.gifshow.listcomponent.layoutmanager.layout.StaggeredGridLayoutHelper";
          Objects.requireNonNull(tx, str);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tx, f.class, "10")) {
             tx.E.a();
          }
          tx = this.x;
          Objects.requireNonNull(tx, str);
          tx.W(p0);
          if (HomeCardExperimentUtil.h.a()) {
             homeFollowFe = this.E;
             if (homeFollowFe == null) {
                a.S("mFragment");
             }
             if (homeFollowFe instanceof RecyclerFragment) {
                objArray = homeFollowFe;
             }
             if (objArray != null) {
                RecyclerView recyclerView = objArray.h0();
                if (recyclerView != null) {
                   recyclerView.requestLayout();
                }
             }
             b.j(p0);
             k1.o(new HomeFollowFeedsComponent$d(this));
          }
       }
       return;
    }
    public final void onHomeHuaweiMateXFoldEvent(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowFeedsComponent.class, "13")) {
          return;
       }
       int i = (d2.m(p0.a()))? 3: 2;
       this.O(i);
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, HomeFollowFeedsComponent.class, "1")) {
          return;
       }
       super.s();
       PhotoItemViewParam photoItemVie = d.f();
       a.o(photoItemVie, "HomeFollowItemViewFactory.createPhotoItemParam\(\)");
       this.D = photoItemVie;
       HomeFollowFeedsComponent tD = this.D;
       if (tD == null) {
          a.S("mParam");
       }
       this.C = new d(tD);
       this.F = new l();
       c uoc = this.i();
       a.o(uoc, "adapter");
       b uob = uoc.K0();
       a.o(uob, "adapter.fragment");
       this.E = uob;
       return;
    }
    public n0 v(){
       return this.H;
    }
    public PresenterV2 w(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, HomeFollowFeedsComponent.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.w();
       obj.U7(new a());
       obj.U7(new i());
       a.o(obj, "presenter");
       PatchProxy.onMethodExit(HomeFollowFeedsComponent.class, "9");
       return obj;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, HomeFollowFeedsComponent.class, "10")) {
          return;
       }
       b tl = this.l;
       if (tl != null && tl instanceof a) {
          Objects.requireNonNull(tl, "null cannot be cast to non-null type com.yxcorp.gifshow.follow.stagger.data.delegate.FollowBasePageListDelegate");
          tl.W2();
       }
       super.x();
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, HomeFollowFeedsComponent.class, "3")) {
          return;
       }
       HomeFollowFeedsComponent tG = this.G;
       if (tG != null) {
          tG.dispose();
       }
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, HomeFollowFeedsComponent.class, "2")) {
          return;
       }
       super.z();
       j oj = this.H();
       a.o(oj, "moduleContext");
       oj.e().c("kscc.event.page.arch.refresh.FinishLoading", new HomeFollowFeedsComponent$b(this));
       oj = this.H();
       a.o(oj, "moduleContext");
       oj.e().c("kscc.event.component.arch.load_more.FinishLoading", new HomeFollowFeedsComponent$c(this));
       if (HomeCardExperimentUtil.h.a()) {
          this.G = RxBus.f.f(f.class).observeOn(d.a).subscribe(new a(new HomeFollowFeedsComponent$bind$3(this)));
       }
       return;
    }
}
