package com.kuaishou.android.model.mix.PhotoRewardCollectStat$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PhotoRewardCollectStat$$Parcelable$a;
import com.kuaishou.android.model.mix.PhotoRewardCollectStat;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoRewardCollectStat$$Parcelable implements Parcelable, d	// class@000d67
{
    public PhotoRewardCollectStat photoRewardCollectStat$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoRewardCollectStat$$Parcelable.CREATOR = new PhotoRewardCollectStat$$Parcelable$a();
    }
    public void PhotoRewardCollectStat$$Parcelable(PhotoRewardCollectStat p0){
       super();
       this.photoRewardCollectStat$$0 = p0;
    }
    public static PhotoRewardCollectStat read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoRewardCollectStat photoRewardC = new PhotoRewardCollectStat();
          p1.f(p1.g(), photoRewardC);
          photoRewardC.mCollectCount = p0.readInt();
          photoRewardC.mRewardAmount = p0.readInt();
          photoRewardC.mToast = p0.readString();
          photoRewardC.mRewardCount = p0.readInt();
          p1.f(i, photoRewardC);
          return photoRewardC;
       }
    }
    public static void write(PhotoRewardCollectStat p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mCollectCount);
          p1.writeInt(p0.mRewardAmount);
          p1.writeString(p0.mToast);
          p1.writeInt(p0.mRewardCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoRewardCollectStat getParcel(){
       return this.photoRewardCollectStat$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoRewardCollectStat$$Parcelable.write(this.photoRewardCollectStat$$0, p0, p1, new a());
    }
}
