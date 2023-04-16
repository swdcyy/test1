package c.t.m.g.ak$a;
import c.t.m.g.ak;
import android.os.Binder;
import android.os.IBinder;
import java.lang.String;
import android.os.IInterface;
import c.t.m.g.ak$a$a;

public abstract class ak$a extends Binder implements ak	// class@000bc4
{

    public static ak a(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.heytap.openid.IOpenID");
       if (iInterface == null || !iInterface instanceof ak) {
          return new ak$a$a(p0);
       }
       return iInterface;
    }
}
