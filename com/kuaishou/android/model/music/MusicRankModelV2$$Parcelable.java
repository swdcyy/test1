package com.kuaishou.android.model.music.MusicRankModelV2$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.music.MusicRankModelV2$$Parcelable$a;
import com.kuaishou.android.model.music.MusicRankModelV2;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class MusicRankModelV2$$Parcelable implements Parcelable, d	// class@000e7c
{
    public MusicRankModelV2 musicRankModelV2$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MusicRankModelV2$$Parcelable.CREATOR = new MusicRankModelV2$$Parcelable$a();
    }
    public void MusicRankModelV2$$Parcelable(MusicRankModelV2 p0){
       super();
       this.musicRankModelV2$$0 = p0;
    }
    public static MusicRankModelV2 read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          MusicRankModelV2 musicRankMod = new MusicRankModelV2();
          p1.f(p1.g(), musicRankMod);
          musicRankMod.mKwaiUrl = p0.readString();
          musicRankMod.mRankNum = p0.readInt();
          musicRankMod.mRankName = p0.readString();
          musicRankMod.mRankId = p0.readLong();
          p1.f(i, musicRankMod);
          return musicRankMod;
       }
    }
    public static void write(MusicRankModelV2 p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mKwaiUrl);
          p1.writeInt(p0.mRankNum);
          p1.writeString(p0.mRankName);
          p1.writeLong(p0.mRankId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MusicRankModelV2 getParcel(){
       return this.musicRankModelV2$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MusicRankModelV2$$Parcelable.write(this.musicRankModelV2$$0, p0, p1, new a());
    }
}
