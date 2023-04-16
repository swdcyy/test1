package com.oplus.ocs.base.IServiceBroker$Stub;
import com.oplus.ocs.base.IServiceBroker;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.oplus.ocs.base.IServiceBroker$Stub$Proxy;
import java.lang.IllegalStateException;
import android.os.Parcel;
import com.oplus.ocs.base.IAuthenticationListener;
import com.oplus.ocs.base.IAuthenticationListener$Stub;

public abstract class IServiceBroker$Stub extends Binder implements IServiceBroker	// class@000aaf
{

    public void IServiceBroker$Stub(){
       super();
       this.attachInterface(this, "com.oplus.ocs.base.IServiceBroker");
    }
    public static IServiceBroker asInterface(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.oplus.ocs.base.IServiceBroker");
       if (iInterface != null && iInterface instanceof IServiceBroker) {
          return iInterface;
       }
       return new IServiceBroker$Stub$Proxy(p0);
    }
    public static IServiceBroker getDefaultImpl(){
       return IServiceBroker$Stub$Proxy.sDefaultImpl;
    }
    public static boolean setDefaultImpl(IServiceBroker p0){
       if (IServiceBroker$Stub$Proxy.sDefaultImpl != null) {
          throw new IllegalStateException("setDefaultImpl\(\) called twice");
       }
       if (p0 == null) {
          return false;
       }
       IServiceBroker$Stub$Proxy.sDefaultImpl = p0;
       return true;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 0x5f4e5446) {
          if (p0 != 1) {
             if (p0 != 2) {
                return super.onTransact(p0, p1, p2, p3);
             }
             p1.enforceInterface("com.oplus.ocs.base.IServiceBroker");
             p2.writeNoException();
             p2.writeStrongBinder(this.getBinder(p1.readString(), p1.readString()));
             return 1;
          }else {
             p1.enforceInterface("com.oplus.ocs.base.IServiceBroker");
             this.handleAuthentication(p1.readString(), p1.readString(), IAuthenticationListener$Stub.asInterface(p1.readStrongBinder()));
             p2.writeNoException();
             return 1;
          }
       }else {
          p2.writeString("com.oplus.ocs.base.IServiceBroker");
          return 1;
       }
    }
}
