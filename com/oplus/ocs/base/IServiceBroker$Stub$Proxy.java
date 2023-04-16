package com.oplus.ocs.base.IServiceBroker$Stub$Proxy;
import com.oplus.ocs.base.IServiceBroker;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import com.oplus.ocs.base.IServiceBroker$Stub;
import com.oplus.ocs.base.IAuthenticationListener;
import android.os.IInterface;

public class IServiceBroker$Stub$Proxy implements IServiceBroker	// class@000aae
{
    public IBinder mRemote;
    public static IServiceBroker sDefaultImpl;

    public void IServiceBroker$Stub$Proxy(IBinder p0){
       super();
       this.mRemote = p0;
    }
    public IBinder asBinder(){
       return this.mRemote;
    }
    public IBinder getBinder(String p0,String p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.oplus.ocs.base.IServiceBroker");
       parcel.writeString(p0);
       parcel.writeString(p1);
       if (!this.mRemote.transact(2, parcel, parcel1, 0) && IServiceBroker$Stub.getDefaultImpl() != null) {
          parcel1.recycle();
          parcel.recycle();
          return IServiceBroker$Stub.getDefaultImpl().getBinder(p0, p1);
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return parcel1.readStrongBinder();
       }
    }
    public String getInterfaceDescriptor(){
       return "com.oplus.ocs.base.IServiceBroker";
    }
    public void handleAuthentication(String p0,String p1,IAuthenticationListener p2){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.oplus.ocs.base.IServiceBroker");
       parcel.writeString(p0);
       parcel.writeString(p1);
       IBinder iBinder = (p2 != null)? p2.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       if (!this.mRemote.transact(1, parcel, parcel1, 0) && IServiceBroker$Stub.getDefaultImpl() != null) {
          IServiceBroker$Stub.getDefaultImpl().handleAuthentication(p0, p1, p2);
       }else {
          parcel1.readException();
       }
       parcel1.recycle();
       parcel.recycle();
       return;
    }
}
