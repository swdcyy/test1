package com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.sidebar.LiveLiteGiftGuideSideBarConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveLiteGiftGuideSideBarConfig implements Serializable	// class@001de0
{
    public String mBackgroundColor;
    public String mBottomBackgroundColor;
    public String mLiteSideButtonText;
    public static final long serialVersionUID = 0xfb45dc88d68f4436;

    public void LiveLiteGiftGuideSideBarConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLiteGiftGuideSideBarConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftGuideSideBarConfig{mLiteSideButtonText=\'"+this.mLiteSideButtonText+'''+", mBackgroundColor=\'"+this.mBackgroundColor+'''+", mBottomBackgroundColor=\'"+this.mBottomBackgroundColor+'''+'}';
    }
}
