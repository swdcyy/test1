package androidx.room.v$a;
import androidx.room.v;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import androidx.room.v$a$a;
import android.os.Parcel;
import androidx.room.MultiInstanceInvalidationService$b;
import androidx.room.u;
import androidx.room.u$a;

public abstract class v$a extends Binder implements v	// class@000975
{

    public void v$a(){
       super();
       this.attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
    public static v L1(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
       if (iInterface != null && iInterface instanceof v) {
          return iInterface;
       }
       return new v$a$a(p0);
    }
    public static v M1(){
       return v$a$a.b;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 0x5f4e5446) {
                   return super.onTransact(p0, p1, p2, p3);
                }
                p2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return 1;
             }else {
                p1.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                this.r1(p1.readInt(), p1.createStringArray());
                return 1;
             }
          }else {
             p1.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
             this.B0(u$a.L1(p1.readStrongBinder()), p1.readInt());
             p2.writeNoException();
             return 1;
          }
       }else {
          p1.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
          p2.writeNoException();
          p2.writeInt(this.x0(u$a.L1(p1.readStrongBinder()), p1.readString()));
          return 1;
       }
    }
}
