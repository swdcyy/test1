package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ClickAfterWords;

public class PhotoAdvertisement$CoverActionBarInfo$$Parcelable implements Parcelable, d	// class@0008fb
{
    public PhotoAdvertisement$CoverActionBarInfo coverActionBarInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$CoverActionBarInfo$$Parcelable.CREATOR = new PhotoAdvertisement$CoverActionBarInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$CoverActionBarInfo$$Parcelable(PhotoAdvertisement$CoverActionBarInfo p0){
       super();
       this.coverActionBarInfo$$0 = p0;
    }
    public static PhotoAdvertisement$CoverActionBarInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$CoverActionBarInfo uCoverAction = new PhotoAdvertisement$CoverActionBarInfo();
          p1.f(p1.g(), uCoverAction);
          uCoverAction.mAdStyle = p0.readInt();
          uCoverAction.mSearchFormButtonExp = p0.readInt();
          uCoverAction.mDisplayType = p0.readInt();
          uCoverAction.mDisplayInfo = p0.readString();
          uCoverAction.mClickAfterWords = p0.readSerializable();
          uCoverAction.mActionBarLocation = p0.readInt();
          uCoverAction.mTemplateId = p0.readString();
          uCoverAction.mActionBarColor = p0.readString();
          uCoverAction.mProductDetailUrl = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uCoverAction.mShouldJumpDetail = b;
          p1.f(i, uCoverAction);
          return uCoverAction;
       }
    }
    public static void write(PhotoAdvertisement$CoverActionBarInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mAdStyle);
          p1.writeInt(p0.mSearchFormButtonExp);
          p1.writeInt(p0.mDisplayType);
          p1.writeString(p0.mDisplayInfo);
          p1.writeSerializable(p0.mClickAfterWords);
          p1.writeInt(p0.mActionBarLocation);
          p1.writeString(p0.mTemplateId);
          p1.writeString(p0.mActionBarColor);
          p1.writeString(p0.mProductDetailUrl);
          p1.writeInt(p0.mShouldJumpDetail);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$CoverActionBarInfo getParcel(){
       return this.coverActionBarInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$CoverActionBarInfo$$Parcelable.write(this.coverActionBarInfo$$0, p0, p1, new a());
    }
}
