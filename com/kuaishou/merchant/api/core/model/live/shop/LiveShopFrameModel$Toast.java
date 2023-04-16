package com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel$Toast;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopLeftRegion;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopLeftRegion$Index;

public class LiveShopFrameModel$Toast implements Serializable	// class@001540
{
    public int mDurationType;
    public boolean mHasShowed;
    public String mMessage;
    public int mType;
    public static final long serialVersionUID = 0xab392d203f31620a;

    public void LiveShopFrameModel$Toast(){
       super();
    }
    public void createIndexMessage(LiveShopLeftRegion p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopFrameModel$Toast.class, "1")) {
          return;
       }
       if (!TextUtils.x(this.mMessage) && (this.mType == 2 && p0 != null)) {
          LiveShopLeftRegion mIndex = p0.mIndex;
          if (mIndex != null && !TextUtils.x(mIndex.mText)) {
             this.mMessage = (this.mMessage).replace("${0}", p0.mIndex.mText);
          }
       }
    label_0034 :
       return;
    }
}
