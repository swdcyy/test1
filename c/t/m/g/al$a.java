package c.t.m.g.al$a;
import c.t.m.g.al;
import android.os.Binder;
import android.os.IBinder;
import java.lang.String;
import android.os.IInterface;
import c.t.m.g.al$a$a;

public abstract class al$a extends Binder implements al	// class@000bc7
{

    public static al a(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.heytap.openid.IOpenID");
       if (iInterface == null || !iInterface instanceof al) {
          return new al$a$a(p0);
       }
       return iInterface;
    }
}
