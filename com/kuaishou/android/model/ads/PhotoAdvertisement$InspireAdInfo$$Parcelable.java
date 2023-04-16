package com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InterceptInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InterceptInfo$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RewardEndInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RewardEndInfo$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction$$Parcelable;

public class PhotoAdvertisement$InspireAdInfo$$Parcelable implements Parcelable, d	// class@000963
{
    public PhotoAdvertisement$InspireAdInfo inspireAdInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$InspireAdInfo$$Parcelable.CREATOR = new PhotoAdvertisement$InspireAdInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$InspireAdInfo$$Parcelable(PhotoAdvertisement$InspireAdInfo p0){
       super();
       this.inspireAdInfo$$0 = p0;
    }
    public static PhotoAdvertisement$InspireAdInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$InspireAdInfo inspireAdInf = new PhotoAdvertisement$InspireAdInfo();
          p1.f(p1.g(), inspireAdInf);
          inspireAdInf.mInterceptInfo = PhotoAdvertisement$InterceptInfo$$Parcelable.read(p0, p1);
          inspireAdInf.mNeoReportInfo = PhotoAdvertisement$NeoReportInfo$$Parcelable.read(p0, p1);
          inspireAdInf.mNeoParams = p0.readString();
          inspireAdInf.mLiveStartTime = p0.readString();
          inspireAdInf.mInspireAdBillTime = p0.readLong();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          inspireAdInf.mDisableAvatarFollow = b1;
          inspireAdInf.mProcessActionType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          inspireAdInf.mSupportLiveReservation = b1;
          inspireAdInf.mSourceType = p0.readInt();
          inspireAdInf.mCacheExpireMin = p0.readLong();
          b1 = (p0.readInt() == 1)? true: false;
          inspireAdInf.mVideoLoop = b1;
          inspireAdInf.mRewardEndInfo = PhotoAdvertisement$RewardEndInfo$$Parcelable.read(p0, p1);
          if (p0.readInt() == 1) {
             b = true;
          }
          inspireAdInf.mEnableClickOtherArea = b;
          inspireAdInf.mInspireAction = PhotoAdvertisement$InspireAction$$Parcelable.read(p0, p1);
          inspireAdInf.mSocialControl = p0.readInt();
          inspireAdInf.mAdNeoTkControl = p0.readInt();
          inspireAdInf.mPendantScene = p0.readInt();
          p1.f(i, inspireAdInf);
          return inspireAdInf;
       }
    }
    public static void write(PhotoAdvertisement$InspireAdInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$InterceptInfo$$Parcelable.write(p0.mInterceptInfo, p1, p2, p3);
          PhotoAdvertisement$NeoReportInfo$$Parcelable.write(p0.mNeoReportInfo, p1, p2, p3);
          p1.writeString(p0.mNeoParams);
          p1.writeString(p0.mLiveStartTime);
          p1.writeLong(p0.mInspireAdBillTime);
          p1.writeInt(p0.mDisableAvatarFollow);
          p1.writeInt(p0.mProcessActionType);
          p1.writeInt(p0.mSupportLiveReservation);
          p1.writeInt(p0.mSourceType);
          p1.writeLong(p0.mCacheExpireMin);
          p1.writeInt(p0.mVideoLoop);
          PhotoAdvertisement$RewardEndInfo$$Parcelable.write(p0.mRewardEndInfo, p1, p2, p3);
          p1.writeInt(p0.mEnableClickOtherArea);
          PhotoAdvertisement$InspireAction$$Parcelable.write(p0.mInspireAction, p1, p2, p3);
          p1.writeInt(p0.mSocialControl);
          p1.writeInt(p0.mAdNeoTkControl);
          p1.writeInt(p0.mPendantScene);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$InspireAdInfo getParcel(){
       return this.inspireAdInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$InspireAdInfo$$Parcelable.write(this.inspireAdInfo$$0, p0, p1, new a());
    }
}
