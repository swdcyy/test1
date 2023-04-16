package com.kuaishou.live.common.core.component.multiline.model.LiveLineExtraInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveLineExtraInfo implements Serializable	// class@0014ee
{
    public String mAcceptTitle;
    public int mChatType;
    public String mExplanationInfo;
    public List mExtraInfoUserInfoList;
    public LiveMultiInteractiveForbidInvitedInfoV2 mForbidInvitedInfo;
    public boolean mIsFromMatch;
    public boolean mIsPaidMultiLineChat;
    public LiveAnchorBeInvitedPayInfo mPayInfo;
    public LiveAnchorBeInviteSellingInfo mSellingChatInfo;
    public int mSource;
    public static final long serialVersionUID = 0xcf4bff57d2bac7ed;

    public void LiveLineExtraInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLineExtraInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLineExtraInfo{mIsFromMatch="+this.mIsFromMatch+", mExtraInfoUserInfoList="+this.mExtraInfoUserInfoList+", mIsPaidMultiLineChat="+this.mIsPaidMultiLineChat+", mPayInfo="+this.mPayInfo+'}';
    }
}
