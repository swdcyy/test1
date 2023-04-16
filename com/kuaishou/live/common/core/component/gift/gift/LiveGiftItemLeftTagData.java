package com.kuaishou.live.common.core.component.gift.gift.LiveGiftItemLeftTagData;
import java.io.Serializable;
import java.lang.Object;
import lnc.a1;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemViewData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import va1.l0;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveGiftItemLeftTagData implements Serializable	// class@001288
{
    public int mDynamicBackgroundColor;
    public GiftPanelItemRightPictureInfo mGiftPanelItemRightPictureInfo;
    public String mLongDynamicText;
    public String mShortDynamicText;
    public boolean mShouldGoneOnSelected;
    public List mStaticDefaultIcons;
    public static final long serialVersionUID = 0xb772e2961f503ff7;

    public void LiveGiftItemLeftTagData(){
       super();
       this.mShouldGoneOnSelected = true;
       this.mDynamicBackgroundColor = a1.a(0x7f061de2);
    }
    public static LiveGiftItemLeftTagData parse(GiftPanelItemViewData p0){
       LiveGiftItemLeftTagData obj = PatchProxy.applyOneRefs(p0, null, LiveGiftItemLeftTagData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveGiftItemLeftTagData();
       if (p0 != null) {
          obj.mShortDynamicText = p0.mDynamicCornerShortText;
          obj.mLongDynamicText = p0.mDynamicCornerText;
          obj.mDynamicBackgroundColor = l0.j(p0.mDynamicCornerBackgroundColor, a1.a(0x7f061de2));
          obj.mStaticDefaultIcons = p0.mRightIconUrl;
          obj.mGiftPanelItemRightPictureInfo = p0.mRightPictureInfo;
       }
       return obj;
    }
    public boolean isDynamicTag(){
       Object obj = PatchProxy.apply(null, this, LiveGiftItemLeftTagData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.x(this.mShortDynamicText) && !TextUtils.x(this.mLongDynamicText)) {
          return true;
       }
       return false;
    }
}
