package com.kuaishou.merchant.transaction.live.orderconfirmpanel.c;
import com.yxcorp.gifshow.fragment.f;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$FailBackInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import yj4.b;
import android.view.View$OnClickListener;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import ot3.k0;

public class c extends f	// class@0007e9
{
    public MerchantLivePurchasePanelFragment$b l;

    public void c(MerchantLivePurchasePanelFragment$b p0,RecyclerFragment p1){
       super(p1);
       this.l = p0;
    }
    public KwaiEmptyStateView$a a(){
       MerchantLivePurchasePanelFragment$b c;
       String str1;
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       c = this.l.c;
       String str = "";
       if (c != null) {
          MerchantLivePurchasePanelResponse mFailBackInf = c.mFailBackInfo;
          if (mFailBackInf != null) {
             str1 = mFailBackInf.mTip;
          label_0025 :
             obj.i(str1);
             c = this.l.c;
             if (c != null) {
                mFailBackInf = c.mFailBackInfo;
                if (mFailBackInf != null) {
                   str = TextUtils.k(mFailBackInf.mButtonTitle);
                }
             }
             obj.f(str);
             obj.k(R.drawable.arg_RES_7f0805e9);
             obj.p(new b(this));
             return obj;
          }
       }
       str1 = str;
       goto label_0025 ;
    }
    public KwaiEmptyStateView$a e(Throwable p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KwaiEmptyStateView$a uoa = super.e(p0, p1);
       if (p0 instanceof KwaiException) {
          uoa.k(R.drawable.arg_RES_7f080ebf);
          uoa.j(k0.a(p0));
          uoa.f("жиЪд");
       }
       return uoa;
    }
}
