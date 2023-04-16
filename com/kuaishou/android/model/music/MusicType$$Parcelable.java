package com.kuaishou.android.model.music.MusicType$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.music.MusicType$$Parcelable$a;
import com.kuaishou.android.model.music.MusicType;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import java.lang.Enum;

public class MusicType$$Parcelable implements Parcelable, d	// class@000e80
{
    public MusicType musicType$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MusicType$$Parcelable.CREATOR = new MusicType$$Parcelable$a();
    }
    public void MusicType$$Parcelable(MusicType p0){
       super();
       this.musicType$$0 = p0;
    }
    public static MusicType read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          String str = p0.readString();
          MusicType musicType = (str == null)? null: Enum.valueOf(MusicType.class, str);
          p1.f(i, musicType);
          return musicType;
       }
    }
    public static void write(MusicType p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          String str = (p0 == null)? null: p0.name();
          p1.writeString(str);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MusicType getParcel(){
       return this.musicType$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MusicType$$Parcelable.write(this.musicType$$0, p0, p1, new a());
    }
}
