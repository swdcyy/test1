package com.coloros.gamespace.gamesdk.IHyperBoostNotifier$a;
import com.coloros.gamespace.gamesdk.IHyperBoostNotifier;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import android.os.Parcel;

public abstract class IHyperBoostNotifier$a extends Binder implements IHyperBoostNotifier	// class@000f73
{

    public void IHyperBoostNotifier$a(){
       super();
       this.attachInterface(this, "com.coloros.gamespace.gamesdk.IHyperBoostNotifier");
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 0x5f4e5446) {
          if (p0 != 1) {
             return super.onTransact(p0, p1, p2, p3);
          }
          p1.enforceInterface("com.coloros.gamespace.gamesdk.IHyperBoostNotifier");
          this.onSystemNotify(p1.readString());
          p2.writeNoException();
          return 1;
       }else {
          p2.writeString("com.coloros.gamespace.gamesdk.IHyperBoostNotifier");
          return 1;
       }
    }
}
