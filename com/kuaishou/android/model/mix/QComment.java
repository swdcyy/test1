package com.kuaishou.android.model.mix.QComment;
import mkd.a;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.kuaishou.android.model.mix.QComment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import ka6.b;
import com.kuaishou.android.model.mix.QSubComment;
import java.util.ArrayList;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.QComment$CommentBottomTag;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.android.model.mix.QComment$Label;
import java.lang.Integer;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.kuaishou.android.model.mix.QComment$CommentMarqueeTag;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.user.User;
import java.lang.Number;
import ei5.c;
import java.lang.StringBuilder;
import q87.c;
import la6.a;
import yl8.b;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;

public class QComment extends DefaultObservableAndSyncable implements a	// class@000670
{
    public List attachmentList;
    public HashSet mAtFromAtPanelUidSet;
    public String mAuthorArea;
    public boolean mAuthorPraiseLogged;
    public boolean mAvatarPendantShow;
    public int mBottomSpaceHeight;
    public Map mCashTags;
    public String mComment;
    public CommentAuthorPendantInfo mCommentAuthorPendantInfo;
    public List mCommentBottomTags;
    public List mCommentMarqueeTags;
    public QComment$CommentViewBindEntity mCommentViewBindEntity;
    public String mConversation;
    public long mCreated;
    public boolean mDisliked;
    public boolean mDisplaySubCommentCount;
    public EmotionInfo mEmotionInfo;
    public boolean mGodCommentNegatived;
    public boolean mHasPosition;
    public boolean mHasShowAtTailEasterEgg;
    public QComment mHotCommentDivider;
    public QComment mHotMoreComment;
    public String mId;
    public boolean mIsAuthorPraised;
    public boolean mIsCopyAt;
    public boolean mIsDislikeHideComment;
    public boolean mIsFollowingComment;
    public boolean mIsFriendComment;
    public boolean mIsGodComment;
    public boolean mIsHighQualityComment;
    public boolean mIsHot;
    public boolean mIsKeepEditorState;
    public boolean mIsNearbyAuthor;
    public boolean mIsPraiseCommentEdited;
    public boolean mIsQuickAtComment;
    public boolean mIsQuickComment;
    public boolean mIsQuickEmojiComment;
    public boolean mIsShowedByDefault;
    public boolean mIsVoiceInput;
    public boolean mIsVoiceTextEdit;
    public List mLabels;
    public long mLastVisibleTimeStamp;
    public boolean mLiked;
    public long mLikedCount;
    public boolean mLocalCreated;
    public QComment mMoreComment;
    public QComment mParent;
    public long mParsedId;
    public String mPhotoId;
    public String mPhotoUserId;
    public long mPraiseCommentId;
    public QMedia mQMedia;
    public int mRecallType;
    public String mRecommendDesc;
    public boolean mRefreshFirstShowComment;
    public QComment mReplyComment;
    public String mReplyToCommentId;
    public String mReplyToUserId;
    public String mReplyToUserName;
    public String mRootCommentId;
    public int mRootCommentPosition;
    public int mServerSubCommentCount;
    public long mShowedTimeMs;
    public int mStatus;
    public QSubComment mSubComment;
    public int mSubCommentCount;
    public boolean mSubCommentVisible;
    public int mSubCommentVisibleLimit;
    public QComment$a mTagShowStatusEntity;
    public boolean mTagShowed;
    public int mType;
    public int mUpdateLikeType;
    public User mUser;
    public JSONObject transparentParam;
    public static final long serialVersionUID = 0x6b04c738fbc0d17;

