package com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashSet;

public class QComment$CommentViewBindEntity implements Serializable	// class@000dc8
{
    public long mADCrativeId;
    public boolean mDoAnim;
    public int mDynamicEffectId;
    public String mDynamicEffectWords;
    public int mDynamicEffectWordsId;
    public boolean mExpandMoreSubComment;
    public int mFirstCommentType;
    public String mFormatCaption;
    public boolean mHasCollapseSub;
    public boolean mHasLogSubMoreItemShow;
    public boolean mHasRequestedSubList;
    public boolean mIsFirstOpenMoreComment;
    public boolean mIsFoldedComment;
    public boolean mIsHide;
    public boolean mIsHotCommentDivider;
    public boolean mIsHotMore;
    public boolean mIsLastHotComment;
    public boolean mIsLastHotCommentWhenNoMoreHot;
    public boolean mIsLogSubCommentCount;
    public boolean mIsLoggedAtTailEasterEggShow;
    public boolean mIsLoggedUnfoldCommentNum;
    public boolean mIsMore;
    public boolean mIsNewAddComment;
    public boolean mIsOpen;
    public boolean mIsPlaceholder;
    public boolean mIsRequestingLike;
    public boolean mIsShowAuthorPraisedTag;
    public boolean mIsShowFullDivider;
    public boolean mIsSinkedComment;
    public boolean mIsSubCommentHidedMore;
    public boolean mIsUserInfo;
    public Set mNewSubCommentIdSet;
    public int mRecommendSubCommentShowNum;
    public int mShowChildCount;
    public boolean mShowSelectionBackground;
    public boolean mShown;
    public static final long serialVersionUID = 0x682a188baf50d669;

    public void QComment$CommentViewBindEntity(){
       super();
       this.mADCrativeId = -1;
       this.mNewSubCommentIdSet = new HashSet();
       this.mDynamicEffectWords = "";
    }
}
