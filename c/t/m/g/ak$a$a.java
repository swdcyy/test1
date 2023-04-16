package c.t.m.g.ak$a$a;
import c.t.m.g.ak;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import java.lang.Throwable;
import c.t.m.g.bt;

public class ak$a$a implements ak	// class@000bc3
{
    public IBinder a;

    public void ak$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public String a(String p0,String p1,String p2){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       try{
          parcel.writeInterfaceToken("com.heytap.openid.IOpenID");
          parcel.writeString(p0);
          parcel.writeString(p1);
          parcel.writeString(p2);
          this.a.transact(1, parcel, parcel1, 0);
          parcel1.readException();
          p0 = parcel1.readString();
          parcel.recycle();
          parcel1.recycle();
       }catch(java.lang.Exception e4){
          bt.a("OnePlusIDInterface", "getID", e4);
          parcel.recycle();
          parcel1.recycle();
          p0 = null;
       }
       return p0;
    }
    public IBinder asBinder(){
       return this.a;
    }
}
