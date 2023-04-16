package com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder$e;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import com.yxcorp.retrofit.model.KwaiException;
import ot3.k0;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.lang.CharSequence;
import lnc.a1;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import com.kuaishou.merchant.transaction.purchase.l0;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;

public final class MtpLoadingViewBinder$e implements Observer	// class@000923
{
    public final MtpLoadingViewBinder b;

    public void MtpLoadingViewBinder$e(MtpLoadingViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       MtpLoadingViewBinder a;
       MtpLoadingViewBinder mtpLoadingVi = MtpLoadingViewBinder.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, MtpLoadingViewBinder$e.class, str)) {
       }else {
          MtpLoadingViewBinder$e tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, mtpLoadingVi, "7")) {
             a = tb.A;
             if (a == null) {
                a.S("mEmptyView");
             }
             int i = (p0 != null)? 0: 8;
             a.setVisibility(i);
             if (p0 != null) {
                v3 = p0 instanceof KwaiException;
                a.d(k0.a(p0));
                a.o("жиЪд");
                KwaiException mErrorMessag = (i)? p0.mErrorMessage: a1.p(R.string.arg_RES_7f1033ce);
                a.h(mErrorMessag);
                i = (i)? 0x7f081707: 0x7f0805f4;
                a.i(i);
             }
          }
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, mtpLoadingVi, "8")) {
             l0 ol0 = PatchProxy.apply(null, tb, mtpLoadingVi, str);
             if (ol0 == PatchProxyResult.class) {
                ol0 = tb.B.getValue();
             }
             ol0.b(p0);
          }
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, mtpLoadingVi, "6") && p0 != null) {
             a.g(MerchantTransactionLogBiz.PURCHASE_V2, "MtpLoadingViewBinder", "loadFail:"+p0.getMessage());
          }
       }
       return;
    }
}
