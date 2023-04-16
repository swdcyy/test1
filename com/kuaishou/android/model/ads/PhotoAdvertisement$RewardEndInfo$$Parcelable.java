package com.kuaishou.android.model.ads.PhotoAdvertisement$RewardEndInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RewardEndInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RewardEndInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$RewardEndInfo$$Parcelable implements Parcelable, d	// class@0009fc
{
    public PhotoAdvertisement$RewardEndInfo rewardEndInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$RewardEndInfo$$Parcelable.CREATOR = new PhotoAdvertisement$RewardEndInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$RewardEndInfo$$Parcelable(PhotoAdvertisement$RewardEndInfo p0){
       super();
       this.rewardEndInfo$$0 = p0;
    }
    public static PhotoAdvertisement$RewardEndInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$RewardEndInfo rewardEndInf = new PhotoAdvertisement$RewardEndInfo();
          p1.f(p1.g(), rewardEndInf);
          rewardEndInf.mTaskSubTitle = p0.readString();
          rewardEndInf.mActionTitle = p0.readString();
          rewardEndInf.mHightLightTitle = p0.readString();
          rewardEndInf.mTaskTitle = p0.readString();
          rewardEndInf.mTitle = p0.readString();
          rewardEndInf.mExtParams = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          rewardEndInf.mEnableShowAgainView = b;
          rewardEndInf.mType = p0.readInt();
          rewardEndInf.mSubTitle = p0.readString();
          rewardEndInf.mIconUrl = p0.readString();
          p1.f(i, rewardEndInf);
          return rewardEndInf;
       }
    }
    public static void write(PhotoAdvertisement$RewardEndInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTaskSubTitle);
          p1.writeString(p0.mActionTitle);
          p1.writeString(p0.mHightLightTitle);
          p1.writeString(p0.mTaskTitle);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mExtParams);
          p1.writeInt(p0.mEnableShowAgainView);
          p1.writeInt(p0.mType);
          p1.writeString(p0.mSubTitle);
          p1.writeString(p0.mIconUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$RewardEndInfo getParcel(){
       return this.rewardEndInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$RewardEndInfo$$Parcelable.write(this.rewardEndInfo$$0, p0, p1, new a());
    }
}
