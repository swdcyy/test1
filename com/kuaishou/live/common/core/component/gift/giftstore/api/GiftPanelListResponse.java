package com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class GiftPanelListResponse implements Serializable, b	// class@00130c
{
    public List mGiftPanelItems;
    public String mGiftToken;
    public LiveFansGroupIntimacyInfo mIntimacyInfo;
    public boolean mNeedCheckLastGift;
    public int mPanelSelectGiftId;
    public String mRecoGiftLlsid;
    public boolean mShouldHideGiftEntrance;
    public static final long serialVersionUID = 0x5eb7f05c293253fb;

    public void GiftPanelListResponse(){
       super();
       this.mGiftPanelItems = new ArrayList();
    }
    public List getItems(){
       return this.mGiftPanelItems;
    }
    public boolean hasMore(){
       return false;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GiftPanelListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GiftPanelListResponse{, mIntimacyInfo="+this.mIntimacyInfo+", mShouldHideGiftEntrance="+this.mShouldHideGiftEntrance+", mRecoGiftLlsid=\'"+this.mRecoGiftLlsid+'''+'}';
    }
}
