package com.yxcorp.gifshow.tube.SerialInfo$ClusterSerialCount$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.SerialInfo$ClusterSerialCount$$Parcelable$a;
import com.yxcorp.gifshow.tube.SerialInfo$ClusterSerialCount;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class SerialInfo$ClusterSerialCount$$Parcelable implements Parcelable, d	// class@001de4
{
    public SerialInfo$ClusterSerialCount clusterSerialCount$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SerialInfo$ClusterSerialCount$$Parcelable.CREATOR = new SerialInfo$ClusterSerialCount$$Parcelable$a();
    }
    public void SerialInfo$ClusterSerialCount$$Parcelable(SerialInfo$ClusterSerialCount p0){
       super();
       this.clusterSerialCount$$0 = p0;
    }
    public static SerialInfo$ClusterSerialCount read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          SerialInfo$ClusterSerialCount uClusterSeri = new SerialInfo$ClusterSerialCount();
          p1.f(p1.g(), uClusterSeri);
          uClusterSeri.mDanmakuCount = p0.readInt();
          uClusterSeri.mPlayCount = p0.readInt();
          p1.f(i, uClusterSeri);
          return uClusterSeri;
       }
    }
    public static void write(SerialInfo$ClusterSerialCount p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mDanmakuCount);
          p1.writeInt(p0.mPlayCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SerialInfo$ClusterSerialCount getParcel(){
       return this.clusterSerialCount$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SerialInfo$ClusterSerialCount$$Parcelable.write(this.clusterSerialCount$$0, p0, p1, new a());
    }
}
