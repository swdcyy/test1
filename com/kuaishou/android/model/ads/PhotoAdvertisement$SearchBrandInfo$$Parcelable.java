package com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLinkConfig;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLinkConfig$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig$$Parcelable;

public class PhotoAdvertisement$SearchBrandInfo$$Parcelable implements Parcelable, d	// class@000a08
{
    public PhotoAdvertisement$SearchBrandInfo searchBrandInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$SearchBrandInfo$$Parcelable.CREATOR = new PhotoAdvertisement$SearchBrandInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$SearchBrandInfo$$Parcelable(PhotoAdvertisement$SearchBrandInfo p0){
       super();
       this.searchBrandInfo$$0 = p0;
    }
    public static PhotoAdvertisement$SearchBrandInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$SearchBrandInfo searchBrandI = new PhotoAdvertisement$SearchBrandInfo();
          p1.f(p1.g(), searchBrandI);
          searchBrandI.mSloganFinalColor = p0.readString();
          searchBrandI.mAdTitle = p0.readString();
          searchBrandI.mUserModuleTitle = p0.readString();
          searchBrandI.mPicJumpUrl = p0.readString();
          searchBrandI.mLiveStartTime = p0.readString();
          searchBrandI.mChildLinkConfig = PhotoAdvertisement$ChildLinkConfig$$Parcelable.read(p0, p1);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          searchBrandI.mAlreadyBooked = b1;
          searchBrandI.mSmallShopConfig = PhotoAdvertisement$SmallShopConfig$$Parcelable.read(p0, p1);
          searchBrandI.mSearchAdFlag = p0.readInt();
          searchBrandI.mMiddleBarSlogan = p0.readString();
          searchBrandI.mPicJumpSchemaUrl = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          searchBrandI.mIsLiving = b;
          searchBrandI.mBookUserCount = p0.readString();
          searchBrandI.mShopProductModuleLinkUrl = p0.readString();
          searchBrandI.mLiveReservationSchema = p0.readString();
          searchBrandI.mShopProductModuleTitle = p0.readString();
          p1.f(i, searchBrandI);
          return searchBrandI;
       }
    }
    public static void write(PhotoAdvertisement$SearchBrandInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mSloganFinalColor);
          p1.writeString(p0.mAdTitle);
          p1.writeString(p0.mUserModuleTitle);
          p1.writeString(p0.mPicJumpUrl);
          p1.writeString(p0.mLiveStartTime);
          PhotoAdvertisement$ChildLinkConfig$$Parcelable.write(p0.mChildLinkConfig, p1, p2, p3);
          p1.writeInt(p0.mAlreadyBooked);
          PhotoAdvertisement$SmallShopConfig$$Parcelable.write(p0.mSmallShopConfig, p1, p2, p3);
          p1.writeInt(p0.mSearchAdFlag);
          p1.writeString(p0.mMiddleBarSlogan);
          p1.writeString(p0.mPicJumpSchemaUrl);
          p1.writeInt(p0.mIsLiving);
          p1.writeString(p0.mBookUserCount);
          p1.writeString(p0.mShopProductModuleLinkUrl);
          p1.writeString(p0.mLiveReservationSchema);
          p1.writeString(p0.mShopProductModuleTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$SearchBrandInfo getParcel(){
       return this.searchBrandInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$SearchBrandInfo$$Parcelable.write(this.searchBrandInfo$$0, p0, p1, new a());
    }
}
