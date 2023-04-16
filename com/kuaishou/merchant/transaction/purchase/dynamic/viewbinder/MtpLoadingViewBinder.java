package com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder;
import vd4.b;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder$mApiErrorConsumer$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.dynamic.LoadingViewModel;
import rk0.b;
import com.kuaishou.merchant.transaction.base.dynamic.LoadingViewModel$a;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder$c;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import ok0.n;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder$d;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder$e;
import android.view.View;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder$b;
import android.view.View$OnClickListener;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.base.dynamic.viewbinder.MainProcViewBinder$c;

public final class MtpLoadingViewBinder extends b	// class@000925
{
    public KwaiEmptyStateView A;
    public final p B;
    public MainProcViewBinder$c y;
    public KwaiLoadingView z;
    public static final MtpLoadingViewBinder$a C;

    static {
       MtpLoadingViewBinder.C = new MtpLoadingViewBinder$a(null);
    }
    public void MtpLoadingViewBinder(Fragment p0){
       super(p0);
       this.B = s.c(new MtpLoadingViewBinder$mApiErrorConsumer$2(p0));
    }
    public static final KwaiLoadingView o9(MtpLoadingViewBinder p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("mLoadingView");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MtpLoadingViewBinder.class, "5")) {
          return;
       }
       super.E8();
       LoadingViewModel$a i = LoadingViewModel.i;
       this.J0(i.a(this.R8()).r0(), new MtpLoadingViewBinder$c(this));
       this.J0(i.a(this.R8()).p0(), new MtpLoadingViewBinder$d(this));
       this.J0(i.a(this.R8()).q0(), new MtpLoadingViewBinder$e(this));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, MtpLoadingViewBinder.class, "2")) {
          return;
       }
       super.F8();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MtpLoadingViewBinder.class, "4")) {
          return;
       }
       super.doBindView(p0);
       a.m(p0);
       this.z = p0.findViewById(0x7f0a403e);
       KwaiEmptyStateView kwaiEmptySta = p0.findViewById(R.id.transaction_base_id_dy_empty_view);
       this.A = kwaiEmptySta;
       String str = "mEmptyView";
       if (kwaiEmptySta == null) {
          a.S(str);
       }
       kwaiEmptySta.q(2);
       MtpLoadingViewBinder tA = this.A;
       if (tA == null) {
          a.S(str);
       }
       tA.p(new MtpLoadingViewBinder$b(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MtpLoadingViewBinder.class, "3")) {
          return;
       }
       super.j8();
       this.y = this.r8("id_main_proc_svr");
       return;
    }
}
