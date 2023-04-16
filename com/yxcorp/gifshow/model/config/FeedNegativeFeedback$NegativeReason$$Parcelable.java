package com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason$$Parcelable$a;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.QRecoTag;
import com.kuaishou.android.model.mix.QRecoTag$$Parcelable;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$RoastFeedBack;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$RoastFeedBack$$Parcelable;
import java.util.Iterator;

public class FeedNegativeFeedback$NegativeReason$$Parcelable implements Parcelable, d	// class@001ec1
{
    public FeedNegativeFeedback$NegativeReason negativeReason$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FeedNegativeFeedback$NegativeReason$$Parcelable.CREATOR = new FeedNegativeFeedback$NegativeReason$$Parcelable$a();
    }
    public void FeedNegativeFeedback$NegativeReason$$Parcelable(FeedNegativeFeedback$NegativeReason p0){
       super();
       this.negativeReason$$0 = p0;
    }
    public static FeedNegativeFeedback$NegativeReason read(Parcel p0,a p1){
       ArrayList uArrayList;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          FeedNegativeFeedback$NegativeReason negativeReas = new FeedNegativeFeedback$NegativeReason();
          p1.f(p1.g(), negativeReas);
          int i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList = null;
          }else {
             ArrayList uArrayList1 = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList1.add(QRecoTag$$Parcelable.read(p0, p1));
             }
             uArrayList = uArrayList1;
          }
          negativeReas.mDetailReason = uArrayList;
          negativeReas.mDarkIconImageUrl = p0.readString();
          negativeReas.mTagId = p0.readString();
          negativeReas.mId = p0.readString();
          negativeReas.mToast = p0.readString();
          negativeReas.mTitle = p0.readString();
          negativeReas.mIconImageUrl = p0.readString();
          negativeReas.mCategory = p0.readInt();
          negativeReas.mJumpUrl = p0.readString();
          negativeReas.mContentType = p0.readString();
          negativeReas.mSubTitle = p0.readString();
          negativeReas.mRoast = FeedNegativeFeedback$RoastFeedBack$$Parcelable.read(p0, p1);
          p1.f(i, negativeReas);
          return negativeReas;
       }
    }
    public static void write(FeedNegativeFeedback$NegativeReason p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          FeedNegativeFeedback$NegativeReason mDetailReaso = p0.mDetailReason;
          if (mDetailReaso == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mDetailReaso.size());
             Iterator iterator = p0.mDetailReason.iterator();
             while (iterator.hasNext()) {
                QRecoTag$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mDarkIconImageUrl);
          p1.writeString(p0.mTagId);
          p1.writeString(p0.mId);
          p1.writeString(p0.mToast);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mIconImageUrl);
          p1.writeInt(p0.mCategory);
          p1.writeString(p0.mJumpUrl);
          p1.writeString(p0.mContentType);
          p1.writeString(p0.mSubTitle);
          FeedNegativeFeedback$RoastFeedBack$$Parcelable.write(p0.mRoast, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FeedNegativeFeedback$NegativeReason getParcel(){
       return this.negativeReason$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FeedNegativeFeedback$NegativeReason$$Parcelable.write(this.negativeReason$$0, p0, p1, new a());
    }
}
