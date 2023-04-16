package com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView$d;
import ml8.d;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.yxcorp.widget.selector.view.SelectShapeView;

public class LiveShopOrderInfoView$d implements d	// class@0019a2
{
    public KwaiImageView b;
    public TextView c;
    public SelectShapeView d;
    public SelectShapeView e;
    public final LiveShopOrderInfoView f;

    public void LiveShopOrderInfoView$d(LiveShopOrderInfoView p0,View p1){
       this.f = p0;
       super();
       this.doBindView(p1);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopOrderInfoView$d.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a134d);
       TextView textView = m1.f(p0, R.id.text);
       this.c = textView;
       textView.setTextSize(1, 11.00f);
       this.d = m1.f(p0, 0x7f0a1359);
       this.e = m1.f(p0, 0x7f0a369a);
       return;
    }
}
