package com.kuaishou.merchant.feed.model.BaseFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.merchant.feed.model.BaseFeed$$Parcelable$a;
import com.kuaishou.merchant.feed.model.BaseFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.merchant.feed.model.BaseFeed$a;

public class BaseFeed$$Parcelable implements Parcelable, d	// class@0016b3
{
    public BaseFeed baseFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       BaseFeed$$Parcelable.CREATOR = new BaseFeed$$Parcelable$a();
    }
    public void BaseFeed$$Parcelable(BaseFeed p0){
       super();
       this.baseFeed$$0 = p0;
    }
    public static BaseFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          BaseFeed uBaseFeed = new BaseFeed$a().c(p0);
          p1.f(i, uBaseFeed);
          return uBaseFeed;
       }
    }
    public static void write(BaseFeed p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          new BaseFeed$a().d(p0, p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public BaseFeed getParcel(){
       return this.baseFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       BaseFeed$$Parcelable.write(this.baseFeed$$0, p0, p1, new a());
    }
}
