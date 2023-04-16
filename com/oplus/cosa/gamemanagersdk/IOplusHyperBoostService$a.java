package com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService$a;
import com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService;
import android.os.Binder;
import com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService$a$a;
import android.os.IBinder;
import java.lang.String;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IOplusHyperBoostService$a extends Binder implements IOplusHyperBoostService	// class@000aa7
{

    public static IOplusHyperBoostService a(){
       return IOplusHyperBoostService$a$a.a;
    }
    public static IOplusHyperBoostService a(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService");
       if (iInterface != null && iInterface instanceof IOplusHyperBoostService) {
          return iInterface;
       }
       return new IOplusHyperBoostService$a$a(p0);
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 0x5f4e5446) {
          switch (p0){
              case 1:
                p1.enforceInterface("com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService");
                p2.writeNoException();
                p2.writeInt(this.initHyperBoost());
                return true;
              case 2:
                p1.enforceInterface("com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService");
                p2.writeNoException();
                p2.writeInt(this.registerClient(p1.readStrongBinder()));
                return true;
              case 3:
                p1.enforceInterface("com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService");
                p2.writeNoException();
                p2.writeString(this.getVersion());
                return true;
              case 4:
                p1.enforceInterface("com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService");
                this.generalSignal(p1.readString());
                p2.writeNoException();
                return true;
              case 5:
                p1.enforceInterface("com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService");
                this.registerNotifier();
                p2.writeNoException();
                return true;
              case 6:
                p1.enforceInterface("com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService");
                this.vibrate(p1.readInt());
                p2.writeNoException();
                return true;
              default:
                return super.onTransact(p0, p1, p2, p3);
          }
       }else {
          p2.writeString("com.oplus.cosa.gamemanagersdk.IOplusHyperBoostService");
          return true;
       }
    }
}
