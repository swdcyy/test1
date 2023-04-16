package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.CouponLiveMarqueeView;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.GraphicVerticalMarqueeView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.widget.TextView;

public class CouponLiveMarqueeView extends GraphicVerticalMarqueeView	// class@001c18
{

    public void CouponLiveMarqueeView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public MerchantKwaiImageView a(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CouponLiveMarqueeView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a3697);
    }
    public TextView b(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CouponLiveMarqueeView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a3696);
    }
    public int getLayoutResId(){
       return 0x7f0d0c95;
    }
}
