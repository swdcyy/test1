package com.alipay.android.app.IAlixPay$Stub$a;
import com.alipay.android.app.IAlixPay;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import java.util.Map;
import com.alipay.android.app.IRemoteServiceCallback;
import android.os.IInterface;

public class IAlixPay$Stub$a implements IAlixPay	// class@000e2f
{
    public IBinder a;

    public void IAlixPay$Stub$a(IBinder p0){
       super();
       this.a = p0;
    }
    public String Pay(String p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
       parcel.writeString(p0);
       this.a.transact(1, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readString();
    }
    public String a(){
       return "com.alipay.android.app.IAlixPay";
    }
    public IBinder asBinder(){
       return this.a;
    }
    public void deployFastConnect(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
       this.a.transact(6, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public int getVersion(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
       this.a.transact(8, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readInt();
    }
    public boolean manager(String p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
       parcel.writeString(p0);
       int i = 0;
       this.a.transact(7, parcel, parcel1, i);
       parcel1.readException();
       if (parcel1.readInt()) {
          i = true;
       }
       parcel1.recycle();
       parcel.recycle();
       return i;
    }
    public String pay02(String p0,Map p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
       parcel.writeString(p0);
       parcel.writeMap(p1);
       this.a.transact(9, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readString();
    }
    public String prePay(String p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
       parcel.writeString(p0);
       this.a.transact(5, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readString();
    }
    public void r03(String p0,String p1,Map p2){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
       parcel.writeString(p0);
       parcel.writeString(p1);
       parcel.writeMap(p2);
       this.a.transact(10, parcel, null, 1);
       parcel.recycle();
    }
    public void registerCallback(IRemoteServiceCallback p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       this.a.transact(3, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public void registerCallback03(IRemoteServiceCallback p0,String p1,Map p2){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       parcel.writeString(p1);
       parcel.writeMap(p2);
       this.a.transact(11, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public String test(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
       this.a.transact(2, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readString();
    }
    public void unregisterCallback(IRemoteServiceCallback p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.alipay.android.app.IAlixPay");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       this.a.transact(4, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
}
