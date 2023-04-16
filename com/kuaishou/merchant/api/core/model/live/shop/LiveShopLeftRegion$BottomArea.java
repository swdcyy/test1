package com.kuaishou.merchant.api.core.model.live.shop.LiveShopLeftRegion$BottomArea;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopLeftRegion$ActionButton;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveShopLeftRegion$BottomArea implements Serializable	// class@001545
{
    public LiveShopLeftRegion$ActionButton mActionButton;
    public LiveShopLeftRegion$BottomTips mBottomTips;
    public int mType;
    public static final long serialVersionUID = 0xfd8549ae1bb6a9c2;

    public void LiveShopLeftRegion$BottomArea(){
       super();
    }
    public LiveShopLeftRegion$ActionButton getActionButton(){
       Object obj = PatchProxy.apply(null, this, LiveShopLeftRegion$BottomArea.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mActionButton == null) {
          this.mActionButton = new LiveShopLeftRegion$ActionButton();
       }
       return this.mActionButton;
    }
}
