package com.yxcorp.gifshow.notice.data.model.Notice;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.reminder.data.model.ReminderContentInfo;
import com.yxcorp.gifshow.notice.data.model.content.ReminderDegradeContent;
import w30.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import yl8.b;
import java.lang.StringBuilder;
import java.util.Arrays;

public class Notice extends DefaultObservableAndSyncable	// class@002185
{
    public boolean mAggregate;
    public NoticeBadgeIcon mBadgeIcon;
    public CharSequence mCachedRightText;
    public int mCanFollowStatus;
    public ReminderCardContent mCardContent;
    public final f mClientLog;
    public JsonElement mClientLogInfo;
    public QComment mComment;
    public int mContactType;
    public ReminderContentInfo mContentInfo;
    public Spannable mContentSpannable;
    public String mContentUrl;
    public int mCount;
    public long mCreated;
    public CDNUrl[] mCustomHeadImage;
    public CharSequence mDateText;
    public String mDecodeMobileHashContactName;
    public ReminderDegradeContent mDegradeContentInfo;
    public HashMap mExtParams;
    public String mExtensionText;
    public int mExtraType;
    public int mFollowRequestStatus;
    public User[] mFromUsers;
    public boolean mHasItemSayHiBtnShow;
    public String mHeadScheme;
    public String mId;
    public boolean mIsNeedCommentEllipsize;
    public boolean mIsPhotoDelete;
    public boolean mIsReviewReplied;
    public ReminderLongPressActionModel[] mLongPressActionList;
    public CDNUrl[] mPendantUrls;
    public int mPosition;
    public NoticeProfileList mProfileList;
    public int mRelationChainType;
    public String mRelationName;
    public String mRightText;
    public String mRootCommentId;
    public int mRowNumber;
    public String mSectionTitle;
    public boolean mShowed;
    public String mSourceId;
    public User mSourceUser;
    public String mText;
    public String mThumbnailScheme;
    public CDNUrl[] mThumbnails;
    public SpannableStringBuilder mTitleDateSpannable;
    public CharSequence mTitleText;
    public int mType;
    public boolean mUnread;
    public static final long serialVersionUID = 0xe7cecb9308e4ce14;

    public void Notice(){
       super();
       this.mId = "";
       this.mCreated = 0;
       this.mSourceId = "";
       this.mRelationChainType = 100;
       this.mRightText = "";
       this.mText = "";
       this.mContentUrl = "";
       this.mHeadScheme = "";
       this.mThumbnailScheme = "";
       this.mExtensionText = "";
       this.mCanFollowStatus = 0;
       this.mFollowRequestStatus = 0;
       this.mRootCommentId = "";
       this.mContentInfo = new ReminderContentInfo();
       this.mDegradeContentInfo = new ReminderDegradeContent();
       this.mSectionTitle = "";
       this.mDecodeMobileHashContactName = "";
       this.mTitleText = "";
       this.mCachedRightText = "";
       this.mDateText = "";
       this.mContactType = 0;
       this.mPosition = -1;
       this.mExtraType = 0;
       this.mClientLog = new f();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Notice.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (!k.a(this.mId, p0.mId) || (this.mType != p0.mType || (this.mUnread != p0.mUnread || (this.mAggregate != p0.mAggregate || this.mCount != p0.mCount)))) {
          b = false;
       }
       return b;
    }
    public String getHeadScheme(){
       return this.mHeadScheme;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, Notice.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mId,Integer.valueOf(this.mType),Boolean.valueOf(this.mUnread)};
       return k.b(obj);
    }
    public void sync(Notice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Notice.class, "1")) {
          return;
       }
       int i = 1;
       int i1 = TextUtils.n(this.mId, p0.mId) ^ i;
       if (this.mType != p0.mType) {
          i1 = 1;
       }
       if (this.mCount != p0.mCount) {
          i1 = 1;
       }
       if (this.mAggregate != p0.mAggregate) {
          i = i1;
       }
       if (i) {
          this.notifyChanged();
       }
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Notice.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Notice{mId=\'"+this.mId+'''+", mType="+this.mType+", mCreated="+this.mCreated+", mSourceId=\'"+this.mSourceId+'''+", mUnread="+this.mUnread+", mRelationChainType="+this.mRelationChainType+", mRightText=\'"+this.mRightText+'''+", mText=\'"+this.mText+'''+", mAggregate="+this.mAggregate+", mContentUrl=\'"+this.mContentUrl+'''+", mCount="+this.mCount+", mHeadScheme=\'"+this.mHeadScheme+'''+", mThumbnailScheme=\'"+this.mThumbnailScheme+'''+", mExtensionText=\'"+this.mExtensionText+'''+", mCanFollowStatus="+this.mCanFollowStatus+", mFollowRequestStatus="+this.mFollowRequestStatus+", mRowNumber="+this.mRowNumber+", mRootCommentId=\'"+this.mRootCommentId+'''+", mComment="+this.mComment+", mExtParams="+this.mExtParams+", mSourceUser="+this.mSourceUser+", mThumbnails="+Arrays.toString(this.mThumbnails)+", mFromUsers="+Arrays.toString(this.mFromUsers)+", mCustomHeadImage="+Arrays.toString(this.mCustomHeadImage)+", mPendantUrls="+Arrays.toString(this.mPendantUrls)+", mLongPressActionList="+Arrays.toString(this.mLongPressActionList)+", mProfileList="+this.mProfileList+", mContentInfo="+this.mContentInfo+", mClientLogInfo="+this.mClientLogInfo+", mSectionTitle=\'"+this.mSectionTitle+'''+", mShowed="+this.mShowed+", mDecodeMobileHashContactName=\'"+this.mDecodeMobileHashContactName+'''+", mTitleText="+this.mTitleText+", mCachedRightText="+this.mCachedRightText+", mDateText="+this.mDateText+", mIsNeedCommentEllipsize="+this.mIsNeedCommentEllipsize+", mContactType="+this.mContactType+", mPosition="+this.mPosition+", mExtraType="+this.mExtraType+", mRelationName=\'"+this.mRelationName+'''+", mContentSpannable="+this.mContentSpannable+", mTitleDateSpannable="+this.mTitleDateSpannable+", mClientLog="+this.mClientLog+'}';
    }
}
