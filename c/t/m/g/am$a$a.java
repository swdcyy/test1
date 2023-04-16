package c.t.m.g.am$a$a;
import c.t.m.g.am;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;

public class am$a$a implements am	// class@000bc9
{
    public IBinder a;

    public void am$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public String a(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.bun.lib.MsaIdInterface");
       this.a.transact(3, parcel, parcel1, 0);
       parcel1.readException();
       String str = parcel1.readString();
       parcel.recycle();
       parcel1.recycle();
       return str;
    }
    public IBinder asBinder(){
       return this.a;
    }
    public boolean b(){
       boolean i;
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       try{
          i = 0;
          parcel.writeInterfaceToken("com.bun.lib.MsaIdInterface");
          this.a.transact(1, parcel, parcel1, i);
          parcel1.readException();
          if (parcel1.readInt()) {
             i = true;
          }
       }catch(java.lang.Exception e0){
          parcel1.recycle();
          e0.recycle();
       }
       return i;
    }
}
