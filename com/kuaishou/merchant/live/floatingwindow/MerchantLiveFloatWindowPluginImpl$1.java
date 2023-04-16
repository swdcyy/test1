package com.kuaishou.merchant.live.floatingwindow.MerchantLiveFloatWindowPluginImpl$1;
import java.util.HashSet;
import com.kuaishou.merchant.live.floatingwindow.MerchantLiveFloatWindowPluginImpl;
import java.lang.Object;
import tkd.b;
import tkd.d;
import gc4.b;
import java.util.Collection;
import ekd.q;

public class MerchantLiveFloatWindowPluginImpl$1 extends HashSet	// class@001a1e
{
    public final MerchantLiveFloatWindowPluginImpl this$0;

    public void MerchantLiveFloatWindowPluginImpl$1(MerchantLiveFloatWindowPluginImpl p0){
       this.this$0 = p0;
       super();
       this.add("MerchantTrilateralYodaWebViewActivity");
       this.add("MerchantYodaWebViewActivity");
       this.add("GatewayPayActivity");
       this.add("AlbumActivity");
       this.add("MultipleImagePreviewActivity");
       this.add("PayWebViewActivity");
       this.add("PhotoAdvertisementWebActivity");
       this.add("IMChatActivity");
       this.add("MerchantPurchaseActivity");
       this.add("MerchantPurchaseV2Activity");
       this.add("KwaiRnActivity");
       Collection uCollection = d.a(0x6fa34f6a).p();
       if (!q.f(uCollection)) {
          this.addAll(uCollection);
       }
       return;
    }
}
