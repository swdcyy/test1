package com.meizu.cloud.pushsdk.handler.MessageV4$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.meizu.cloud.pushsdk.handler.MessageV4;

public final class MessageV4$1 implements Parcelable$Creator	// class@00152d
{

    public void MessageV4$1(){
       super();
    }
    public MessageV4 a(Parcel p0){
       return new MessageV4(p0);
    }
    public MessageV4[] a(int p0){
       MessageV4[] messageV4Arr = new MessageV4[p0];
       return messageV4Arr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.a(p0);
    }
}
