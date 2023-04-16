package com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$CustomLevelInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$CustomLevelInfo$$Parcelable$a;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$CustomLevelInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class RewardPanelInfoResponse$CustomLevelInfo$$Parcelable implements Parcelable, d	// class@001246
{
    public RewardPanelInfoResponse$CustomLevelInfo customLevelInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RewardPanelInfoResponse$CustomLevelInfo$$Parcelable.CREATOR = new RewardPanelInfoResponse$CustomLevelInfo$$Parcelable$a();
    }
    public void RewardPanelInfoResponse$CustomLevelInfo$$Parcelable(RewardPanelInfoResponse$CustomLevelInfo p0){
       super();
       this.customLevelInfo$$0 = p0;
    }
    public static RewardPanelInfoResponse$CustomLevelInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          RewardPanelInfoResponse$CustomLevelInfo uCustomLevel = new RewardPanelInfoResponse$CustomLevelInfo();
          p1.f(p1.g(), uCustomLevel);
          uCustomLevel.mCornerText = p0.readString();
          uCustomLevel.mKsCoinPerYuan = p0.readInt();
          uCustomLevel.mPicUrl = p0.readString();
          uCustomLevel.mInputPromt = p0.readString();
          uCustomLevel.mMaxGiftHint = p0.readString();
          uCustomLevel.mMinGiftHint = p0.readString();
          uCustomLevel.mDisplayName = p0.readString();
          uCustomLevel.mExchangeRate = p0.readInt();
          uCustomLevel.mDiscountRate = p0.readInt();
          uCustomLevel.mRateTips = p0.readString();
          uCustomLevel.mIconUrl = p0.readString();
          p1.f(i, uCustomLevel);
          return uCustomLevel;
       }
    }
    public static void write(RewardPanelInfoResponse$CustomLevelInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mCornerText);
          p1.writeInt(p0.mKsCoinPerYuan);
          p1.writeString(p0.mPicUrl);
          p1.writeString(p0.mInputPromt);
          p1.writeString(p0.mMaxGiftHint);
          p1.writeString(p0.mMinGiftHint);
          p1.writeString(p0.mDisplayName);
          p1.writeInt(p0.mExchangeRate);
          p1.writeInt(p0.mDiscountRate);
          p1.writeString(p0.mRateTips);
          p1.writeString(p0.mIconUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RewardPanelInfoResponse$CustomLevelInfo getParcel(){
       return this.customLevelInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RewardPanelInfoResponse$CustomLevelInfo$$Parcelable.write(this.customLevelInfo$$0, p0, p1, new a());
    }
}
