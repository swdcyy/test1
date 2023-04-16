package com.coloros.gamespace.gamesdk.IHyperBoostService$a$a;
import com.coloros.gamespace.gamesdk.IHyperBoostService;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import com.coloros.gamespace.gamesdk.IHyperBoostService$a;

public final class IHyperBoostService$a$a implements IHyperBoostService	// class@000f75
{
    public IBinder b;
    public static IHyperBoostService a;

    public void IHyperBoostService$a$a(IBinder p0){
       super();
       this.b = p0;
    }
    public final IBinder asBinder(){
       return this.b;
    }
    public final void generalSignal(String p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.coloros.gamespace.gamesdk.IHyperBoostService");
       parcel.writeString(p0);
       if (!this.b.transact(4, parcel, parcel1, 0) && IHyperBoostService$a.a() != null) {
          IHyperBoostService$a.a().generalSignal(p0);
       }else {
          parcel1.readException();
       }
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public final String getVersion(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.coloros.gamespace.gamesdk.IHyperBoostService");
       if (!this.b.transact(3, parcel, parcel1, 0) && IHyperBoostService$a.a() != null) {
          parcel1.recycle();
          parcel.recycle();
          return IHyperBoostService$a.a().getVersion();
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return parcel1.readString();
       }
    }
    public final boolean initHyperBoost(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.coloros.gamespace.gamesdk.IHyperBoostService");
       int i = 0;
       if (!this.b.transact(1, parcel, parcel1, i) && IHyperBoostService$a.a() != null) {
          parcel1.recycle();
          parcel.recycle();
          return IHyperBoostService$a.a().initHyperBoost();
       }else {
          parcel1.readException();
          if (parcel1.readInt()) {
             i = true;
          }
          parcel1.recycle();
          parcel.recycle();
          return i;
       }
    }
    public final boolean registerClient(IBinder p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.coloros.gamespace.gamesdk.IHyperBoostService");
       parcel.writeStrongBinder(p0);
       int i = 0;
       if (!this.b.transact(2, parcel, parcel1, i) && IHyperBoostService$a.a() != null) {
          parcel1.recycle();
          parcel.recycle();
          return IHyperBoostService$a.a().registerClient(p0);
       }else {
          parcel1.readException();
          if (parcel1.readInt()) {
             i = true;
          }
          parcel1.recycle();
          parcel.recycle();
          return i;
       }
    }
    public final void registerNotifier(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.coloros.gamespace.gamesdk.IHyperBoostService");
       if (!this.b.transact(5, parcel, parcel1, 0) && IHyperBoostService$a.a() != null) {
          IHyperBoostService$a.a().registerNotifier();
       }else {
          parcel1.readException();
       }
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public final void vibrate(int p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.coloros.gamespace.gamesdk.IHyperBoostService");
       parcel.writeInt(p0);
       if (!this.b.transact(6, parcel, parcel1, 0) && IHyperBoostService$a.a() != null) {
          IHyperBoostService$a.a().vibrate(p0);
       }else {
          parcel1.readException();
       }
       parcel1.recycle();
       parcel.recycle();
       return;
    }
}
