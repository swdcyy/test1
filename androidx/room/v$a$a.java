package androidx.room.v$a$a;
import androidx.room.v;
import android.os.IBinder;
import java.lang.Object;
import androidx.room.u;
import android.os.Parcel;
import java.lang.String;
import android.os.IInterface;
import androidx.room.v$a;

public class v$a$a implements v	// class@000974
{
    public IBinder a;
    public static v b;

    public void v$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public void B0(u p0,int p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       parcel.writeInt(p1);
       if (!this.a.transact(2, parcel, parcel1, 0) && v$a.M1() != null) {
          v$a.M1().B0(p0, p1);
          parcel1.recycle();
          parcel.recycle();
          return;
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return;
       }
    }
    public IBinder asBinder(){
       return this.a;
    }
    public void r1(int p0,String[] p1){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
       parcel.writeInt(p0);
       parcel.writeStringArray(p1);
       if (!this.a.transact(3, parcel, null, 1) && v$a.M1() != null) {
          v$a.M1().r1(p0, p1);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public int x0(u p0,String p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       parcel.writeString(p1);
       if (!this.a.transact(1, parcel, parcel1, 0) && v$a.M1() != null) {
          parcel1.recycle();
          parcel.recycle();
          return v$a.M1().x0(p0, p1);
       }else {
          parcel1.readException();
          parcel1.recycle();
          parcel.recycle();
          return parcel1.readInt();
       }
    }
}
