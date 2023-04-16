package com.hpplay.sdk.source.c$a;
import com.hpplay.sdk.source.c;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.hpplay.sdk.source.c$a$a;
import android.os.Parcel;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.lang.Object;
import android.os.Parcelable$Creator;

public abstract class c$a extends Binder implements c	// class@000665
{

    public void c$a(){
       super();
       this.attachInterface(this, "com.hpplay.sdk.source.ConnectStatusListener");
    }
    public static c asInterface(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.hpplay.sdk.source.ConnectStatusListener");
       if (iInterface != null && iInterface instanceof c) {
          return iInterface;
       }
       return new c$a$a(p0);
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       LelinkServiceInfo lelinkServic = null;
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 0x5f4e5446) {
                return super.onTransact(p0, p1, p2, p3);
             }else {
                p2.writeString("com.hpplay.sdk.source.ConnectStatusListener");
                return 1;
             }
          }else {
             p1.enforceInterface("com.hpplay.sdk.source.ConnectStatusListener");
             if (p1.readInt()) {
                lelinkServic = LelinkServiceInfo.CREATOR.createFromParcel(p1);
             }
             this.onDisconnect(lelinkServic, p1.readInt(), p1.readInt());
             p2.writeNoException();
             return 1;
          }
       }else {
          p1.enforceInterface("com.hpplay.sdk.source.ConnectStatusListener");
          if (p1.readInt()) {
             lelinkServic = LelinkServiceInfo.CREATOR.createFromParcel(p1);
          }
          this.onConnect(lelinkServic, p1.readInt());
          p2.writeNoException();
          return 1;
       }
    }
}
