package com.yxcorp.gifshow.commercial.response.magnetic.PlayAwardVideoResponse$Data$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.commercial.response.magnetic.PlayAwardVideoResponse$Data$$Parcelable$a;
import com.yxcorp.gifshow.commercial.response.magnetic.PlayAwardVideoResponse$Data;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PlayAwardVideoResponse$Data$$Parcelable implements Parcelable, d	// class@00116a
{
    public PlayAwardVideoResponse$Data data$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlayAwardVideoResponse$Data$$Parcelable.CREATOR = new PlayAwardVideoResponse$Data$$Parcelable$a();
    }
    public void PlayAwardVideoResponse$Data$$Parcelable(PlayAwardVideoResponse$Data p0){
       super();
       this.data$$0 = p0;
    }
    public static PlayAwardVideoResponse$Data read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PlayAwardVideoResponse$Data uData = new PlayAwardVideoResponse$Data();
          p1.f(p1.g(), uData);
          uData.mAwardAmount = p0.readInt();
          p1.f(i, uData);
          return uData;
       }
    }
    public static void write(PlayAwardVideoResponse$Data p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mAwardAmount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlayAwardVideoResponse$Data getParcel(){
       return this.data$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlayAwardVideoResponse$Data$$Parcelable.write(this.data$$0, p0, p1, new a());
    }
}
