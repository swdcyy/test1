package com.kuaishou.merchant.marketing.shop.auction.start.b;
import erd.g;
import com.kuaishou.merchant.marketing.shop.auction.start.LiveAnchorStartAuctionFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import o74.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import e94.g;
import android.view.View$OnClickListener;

public final class b implements g	// class@001bcb
{
    public final LiveAnchorStartAuctionFragment b;

    public void b(LiveAnchorStartAuctionFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, LiveAnchorStartAuctionFragment.class, "9")) {
       }else {
          a.l(MerchantMarketingShopLogBiz.AUCTION, "LiveAnchorStartAuctionFragment", "onLoadStartConfigFail", p0);
          if (!ExceptionHandler.handleException(tb.getActivity(), p0)) {
             ExceptionHandler.handleCaughtException(p0);
          }
          b[] uobArray = new b[]{b.f};
          c.d(tb.m, uobArray);
          LiveAnchorStartAuctionFragment m = tb.m;
          b g = b.g;
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.c();
          p0 = (p0 instanceof KwaiException)? p0.getMessage(): null;
          uoa.i(p0);
          uoa.p(new g(tb));
          c.e(m, g, uoa);
       }
       return;
    }
}
