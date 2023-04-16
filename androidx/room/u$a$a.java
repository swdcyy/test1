package androidx.room.u$a$a;
import androidx.room.u;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import androidx.room.u$a;

public class u$a$a implements u	// class@000971
{
    public IBinder a;
    public static u b;

    public void u$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public void I0(String[] p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
       parcel.writeStringArray(p0);
       if (!this.a.transact(1, parcel, null, 1) && u$a.M1() != null) {
          u$a.M1().I0(p0);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public IBinder asBinder(){
       return this.a;
    }
}
