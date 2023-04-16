package com.kuaishou.merchant.live.cart.onsale.audience.g;
import erd.g;
import com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment;
import com.kuaishou.merchant.api.core.LiveMerchantSkin;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.kuaishou.merchant.live.cart.onsale.audience.LiveAudienceShopWrapperFragment$Status;
import mkc.b;
import mkc.c;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.lang.Throwable;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import ot3.k0;
import java.lang.CharSequence;
import k34.v;
import android.view.View$OnClickListener;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.utility.TextUtils;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;

public final class g implements g	// class@00193e
{
    public final LiveAudienceShopWrapperFragment b;
    public final LiveMerchantSkin c;

    public void g(LiveAudienceShopWrapperFragment p0,LiveMerchantSkin p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b[] uobArray;
       g tb = this.b;
       g tc = this.c;
       tb.F.setBackground(null);
       int i = 0;
       int i1 = 1;
       if (p0 == LiveAudienceShopWrapperFragment$Status.LOADING) {
          tb.Q = c.h(tb.F, tb.P);
          uobArray = new b[i1];
          uobArray[i] = b.g;
          c.d(tb.F, uobArray);
       }else if(p0 == LiveAudienceShopWrapperFragment$Status.SUCCESS){
          b[] uobArray1 = new b[i1];
          uobArray1[i] = tb.P;
          c.d(tb.F, uobArray1);
          uobArray = new b[i1];
          uobArray[i] = b.g;
          c.d(tb.F, uobArray);
       }else if(p0 instanceof Throwable){
          b[] uobArray2 = new b[i1];
          uobArray2[i] = tb.P;
          c.d(tb.F, uobArray2);
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.j(k0.a(p0));
          uoa.f("÷ÿ ‘");
          uoa.c();
          uoa.p(new v(tb));
          if (p0 instanceof KwaiException) {
             p0 = p0.mErrorMessage;
             if (TextUtils.x(p0)) {
                p0 = "Ã´ª±¨¡À£¨«Î…‘∫Û‘Ÿ ‘";
             }
             uoa.i(p0);
             uoa.k(R.drawable.arg_RES_7f0805e9);
          }
          if (tc != null && tc.isMerchantPageUseSkin()) {
             b uob = new b();
             uob.v(-1);
             uob.g(KwaiRadiusStyles.TL16_TR16);
             tb.F.setBackground(uob.a());
          }
          c.e(tb.F, b.g, uoa);
       }
       return;
    }
}
