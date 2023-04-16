package com.kuaishou.live.common.core.component.fansgroup.model.LiveFansGroupAudienceStatusResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveFansGroupAudienceStatusResponse implements Serializable	// class@0010fb
{
    public LiveFansGroupActiveNoticeInfo mActiveNoticeInfo;
    public boolean mHasSuperFansGroup;
    public LiveFansGroupIntimacyInfo mIntimacyInfo;
    public boolean mIsInactiveSoon;
    public List mLiveFansGroupDelayRequestTaskActionInfoList;
    public int mMedalType;
    public LiveSuperFansGroupInfo mSuperFansGroupInfo;
    public LiveFansGroupTagInfo mSuperFansGroupTagInfo;
    public static final long serialVersionUID = 0xdafbfff9f9771f44;

    public void LiveFansGroupAudienceStatusResponse(){
       super();
    }
}
