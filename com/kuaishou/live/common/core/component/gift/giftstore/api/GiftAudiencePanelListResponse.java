package com.kuaishou.live.common.core.component.gift.giftstore.api.GiftAudiencePanelListResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Collection;
import ekd.q;
import rm1.f;

public class GiftAudiencePanelListResponse implements Serializable, b	// class@00130a
{
    public List mGiftPanelItems;
    public String mGiftToken;
    public List mGifts;
    public LiveFansGroupIntimacyInfo mIntimacyInfo;
    public int mPanelSelectGiftId;
    public String mRecoGiftLlsid;
    public boolean mShouldHideGiftEntrance;
    public static final long serialVersionUID = 0x972da111dc7d4805;

    public void GiftAudiencePanelListResponse(){
       super();
       this.mGifts = new ArrayList();
       this.mGiftPanelItems = new ArrayList();
    }
    public GiftPanelListResponse convertToGiftPanelListResponse(){
       GiftPanelListResponse obj = PatchProxy.apply(null, this, GiftAudiencePanelListResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GiftPanelListResponse();
       obj.mGiftPanelItems = this.getItems();
       obj.mGiftToken = this.mGiftToken;
       obj.mShouldHideGiftEntrance = this.mShouldHideGiftEntrance;
       obj.mIntimacyInfo = this.mIntimacyInfo;
       obj.mRecoGiftLlsid = this.mRecoGiftLlsid;
       obj.mPanelSelectGiftId = this.mPanelSelectGiftId;
       return obj;
    }
    public List getItems(){
       Object obj = PatchProxy.apply(null, this, GiftAudiencePanelListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.f(this.mGiftPanelItems)) {
          return this.mGiftPanelItems;
       }
       return f.f(this.mGifts);
    }
    public boolean hasMore(){
       return false;
    }
}
