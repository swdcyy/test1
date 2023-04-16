package com.alipay.android.app.IAlixPay$Stub;
import com.alipay.android.app.IAlixPay;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.alipay.android.app.IAlixPay$Stub$a;
import android.os.Parcel;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.android.app.IRemoteServiceCallback$Stub;
import java.lang.ClassLoader;
import java.lang.Class;
import java.util.HashMap;
import java.util.Map;

public abstract class IAlixPay$Stub extends Binder implements IAlixPay	// class@000e30
{

    public void IAlixPay$Stub(){
       super();
       this.attachInterface(this, "com.alipay.android.app.IAlixPay");
    }
    public static IAlixPay asInterface(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.alipay.android.app.IAlixPay");
       if (iInterface != null && iInterface instanceof IAlixPay) {
          return iInterface;
       }
       return new IAlixPay$Stub$a(p0);
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       String str = "com.alipay.android.app.IAlixPay";
       if (p0 != 0x5f4e5446) {
          switch (p0){
              case 1:
                p1.enforceInterface(str);
                p2.writeNoException();
                p2.writeString(this.Pay(p1.readString()));
                return true;
              case 2:
                p1.enforceInterface(str);
                p2.writeNoException();
                p2.writeString(this.test());
                return true;
              case 3:
                p1.enforceInterface(str);
                this.registerCallback(IRemoteServiceCallback$Stub.asInterface(p1.readStrongBinder()));
                p2.writeNoException();
                return true;
              case 4:
                p1.enforceInterface(str);
                this.unregisterCallback(IRemoteServiceCallback$Stub.asInterface(p1.readStrongBinder()));
                p2.writeNoException();
                return true;
              case 5:
                p1.enforceInterface(str);
                p2.writeNoException();
                p2.writeString(this.prePay(p1.readString()));
                return true;
              case 6:
                p1.enforceInterface(str);
                this.deployFastConnect();
                p2.writeNoException();
                return true;
              case 7:
                p1.enforceInterface(str);
                p2.writeNoException();
                p2.writeInt(this.manager(p1.readString()));
                return true;
              case 8:
                p1.enforceInterface(str);
                p2.writeNoException();
                p2.writeInt(this.getVersion());
                return true;
              case 9:
                p1.enforceInterface(str);
                p2.writeNoException();
                p2.writeString(this.pay02(p1.readString(), p1.readHashMap(IAlixPay$Stub.class.getClassLoader())));
                return true;
              case 10:
                p1.enforceInterface(str);
                this.r03(p1.readString(), p1.readString(), p1.readHashMap(IAlixPay$Stub.class.getClassLoader()));
                return true;
              case 11:
                p1.enforceInterface(str);
                this.registerCallback03(IRemoteServiceCallback$Stub.asInterface(p1.readStrongBinder()), p1.readString(), p1.readHashMap(IAlixPay$Stub.class.getClassLoader()));
                p2.writeNoException();
                return true;
              default:
                return super.onTransact(p0, p1, p2, p3);
          }
       }else {
          p2.writeString(str);
          return true;
       }
    }
}
