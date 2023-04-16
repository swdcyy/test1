package com.vivo.vms.IPCInvoke$Stub$Proxy;
import com.vivo.vms.IPCInvoke;
import android.os.IBinder;
import java.lang.Object;
import android.os.Bundle;
import com.vivo.vms.IPCCallback;
import android.os.Parcel;
import java.lang.String;
import android.os.IInterface;
import com.vivo.vms.IPCInvoke$Stub;
import android.os.Parcelable$Creator;

public class IPCInvoke$Stub$Proxy implements IPCInvoke	// class@0010ce
{
    public IBinder mRemote;
    public static IPCInvoke sDefaultImpl;

    public void IPCInvoke$Stub$Proxy(IBinder p0){
       super();
       this.mRemote = p0;
    }
    public IBinder asBinder(){
       return this.mRemote;
    }
    public Bundle asyncCall(Bundle p0,IPCCallback p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.vivo.vms.IPCInvoke");
       int i = 1;
       if (p0 != null) {
          parcel.writeInt(i);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       Bundle uBundle = null;
       IBinder iBinder = (p1 != null)? p1.asBinder(): uBundle;
       parcel.writeStrongBinder(iBinder);
       if (!this.mRemote.transact(i, parcel, parcel1, 0) && IPCInvoke$Stub.getDefaultImpl() != null) {
          parcel1.recycle();
          parcel.recycle();
          return IPCInvoke$Stub.getDefaultImpl().asyncCall(p0, p1);
       }else {
          parcel1.readException();
          if (parcel1.readInt()) {
             uBundle = Bundle.CREATOR.createFromParcel(parcel1);
          }
          parcel1.recycle();
          parcel.recycle();
          return uBundle;
       }
    }
    public String getInterfaceDescriptor(){
       return "com.vivo.vms.IPCInvoke";
    }
}
