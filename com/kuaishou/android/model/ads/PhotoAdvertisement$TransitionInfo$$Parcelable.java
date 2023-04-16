package com.kuaishou.android.model.ads.PhotoAdvertisement$TransitionInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TransitionInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TransitionInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$TransitionInfo$$Parcelable implements Parcelable, d	// class@000a48
{
    public PhotoAdvertisement$TransitionInfo transitionInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$TransitionInfo$$Parcelable.CREATOR = new PhotoAdvertisement$TransitionInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$TransitionInfo$$Parcelable(PhotoAdvertisement$TransitionInfo p0){
       super();
       this.transitionInfo$$0 = p0;
    }
    public static PhotoAdvertisement$TransitionInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$TransitionInfo transitionIn = new PhotoAdvertisement$TransitionInfo();
          p1.f(p1.g(), transitionIn);
          transitionIn.mHeight = p0.readInt();
          transitionIn.mWidth = p0.readInt();
          transitionIn.mDurationMs = p0.readInt();
          transitionIn.mVideoUrl = p0.readString();
          p1.f(i, transitionIn);
          return transitionIn;
       }
    }
    public static void write(PhotoAdvertisement$TransitionInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHeight);
          p1.writeInt(p0.mWidth);
          p1.writeInt(p0.mDurationMs);
          p1.writeString(p0.mVideoUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$TransitionInfo getParcel(){
       return this.transitionInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$TransitionInfo$$Parcelable.write(this.transitionInfo$$0, p0, p1, new a());
    }
}
