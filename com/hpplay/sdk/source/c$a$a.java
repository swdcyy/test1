package com.hpplay.sdk.source.c$a$a;
import com.hpplay.sdk.source.c;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import android.os.Parcel;

public class c$a$a implements c	// class@000664
{
    public IBinder a;

    public void c$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public IBinder asBinder(){
       return this.a;
    }
    public String getInterfaceDescriptor(){
       return "com.hpplay.sdk.source.ConnectStatusListener";
    }
    public void onConnect(LelinkServiceInfo p0,int p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.ConnectStatusListener");
       if (p0 != null) {
          parcel.writeInt(1);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       parcel.writeInt(p1);
       this.a.transact(1, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void onDisconnect(LelinkServiceInfo p0,int p1,int p2){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.ConnectStatusListener");
       if (p0 != null) {
          parcel.writeInt(1);
          p0.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       parcel.writeInt(p1);
       parcel.writeInt(p2);
       this.a.transact(2, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
}
