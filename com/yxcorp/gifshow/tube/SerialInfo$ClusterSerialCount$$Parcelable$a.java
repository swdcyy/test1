package com.yxcorp.gifshow.tube.SerialInfo$ClusterSerialCount$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.SerialInfo$ClusterSerialCount$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.SerialInfo$ClusterSerialCount;

public class SerialInfo$ClusterSerialCount$$Parcelable$a implements Parcelable$Creator	// class@001de3
{

    public void SerialInfo$ClusterSerialCount$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SerialInfo$ClusterSerialCount$$Parcelable(SerialInfo$ClusterSerialCount$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SerialInfo$ClusterSerialCount$$Parcelable[] uClusterSeri = new SerialInfo$ClusterSerialCount$$Parcelable[p0];
       return uClusterSeri;
    }
}
