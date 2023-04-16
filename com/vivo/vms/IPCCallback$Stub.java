package com.vivo.vms.IPCCallback$Stub;
import com.vivo.vms.IPCCallback;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.vivo.vms.IPCCallback$Stub$Proxy;
import android.os.Parcel;
import android.os.Bundle;

public abstract class IPCCallback$Stub extends Binder implements IPCCallback	// class@0010cb
{

    public void IPCCallback$Stub(){
       super();
       this.attachInterface(this, "com.vivo.vms.IPCCallback");
    }
    public static IPCCallback asInterface(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.vivo.vms.IPCCallback");
       if (iInterface != null && iInterface instanceof IPCCallback) {
          return iInterface;
       }
       return new IPCCallback$Stub$Proxy(p0);
    }
    public static IPCCallback getDefaultImpl(){
       return IPCCallback$Stub$Proxy.sDefaultImpl;
    }
    public static boolean setDefaultImpl(IPCCallback p0){
       if (IPCCallback$Stub$Proxy.sDefaultImpl != null || p0 == null) {
          return false;
       }
       IPCCallback$Stub$Proxy.sDefaultImpl = p0;
       return true;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 1) {
          if (p0 != 0x5f4e5446) {
             return super.onTransact(p0, p1, p2, p3);
          }
          p2.writeString("com.vivo.vms.IPCCallback");
          return 1;
       }else {
          p1.enforceInterface("com.vivo.vms.IPCCallback");
          Bundle uBundle = new Bundle();
          this.call(uBundle);
          p2.writeNoException();
          p2.writeInt(1);
          uBundle.writeToParcel(p2, 1);
          return 1;
       }
    }
}
