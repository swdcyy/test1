package com.kuaishou.merchant.live.cart.onsale.anchor.r;
import erd.g;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import java.lang.String;
import o74.a;
import com.kuaishou.merchant.live.cart.onsale.anchor.LiveAnchorOnSaleFragment$c;
import java.util.List;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import mkc.b;
import android.view.View;
import mkc.c;
import f34.c;
import android.view.View$OnClickListener;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;

public final class r implements g	// class@001916
{
    public final LiveAnchorOnSaleFragment b;

    public void r(LiveAnchorOnSaleFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       a.l(MerchantCartLogBiz.LIVE_SALE_MANAGER, "LiveAnchorOnSaleFragment", "loadCommodityList fail", p0);
       LiveAnchorOnSaleFragment q = tb.q;
       q.c = null;
       q.k.clear();
       q = tb.q;
       q.d = p0;
       LiveAnchorOnSaleFragment o = tb.o;
       int i = 1;
       if (o != null) {
          Object[] objArray = new Object[i];
          objArray[0] = q;
          o.i(objArray);
       }
       ExceptionHandler.handleException(tb.getActivity(), p0);
       b[] uobArray = new b[i];
       uobArray[0] = b.d;
       c.d(tb.m, uobArray);
       uobArray = new b[i];
       uobArray[0] = b.i;
       c.d(tb.m, uobArray);
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.k(R.drawable.arg_RES_7f0805f4);
       uoa.a(c.g(tb.m, p0, new c(tb)));
       return;
    }
}
