package com.kwai.nearby.local.presenter.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.nearby.common.model.NearbyLiveCachePoolConfig;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import com.kwai.nearby.local.presenter.e$a;
import com.kwai.nearby.local.presenter.e$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import w16.l;
import brd.t;
import eoc.e;
import brd.z;
import dd7.k;
import erd.g;
import crd.b;
import qvb.q;
import qvb.a;
import mb5.r;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qc7.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import dd7.n;
import io.reactivex.internal.functions.Functions;
import dd7.m;
import java.util.Objects;
import mb5.a;
import kotlin.jvm.internal.a;
import dd7.l;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import trb.b;
import sc7.b0;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import jb5.a;
import com.kwai.framework.model.feed.BaseFeed;
import lnc.d4;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class e extends PresenterV2	// class@000fb0
{
    public a p;
    public RecyclerFragment q;
    public RecyclerView$LayoutManager r;
    public boolean s;
    public boolean t;
    public final NearbyLiveCachePoolConfig u;
    public b v;
    public r w;
    public final a x;
    public final q y;

    public void e(){
       super(false);
    }
    public void e(boolean p0){
       super();
       this.u = LocalConfigKeyHelper.h();
       this.x = new e$a(this);
       this.y = new e$b(this);
       this.s = p0;
    }
    public void E8(){
       g e;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "4")) {
          return;
       }
       RxBus f = RxBus.f;
       this.X7(f.f(l.class).observeOn(e.c).subscribe(new k(this)));
       this.p.h(this.y);
       this.w.e(this.p);
       this.w.a(this.q.Vg().g(), this.q.Vg().a());
       e = Functions.e;
       this.X7(f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new n(this), e));
       if (!PatchProxy.applyVoid(objArray, this, uoe, "6")) {
          e tq = this.q;
          t ot1 = PatchProxy.applyOneRefs(tq, this, uoe, "10");
          if (ot1 != patchProxyRe) {
          }else {
             ot1 = tq.Vg().i();
             if (this.s == null) {
                ot1 = ot1.skip(1);
             }
          }
          this.X7(ot1.subscribe(new m(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "7")) {
          uoe = this.x;
          Objects.requireNonNull(uoe);
          t ot = PatchProxy.apply(objArray, uoe, a.class, "4");
          if (ot != patchProxyRe) {
          }else {
             ot = uoe.d.hide();
             a.o(ot, "liveCacheSubject.hide\(\)");
          }
          this.X7(ot.subscribe(new l(this), e));
       }
       this.r = this.q.h0().getLayoutManager();
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       r or = new r(6, "HomeLocal");
       this.w = or;
       e tu = this.u;
       if (tu.visibleLiveEndStrategy != null || tu.cacheSize != null) {
          or.k = this.x;
       }
       return;
    }
    public void J8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "5")) {
          return;
       }
       this.p.f(this.y);
       if (!PatchProxy.applyVoid(objArray, this, uoe, "11")) {
          this.w.b();
       }
       if (this.P8()) {
          this.t = true;
          b.a("localLeaveBeforeBackgroundRefresh", "true");
       }
       return;
    }
    public final boolean P8(){
       boolean b;
       if (this.t == null) {
          e tp = this.p;
          if (tp instanceof b0 && tp.Z == null) {
             b = true;
          label_0013 :
             return b;
          }
       }
       b = false;
       goto label_0013 ;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(this.p.getItems());
       uArrayList.addAll(this.x.a);
       this.w.f(uArrayList);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("PAGE_LIST");
       this.q = this.r8("FRAGMENT");
       return;
    }
    public void onEventMainThread(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       int i = d4.b(p0.a, this.p.getItems());
       if (i != -1) {
          this.q.g7().l0(i);
       }
       return;
    }
}
