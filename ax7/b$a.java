package ax7.b$a;
import ax7.b;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import ax7.b$a$a;
import android.os.IBinder;
import android.os.Parcel;
import com.k.tran.TranSService$a;

public abstract class b$a extends Binder implements b	// class@0002de
{
    public static final int a;

    public void b$a(){
       super();
       this.attachInterface(this, "com.kwai.wake.matrix.ISubService");
    }
    public static b L1(){
       return b$a$a.b;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 1) {
          if (p0 != 0x5f4e5446) {
             return super.onTransact(p0, p1, p2, p3);
          }else {
             p2.writeString("com.kwai.wake.matrix.ISubService");
             return 1;
          }
       }else {
          p1.enforceInterface("com.kwai.wake.matrix.ISubService");
          boolean b = (p1.readInt())? true: false;
          this.e0(b);
          return 1;
       }
    }
}
