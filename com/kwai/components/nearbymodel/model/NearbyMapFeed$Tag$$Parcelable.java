package com.kwai.components.nearbymodel.model.NearbyMapFeed$Tag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$Tag$$Parcelable$a;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$Tag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class NearbyMapFeed$Tag$$Parcelable implements Parcelable, d	// class@000cb3
{
    public NearbyMapFeed$Tag tag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NearbyMapFeed$Tag$$Parcelable.CREATOR = new NearbyMapFeed$Tag$$Parcelable$a();
    }
    public void NearbyMapFeed$Tag$$Parcelable(NearbyMapFeed$Tag p0){
       super();
       this.tag$$0 = p0;
    }
    public static NearbyMapFeed$Tag read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          NearbyMapFeed$Tag tag = new NearbyMapFeed$Tag();
          p1.f(p1.g(), tag);
          tag.mText = p0.readString();
          tag.mType = p0.readInt();
          p1.f(i, tag);
          return tag;
       }
    }
    public static void write(NearbyMapFeed$Tag p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mText);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NearbyMapFeed$Tag getParcel(){
       return this.tag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NearbyMapFeed$Tag$$Parcelable.write(this.tag$$0, p0, p1, new a());
    }
}
