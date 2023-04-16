package com.alipay.android.app.IRemoteServiceCallback$Stub;
import com.alipay.android.app.IRemoteServiceCallback;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.alipay.android.app.IRemoteServiceCallback$Stub$a;
import android.os.Parcel;
import java.lang.Class;
import java.lang.Object;
import java.lang.ClassLoader;
import java.util.HashMap;
import java.util.Map;
import android.os.Bundle;
import android.os.Parcelable$Creator;

public abstract class IRemoteServiceCallback$Stub extends Binder implements IRemoteServiceCallback	// class@000e33
{

    public void IRemoteServiceCallback$Stub(){
       super();
       this.attachInterface(this, "com.alipay.android.app.IRemoteServiceCallback");
    }
    public static IRemoteServiceCallback asInterface(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.alipay.android.app.IRemoteServiceCallback");
       if (iInterface != null && iInterface instanceof IRemoteServiceCallback) {
          return iInterface;
       }
       return new IRemoteServiceCallback$Stub$a(p0);
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       String str = "com.alipay.android.app.IRemoteServiceCallback";
       if (p0 != 0x5f4e5446) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 != 3) {
                   if (p0 != 4) {
                      if (p0 != 5) {
                         return super.onTransact(p0, p1, p2, p3);
                      }else {
                         p1.enforceInterface(str);
                         this.r03(p1.readString(), p1.readString(), p1.readHashMap(this.getClass().getClassLoader()));
                         return 1;
                      }
                   }else {
                      p1.enforceInterface(str);
                      p2.writeNoException();
                      p2.writeInt(this.getVersion());
                      return 1;
                   }
                }else {
                   p1.enforceInterface(str);
                   p2.writeNoException();
                   p2.writeInt(this.isHideLoadingScreen());
                   return 1;
                }
             }else {
                p1.enforceInterface(str);
                boolean b = (p1.readInt())? true: false;
                this.payEnd(b, p1.readString());
                p2.writeNoException();
                return 1;
             }
          }else {
             p1.enforceInterface(str);
             String str1 = p1.readString();
             String str2 = p1.readString();
             int i = p1.readInt();
             Bundle uBundle = (p1.readInt())? Bundle.CREATOR.createFromParcel(p1): null;
             this.startActivity(str1, str2, i, uBundle);
             p2.writeNoException();
             return 1;
          }
       }else {
          p2.writeString(str);
          return 1;
       }
    }
}
