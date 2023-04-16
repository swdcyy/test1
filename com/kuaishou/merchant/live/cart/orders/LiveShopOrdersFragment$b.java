package com.kuaishou.merchant.live.cart.orders.LiveShopOrdersFragment$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.live.cart.orders.LiveShopOrdersFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import com.kuaishou.merchant.live.cart.orders.LiveShopOrderResponse$LiveCommodityOrderItem;
import com.kuaishou.merchant.live.cart.orders.LiveShopOrderResponse$OrderUser;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Locale;
import java.lang.Float;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class LiveShopOrdersFragment$b extends PresenterV2	// class@0019c9
{
    public LiveShopOrderResponse$LiveCommodityOrderItem p;
    public KwaiImageView q;
    public TextView r;
    public TextView s;
    public final LiveShopOrdersFragment t;

    public void LiveShopOrdersFragment$b(LiveShopOrdersFragment p0){
       this.t = p0;
       super();
    }
    public void E8(){
       String str;
       LiveShopOrdersFragment$b uob = LiveShopOrdersFragment$b.class;
       if (PatchProxy.applyVoid(null, this, uob, "3")) {
          return;
       }
       LiveShopOrdersFragment$b tr = this.r;
       Resources resources = this.l8();
       Object[] objArray = new Object[3];
       LiveShopOrdersFragment$b tp = this.p;
       objArray[0] = tp.orderUser.userName;
       int i = 1;
       objArray[1] = String.valueOf(tp.buyCount);
       LiveShopOrderResponse$LiveCommodityOrderItem totalCost = this.p.totalCost;
       if (PatchProxy.isSupport(uob)) {
          str = PatchProxy.applyOneRefs(Integer.valueOf(totalCost), this, uob, "4");
          if (str != PatchProxyResult.class) {
          label_006d :
             objArray[2] = str;
             tr.setText(resources.getString(R.string.arg_RES_7f102c75, objArray));
             this.s.setText(this.p.commodity.mTitle);
             this.q.P(this.p.commodity.mImageUrls);
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       objArray1[0] = Float.valueOf(((float)totalCost / 100.00f));
       str = "гд"+String.format(Locale.getDefault(), "%.2f", objArray1);
       goto label_006d ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopOrdersFragment$b.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a2240);
       this.r = m1.f(p0, 0x7f0a2242);
       this.q = m1.f(p0, 0x7f0a223f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveShopOrdersFragment$b.class, "1")) {
          return;
       }
       this.p = this.q8(LiveShopOrderResponse$LiveCommodityOrderItem.class);
       return;
    }
}
