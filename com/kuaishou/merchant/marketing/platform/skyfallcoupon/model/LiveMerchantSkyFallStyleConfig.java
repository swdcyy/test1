package com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$PendantStyle;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$PopUpStyleInfo;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$BeforeOpen;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$AfterOpen;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$ButtonStyle;

public final class LiveMerchantSkyFallStyleConfig implements Serializable	// class@001b5c
{
    public LiveMerchantSkyFallStyleConfig$PendantStyle pendantStyle;
    public LiveMerchantSkyFallStyleConfig$PopUpStyleInfo popUpStyleInfo;
    public static final LiveMerchantSkyFallStyleConfig$a Companion;
    public static final long serialVersionUID;

    static {
       LiveMerchantSkyFallStyleConfig.Companion = new LiveMerchantSkyFallStyleConfig$a(null);
    }
    public void LiveMerchantSkyFallStyleConfig(){
       super();
    }
    public final LiveMerchantSkyFallStyleConfig$PendantStyle getPendantStyle(){
       return this.pendantStyle;
    }
    public final LiveMerchantSkyFallStyleConfig$PopUpStyleInfo getPopUpStyleInfo(){
       return this.popUpStyleInfo;
    }
    public final List getPopupCDNResource(){
       List mTopImgUrls;
       List mMainTitleIm;
       LiveMerchantSkyFallStyleConfig$AfterOpen afterOpen;
       ArrayList obj = PatchProxy.apply(null, this, LiveMerchantSkyFallStyleConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       LiveMerchantSkyFallStyleConfig tpopUpStyleI = this.popUpStyleInfo;
       if (tpopUpStyleI != null) {
          LiveMerchantSkyFallStyleConfig$BeforeOpen beforeOpen = tpopUpStyleI.getBeforeOpen();
          if (beforeOpen != null) {
             mTopImgUrls = beforeOpen.getMTopImgUrls();
             if (mTopImgUrls != null) {
                obj.add(mTopImgUrls);
             }
             mMainTitleIm = beforeOpen.getMMainTitleImgUrls();
             if (mMainTitleIm != null) {
                obj.add(mMainTitleIm);
             }
          }
       }
       tpopUpStyleI = this.popUpStyleInfo;
       if (tpopUpStyleI != null) {
          afterOpen = tpopUpStyleI.getAfterOpen();
          if (afterOpen != null) {
             mTopImgUrls = afterOpen.getMMainTitleUrls();
             if (mTopImgUrls != null) {
                obj.add(mTopImgUrls);
             }
             mTopImgUrls = afterOpen.getMTopImgUrl();
             if (mTopImgUrls != null) {
                obj.add(mTopImgUrls);
             }
             mTopImgUrls = afterOpen.getMMediumImgUrls();
             if (mTopImgUrls != null) {
                obj.add(mTopImgUrls);
             }
             mMainTitleIm = afterOpen.getMBottomImgUrls();
             if (mMainTitleIm != null) {
                obj.add(mMainTitleIm);
             }
          }
       }
       tpopUpStyleI = this.popUpStyleInfo;
       if (tpopUpStyleI != null) {
          afterOpen = tpopUpStyleI.getAfterOpen();
          if (afterOpen != null) {
             LiveMerchantSkyFallStyleConfig$ButtonStyle mButtonStyle = afterOpen.getMButtonStyle();
             if (mButtonStyle != null) {
                mMainTitleIm = mButtonStyle.getMButtonImgUrls();
                if (mMainTitleIm != null) {
                   obj.add(mMainTitleIm);
                }
             }
          }
       }
       return obj;
    }
    public final void setPendantStyle(LiveMerchantSkyFallStyleConfig$PendantStyle p0){
       this.pendantStyle = p0;
    }
    public final void setPopUpStyleInfo(LiveMerchantSkyFallStyleConfig$PopUpStyleInfo p0){
       this.popUpStyleInfo = p0;
    }
}
