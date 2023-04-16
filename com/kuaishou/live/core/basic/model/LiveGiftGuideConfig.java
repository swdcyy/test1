package com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveGiftGuideConfig implements Serializable	// class@00086c
{
    public List mAttachGiftConfigs;
    public boolean mEnableLiveExplicitGift;
    public LiveGiftGuideConfig$GiftGuideBubbleInfo mExplicitGiftBubbleInfo;
    public Map mExplicitGiftConfirmDialogInfo;
    public List mExplicitGiftIds;
    public int mExplicitGiftType;
    public String mGiftToken;
    public long mLitePopularityTicketSenseFansGroupStatusTimeMillis;
    public int mLiteSideBarAttachGiftRecoverThreshold;
    public String mRecoGiftLlsid;
    public static final long serialVersionUID = 0x4293c02e8c5700d8;

    public void LiveGiftGuideConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveGiftGuideConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftGuideConfig{mEnableLiveExplicitGift="+this.mEnableLiveExplicitGift+", mExplicitGiftIds="+this.mExplicitGiftIds+", mExplicitGiftConfirmDialogInfo="+this.mExplicitGiftConfirmDialogInfo+", mGiftToken=\'"+this.mGiftToken+'''+", mExplicitGiftType="+this.mExplicitGiftType+", mExplicitGiftBubbleInfo="+this.mExplicitGiftBubbleInfo+", mRecoGiftLlsid=\'"+this.mRecoGiftLlsid+'''+", mAttachGiftConfigs="+this.mAttachGiftConfigs+", mLiteSideBarAttachGiftRecoverThreshold="+this.mLiteSideBarAttachGiftRecoverThreshold+", mLitePopularityTicketSenseFansGroupStatusTimeMillis="+this.mLitePopularityTicketSenseFansGroupStatusTimeMillis+'}';
    }
}
