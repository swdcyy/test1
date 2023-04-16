package com.kuaishou.android.model.mix.TubeMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.TubeMeta$$Parcelable$a;
import com.kuaishou.android.model.mix.TubeMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.tube.TubeEntryInfo;
import com.yxcorp.gifshow.tube.TubeEntryInfo$$Parcelable;
import com.yxcorp.gifshow.tube.TubeInfo;
import com.yxcorp.gifshow.tube.TubeInfo$$Parcelable;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo$$Parcelable;

public class TubeMeta$$Parcelable implements Parcelable, d	// class@000e1e
{
    public TubeMeta tubeMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TubeMeta$$Parcelable.CREATOR = new TubeMeta$$Parcelable$a();
    }
    public void TubeMeta$$Parcelable(TubeMeta p0){
       super();
       this.tubeMeta$$0 = p0;
    }
    public static TubeMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TubeMeta tubeMeta = new TubeMeta();
          p1.f(p1.g(), tubeMeta);
          tubeMeta.mTubeEntryInfo = TubeEntryInfo$$Parcelable.read(p0, p1);
          tubeMeta.mTubeInfo = TubeInfo$$Parcelable.read(p0, p1);
          tubeMeta.mTubeEpisodeInfo = TubeEpisodeInfo$$Parcelable.read(p0, p1);
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          tubeMeta.mHasTubeTag = b;
          p1.f(i, tubeMeta);
          return tubeMeta;
       }
    }
    public static void write(TubeMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          TubeEntryInfo$$Parcelable.write(p0.mTubeEntryInfo, p1, p2, p3);
          TubeInfo$$Parcelable.write(p0.mTubeInfo, p1, p2, p3);
          TubeEpisodeInfo$$Parcelable.write(p0.mTubeEpisodeInfo, p1, p2, p3);
          p1.writeInt(p0.mHasTubeTag);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TubeMeta getParcel(){
       return this.tubeMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TubeMeta$$Parcelable.write(this.tubeMeta$$0, p0, p1, new a());
    }
}
