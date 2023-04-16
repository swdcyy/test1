package com.yxcorp.gifshow.model.config.FeedNegativeFeedback$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$$Parcelable$a;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason$$Parcelable;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$PhotoInterestAdjust;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$PhotoInterestAdjust$$Parcelable;
import java.util.Iterator;

public class FeedNegativeFeedback$$Parcelable implements Parcelable, d	// class@001ebf
{
    public FeedNegativeFeedback feedNegativeFeedback$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FeedNegativeFeedback$$Parcelable.CREATOR = new FeedNegativeFeedback$$Parcelable$a();
    }
    public void FeedNegativeFeedback$$Parcelable(FeedNegativeFeedback p0){
       super();
       this.feedNegativeFeedback$$0 = p0;
    }
    public static FeedNegativeFeedback read(Parcel p0,a p1){
       ArrayList uArrayList1;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          FeedNegativeFeedback uFeedNegativ = new FeedNegativeFeedback();
          p1.f(p1.g(), uFeedNegativ);
          int i1 = p0.readInt();
          ArrayList uArrayList = null;
          int i2 = 0;
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mChannelReasons = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mPhotoNegativeHeader = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mSuggestReasons = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mActivityReasons = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mContentAggregateWeakTemplate = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mFollowPhotoNegative = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mFunctionalTemplate = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mReasonsForRecommend = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.followLiveReasons = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mLiveReasons = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mPhotoContentNegative = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mAdReasons = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$PhotoInterestAdjust$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mPhotoInterestAdjust = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mLiveNegative = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.unfollowPhotoReasons = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mCoverAggregateTemplate = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.followPhotoReasons = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mLiveSquareReasons = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mPhotoNegative = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mChannelTemplatePhoto = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mPhotoReasons = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.unfollowLiveReasons = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mAggregateStrongTemplate = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mFollowLiveNegative = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mSearchHomeInterestReasons = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mRsReasons = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mPhotoContentNegativeHeader = uArrayList1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList1 = uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList1.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mSpecialPhotoNegative = uArrayList1;
          i1 = p0.readInt();
          if (i1 >= 0) {
             uArrayList = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          uFeedNegativ.mCoronaConfig = uArrayList;
          p1.f(i, uFeedNegativ);
          return uFeedNegativ;
       }
    }
    public static void write(FeedNegativeFeedback p0,Parcel p1,int p2,a p3){
       Iterator iterator1;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          FeedNegativeFeedback mChannelReas = p0.mChannelReasons;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mChannelReasons.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mPhotoNegativeHeader;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mPhotoNegativeHeader.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mSuggestReasons;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mSuggestReasons.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mActivityReasons;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mActivityReasons.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mContentAggregateWeakTemplate;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mContentAggregateWeakTemplate.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mFollowPhotoNegative;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mFollowPhotoNegative.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mFunctionalTemplate;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mFunctionalTemplate.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mReasonsForRecommend;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mReasonsForRecommend.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.followLiveReasons;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.followLiveReasons.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mLiveReasons;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mLiveReasons.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mPhotoContentNegative;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mPhotoContentNegative.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mAdReasons;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mAdReasons.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mPhotoInterestAdjust;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mPhotoInterestAdjust.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$PhotoInterestAdjust$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mLiveNegative;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mLiveNegative.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.unfollowPhotoReasons;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.unfollowPhotoReasons.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mCoverAggregateTemplate;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mCoverAggregateTemplate.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.followPhotoReasons;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.followPhotoReasons.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mLiveSquareReasons;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mLiveSquareReasons.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mPhotoNegative;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mPhotoNegative.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mChannelTemplatePhoto;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mChannelTemplatePhoto.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mPhotoReasons;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mPhotoReasons.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.unfollowLiveReasons;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.unfollowLiveReasons.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mAggregateStrongTemplate;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mAggregateStrongTemplate.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mFollowLiveNegative;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mFollowLiveNegative.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mSearchHomeInterestReasons;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mSearchHomeInterestReasons.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mRsReasons;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mRsReasons.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mPhotoContentNegativeHeader;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mPhotoContentNegativeHeader.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mSpecialPhotoNegative;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             iterator1 = p0.mSpecialPhotoNegative.iterator();
             while (iterator1.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          mChannelReas = p0.mCoronaConfig;
          if (mChannelReas == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChannelReas.size());
             Iterator iterator = p0.mCoronaConfig.iterator();
             while (iterator.hasNext()) {
                FeedNegativeFeedback$NegativeReason$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FeedNegativeFeedback getParcel(){
       return this.feedNegativeFeedback$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FeedNegativeFeedback$$Parcelable.write(this.feedNegativeFeedback$$0, p0, p1, new a());
    }
}
