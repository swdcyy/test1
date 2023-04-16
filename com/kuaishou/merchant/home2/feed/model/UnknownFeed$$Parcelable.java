package com.kuaishou.merchant.home2.feed.model.UnknownFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.merchant.home2.feed.model.UnknownFeed$$Parcelable$a;
import com.kuaishou.merchant.home2.feed.model.UnknownFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.io.Serializable;
import com.kuaishou.merchant.home2.feed.model.CardStyle;

public class UnknownFeed$$Parcelable implements Parcelable, d	// class@0017bf
{
    public UnknownFeed unknownFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UnknownFeed$$Parcelable.CREATOR = new UnknownFeed$$Parcelable$a();
    }
    public void UnknownFeed$$Parcelable(UnknownFeed p0){
       super();
       this.unknownFeed$$0 = p0;
    }
    public static UnknownFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          UnknownFeed unknownFeed = new UnknownFeed();
          p1.f(p1.g(), unknownFeed);
          unknownFeed.mScreenId = p0.readString();
          unknownFeed.mBizType = p0.readInt();
          unknownFeed.mCardStyle = p0.readSerializable();
          unknownFeed.mListLoadSequenceID = p0.readString();
          unknownFeed.mOnlineNum = p0.readString();
          unknownFeed.mServerExpTag = p0.readString();
          unknownFeed.mType = p0.readInt();
          unknownFeed.mRatio = p0.readDouble();
          unknownFeed.mSourceTypeLog = p0.readString();
          unknownFeed.mSourceId = p0.readString();
          unknownFeed.mPlanId = p0.readString();
          unknownFeed.mReleaseId = p0.readString();
          unknownFeed.mExpTag = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          unknownFeed.mShowLogSent = b;
          p1.f(i, unknownFeed);
          return unknownFeed;
       }
    }
    public static void write(UnknownFeed p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mScreenId);
          p1.writeInt(p0.mBizType);
          p1.writeSerializable(p0.mCardStyle);
          p1.writeString(p0.mListLoadSequenceID);
          p1.writeString(p0.mOnlineNum);
          p1.writeString(p0.mServerExpTag);
          p1.writeInt(p0.mType);
          p1.writeDouble(p0.mRatio);
          p1.writeString(p0.mSourceTypeLog);
          p1.writeString(p0.mSourceId);
          p1.writeString(p0.mPlanId);
          p1.writeString(p0.mReleaseId);
          p1.writeString(p0.mExpTag);
          p1.writeInt(p0.mShowLogSent);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UnknownFeed getParcel(){
       return this.unknownFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UnknownFeed$$Parcelable.write(this.unknownFeed$$0, p0, p1, new a());
    }
}
