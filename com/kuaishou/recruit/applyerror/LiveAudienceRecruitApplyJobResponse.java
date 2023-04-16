package com.kuaishou.recruit.applyerror.LiveAudienceRecruitApplyJobResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveAudienceRecruitApplyJobResponse implements Serializable	// class@000e9a
{
    public int mBizErrorCode;
    public String mBizErrorReason;
    public String mBizErrorToast;
    public String mInterfaceApi;
    public String mRecruitApplyFailKrnUrl;
    public String mRecruitApplySuccessKrnUrl;
    public static final long serialVersionUID = 0xd47f871247d17645;

    public void LiveAudienceRecruitApplyJobResponse(){
       super();
    }
    public boolean isApplyFailed(){
       boolean b = (this.mBizErrorCode > null)? true: false;
       return b;
    }
    public boolean isOutOfAge(){
       boolean b = (this.mBizErrorCode == 0x15b44)? true: false;
       return b;
    }
    public boolean isRepeatApply(){
       boolean b = (this.mBizErrorCode == 0x151e9)? true: false;
       return b;
    }
    public boolean isResumeInvalid(){
       boolean b = (this.mBizErrorCode == 0x151ea)? true: false;
       return b;
    }
}
