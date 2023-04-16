package c.t.m.g.aj$a$a;
import c.t.m.g.aj;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import java.lang.Throwable;
import c.t.m.g.bt;

public class aj$a$a implements aj	// class@000bc0
{
    public IBinder a;

    public void aj$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public String a(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       try{
          parcel.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
          this.a.transact(1, parcel, parcel1, 0);
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return parcel1.readString();
       }catch(java.lang.Exception e2){
          bt.a("LenovoIDInterface", "a", e2);
          parcel1.recycle();
          parcel.recycle();
          return null;
       }
    }
    public String a(String p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       try{
          parcel.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
          this.a.transact(4, parcel, parcel1, 0);
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return parcel1.readString();
       }catch(java.lang.Exception e1){
          bt.a("LenovoIDInterface", "a", e1);
          parcel1.recycle();
          parcel.recycle();
          return null;
       }
    }
    public IBinder asBinder(){
       return null;
    }
    public String b(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       try{
          parcel.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
          this.a.transact(2, parcel, parcel1, 0);
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return parcel1.readString();
       }catch(java.lang.Exception e2){
          bt.a("LenovoIDInterface", "b", e2);
          parcel1.recycle();
          parcel.recycle();
          return null;
       }
    }
    public String b(String p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       try{
          parcel.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
          this.a.transact(5, parcel, parcel1, 0);
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return parcel1.readString();
       }catch(java.lang.Exception e1){
          bt.a("LenovoIDInterface", "b", e1);
          parcel1.recycle();
          parcel.recycle();
          return null;
       }
    }
    public boolean c(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       int i = 0;
       parcel.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
       this.a.transact(3, parcel, parcel1, i);
       parcel1.readException();
       if (parcel1.readInt()) {
          i = true;
       }
       parcel1.recycle();
       parcel.recycle();
       return i;
    }
}
