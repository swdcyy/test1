package com.kuaishou.merchant.marketing.shop.MerchantMarketingShopPluginImpl;
import ss3.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopPluginImpl$2;
import com.yxcorp.gifshow.util.rx.RxBus;
import o94.a;
import androidx.fragment.app.Fragment;
import java.lang.Boolean;
import com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment;
import android.os.Bundle;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ks3.x;
import androidx.fragment.app.c;
import com.kuaishou.merchant.marketing.shop.auction.bidrecord.LiveAuctionBidRecordFragment;
import androidx.fragment.app.KwaiDialogFragment;
import ts3.b;
import u84.b;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopPluginImpl$1;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopPluginImpl$3;

public class MerchantMarketingShopPluginImpl implements a	// class@001b7c
{

    public void MerchantMarketingShopPluginImpl(){
       super();
    }
    public List C(){
       Object obj = PatchProxy.apply(null, this, MerchantMarketingShopPluginImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MerchantMarketingShopPluginImpl$2(this);
    }
    public void Yn(){
       if (PatchProxy.applyVoid(null, this, MerchantMarketingShopPluginImpl.class, "4")) {
          return;
       }
       RxBus.f.b(new a());
       return;
    }
    public Fragment gN(String p0,String p1,boolean p2){
       AuctionSettingFragment obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(MerchantMarketingShopPluginImpl.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, MerchantMarketingShopPluginImpl.class, "7");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(AuctionSettingFragment.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, AuctionSettingFragment.class, "1");
          if (obj != patchProxyRe) {
          label_0058 :
             return obj;
          }
       }
       Bundle uBundle = new Bundle();
       uBundle.putString("liveStreamId", p0);
       uBundle.putString("KEY_MERCHANT_ROUTER_URL", p1);
       uBundle.putBoolean("KEY_PROCESS_PADDING", p2);
       obj = new AuctionSettingFragment();
       obj.setArguments(uBundle);
       goto label_0058 ;
    }
    public boolean isAvailable(){
       return true;
    }
    public void lD(LiveMerchantBaseContext p0,String p1,x p2,c p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, MerchantMarketingShopPluginImpl.class, "6")) {
          return;
       }
       LiveAuctionBidRecordFragment.Bh(p0, p1, p2).show(p3, "LiveAuctionBidRecordFragment");
       return;
    }
    public b no(){
       Object obj = PatchProxy.apply(null, this, MerchantMarketingShopPluginImpl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.k();
    }
    public List t(boolean p0){
       MerchantMarketingShopPluginImpl merchantMark = MerchantMarketingShopPluginImpl.class;
       if (PatchProxy.isSupport(merchantMark)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, merchantMark, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new MerchantMarketingShopPluginImpl$1(this);
    }
    public List v(){
       Object obj = PatchProxy.apply(null, this, MerchantMarketingShopPluginImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MerchantMarketingShopPluginImpl$3(this);
    }
}
