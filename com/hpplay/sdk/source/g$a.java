package com.hpplay.sdk.source.g$a;
import com.hpplay.sdk.source.g;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.hpplay.sdk.source.g$a$a;
import android.os.Parcel;

public abstract class g$a extends Binder implements g	// class@000671
{

    public void g$a(){
       super();
       this.attachInterface(this, "com.hpplay.sdk.source.PcAuthListener");
    }
    public static g asInterface(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.hpplay.sdk.source.PcAuthListener");
       if (iInterface != null && iInterface instanceof g) {
          return iInterface;
       }
       return new g$a$a(p0);
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 0x5f4e5446) {
                return super.onTransact(p0, p1, p2, p3);
             }
             p2.writeString("com.hpplay.sdk.source.PcAuthListener");
             return 1;
          }else {
             p1.enforceInterface("com.hpplay.sdk.source.PcAuthListener");
             this.onAuthFailed(p1.readInt());
             p2.writeNoException();
             return 1;
          }
       }else {
          p1.enforceInterface("com.hpplay.sdk.source.PcAuthListener");
          this.onAuthSuccess(p1.readString(), p1.readString());
          p2.writeNoException();
          return 1;
       }
    }
}
