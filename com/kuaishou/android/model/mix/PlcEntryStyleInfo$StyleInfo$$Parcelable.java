package com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo$$Parcelable;

public class PlcEntryStyleInfo$StyleInfo$$Parcelable implements Parcelable, d	// class@000d99
{
    public PlcEntryStyleInfo$StyleInfo styleInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlcEntryStyleInfo$StyleInfo$$Parcelable.CREATOR = new PlcEntryStyleInfo$StyleInfo$$Parcelable$a();
    }
    public void PlcEntryStyleInfo$StyleInfo$$Parcelable(PlcEntryStyleInfo$StyleInfo p0){
       super();
       this.styleInfo$$0 = p0;
    }
    public static PlcEntryStyleInfo$StyleInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PlcEntryStyleInfo$StyleInfo styleInfo = new PlcEntryStyleInfo$StyleInfo();
          p1.f(p1.g(), styleInfo);
          styleInfo.mShowWeakVideoCountdownMillis = p0.readLong();
          styleInfo.mAppIconUrl = p0.readString();
          styleInfo.mShowWeakVideoPercent = p0.readDouble();
          styleInfo.mDoWeakTransitionMillis = p0.readLong();
          styleInfo.mMerchantCustomerStyle = p0.readString();
          styleInfo.mAppLink = p0.readString();
          styleInfo.mStrongVideoHidePercent = p0.readDouble();
          styleInfo.mShowWeakMillis = p0.readLong();
          styleInfo.mShowWeakVideoMillis = p0.readLong();
          styleInfo.mStrongStyleTemplateInfo = PlcEntryStyleInfo$StrongStyleInfo$$Parcelable.read(p0, p1);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          styleInfo.mShowAdLabelInFeed = b1;
          styleInfo.mDisplayType = p0.readInt();
          styleInfo.mStrongVideoHideMillis = p0.readLong();
          b1 = (p0.readInt() == 1)? true: false;
          styleInfo.mShowAdLabelInDetail = b1;
          styleInfo.mCoverStyleTemplateInfo = PlcEntryStyleInfo$CoverStyleInfo$$Parcelable.read(p0, p1);
          styleInfo.mSubscriptDescription = p0.readString();
          styleInfo.mAppName = p0.readString();
          styleInfo.mStrongToDisappearVideoPercent = p0.readDouble();
          styleInfo.mStrongToDisappearMillis = p0.readLong();
          styleInfo.mWeakToStrongVideoMillis = p0.readLong();
          styleInfo.mWeakStyleTemplateInfo = PlcEntryStyleInfo$WeakStyleInfo$$Parcelable.read(p0, p1);
          styleInfo.weakToStrongVideoCountdownMillis = p0.readLong();
          styleInfo.mStrongToDisappearVideoCountdownMillis = p0.readLong();
          styleInfo.mCommentStyleInfo = PlcEntryStyleInfo$CommentStyleInfo$$Parcelable.read(p0, p1);
          styleInfo.mMarketUri = p0.readString();
          styleInfo.mWeakToStrongVideoPercent = p0.readDouble();
          if (p0.readInt() == 1) {
             b = true;
          }
          styleInfo.mHidePlcAfterStrongDisappear = b;
          styleInfo.mPackageName = p0.readString();
          styleInfo.mLongVideoStyleTemplateInfo = PlcEntryStyleInfo$LongVideoStyleInfo$$Parcelable.read(p0, p1);
          styleInfo.mExpireTimestamp = p0.readLong();
          styleInfo.mStrongToDisappearVideoMillis = p0.readLong();
          p1.f(i, styleInfo);
          return styleInfo;
       }
    }
    public static void write(PlcEntryStyleInfo$StyleInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mShowWeakVideoCountdownMillis);
          p1.writeString(p0.mAppIconUrl);
          p1.writeDouble(p0.mShowWeakVideoPercent);
          p1.writeLong(p0.mDoWeakTransitionMillis);
          p1.writeString(p0.mMerchantCustomerStyle);
          p1.writeString(p0.mAppLink);
          p1.writeDouble(p0.mStrongVideoHidePercent);
          p1.writeLong(p0.mShowWeakMillis);
          p1.writeLong(p0.mShowWeakVideoMillis);
          PlcEntryStyleInfo$StrongStyleInfo$$Parcelable.write(p0.mStrongStyleTemplateInfo, p1, p2, p3);
          p1.writeInt(p0.mShowAdLabelInFeed);
          p1.writeInt(p0.mDisplayType);
          p1.writeLong(p0.mStrongVideoHideMillis);
          p1.writeInt(p0.mShowAdLabelInDetail);
          PlcEntryStyleInfo$CoverStyleInfo$$Parcelable.write(p0.mCoverStyleTemplateInfo, p1, p2, p3);
          p1.writeString(p0.mSubscriptDescription);
          p1.writeString(p0.mAppName);
          p1.writeDouble(p0.mStrongToDisappearVideoPercent);
          p1.writeLong(p0.mStrongToDisappearMillis);
          p1.writeLong(p0.mWeakToStrongVideoMillis);
          PlcEntryStyleInfo$WeakStyleInfo$$Parcelable.write(p0.mWeakStyleTemplateInfo, p1, p2, p3);
          p1.writeLong(p0.weakToStrongVideoCountdownMillis);
          p1.writeLong(p0.mStrongToDisappearVideoCountdownMillis);
          PlcEntryStyleInfo$CommentStyleInfo$$Parcelable.write(p0.mCommentStyleInfo, p1, p2, p3);
          p1.writeString(p0.mMarketUri);
          p1.writeDouble(p0.mWeakToStrongVideoPercent);
          p1.writeInt(p0.mHidePlcAfterStrongDisappear);
          p1.writeString(p0.mPackageName);
          PlcEntryStyleInfo$LongVideoStyleInfo$$Parcelable.write(p0.mLongVideoStyleTemplateInfo, p1, p2, p3);
          p1.writeLong(p0.mExpireTimestamp);
          p1.writeLong(p0.mStrongToDisappearVideoMillis);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlcEntryStyleInfo$StyleInfo getParcel(){
       return this.styleInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlcEntryStyleInfo$StyleInfo$$Parcelable.write(this.styleInfo$$0, p0, p1, new a());
    }
}
