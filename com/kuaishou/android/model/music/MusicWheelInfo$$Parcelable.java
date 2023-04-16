package com.kuaishou.android.model.music.MusicWheelInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.music.MusicWheelInfo$$Parcelable$a;
import com.kuaishou.android.model.music.MusicWheelInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class MusicWheelInfo$$Parcelable implements Parcelable, d	// class@000e84
{
    public MusicWheelInfo musicWheelInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MusicWheelInfo$$Parcelable.CREATOR = new MusicWheelInfo$$Parcelable$a();
    }
    public void MusicWheelInfo$$Parcelable(MusicWheelInfo p0){
       super();
       this.musicWheelInfo$$0 = p0;
    }
    public static MusicWheelInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          MusicWheelInfo musicWheelIn = new MusicWheelInfo();
          p1.f(p1.g(), musicWheelIn);
          musicWheelIn.mMusicWheelTopicName = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          musicWheelIn.mMusicWheelExtendable = b;
          p1.f(i, musicWheelIn);
          return musicWheelIn;
       }
    }
    public static void write(MusicWheelInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mMusicWheelTopicName);
          p1.writeInt(p0.mMusicWheelExtendable);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MusicWheelInfo getParcel(){
       return this.musicWheelInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MusicWheelInfo$$Parcelable.write(this.musicWheelInfo$$0, p0, p1, new a());
    }
}
