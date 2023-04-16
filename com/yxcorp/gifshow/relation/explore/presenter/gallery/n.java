package com.yxcorp.gifshow.relation.explore.presenter.gallery.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.n$a;
import qvb.q;
import qvb.a;
import qvb.n0;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.m;
import erd.g;
import crd.b;
import brd.t;
import iac.w0;
import com.yxcorp.gifshow.util.rx.RxBus;
import ada.c;
import t45.d;
import brd.z;
import iac.v0;
import lnc.b9;
import bac.p;
import java.lang.Integer;
import android.app.Application;
import o56.a;
import java.lang.CharSequence;
import e17.i;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import k2b.u1;
import android.view.ViewGroup;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import android.widget.FrameLayout;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.view.View;
import com.yxcorp.gifshow.relation.explore.view.HorizontalRecyclerView;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.pymk.f;
import f7c.c;
import a7c.h;

public class n extends PresenterV2	// class@00184b
{
    public a A;
    public boolean B;
    public PublishSubject C;
    public PublishSubject D;
    public f p;
    public c q;
    public h r;
    public PublishSubject s;
    public boolean t;
    public KwaiEmptyStateView u;
    public KwaiLoadingView v;
    public BaseFragment w;
    public p x;
    public HorizontalRecyclerView y;
    public int z;

    public void n(){
       super();
       this.t = false;
       this.z = -1;
       this.A = new a();
       this.B = false;
       this.C = PublishSubject.g();
       this.D = PublishSubject.g();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "8")) {
          return;
       }
       this.p.h(new n$a(this));
       this.p.load();
       this.X7(this.C.subscribe(new m(this)));
       this.X7(this.D.subscribe(new w0(this)));
       this.X7(RxBus.f.f(c.class).observeOn(d.a).subscribe(new v0(this)));
       return;
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, n.class, "12");
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, n.class, "17")) {
          return;
       }
       b9.a(this.A);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n.class, "11")) {
          return;
       }
       n tx = this.x;
       if (tx != null) {
          tx.K0();
       }
       return;
    }
    public final void P8(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on, "7")) {
          return;
       }
       if ((this.p.getCount() - 5) < p0) {
          int i = 1;
          if ((this.p.getCount() - i) == p0) {
             if (!this.p.hasMore()) {
                i.e(R.style.arg_RES_7f11066a, a.b().getString(R.string.arg_RES_7f10420d), 0);
                return;
             }else if(this.t != null){
                this.v.setVisibility(0);
             }
             this.t = false;
          }else {
             this.t = i;
          }
          this.p.load();
       }
       return;
    }
    public final void R8(int p0,String p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, on, "16")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SWITCH_USER_CARD";
       i3 oi3 = i3.f();
       oi3.d("switch_direction", p1);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.userPackage = new ClientContent$UserPackage();
       if (this.x.M0(p0) != null) {
          uContentPack.userPackage.identity = this.x.M0(p0).mUser.getId();
          uContentPack.userPackage.index = p0 + 1;
          u1.u(1, uElementPack, uContentPack);
       }
       return;
    }
    public void S8(){
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "4")) {
          return;
       }
       this.y.setVisibility(8);
       this.u.d(0);
       this.u.setVisibility(0);
       this.u.q(3);
       this.u.g(R.string.arg_RES_7f10420d);
       n tu = this.u;
       Drawable uDrawable = PatchProxy.apply(objArray, this, on, "18");
       if (uDrawable != PatchProxyResult.class) {
       }else {
          uDrawable = this.l8().getDrawable(R.drawable.arg_RES_7f0805f7);
       }
       tu.j(uDrawable);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       HorizontalRecyclerView horizontalRe = p0.findViewById(R.id.recycler_view);
       this.y = horizontalRe;
       horizontalRe.setInterceptAll(true);
       this.u = m1.f(p0, 0x7f0a0d89);
       this.v = m1.f(p0, 0x7f0a1049);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.w = this.r8("FRAGMENT");
       this.p = this.r8("PAGE_LIST");
       this.q = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       this.r = this.r8("PYMK_ACCESS_IDSPYMK_PARAMS");
       this.s = this.r8("PYMK_ACCESS_IDScurrentUser");
       return;
    }
}
