package com.yxcorp.gifshow.model.MusicCategory$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.MusicCategory$$Parcelable$a;
import com.yxcorp.gifshow.model.MusicCategory;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class MusicCategory$$Parcelable implements Parcelable, d	// class@001e5f
{
    public MusicCategory musicCategory$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MusicCategory$$Parcelable.CREATOR = new MusicCategory$$Parcelable$a();
    }
    public void MusicCategory$$Parcelable(MusicCategory p0){
       super();
       this.musicCategory$$0 = p0;
    }
    public static MusicCategory read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          MusicCategory musicCategor = new MusicCategory();
          p1.f(p1.g(), musicCategor);
          musicCategor.mId = p0.readLong();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          musicCategor.mShowLabel = b;
          musicCategor.mName = p0.readString();
          musicCategor.mType = p0.readString();
          p1.f(i, musicCategor);
          return musicCategor;
       }
    }
    public static void write(MusicCategory p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mId);
          p1.writeInt(p0.mShowLabel);
          p1.writeString(p0.mName);
          p1.writeString(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MusicCategory getParcel(){
       return this.musicCategory$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MusicCategory$$Parcelable.write(this.musicCategory$$0, p0, p1, new a());
    }
}