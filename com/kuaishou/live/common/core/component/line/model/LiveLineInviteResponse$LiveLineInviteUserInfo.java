package com.kuaishou.live.common.core.component.line.model.LiveLineInviteResponse$LiveLineInviteUserInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.line.model.LiveLineInviteResponse$LiveLineInviteUserInfo$LiveLineInvitee;
import com.kuaishou.live.common.core.component.pk.model.LiveLineInviteItem;

public class LiveLineInviteResponse$LiveLineInviteUserInfo implements Serializable	// class@001486
{
    public List b;
    public List mInviteeUsers;
    public int mSourceType;
    public String mTitle;
    public static final long serialVersionUID = 0x5e4b8c6f01afca99;

    public void LiveLineInviteResponse$LiveLineInviteUserInfo(){
       super();
    }
    public List getItems(String p0){
       LiveLineInviteResponse$LiveLineInviteUserInfo obj = PatchProxy.applyOneRefs(p0, this, LiveLineInviteResponse$LiveLineInviteUserInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          return obj;
       }
       this.b = new ArrayList();
       int i = 0;
       while (i < this.mInviteeUsers.size()) {
          LiveLineInviteResponse$LiveLineInviteUserInfo$LiveLineInvitee liveLineInvi = this.mInviteeUsers.get(i);
          if (liveLineInvi == null) {
             this.b.add(LiveLineInviteItem.createDefaultUserInfo());
          }else {
             LiveLineInviteItem liveLineInvi1 = new LiveLineInviteItem();
             liveLineInvi1.mUserInfo = liveLineInvi.mUserInfo;
             liveLineInvi1.mLiveStreamId = liveLineInvi.mLiveStreamId;
             liveLineInvi1.mDisplayLocation = liveLineInvi.mDisplayLocation;
             liveLineInvi1.mDisplayAge = liveLineInvi.mDisplayAge;
             liveLineInvi1.mNotSupportPaidMultiLineChat = liveLineInvi.mNotSupportPaidMultiLineChat;
             liveLineInvi1.mFlowDiversionCpcInfo = liveLineInvi.mLiveFlowDiversionCpcInfoV2;
             liveLineInvi1.mSourceType = this.mSourceType;
             liveLineInvi1.mMultiLineJoinSourceType = liveLineInvi.mMultiLineJoinSourceType;
             liveLineInvi1.mMatchSource = p0;
             liveLineInvi1.mSupportMultiLineChat = liveLineInvi.mSupportMultiLineChat;
             liveLineInvi1.mLiveLineExtraInfo = liveLineInvi.mLiveLineExtraInfo;
             liveLineInvi1.mHighlightTagList = liveLineInvi.mHighlightTagList;
             liveLineInvi1.mNormalTagList = liveLineInvi.mNormalTagList;
             int i1 = i + 1;
             liveLineInvi1.mIndex = i1;
             liveLineInvi1.mSellingChatInfo = liveLineInvi.mSellingChatInfo;
             liveLineInvi1.mInvitePenetrateParam = liveLineInvi.mInvitePenetrateParam;
             liveLineInvi1.mPromptDialogInfo = liveLineInvi.mPromptDialogInfo;
             liveLineInvi1.mCandidateStatus = liveLineInvi.mCandidateStatus;
             this.b.add(liveLineInvi1);
          }
          i = i + 1;
       }
       return this.b;
    }
}
