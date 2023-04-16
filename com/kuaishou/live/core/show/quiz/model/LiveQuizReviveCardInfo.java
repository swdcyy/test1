package com.kuaishou.live.core.show.quiz.model.LiveQuizReviveCardInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveQuizReviveCardInfo implements Serializable	// class@000e27
{
    public int mAvailableReviveCardCount;
    public String mDisplayAwardRatio;
    public String mGroupRuleDesc;
    public int mGroupStatus;
    public List mGroupUsers;
    public boolean mHasEraser;
    public boolean mInvitationCodeExchanged;
    public String mInvitationRuleDesc;
    public List mInvitedNewUsers;
    public String mMyInvitationCode;
    public int mReviveCardTotalCount;
    public String mRuleRedirectUrl;
    public int mSuccessGroupSize;
    public int mUserReviveCardAvailableCountLimitPerQuiz;
    public static final long serialVersionUID = 0xd9fb4c4c590ccffe;

    public void LiveQuizReviveCardInfo(){
       super();
    }
}