    public void QComment(){
       super();
       this.mStatus = 0;
       this.mAuthorPraiseLogged = false;
       this.mIsQuickComment = false;
       this.mIsQuickAtComment = false;
       this.mIsQuickEmojiComment = false;
       this.mIsKeepEditorState = false;
       this.mBottomSpaceHeight = 15;
       this.mTagShowStatusEntity = new QComment$a();
       this.mHasShowAtTailEasterEgg = false;
       this.mIsDislikeHideComment = false;
       this.mRefreshFirstShowComment = true;
       this.mUpdateLikeType = 0;
       this.mIsCopyAt = false;
    }
    public static QComment createPlaceholderComment(){
       QComment obj = PatchProxy.apply(null, null, QComment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new QComment();
       obj.getEntity().mIsPlaceholder = true;
       return obj;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, QComment.class, "18")) {
          return;
       }
       this.mServerSubCommentCount = this.mSubCommentCount;
       b.b().c(this, QComment.class);
       return;
    }
    public void attemptCreateSubComment(){
       if (PatchProxy.applyVoid(null, this, QComment.class, "7")) {
          return;
       }
       if (this.mSubComment == null) {
          this.mSubComment = new QSubComment();
       }
       QComment tmSubComment = this.mSubComment;
       if (tmSubComment.mComments == null) {
          tmSubComment.mComments = new ArrayList();
       }
       return;
    }
    public long created(){
       return this.mCreated;
    }
    public boolean equals(Object p0){
       QComment obj = PatchProxy.applyOneRefs(p0, this, QComment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this != p0) {
          if (p0 instanceof QComment) {
             obj = this.mId;
             if (obj == null || !TextUtils.n(obj, p0.getId())) {
             }
          }else {
          }
       }
       boolean b = true;
    label_002d :
       return b;
    }
    public String getBizId(){
       return this.mId;
    }
    public String getComment(){
       Object obj = PatchProxy.apply(null, this, QComment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(this.mComment);
    }
    public QComment$CommentBottomTag getCommentBottomTag(){
       QComment obj = PatchProxy.apply(null, this, QComment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCommentBottomTags;
       if (obj != null && obj.size()) {
          Iterator iterator = this.mCommentBottomTags.iterator();
          while (iterator.hasNext()) {
             QComment$CommentBottomTag uCommentBott = iterator.next();
             if (("top_comment_tag").equalsIgnoreCase(uCommentBott.mTextKey)) {
                return uCommentBott;
             }
          }
       }
       return null;
    }
    public QComment$Label getCommentTopLabel(){
       QComment obj = PatchProxy.apply(null, this, QComment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLabels;
       if (obj != null && obj.size()) {
          Iterator iterator = this.mLabels.iterator();
          while (iterator.hasNext()) {
             QComment$Label label = iterator.next();
             if (label.mLabelType.intValue() == 9) {
                return label;
             }
          }
       }
       return null;
    }
    public QComment$CommentViewBindEntity getEntity(){
       Object obj = PatchProxy.apply(null, this, QComment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mCommentViewBindEntity == null) {
          this.mCommentViewBindEntity = new QComment$CommentViewBindEntity();
       }
       return this.mCommentViewBindEntity;
    }
    public String getGifEmotionId(){
       QComment tmEmotionInf = this.mEmotionInfo;
       if (tmEmotionInf == null) {
          return null;
       }
       return tmEmotionInf.mId;
    }
    public String getId(){
       return this.mId;
    }
    public String getPhotoId(){
       return this.mPhotoId;
    }
    public String getPhotoUserId(){
       return this.mPhotoUserId;
    }
    public String getReplyToUserId(){
       return this.mReplyToUserId;
    }
    public String getRootCommentId(){
       return this.mRootCommentId;
    }
    public int getStatus(){
       return this.mStatus;
    }
    public QComment$CommentMarqueeTag getTag(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, QComment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.f(this.mCommentMarqueeTags)) {
          objArray = this.mCommentMarqueeTags.get(0);
       }
       return objArray;
    }
    public User getUser(){
       return this.mUser;
    }
    public final boolean hasHideComments(){
       QComment obj = PatchProxy.apply(null, this, QComment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mSubComment;
       if (obj != null) {
          QSubComment mComments = obj.mComments;
          if (mComments != null) {
             Iterator iterator = mComments.iterator();
             while (iterator.hasNext()) {
                if (iterator.next().getEntity().mIsHide != null) {
                   return true;
                }
             }
          }
       }
       return false;
    }
    public boolean hasSub(){
       QComment obj = PatchProxy.apply(null, this, QComment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mSubComment;
       boolean b = (obj != null && !q.f(obj.mComments))? true: false;
       return b;
    }
    public int hashCode(){
       QComment obj = PatchProxy.apply(null, this, QComment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.getEntity().mIsUserInfo != null) {
          obj = this.mUser;
          if (obj != null && !TextUtils.x(obj.mId)) {
             return (this.mUser.mId).hashCode();
          }
       }
       int i = (!TextUtils.x(this.getId()))? (this.getId()).hashCode(): super.hashCode();
       return i;
    }
    public boolean isLastShowedCommentInGroup(){
       QComment obj = PatchProxy.apply(null, this, QComment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       if (!this.isSub()) {
          return (this.hasSub() ^ i);
       }
       if (this.mType == 3) {
          return i;
       }
       if (!this.mParent.hasSub() || this.mParent.showExpandOrCollapse()) {
          return false;
       }
       obj = this.mParent;
       if (obj.mSubCommentVisible == null && obj.getEntity().mHasCollapseSub != null) {
          return false;
       }
       return this.equals(this.mParent.mSubComment.getLastShowBean());
    }
    public boolean isLocalCreated(){
       return this.mLocalCreated;
    }
    public boolean isSub(){
       boolean b = (this.mParent != null)? true: false;
       return b;
    }
    public boolean isTopComment(){
       Object obj = PatchProxy.apply(null, this, QComment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getCommentTopLabel() != null || this.getCommentBottomTag() != null)? true: false;
       return b;
    }
    public void setLocalCreated(boolean p0){
       this.mLocalCreated = p0;
    }
    public void setStatus(int p0){
       this.mStatus = p0;
    }
    public boolean showExpandOrCollapse(){
       QComment obj = PatchProxy.apply(null, this, QComment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (this.isSub()) {
          obj = this.mParent;
          if (obj.mParent != null) {
             Object[] objArray = new Object[i];
             c.C().t("QComment", "comment_parent_illegal_error, comment_id£º"+this.getId()+"£¬rootComment_id£º"+this.mParent.getId(), objArray);
             return i;
          }else {
             return obj.showExpandOrCollapse();
          }
       }else {
          obj = this.mSubComment;
          if (obj != null) {
             QSubComment mComments = obj.mComments;
             if (mComments != null) {
                int i1 = mComments.size();
                if (i1 <= this.getEntity().mShowChildCount && (!a.a(this.mSubComment.mCursor) && (this.hasHideComments() || (i1 == this.getEntity().mShowChildCount && i1 > this.mSubCommentVisibleLimit)))) {
                   i = true;
                }
             }
          }
          return i;
       }
    }
    public void sync(QComment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QComment.class, "12")) {
          return;
       }
       int i = 0;
       QComment mLiked = p0.mLiked;
       int i1 = 1;
       if (this.mLiked != mLiked) {
          this.mLiked = mLiked;
          i = 1;
       }
       QComment mLikedCount = p0.mLikedCount;
       if (this.mLikedCount - mLikedCount) {
          this.mLikedCount = mLikedCount;
          i = 1;
       }
       mLiked = p0.mDisliked;
       if (this.mDisliked != mLiked) {
          this.mDisliked = mLiked;
          i = 1;
       }
       mLiked = p0.mRefreshFirstShowComment;
       if (this.mRefreshFirstShowComment != mLiked) {
          this.mRefreshFirstShowComment = mLiked;
          i = 1;
       }
       p0 = p0.mIsDislikeHideComment;
       if (this.mIsDislikeHideComment != p0) {
          this.mIsDislikeHideComment = p0;
       }else {
          i1 = i;
       }
       if (i1) {
          this.notifyChanged();
       }
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
    public void updateDislike(boolean p0){
       if (PatchProxy.isSupport(QComment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QComment.class, "14")) {
          return;
       }
       if (this.mDisliked == p0) {
          return;
       }
       this.mUpdateLikeType = 1;
       this.mDisliked = p0;
       this.notifyChanged();
       this.fireSync();
       return;
    }
    public void updateLiked(boolean p0){
       if (PatchProxy.isSupport(QComment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, QComment.class, "13")) {
          return;
       }
       if (this.mLiked == p0) {
          return;
       }
       this.mUpdateLikeType = 2;
       this.mLiked = p0;
       this.notifyChanged();
       this.fireSync();
       return;
    }
}
