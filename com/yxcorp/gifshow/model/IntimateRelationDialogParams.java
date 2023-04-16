package com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import com.kwai.framework.model.user.IntimateTag;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Map;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams$ToastInfo;

public class IntimateRelationDialogParams implements Serializable	// class@001e2b
{
    public boolean isFromAgree;
    public int mAction;
    public String mBizDataId;
    public String mBizType;
    public boolean mCanRebuild;
    public int mCurrentIntimateType;
    public boolean mEnableChangeToday;
    public boolean mEnableIntimateEntranceIntensify;
    public boolean mEnableInviteToday;
    public boolean mEnableProfileShow;
    public boolean mHasInvited;
    public IntimateTag mIntimateTag;
    public int mIntimateType;
    public boolean mNeedShowGuide;
    public String mOwnerHeadUrl;
    public String mOwnerId;
    public String mOwnerName;
    public String mOwnerSex;
    public String mProposeId;
    public Map mRelationCounts;
    public int mRelationStatus;
    public int mSource;
    public long mStartTime;
    public int mStyle;
    public String mSubTitle;
    public String mTargetHeadUrl;
    public String mTargetId;
    public String mTargetName;
    public String mTitle;
    public boolean mToIM;
    public IntimateRelationDialogParams$ToastInfo mToastInfo;
    public static final long serialVersionUID = 0xd84bcabd2fbc08c2;

    public void IntimateRelationDialogParams(String p0){
       super();
       this.mCurrentIntimateType = -1;
       this.mAction = -1;
       this.mBizType = "acceptIntimateRelation";
       this.mEnableChangeToday = true;
       this.mIntimateTag = new IntimateTag();
       this.mToIM = true;
       this.mOwnerId = p0;
    }
    public int getRelationCount(int p0){
       IntimateRelationDialogParams obj;
       if (PatchProxy.isSupport(IntimateRelationDialogParams.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, IntimateRelationDialogParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.mRelationCounts;
       int i = 0;
       if (obj != null && obj.size()) {
          Integer integer = this.mRelationCounts.get(p0+"");
          if (integer != null) {
             i = integer.intValue();
          }
       }
       return i;
    }
    public IntimateRelationDialogParams setAction(int p0){
       this.mAction = p0;
       return this;
    }
    public IntimateRelationDialogParams setBizDataId(String p0){
       this.mBizDataId = p0;
       return this;
    }
    public IntimateRelationDialogParams setCanRebuild(boolean p0){
       this.mCanRebuild = p0;
       return this;
    }
    public IntimateRelationDialogParams setCurrentIntimateType(int p0){
       this.mCurrentIntimateType = p0;
       return this;
    }
    public IntimateRelationDialogParams setEnableChangeToday(boolean p0){
       this.mEnableChangeToday = p0;
       return this;
    }
    public IntimateRelationDialogParams setEnableIntimateEntranceIntensify(boolean p0){
       this.mEnableIntimateEntranceIntensify = p0;
       return this;
    }
    public IntimateRelationDialogParams setEnableInviteToday(boolean p0){
       this.mEnableInviteToday = p0;
       return this;
    }
    public IntimateRelationDialogParams setEnableProfileShow(boolean p0){
       this.mEnableProfileShow = p0;
       return this;
    }
    public IntimateRelationDialogParams setHasInvited(boolean p0){
       this.mHasInvited = p0;
       return this;
    }
    public IntimateRelationDialogParams setIntimateTag(IntimateTag p0){
       this.mIntimateTag = p0;
       return this;
    }
    public IntimateRelationDialogParams setIntimateType(int p0){
       this.mIntimateType = p0;
       return this;
    }
    public IntimateRelationDialogParams setNeedShowGuide(boolean p0){
       this.mNeedShowGuide = p0;
       return this;
    }
    public IntimateRelationDialogParams setOwnerHeadUrl(String p0){
       this.mOwnerHeadUrl = p0;
       return this;
    }
    public IntimateRelationDialogParams setOwnerName(String p0){
       this.mOwnerName = p0;
       return this;
    }
    public IntimateRelationDialogParams setOwnerSex(String p0){
       this.mOwnerSex = p0;
       return this;
    }
    public IntimateRelationDialogParams setProposeId(String p0){
       this.mProposeId = p0;
       return this;
    }
    public IntimateRelationDialogParams setRelationCounts(Map p0){
       this.mRelationCounts = p0;
       return this;
    }
    public IntimateRelationDialogParams setRelationStatus(int p0){
       this.mRelationStatus = p0;
       return this;
    }
    public IntimateRelationDialogParams setSource(int p0){
       this.mSource = p0;
       return this;
    }
    public void setStartTime(long p0){
       this.mStartTime = p0;
    }
    public IntimateRelationDialogParams setStyle(int p0){
       this.mStyle = p0;
       return this;
    }
    public IntimateRelationDialogParams setSubTitle(String p0){
       this.mSubTitle = p0;
       return this;
    }
    public IntimateRelationDialogParams setTargetHeadUrl(String p0){
       this.mTargetHeadUrl = p0;
       return this;
    }
    public IntimateRelationDialogParams setTargetId(String p0){
       this.mTargetId = p0;
       return this;
    }
    public IntimateRelationDialogParams setTargetName(String p0){
       this.mTargetName = p0;
       return this;
    }
    public IntimateRelationDialogParams setTitle(String p0){
       this.mTitle = p0;
       return this;
    }
    public IntimateRelationDialogParams setToIM(boolean p0){
       this.mToIM = p0;
       return this;
    }
    public IntimateRelationDialogParams setToastInfo(IntimateRelationDialogParams$ToastInfo p0){
       this.mToastInfo = p0;
       return this;
    }
}
