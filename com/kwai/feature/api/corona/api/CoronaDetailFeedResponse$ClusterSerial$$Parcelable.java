package com.kwai.feature.api.corona.api.CoronaDetailFeedResponse$ClusterSerial$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.corona.api.CoronaDetailFeedResponse$ClusterSerial$$Parcelable$a;
import com.kwai.feature.api.corona.api.CoronaDetailFeedResponse$ClusterSerial;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CoronaDetailFeedResponse$ClusterSerial$$Parcelable implements Parcelable, d	// class@000dd9
{
    public CoronaDetailFeedResponse$ClusterSerial clusterSerial$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaDetailFeedResponse$ClusterSerial$$Parcelable.CREATOR = new CoronaDetailFeedResponse$ClusterSerial$$Parcelable$a();
    }
    public void CoronaDetailFeedResponse$ClusterSerial$$Parcelable(CoronaDetailFeedResponse$ClusterSerial p0){
       super();
       this.clusterSerial$$0 = p0;
    }
    public static CoronaDetailFeedResponse$ClusterSerial read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaDetailFeedResponse$ClusterSerial uClusterSeri = new CoronaDetailFeedResponse$ClusterSerial();
          p1.f(p1.g(), uClusterSeri);
          uClusterSeri.mSubCount = p0.readInt();
          uClusterSeri.mId = p0.readString();
          uClusterSeri.mTitle = p0.readString();
          uClusterSeri.mType = p0.readInt();
          p1.f(i, uClusterSeri);
          return uClusterSeri;
       }
    }
    public static void write(CoronaDetailFeedResponse$ClusterSerial p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mSubCount);
          p1.writeString(p0.mId);
          p1.writeString(p0.mTitle);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaDetailFeedResponse$ClusterSerial getParcel(){
       return this.clusterSerial$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaDetailFeedResponse$ClusterSerial$$Parcelable.write(this.clusterSerial$$0, p0, p1, new a());
    }
}
