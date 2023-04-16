package androidx.room.u$a;
import androidx.room.u;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import androidx.room.u$a$a;
import android.os.Parcel;
import androidx.room.x$a;

public abstract class u$a extends Binder implements u	// class@000972
{

    public void u$a(){
       super();
       this.attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
    }
    public static u L1(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
       if (iInterface != null && iInterface instanceof u) {
          return iInterface;
       }
       return new u$a$a(p0);
    }
    public static u M1(){
       return u$a$a.b;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 1) {
          if (p0 != 0x5f4e5446) {
             return super.onTransact(p0, p1, p2, p3);
          }
          p2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
          return 1;
       }else {
          p1.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
          this.I0(p1.createStringArray());
          return 1;
       }
    }
}
