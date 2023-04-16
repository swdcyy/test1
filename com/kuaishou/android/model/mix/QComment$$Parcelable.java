package com.kuaishou.android.model.mix.QComment$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.QComment$$Parcelable$a;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.HashMap;
import xwd.b;
import com.kuaishou.android.model.mix.CashTag;
import com.kuaishou.android.model.mix.CashTag$$Parcelable;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.Serializable;
import com.kuaishou.android.model.mix.QComment$CommentMarqueeTag;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.kwai.emotionsdk.bean.EmotionInfo$$Parcelable;
import com.kuaishou.android.model.mix.AttachmentInfo;
import com.kuaishou.android.model.mix.QComment$CommentBottomTag;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import com.kuaishou.android.model.mix.QComment$Label;
import com.kuaishou.android.model.mix.CommentAuthorPendantInfo;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import java.lang.Class;
import org.parceler.a;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;
import org.parceler.a$c;

public class QComment$$Parcelable implements Parcelable, d	// class@000dc3
{
    public QComment qComment$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       QComment$$Parcelable.CREATOR = new QComment$$Parcelable$a();
    }
    public void QComment$$Parcelable(QComment p0){
       super();
       this.qComment$$0 = p0;
    }
    public static QComment read(Parcel p0,a p1){
       Map map;
       HashSet hashSet;
       List list1;
       ArrayList uArrayList;
       int i2;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          QComment qComment = new QComment();
          p1.f(p1.g(), qComment);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          qComment.mIsFollowingComment = b1;
          qComment.mStatus = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mIsAuthorPraised = b1;
          qComment.mComment = p0.readString();
          qComment.mLikedCount = p0.readLong();
          qComment.mReplyToUserName = p0.readString();
          b1 = p0.readInt();
          List list = null;
          if (b1 < 0) {
             map = list;
          }else {
             map = new HashMap(b.a(b1));
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                map.put(p0.readString(), CashTag$$Parcelable.read(p0, p1));
             }
          }
          qComment.mCashTags = map;
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mIsGodComment = b1;
          b1 = p0.readInt();
          if (b1 < 0) {
             hashSet = list;
          }else {
             hashSet = new HashSet(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                hashSet.add(p0.readString());
             }
          }
          qComment.mAtFromAtPanelUidSet = hashSet;
          qComment.mReplyToUserId = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mIsQuickComment = b1;
          qComment.mRootCommentId = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mLiked = b1;
          qComment.mConversation = p0.readString();
          qComment.mRecallType = p0.readInt();
          qComment.mSubCommentVisibleLimit = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mAuthorPraiseLogged = b1;
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mIsDislikeHideComment = b1;
          qComment.mAuthorArea = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mSubCommentVisible = b1;
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mDisliked = b1;
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mIsQuickEmojiComment = b1;
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mIsKeepEditorState = b1;
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          qComment.mCommentMarqueeTags = list1;
          qComment.mEmotionInfo = EmotionInfo$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mDisplaySubCommentCount = b1;
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mHasPosition = b1;
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mGodCommentNegatived = b1;
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mIsQuickAtComment = b1;
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mIsNearbyAuthor = b1;
          qComment.mSubCommentCount = p0.readInt();
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          qComment.attachmentList = list1;
          qComment.mCreated = p0.readLong();
          qComment.mPhotoId = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mIsPraiseCommentEdited = b1;
          qComment.mPhotoUserId = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mIsHighQualityComment = b1;
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mRefreshFirstShowComment = b1;
          qComment.mId = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mIsFriendComment = b1;
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          qComment.mCommentBottomTags = list1;
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mIsHot = b1;
          qComment.mQMedia = p0.readSerializable();
          qComment.mServerSubCommentCount = p0.readInt();
          qComment.mUpdateLikeType = p0.readInt();
          qComment.mPraiseCommentId = p0.readLong();
          qComment.mType = p0.readInt();
          qComment.mUser = User$$Parcelable.read(p0, p1);
          b1 = p0.readInt();
          if (b1 >= 0) {
             list = new ArrayList(b1);
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                list.add(p0.readSerializable());
             }
          }
          qComment.mLabels = list;
          b1 = (p0.readInt() == 1)? true: false;
          qComment.mIsVoiceInput = b1;
          qComment.mRecommendDesc = p0.readString();
          qComment.mCommentAuthorPendantInfo = p0.readSerializable();
          qComment.mBottomSpaceHeight = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          qComment.mIsVoiceTextEdit = b;
          qComment.mReplyToCommentId = p0.readString();
          a.d(DefaultObservableAndSyncable.class, qComment, "mDefaultObservable", p0.readSerializable());
          p1.f(i, qComment);
          return qComment;
       }
    }
    public static void write(QComment p0,Parcel p1,int p2,a p3){
       Iterator iterator1;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIsFollowingComment);
          p1.writeInt(p0.mStatus);
          p1.writeInt(p0.mIsAuthorPraised);
          p1.writeString(p0.mComment);
          p1.writeLong(p0.mLikedCount);
          p1.writeString(p0.mReplyToUserName);
          QComment mCashTags = p0.mCashTags;
          if (mCashTags == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mCashTags.size());
             iterator1 = p0.mCashTags.entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry = iterator1.next();
                p1.writeString(uEntry.getKey());
                CashTag$$Parcelable.write(uEntry.getValue(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mIsGodComment);
          mCashTags = p0.mAtFromAtPanelUidSet;
          if (mCashTags == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mCashTags.size());
             iterator1 = p0.mAtFromAtPanelUidSet.iterator();
             while (iterator1.hasNext()) {
                p1.writeString(iterator1.next());
             }
          }
          p1.writeString(p0.mReplyToUserId);
          p1.writeInt(p0.mIsQuickComment);
          p1.writeString(p0.mRootCommentId);
          p1.writeInt(p0.mLiked);
          p1.writeString(p0.mConversation);
          p1.writeInt(p0.mRecallType);
          p1.writeInt(p0.mSubCommentVisibleLimit);
          p1.writeInt(p0.mAuthorPraiseLogged);
          p1.writeInt(p0.mIsDislikeHideComment);
          p1.writeString(p0.mAuthorArea);
          p1.writeInt(p0.mSubCommentVisible);
          p1.writeInt(p0.mDisliked);
          p1.writeInt(p0.mIsQuickEmojiComment);
          p1.writeInt(p0.mIsKeepEditorState);
          mCashTags = p0.mCommentMarqueeTags;
          if (mCashTags == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mCashTags.size());
             iterator1 = p0.mCommentMarqueeTags.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          EmotionInfo$$Parcelable.write(p0.mEmotionInfo, p1, p2, p3);
          p1.writeInt(p0.mDisplaySubCommentCount);
          p1.writeInt(p0.mHasPosition);
          p1.writeInt(p0.mGodCommentNegatived);
          p1.writeInt(p0.mIsQuickAtComment);
          p1.writeInt(p0.mIsNearbyAuthor);
          p1.writeInt(p0.mSubCommentCount);
          mCashTags = p0.attachmentList;
          if (mCashTags == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mCashTags.size());
             iterator1 = p0.attachmentList.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          p1.writeLong(p0.mCreated);
          p1.writeString(p0.mPhotoId);
          p1.writeInt(p0.mIsPraiseCommentEdited);
          p1.writeString(p0.mPhotoUserId);
          p1.writeInt(p0.mIsHighQualityComment);
          p1.writeInt(p0.mRefreshFirstShowComment);
          p1.writeString(p0.mId);
          p1.writeInt(p0.mIsFriendComment);
          mCashTags = p0.mCommentBottomTags;
          if (mCashTags == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mCashTags.size());
             iterator1 = p0.mCommentBottomTags.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          p1.writeInt(p0.mIsHot);
          p1.writeSerializable(p0.mQMedia);
          p1.writeInt(p0.mServerSubCommentCount);
          p1.writeInt(p0.mUpdateLikeType);
          p1.writeLong(p0.mPraiseCommentId);
          p1.writeInt(p0.mType);
          User$$Parcelable.write(p0.mUser, p1, p2, p3);
          QComment mLabels = p0.mLabels;
          if (mLabels == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mLabels.size());
             Iterator iterator = p0.mLabels.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeInt(p0.mIsVoiceInput);
          p1.writeString(p0.mRecommendDesc);
          p1.writeSerializable(p0.mCommentAuthorPendantInfo);
          p1.writeInt(p0.mBottomSpaceHeight);
          p1.writeInt(p0.mIsVoiceTextEdit);
          p1.writeString(p0.mReplyToCommentId);
          p1.writeSerializable(a.c(new a$c(), DefaultObservableAndSyncable.class, p0, "mDefaultObservable"));
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public QComment getParcel(){
       return this.qComment$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       QComment$$Parcelable.write(this.qComment$$0, p0, p1, new a());
    }
}
