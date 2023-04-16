package android.support.v4.app.a$a;
import android.support.v4.app.a;
import android.os.Binder;
import android.os.IBinder;
import java.lang.String;
import android.os.IInterface;
import android.support.v4.app.a$a$a;

public abstract class a$a extends Binder implements a	// class@0003b1
{

    public static a L1(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
       if (iInterface != null && iInterface instanceof a) {
          return iInterface;
       }
       return new a$a$a(p0);
    }
    public static a M1(){
       return a$a$a.b;
    }
}
