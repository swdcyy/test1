package com.alipay.android.app.IRemoteServiceCallback$Stub$a;
import com.alipay.android.app.IRemoteServiceCallback;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import java.util.Map;
import android.os.Bundle;

public class IRemoteServiceCallback$Stub$a implements IRemoteServiceCallback	// class@000e32
{
    public IBinder a;

    public void IRemoteServiceCallback$Stub$a(IBinder p0){
       super();
       this.a = p0;
    }
    public String a(){
       return "com.alipay.android.app.IRemoteServiceCallback";
    }
    public IBinder asBinder(){
       return this.a;
    }
    public int getVersion(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
       this.a.transact(4, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readInt();
    }
    public boolean isHideLoadingScreen(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
       int i = 0;
       this.a.transact(3, parcel, parcel1, i);
       parcel1.readException();
       if (parcel1.readInt()) {
          i = true;
       }
       parcel1.recycle();
       parcel.recycle();
       return i;
    }
    public void payEnd(boolean p0,String p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
       parcel.writeInt(p0);
       parcel.writeString(p1);
       this.a.transact(2, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void r03(String p0,String p1,Map p2){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
       parcel.writeString(p0);
       parcel.writeString(p1);
       parcel.writeMap(p2);
       this.a.transact(5, parcel, null, 1);
       parcel.recycle();
    }
    public void startActivity(String p0,String p1,int p2,Bundle p3){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IRemoteServiceCallback");
       parcel.writeString(p0);
       parcel.writeString(p1);
       parcel.writeInt(p2);
       if (p3 != null) {
          parcel.writeInt(1);
          p3.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       this.a.transact(1, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
}
