package com.yxcorp.gifshow.follow.stagger.container.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.collection.ArraySet;
import com.yxcorp.gifshow.follow.stagger.container.presenter.c$a;
import com.yxcorp.gifshow.follow.stagger.container.presenter.c$b;
import com.yxcorp.gifshow.follow.stagger.container.presenter.c$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import cda.d;
import brd.t;
import eoc.e;
import brd.z;
import oia.f;
import erd.g;
import crd.b;
import lnc.u1;
import jsa.h;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import oia.i;
import zca.o;
import t45.d;
import oia.h;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import qvb.q;
import qvb.a;
import oia.c;
import qvb.f$b;
import qvb.f;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import oia.g;
import com.kuaishou.live.common.core.basic.tools.h;
import java.lang.Runnable;
import ekd.k1;
import jb5.a;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import y8c.t;
import java.util.Set;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import cda.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import android.text.TextUtils;
import e6a.a;
import androidx.fragment.app.Fragment;
import com.kwai.framework.model.feed.BaseFeed;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager;
import y8c.g;
import jia.g;
import android.view.View;
import lnc.x3;
import java.lang.Integer;
import qvb.n0;
import oia.k;
import e6a.c;
import oia.j;
import com.yxcorp.gifshow.follow.stagger.container.presenter.b;
import e6a.f;
import foc.t;
import foc.y;
import oia.d;
import lnc.c3$a;
import lnc.c3;

public class c extends PresenterV2	// class@001161
{
    public final RefreshLayout$h A;
    public a p;
    public HomeFollowFragment q;
    public t r;
    public Set s;
    public Set t;
    public Set u;
    public a v;
    public final int w;
    public Runnable x;
    public final q y;
    public final RecyclerView$r z;

    public void c(int p0){
       super();
       this.t = new ArraySet();
       this.y = new c$a(this);
       this.z = new c$b(this);
       this.A = new c$c(this);
       this.w = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       RxBus f = RxBus.f;
       this.X7(f.f(d.class).observeOn(e.c).subscribe(new f(this)));
       u1.a(this);
       this.X7(f.i(h.class, RxBus$ThreadMode.MAIN, true).subscribe(new i(this)));
       this.X7(f.f(o.class).observeOn(d.a).subscribe(new h(this)));
       Log.g("HomeItemPresenter", "onBind:"+this.w);
       this.p.h(this.y);
       this.p.e2(new c(this));
       this.q.h0().addOnScrollListener(this.z);
       this.q.Ac().c(this.A);
       this.X7(this.q.Vg().j().subscribe(new g(this), h.b));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "4")) {
          return;
       }
       u1.b(this);
       Log.g("HomeItemPresenter", "onUnbind:"+this.w);
       this.p.f(this.y);
       this.p.e2(objArray);
       this.q.h0().removeOnScrollListener(this.z);
       this.q.Ac().E(this.A);
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "15")) {
          return;
       }
       c tx = this.x;
       if (tx != null) {
          k1.m(tx);
          this.x = null;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("PAGE_LIST");
       this.q = this.r8("FRAGMENT");
       this.r = this.q8(t.class);
       this.s = this.r8("HOME_ONRESPONSELOAD_LISTENERS");
       this.t = this.r8("HOME_ON_FEED_SCROLL_LISTENERS");
       this.u = this.r8("FRAGMENT_SELECT_LISTENER");
       this.v = this.r8("HOME_REFRESH_CONTROLLER");
       return;
    }
    public void onEventMainThread(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       if (p0.a == null) {
          return;
       }
       if (q.f(this.p.getItems())) {
          return;
       }
       this.p.remove(p0.a);
       return;
    }
    public void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       List items = this.p.getItems();
       int i = 0;
       while (true) {
          if (i >= items.size()) {
             return;
          }
          if (TextUtils.equals(p0.a, items.get(i).getPhotoId())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       this.p.remove(items.get(i));
       return;
    }
    public void onEventMainThread(a p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "8")) {
          return;
       }
       if (p0.a != this.q.hashCode()) {
          return;
       }
       QPhoto qPhoto = new QPhoto(p0.c);
       VirtualLayoutManager layoutManage = this.q.h0().getLayoutManager();
       if (layoutManage == null) {
          return;
       }
       View view = layoutManage.findViewByPosition((p0.b + this.q.g7().t1()));
       if (!x3.a(this.q.h0()) && view == null) {
          return;
       }
       p0 = p0.b;
       if (PatchProxy.isSupport(uoc) && (!PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), qPhoto, view, layoutManage, this, c.class, "10") && (p0 < null || (this.p.getCount() > p0 && !this.p.getItems().contains(qPhoto))))) {
          this.p.getItem(p0).setIsFromPrePage(false);
          this.p.set(p0, qPhoto);
          if (p0 == null) {
             int top = view.getTop();
             View view1 = this.q.getView();
             if (view1 != null) {
                view1.post(new k(layoutManage, p0, top));
             }
          }
       }
       return;
    }
    public void onEventMainThread(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "14")) {
          return;
       }
       if (p0.a == this.q.hashCode() && p0.b == null) {
          int i = this.p.getItems().indexOf(p0.c);
          if (i > -1) {
             this.q.getView().post(new j(this.q.h0().getLayoutManager(), i));
             this.P8();
             b uob = new b(this, i, p0);
             this.x = uob;
             k1.r(uob, 500);
          }
       }
       return;
    }
    public void onEventMainThread(f p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "9")) {
          return;
       }
       if (p0.a != this.q.hashCode()) {
          return;
       }
       VirtualLayoutManager layoutManage = this.q.h0().getLayoutManager();
       if (layoutManage == null) {
          return;
       }
       f b = p0.b;
       if (p0.d != null && this.p.getItems().indexOf(p0.d) != -1) {
          b = this.p.getItems().indexOf(p0.d);
       }
       View view = layoutManage.findViewByPosition((b + this.q.g7().t1()));
       p0 = p0.c;
       if (!PatchProxy.isSupport(uoc) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), view, this, uoc, "11") && view != null)) {
          c3.c(y.a(p0), new d(view));
       }
       return;
    }
}
