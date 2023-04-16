package c.t.m.g.ah$a;
import c.t.m.g.ah;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import java.lang.Throwable;
import c.t.m.g.bt;

public final class ah$a implements ah	// class@000bbc
{
    public IBinder a;

    public void ah$a(IBinder p0){
       super();
       this.a = p0;
    }
    public String a(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
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
          parcel.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
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
