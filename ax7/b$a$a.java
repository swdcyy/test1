package ax7.b$a$a;
import ax7.b;
import android.os.IBinder;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import ax7.b$a;

public class b$a$a implements b	// class@0002dd
{
    public IBinder a;
    public static b b;

    public void b$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public IBinder asBinder(){
       return this.a;
    }
    public void e0(boolean p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("com.kwai.wake.matrix.ISubService");
       int i = 1;
       int i1 = (p0)? 1: 0;
       parcel.writeInt(i1);
       if (!this.a.transact(i, parcel, null, i) && b$a.L1() != null) {
          b$a.L1().e0(p0);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
}
