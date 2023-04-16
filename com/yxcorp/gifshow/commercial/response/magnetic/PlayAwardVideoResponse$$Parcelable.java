package com.yxcorp.gifshow.commercial.response.magnetic.PlayAwardVideoResponse$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.commercial.response.magnetic.PlayAwardVideoResponse$$Parcelable$a;
import com.yxcorp.gifshow.commercial.response.magnetic.PlayAwardVideoResponse;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.commercial.response.magnetic.PlayAwardVideoResponse$Data;
import com.yxcorp.gifshow.commercial.response.magnetic.PlayAwardVideoResponse$Data$$Parcelable;

public class PlayAwardVideoResponse$$Parcelable implements Parcelable, d	// class@001168
{
    public PlayAwardVideoResponse playAwardVideoResponse$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlayAwardVideoResponse$$Parcelable.CREATOR = new PlayAwardVideoResponse$$Parcelable$a();
    }
    public void PlayAwardVideoResponse$$Parcelable(PlayAwardVideoResponse p0){
       super();
       this.playAwardVideoResponse$$0 = p0;
    }
    public static PlayAwardVideoResponse read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PlayAwardVideoResponse playAwardVid = new PlayAwardVideoResponse();
          p1.f(p1.g(), playAwardVid);
          playAwardVid.mData = PlayAwardVideoResponse$Data$$Parcelable.read(p0, p1);
          p1.f(i, playAwardVid);
          return playAwardVid;
       }
    }
    public static void write(PlayAwardVideoResponse p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PlayAwardVideoResponse$Data$$Parcelable.write(p0.mData, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlayAwardVideoResponse getParcel(){
       return this.playAwardVideoResponse$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlayAwardVideoResponse$$Parcelable.write(this.playAwardVideoResponse$$0, p0, p1, new a());
    }
}
