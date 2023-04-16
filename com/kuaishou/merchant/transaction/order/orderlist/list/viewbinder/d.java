package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.d;
import rk0.b;
import androidx.fragment.app.Fragment;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.d$a;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.d$b;
import jl4.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kl4.m;
import com.kuaishou.ksmvvm.command.KSCommand;
import jl4.i;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ok0.n;
import com.yxcorp.gifshow.util.rx.RxBus;
import xk4.j;
import brd.t;
import t45.d;
import brd.z;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import android.animation.AnimatorSet;
import com.kuaishou.merchant.transaction.order.orderlist.widget.MerchantOrderShadowLayout;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.OrderListResponse;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import android.view.ViewStub;

public class d extends b	// class@0008a9
{
    public ImageCallback A;
    public Animator$AnimatorListener B;
    public g C;
    public m s;
    public ViewStub t;
    public View u;
    public KwaiImageView v;
    public MerchantOrderShadowLayout w;
    public AnimatorSet x;
    public AnimatorSet y;
    public QCurrentUser z;

    public void d(Fragment p0){
       super(p0);
       this.z = QCurrentUser.me();
       this.A = new d$a(this);
       this.B = new d$b(this);
       this.C = new j(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.J0(this.s.j.h, new i(this));
       this.X7(RxBus.f.f(j.class).observeOn(d.a).subscribe(this.C));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.s = ViewModelProviders.of(this.P8()).get(m.class);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       super.J8();
       d tx = this.x;
       if (tx != null) {
          tx.cancel();
          this.x.removeAllListeners();
       }
       tx = this.y;
       if (tx != null) {
          tx.cancel();
       }
       tx = this.w;
       if (tx != null) {
          tx.a();
       }
       return;
    }
    public final OrderListResponse S8(){
       Object obj = PatchProxy.apply(null, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.j.h.getValue();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a2f21);
       return;
    }
}
