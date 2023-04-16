package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.a;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.b;
import java.lang.Object;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.OrderListResponse;
import java.util.Objects;
import android.view.View;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import java.lang.System;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.OrderListResponse$AnnouncementInfo;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import java.lang.String;
import o74.a;
import java.lang.StringBuilder;
import lnc.a1;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.kwai.library.widget.textview.KwaiMarqueeTextView;
import java.lang.CharSequence;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import jl4.a;
import erd.a;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class a implements Observer	// class@0008a0
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       boolean b;
       a tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mAnnouncementInfo;
       int i = 8;
       if (p0 == null) {
          tb.t.setVisibility(i);
       }else {
          Long longx = b.a(0x3b1f7b44).a();
          long l = (longx == null)? System.currentTimeMillis(): longx.longValue();
          String str = "OrderListAnnouncementViewBinder";
          if (p0.mEndTime - l < 0) {
             a.s(MerchantTransactionLogBiz.ORDER, str, "can not show announcement, because end time less than current time");
          }else {
             a.s(MerchantTransactionLogBiz.ORDER, str, "show announcement, mEndTime is "+p0.mEndTime);
             tb.t.setVisibility(0);
             tb.u.setTextColor(TextUtils.J(p0.mTextColor, a1.a(R.color.arg_RES_7f061dfb)));
             tb.t.setBackgroundColor(TextUtils.J(p0.mBgColor, a1.a(R.color.arg_RES_7f061e3c)));
             b u = tb.u;
             str = TextUtils.k(p0.mContent);
             b = true;
             if (p0.mMarqueeStyle != b) {
                b = false;
             }
             u.v(str, b);
             u = tb.v;
             if (!TextUtils.x(p0.mIconUrl)) {
                i = 0;
             }
             u.setVisibility(i);
             tb.v.L(p0.mIconUrl);
             long l1 = p0.mEndTime - l;
             p0 = b.class;
             if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), tb, p0, "4")) {
                tb.X7(t.empty().delaySubscription(l1, TimeUnit.MILLISECONDS, d.a).doOnComplete(new a(tb)).subscribe());
             }
          }
       }
       return;
    }
}
