package com.coloros.ocs.base.IAuthenticationListener$Stub$Proxy;
import com.coloros.ocs.base.IAuthenticationListener;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import com.coloros.ocs.base.IAuthenticationListener$Stub;
import com.oplus.ocs.base.common.CapabilityInfo;

public class IAuthenticationListener$Stub$Proxy implements IAuthenticationListener	// class@000f79
{
    public IBinder mRemote;
    public static IAuthenticationListener sDefaultImpl;

    public void IAuthenticationListener$Stub$Proxy(IBinder p0){
       super();
       this.mRemote = p0;
    }
    public IBinder asBinder(){
       return this.mRemote;
    }
    public String getInterfaceDescriptor(){
       return "com.coloros.ocs.base.IAuthenticationListener";
    }
    public void onFail(int p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.coloros.ocs.base.IAuthenticationListener");
       parcel.writeInt(p0);
       if (!this.mRemote.transact(2, parcel, parcel1, 0) && IAuthenticationListener$Stub.getDefaultImpl() != null) {
          IAuthenticationListener$Stub.getDefaultImpl().onFail(p0);
       }else {
          parcel1.readException();
       }
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void onSuccess(CapabilityInfo p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.coloros.ocs.base.IAuthenticationListener");
       int i = 1;
       if (p0 != null) {
          parcel.writeInt(i);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       if (!this.mRemote.transact(i, parcel, parcel1, 0) && IAuthenticationListener$Stub.getDefaultImpl() != null) {
          IAuthenticationListener$Stub.getDefaultImpl().onSuccess(p0);
       }else {
          parcel1.readException();
       }
       parcel1.recycle();
       parcel.recycle();
       return;
    }
}
