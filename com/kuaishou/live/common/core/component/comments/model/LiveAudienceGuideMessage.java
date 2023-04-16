package com.kuaishou.live.common.core.component.comments.model.LiveAudienceGuideMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.core.show.delayinfo.LiveAuthorToPasserbyGuideConfig$GuideCommentConfig;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.core.show.delayinfo.LiveNearbyGuideConfig$LiveNearbyGuideCommentConfig;

public class LiveAudienceGuideMessage extends QLiveMessage	// class@0010b7
{
    public String mActionButtonText;
    public String mActionUrl;
    public User mAnchorUser;
    public String mBizId;
    public String mSubtitleText;
    public String mTitleText;
    public static final long serialVersionUID = 0xf88560c3150d878a;

    public void LiveAudienceGuideMessage(LiveAuthorToPasserbyGuideConfig$GuideCommentConfig p0,User p1){
       super();
       this.mTitleText = p0.mMainText;
       this.mSubtitleText = p0.mSubText;
       this.mActionButtonText = p0.mButtonText;
       this.mActionUrl = p0.mButtonJumpLink;
       this.mAnchorUser = p1;
       this.mBizId = "PASSERBY_GUIDE";
    }
    public void LiveAudienceGuideMessage(LiveNearbyGuideConfig$LiveNearbyGuideCommentConfig p0,User p1){
       super();
       this.mTitleText = p0.mTitleText;
       this.mSubtitleText = p0.mSubtitleText;
       this.mActionButtonText = p0.mActionButtonText;
       this.mActionUrl = p0.mActionUrl;
       this.mAnchorUser = p1;
       this.mBizId = "NEARBY_GUIDE";
    }
}
