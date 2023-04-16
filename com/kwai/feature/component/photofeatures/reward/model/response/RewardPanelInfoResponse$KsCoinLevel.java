package com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$KsCoinLevel;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class RewardPanelInfoResponse$KsCoinLevel	// class@00124d
{
    public String mCornerText;
    public String mDisplayName;
    public long mGiftId;
    public String mGiftName;
    public List mGiftNumOptions;
    public boolean mIsCustomLevel;
    public long mKsCoin;
    public String mLabel;
    public List mMessage;
    public long mOriginalKsCoin;
    public String mOverrideDisplayName;
    public String mPicUrl;
    public int mPosition;
    public long mSubsidyCoin;
    public int type;

    public void RewardPanelInfoResponse$KsCoinLevel(){
       super();
       this.mMessage = new ArrayList();
       this.mGiftNumOptions = new ArrayList();
    }
    public void RewardPanelInfoResponse$KsCoinLevel(int p0,String p1,String p2){
       super();
       this.mMessage = new ArrayList();
       this.mGiftNumOptions = new ArrayList();
       this.mKsCoin = (long)p0;
       this.mDisplayName = p1;
       this.mPicUrl = p2;
    }
}
