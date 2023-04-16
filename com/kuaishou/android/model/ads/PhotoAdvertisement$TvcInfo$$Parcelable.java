package com.kuaishou.android.model.ads.PhotoAdvertisement$TvcInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TvcInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TvcInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TVCActionBarInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TVCActionBarInfo$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TransitionInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TransitionInfo$$Parcelable;

public class PhotoAdvertisement$TvcInfo$$Parcelable implements Parcelable, d	// class@000a50
{
    public PhotoAdvertisement$TvcInfo tvcInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$TvcInfo$$Parcelable.CREATOR = new PhotoAdvertisement$TvcInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$TvcInfo$$Parcelable(PhotoAdvertisement$TvcInfo p0){
       super();
       this.tvcInfo$$0 = p0;
    }
    public static PhotoAdvertisement$TvcInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$TvcInfo tvcInfo = new PhotoAdvertisement$TvcInfo();
          p1.f(p1.g(), tvcInfo);
          tvcInfo.mUrl = p0.readString();
          tvcInfo.mActionBarInfo = PhotoAdvertisement$TVCActionBarInfo$$Parcelable.read(p0, p1);
          tvcInfo.mTransitionInfo = PhotoAdvertisement$TransitionInfo$$Parcelable.read(p0, p1);
          tvcInfo.mLiveStreamId = p0.readString();
          tvcInfo.mSourceDescription = p0.readString();
          p1.f(i, tvcInfo);
          return tvcInfo;
       }
    }
    public static void write(PhotoAdvertisement$TvcInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUrl);
          PhotoAdvertisement$TVCActionBarInfo$$Parcelable.write(p0.mActionBarInfo, p1, p2, p3);
          PhotoAdvertisement$TransitionInfo$$Parcelable.write(p0.mTransitionInfo, p1, p2, p3);
          p1.writeString(p0.mLiveStreamId);
          p1.writeString(p0.mSourceDescription);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$TvcInfo getParcel(){
       return this.tvcInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$TvcInfo$$Parcelable.write(this.tvcInfo$$0, p0, p1, new a());
    }
}
