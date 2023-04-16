package com.oplus.cosa.gamemanagersdk.IOplusHyperBoostNotifier$a;
import com.oplus.cosa.gamemanagersdk.IOplusHyperBoostNotifier;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import android.os.Parcel;

public abstract class IOplusHyperBoostNotifier$a extends Binder implements IOplusHyperBoostNotifier	// class@000aa4
{

    public void IOplusHyperBoostNotifier$a(){
       super();
       this.attachInterface(this, "com.oplus.cosa.gamemanagersdk.IOplusHyperBoostNotifier");
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 0x5f4e5446) {
          if (p0 != 1) {
             return super.onTransact(p0, p1, p2, p3);
          }
          p1.enforceInterface("com.oplus.cosa.gamemanagersdk.IOplusHyperBoostNotifier");
          this.onSystemNotify(p1.readString());
          p2.writeNoException();
          return 1;
       }else {
          p2.writeString("com.oplus.cosa.gamemanagersdk.IOplusHyperBoostNotifier");
          return 1;
       }
    }
}
