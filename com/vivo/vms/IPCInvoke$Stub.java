package com.vivo.vms.IPCInvoke$Stub;
import com.vivo.vms.IPCInvoke;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.vivo.vms.IPCInvoke$Stub$Proxy;
import android.os.Parcel;
import android.os.Bundle;
import java.lang.Object;
import android.os.Parcelable$Creator;
import com.vivo.vms.IPCCallback;
import com.vivo.vms.IPCCallback$Stub;

public abstract class IPCInvoke$Stub extends Binder implements IPCInvoke	// class@0010cf
{

    public void IPCInvoke$Stub(){
       super();
       this.attachInterface(this, "com.vivo.vms.IPCInvoke");
    }
    public static IPCInvoke asInterface(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.vivo.vms.IPCInvoke");
       if (iInterface != null && iInterface instanceof IPCInvoke) {
          return iInterface;
       }
       return new IPCInvoke$Stub$Proxy(p0);
    }
    public static IPCInvoke getDefaultImpl(){
       return IPCInvoke$Stub$Proxy.sDefaultImpl;
    }
    public static boolean setDefaultImpl(IPCInvoke p0){
       if (IPCInvoke$Stub$Proxy.sDefaultImpl != null || p0 == null) {
          return false;
       }
       IPCInvoke$Stub$Proxy.sDefaultImpl = p0;
       return true;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 1) {
          if (p0 != 0x5f4e5446) {
             return super.onTransact(p0, p1, p2, p3);
          }else {
             p2.writeString("com.vivo.vms.IPCInvoke");
             return 1;
          }
       }else {
          p1.enforceInterface("com.vivo.vms.IPCInvoke");
          Bundle uBundle = (p1.readInt())? Bundle.CREATOR.createFromParcel(p1): null;
          uBundle = this.asyncCall(uBundle, IPCCallback$Stub.asInterface(p1.readStrongBinder()));
          p2.writeNoException();
          if (uBundle != null) {
             p2.writeInt(1);
             uBundle.writeToParcel(p2, 1);
          }else {
             p2.writeInt(0);
          }
          return 1;
       }
    }
}
