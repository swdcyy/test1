package com.kuaishou.android.model.ads.PicFeedInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PicFeedInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PicFeedInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PicFeedInfo$$Parcelable implements Parcelable, d	// class@000a6d
{
    public PicFeedInfo picFeedInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PicFeedInfo$$Parcelable.CREATOR = new PicFeedInfo$$Parcelable$a();
    }
    public void PicFeedInfo$$Parcelable(PicFeedInfo p0){
       super();
       this.picFeedInfo$$0 = p0;
    }
    public static PicFeedInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PicFeedInfo picFeedInfo = new PicFeedInfo();
          p1.f(p1.g(), picFeedInfo);
          picFeedInfo.mExpTag = p0.readString();
          p1.f(i, picFeedInfo);
          return picFeedInfo;
       }
    }
    public static void write(PicFeedInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mExpTag);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PicFeedInfo getParcel(){
       return this.picFeedInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PicFeedInfo$$Parcelable.write(this.picFeedInfo$$0, p0, p1, new a());
    }
}
