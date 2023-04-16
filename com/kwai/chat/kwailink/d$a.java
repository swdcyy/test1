package com.kwai.chat.kwailink.d$a;
import com.kwai.chat.kwailink.d;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import com.kwai.chat.kwailink.d$a$a;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.chat.kwailink.data.PacketData;
import android.os.Parcelable$Creator;

public abstract class d$a extends Binder implements d	// class@000a40
{

    public void d$a(){
       super();
       this.attachInterface(this, "com.kwai.chat.kwailink.IPacketReceiveCallback");
    }
    public static d L1(){
       return d$a$a.b;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (PatchProxy.isSupport(d$a.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, Integer.valueOf(p3), this, d$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != 1) {
          if (p0 != 0x5f4e5446) {
             return super.onTransact(p0, p1, p2, p3);
          }else {
             p2.writeString("com.kwai.chat.kwailink.IPacketReceiveCallback");
             return 1;
          }
       }else {
          p1.enforceInterface("com.kwai.chat.kwailink.IPacketReceiveCallback");
          PacketData packetData = (p1.readInt())? PacketData.CREATOR.createFromParcel(p1): null;
          this.d1(packetData);
          p2.writeNoException();
          return 1;
       }
    }
}
