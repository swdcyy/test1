package com.kuaishou.android.model.music.MusicRankModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.music.MusicRankModel$$Parcelable$a;
import com.kuaishou.android.model.music.MusicRankModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class MusicRankModel$$Parcelable implements Parcelable, d	// class@000e79
{
    public MusicRankModel musicRankModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MusicRankModel$$Parcelable.CREATOR = new MusicRankModel$$Parcelable$a();
    }
    public void MusicRankModel$$Parcelable(MusicRankModel p0){
       super();
       this.musicRankModel$$0 = p0;
    }
    public static MusicRankModel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          MusicRankModel musicRankMod = new MusicRankModel();
          p1.f(p1.g(), musicRankMod);
          musicRankMod.mRankNum = p0.readInt();
          musicRankMod.mRankName = p0.readString();
          musicRankMod.mRankId = p0.readLong();
          p1.f(i, musicRankMod);
          return musicRankMod;
       }
    }
    public static void write(MusicRankModel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mRankNum);
          p1.writeString(p0.mRankName);
          p1.writeLong(p0.mRankId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MusicRankModel getParcel(){
       return this.musicRankModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MusicRankModel$$Parcelable.write(this.musicRankModel$$0, p0, p1, new a());
    }
}
