package com.kuaishou.android.model.ads.PhotoAdvertisement$Track$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$Track$$Parcelable implements Parcelable, d	// class@000a40
{
    public PhotoAdvertisement$Track track$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$Track$$Parcelable.CREATOR = new PhotoAdvertisement$Track$$Parcelable$a();
    }
    public void PhotoAdvertisement$Track$$Parcelable(PhotoAdvertisement$Track p0){
       super();
       this.track$$0 = p0;
    }
    public static PhotoAdvertisement$Track read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$Track track = new PhotoAdvertisement$Track();
          p1.f(p1.g(), track);
          track.mUrl = p0.readString();
          track.mRequestType = p0.readInt();
          track.mUrlOperationType = p0.readInt();
          track.mType = p0.readInt();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          track.mEnableDefaultMacro = b;
          p1.f(i, track);
          return track;
       }
    }
    public static void write(PhotoAdvertisement$Track p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUrl);
          p1.writeInt(p0.mRequestType);
          p1.writeInt(p0.mUrlOperationType);
          p1.writeInt(p0.mType);
          p1.writeInt(p0.mEnableDefaultMacro);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$Track getParcel(){
       return this.track$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$Track$$Parcelable.write(this.track$$0, p0, p1, new a());
    }
}
