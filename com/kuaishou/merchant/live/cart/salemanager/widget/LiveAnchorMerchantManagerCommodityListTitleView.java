package com.kuaishou.merchant.live.cart.salemanager.widget.LiveAnchorMerchantManagerCommodityListTitleView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import lnc.a1;
import android.graphics.Typeface;
import java.lang.CharSequence;

public class LiveAnchorMerchantManagerCommodityListTitleView extends AppCompatTextView	// class@001a02
{

    public void LiveAnchorMerchantManagerCommodityListTitleView(Context p0){
       super(p0, null);
    }
    public void LiveAnchorMerchantManagerCommodityListTitleView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAnchorMerchantManagerCommodityListTitleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveAnchorMerchantManagerCommodityListTitleView.class, "1")) {
       }else {
          this.setBackgroundResource(R.color.arg_RES_7f0620c7);
          this.setId(R.id.merchant_commodity_list_title);
          this.setPadding(a1.d(R.dimen.arg_RES_7f0702ab), a1.d(R.dimen.arg_RES_7f070283), a1.d(R.dimen.arg_RES_7f0702ab), a1.d(R.dimen.arg_RES_7f070283));
          this.setTextColor(a1.a(R.color.arg_RES_7f061d77));
          this.setTextSize(14.00f);
          this.setTypeface(Typeface.DEFAULT_BOLD);
          this.setText(a1.p(R.string.arg_RES_7f1001da));
       }
       return;
    }
}
