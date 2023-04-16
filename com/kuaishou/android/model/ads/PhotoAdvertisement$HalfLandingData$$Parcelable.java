package com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData$$Parcelable;

public class PhotoAdvertisement$HalfLandingData$$Parcelable implements Parcelable, d	// class@000943
{
    public PhotoAdvertisement$HalfLandingData halfLandingData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$HalfLandingData$$Parcelable.CREATOR = new PhotoAdvertisement$HalfLandingData$$Parcelable$a();
    }
    public void PhotoAdvertisement$HalfLandingData$$Parcelable(PhotoAdvertisement$HalfLandingData p0){
       super();
       this.halfLandingData$$0 = p0;
    }
    public static PhotoAdvertisement$HalfLandingData read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$HalfLandingData halfLandingD = new PhotoAdvertisement$HalfLandingData();
          p1.f(p1.g(), halfLandingD);
          halfLandingD.mCollapsedTextData = PhotoAdvertisement$CollapsedTextData$$Parcelable.read(p0, p1);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          halfLandingD.mDisallowExpanded = b;
          halfLandingD.mCoverData = PhotoAdvertisement$CoverData$$Parcelable.read(p0, p1);
          halfLandingD.mPrivacyData = PhotoAdvertisement$PrivacyData$$Parcelable.read(p0, p1);
          halfLandingD.mHeaderData = PhotoAdvertisement$HeaderData$$Parcelable.read(p0, p1);
          p1.f(i, halfLandingD);
          return halfLandingD;
       }
    }
    public static void write(PhotoAdvertisement$HalfLandingData p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$CollapsedTextData$$Parcelable.write(p0.mCollapsedTextData, p1, p2, p3);
          p1.writeInt(p0.mDisallowExpanded);
          PhotoAdvertisement$CoverData$$Parcelable.write(p0.mCoverData, p1, p2, p3);
          PhotoAdvertisement$PrivacyData$$Parcelable.write(p0.mPrivacyData, p1, p2, p3);
          PhotoAdvertisement$HeaderData$$Parcelable.write(p0.mHeaderData, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$HalfLandingData getParcel(){
       return this.halfLandingData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$HalfLandingData$$Parcelable.write(this.halfLandingData$$0, p0, p1, new a());
    }
}
