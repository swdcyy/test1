package com.kuaishou.merchant.api.core.LiveMerchantSkin;
import java.io.Serializable;
import java.io.File;
import java.lang.Object;
import com.kuaishou.merchant.api.core.LiveMerchantSkin$Resource;
import java.lang.String;
import com.kuaishou.merchant.api.core.LiveMerchantSkin$Config;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class LiveMerchantSkin implements Serializable	// class@001507
{
    public final LiveMerchantSkin$Config mConfig;
    public final LiveMerchantSkin$Resource mLiveMerchantBottomBarIcon;
    public final LiveMerchantSkin$Resource mLiveMerchantConfig;
    public final LiveMerchantSkin$Resource mLiveMerchantPageBackground;
    public final LiveMerchantSkin$Resource mLiveMerchantPageBackgroundLandscape;
    public final File mRoot;
    public static final long serialVersionUID = 0xcad0a64e85b63e16;

    public void LiveMerchantSkin(File p0){
       super();
       this.mLiveMerchantBottomBarIcon = new LiveMerchantSkin$Resource(this, "live_merchant_cart", "live_merchant_cart_animation.json");
       this.mLiveMerchantPageBackground = new LiveMerchantSkin$Resource(this, "", "live_merchant_page_background.webp");
       this.mLiveMerchantPageBackgroundLandscape = new LiveMerchantSkin$Resource(this, "", "live_merchant_page_background_landscape.webp");
       LiveMerchantSkin$Resource resource = new LiveMerchantSkin$Resource(this, "", "live_config.json");
       this.mLiveMerchantConfig = resource;
       this.mRoot = p0;
       this.mConfig = LiveMerchantSkin$Config.parse(resource.getFile());
    }
    public boolean isMerchantPageUseSkin(){
       boolean b;
       LiveMerchantSkin obj = PatchProxy.apply(null, this, LiveMerchantSkin.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mLiveMerchantPageBackground.isValid()) {
          obj = this.mConfig;
          if (obj != null && obj.mPageBackgroundTopMargin > null) {
             b = true;
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
}
