package com.vivo.vms.IPCCallback$Stub$Proxy;
import com.vivo.vms.IPCCallback;
import android.os.IBinder;
import java.lang.Object;
import android.os.Bundle;
import android.os.Parcel;
import java.lang.String;
import com.vivo.vms.IPCCallback$Stub;

public class IPCCallback$Stub$Proxy implements IPCCallback	// class@0010ca
{
    public IBinder mRemote;
    public static IPCCallback sDefaultImpl;

    public void IPCCallback$Stub$Proxy(IBinder p0){
       super();
       this.mRemote = p0;
    }
    public IBinder asBinder(){
       return this.mRemote;
    }
    public void call(Bundle p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.vivo.vms.IPCCallback");
       if (!this.mRemote.transact(1, parcel, parcel1, 0) && IPCCallback$Stub.getDefaultImpl() != null) {
          IPCCallback$Stub.getDefaultImpl().call(p0);
       }else {
          parcel1.readException();
          if (parcel1.readInt()) {
             p0.readFromParcel(parcel1);
          }
       }
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public String getInterfaceDescriptor(){
       return "com.vivo.vms.IPCCallback";
    }
}
