package com.coloros.ocs.base.IAuthenticationListener$Stub;
import com.coloros.ocs.base.IAuthenticationListener;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.coloros.ocs.base.IAuthenticationListener$Stub$Proxy;
import java.lang.IllegalStateException;
import android.os.Parcel;
import com.oplus.ocs.base.common.CapabilityInfo;
import java.lang.Object;
import android.os.Parcelable$Creator;

public abstract class IAuthenticationListener$Stub extends Binder implements IAuthenticationListener	// class@000f7a
{

    public void IAuthenticationListener$Stub(){
       super();
       this.attachInterface(this, "com.coloros.ocs.base.IAuthenticationListener");
    }
    public static IAuthenticationListener asInterface(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.coloros.ocs.base.IAuthenticationListener");
       if (iInterface != null && iInterface instanceof IAuthenticationListener) {
          return iInterface;
       }
       return new IAuthenticationListener$Stub$Proxy(p0);
    }
    public static IAuthenticationListener getDefaultImpl(){
       return IAuthenticationListener$Stub$Proxy.sDefaultImpl;
    }
    public static boolean setDefaultImpl(IAuthenticationListener p0){
       if (IAuthenticationListener$Stub$Proxy.sDefaultImpl != null) {
          throw new IllegalStateException("setDefaultImpl\(\) called twice");
       }
       if (p0 == null) {
          return false;
       }
       IAuthenticationListener$Stub$Proxy.sDefaultImpl = p0;
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
             }else {
                p1.enforceInterface("com.coloros.ocs.base.IAuthenticationListener");
                this.onFail(p1.readInt());
                p2.writeNoException();
                return 1;
             }
          }else {
             p1.enforceInterface("com.coloros.ocs.base.IAuthenticationListener");
             CapabilityInfo uCapabilityI = (p1.readInt())? CapabilityInfo.CREATOR.createFromParcel(p1): null;
             this.onSuccess(uCapabilityI);
             p2.writeNoException();
             return 1;
          }
       }else {
          p2.writeString("com.coloros.ocs.base.IAuthenticationListener");
          return 1;
       }
    }
}
