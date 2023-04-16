package com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailPagePresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailPagePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.bowl.core.component.a;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;
import mkc.b;
import android.view.View;
import mkc.c;
import android.view.ViewParent;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import dy3.b;
import android.view.View$OnClickListener;

public final class MerchantMicroDetailPagePresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@00175e
{

    public void MerchantMicroDetailPagePresenter$onBind$1(MerchantMicroDetailPagePresenter p0){
       super(1, p0, MerchantMicroDetailPagePresenter.class, "onDynamicMicroDetailPage", "onDynamicMicroDetailPage\(Lcom/kuaishou/bowl/core/component/Component;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantMicroDetailPagePresenter$onBind$1.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       MerchantMicroDetailPagePresenter merchantMicr = MerchantMicroDetailPagePresenter.class;
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, merchantMicr, "5") && !PatchProxy.applyVoidOneRefs(p0, treceiver, merchantMicr, "6")) {
          int i = 0;
          boolean b = true;
          String str = "mTipsContainer";
          if (p0 != null) {
             p0 = p0.rootView;
             if (p0 != null) {
                if (p0 instanceof ViewGroup) {
                   a uoa = p0;
                   uoa.setClipChildren(b);
                   uoa.setClipToPadding(b);
                }
                MerchantMicroDetailPagePresenter q = treceiver.q;
                if (q == null) {
                   a.S(str);
                }
                b[] uobArray = new b[]{b.d,b.g};
                c.d(q, uobArray);
                merchantMicr = treceiver.q;
                if (merchantMicr == null) {
                   a.S(str);
                }
                merchantMicr.setVisibility(8);
                merchantMicr = treceiver.r;
                if (merchantMicr == null) {
                   a.S("mContainer");
                }
                merchantMicr.removeAllViews();
                ViewParent parent = p0.getParent();
                if (!parent instanceof ViewGroup) {
                   parent = null;
                }
                if (parent != null) {
                   parent.removeView(p0);
                }
                MerchantMicroDetailPagePresenter r = treceiver.r;
                if (r == null) {
                   a.S("mContainer");
                }
                r.addView(p0);
             }
          }
          MerchantMicroDetailPagePresenter q1 = treceiver.q;
          if (q1 == null) {
             a.S(str);
          }
          q1.setVisibility(i);
          q1 = treceiver.q;
          if (q1 == null) {
             a.S(str);
          }
          b[] uobArray1 = new b[b];
          uobArray1[i] = b.d;
          c.d(q1, uobArray1);
          q1 = treceiver.q;
          if (q1 == null) {
             a.S(str);
          }
          KwaiEmptyStateView$a uoa1 = new KwaiEmptyStateView$a();
          uoa1.p(new b(treceiver));
          c.e(q1, b.g, uoa1);
       }
       return;
    }
}
