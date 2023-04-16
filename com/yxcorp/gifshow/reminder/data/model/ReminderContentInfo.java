package com.yxcorp.gifshow.reminder.data.model.ReminderContentInfo;
import java.lang.Object;

public class ReminderContentInfo	// class@001a71
{
    public CharSequence a;
    public Spannable b;
    public f c;
    public boolean d;
    public boolean e;
    public ReminderButtonModel mArrow;
    public ReminderButtonModel mButton;
    public QComment mComment;
    public int mCommentInteractType;
    public String mContent;
    public String mContentUrl;
    public String mFollowReason;
    public ReminderMoment mMoment;
    public MomentComment mMomentComment;
    public BaseFeed mPhoto;
    public String mPinnedUserId;
    public String mRelationLabel;
    public int mRelationLabelType;
    public String mSplittingContent;
    public String mSplittingTitle;
    public QComment mTipsComment;
    public MomentComment mTipsMomentComment;
    public String mTitle;
    public User mUser;

    public void ReminderContentInfo(){
       super();
       this.mTitle = "";
       this.mContent = "";
       this.mSplittingTitle = "";
       this.mSplittingContent = "";
       this.mRelationLabel = "";
       this.mRelationLabelType = 0;
       this.mFollowReason = "";
    }
}
