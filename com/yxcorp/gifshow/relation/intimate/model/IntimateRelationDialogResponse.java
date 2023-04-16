package com.yxcorp.gifshow.relation.intimate.model.IntimateRelationDialogResponse;
import java.io.Serializable;
import java.lang.Object;

public class IntimateRelationDialogResponse implements Serializable	// class@001912
{
    public boolean mCanReBuild;
    public boolean mEnableChangeToday;
    public boolean mEnableIntimateEntranceIntensify;
    public boolean mEnableInviteToday;
    public boolean mEnableProfileShow;
    public boolean mHaveIntimatePropose;
    public IntimateTag mIntimateTag;
    public int mIntimateType;
    public boolean mNeedShowGuide;
    public String mOwnerHeadUrl;
    public String mOwnerName;
    public String mOwnerSex;
    public Map mRelationCounts;
    public int mRelationStatus;
    public String mSubTitle;
    public String mTargetHeadUrl;
    public String mTargetName;
    public String mTitle;
    public IntimateRelationDialogParams$ToastInfo mToastInfo;
    public static final long serialVersionUID = 0xa23b3b5cf23110e4;

    public void IntimateRelationDialogResponse(){
       super();
       this.mEnableChangeToday = true;
       this.mIntimateType = -1;
    }
}
