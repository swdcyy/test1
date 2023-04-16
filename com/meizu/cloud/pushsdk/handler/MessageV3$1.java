package com.meizu.cloud.pushsdk.handler.MessageV3$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.meizu.cloud.pushsdk.handler.MessageV3;

public final class MessageV3$1 implements Parcelable$Creator	// class@00152b
{

    public void MessageV3$1(){
       super();
    }
    public MessageV3 a(Parcel p0){
       return new MessageV3(p0);
    }
    public MessageV3[] a(int p0){
       MessageV3[] messageV3Arr = new MessageV3[p0];
       return messageV3Arr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.a(p0);
    }
}
