package com.yxcorp.gifshow.tube.SerialPhoto$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.SerialPhoto$$Parcelable$a;
import com.yxcorp.gifshow.tube.SerialPhoto;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SerialPhoto$$Parcelable implements Parcelable, d	// class@001df2
{
    public SerialPhoto serialPhoto$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SerialPhoto$$Parcelable.CREATOR = new SerialPhoto$$Parcelable$a();
    }
    public void SerialPhoto$$Parcelable(SerialPhoto p0){
       super();
       this.serialPhoto$$0 = p0;
    }
    public static SerialPhoto read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SerialPhoto serialPhoto = new SerialPhoto();
          p1.f(p1.g(), serialPhoto);
          serialPhoto.mEpisodeName = p0.readString();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          serialPhoto.isLastValidEpisode = b1;
          serialPhoto.caption = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          serialPhoto.isFirstValidEpisode = b;
          serialPhoto.mOriginCaption = p0.readString();
          serialPhoto.episodeNumber = p0.readInt();
          serialPhoto.mSerialDesc = p0.readString();
          p1.f(i, serialPhoto);
          return serialPhoto;
       }
    }
    public static void write(SerialPhoto p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mEpisodeName);
          p1.writeInt(p0.isLastValidEpisode);
          p1.writeString(p0.caption);
          p1.writeInt(p0.isFirstValidEpisode);
          p1.writeString(p0.mOriginCaption);
          p1.writeInt(p0.episodeNumber);
          p1.writeString(p0.mSerialDesc);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SerialPhoto getParcel(){
       return this.serialPhoto$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SerialPhoto$$Parcelable.write(this.serialPhoto$$0, p0, p1, new a());
    }
}
