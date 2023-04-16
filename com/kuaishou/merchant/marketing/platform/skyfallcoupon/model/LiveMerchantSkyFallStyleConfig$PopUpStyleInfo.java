package com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$PopUpStyleInfo;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$PopUpStyleInfo$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$AfterOpen;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$BeforeOpen;

public final class LiveMerchantSkyFallStyleConfig$PopUpStyleInfo implements Serializable	// class@001b5a
{
    public LiveMerchantSkyFallStyleConfig$AfterOpen afterOpen;
    public LiveMerchantSkyFallStyleConfig$BeforeOpen beforeOpen;
    public static final LiveMerchantSkyFallStyleConfig$PopUpStyleInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LiveMerchantSkyFallStyleConfig$PopUpStyleInfo.Companion = new LiveMerchantSkyFallStyleConfig$PopUpStyleInfo$a(null);
    }
    public void LiveMerchantSkyFallStyleConfig$PopUpStyleInfo(){
       super();
    }
    public final LiveMerchantSkyFallStyleConfig$AfterOpen getAfterOpen(){
       return this.afterOpen;
    }
    public final LiveMerchantSkyFallStyleConfig$BeforeOpen getBeforeOpen(){
       return this.beforeOpen;
    }
    public final void setAfterOpen(LiveMerchantSkyFallStyleConfig$AfterOpen p0){
       this.afterOpen = p0;
    }
    public final void setBeforeOpen(LiveMerchantSkyFallStyleConfig$BeforeOpen p0){
       this.beforeOpen = p0;
    }
}
