package bk8.a$a;
import bk8.a;
import android.os.Binder;
import android.os.IBinder;
import java.lang.String;
import android.os.IInterface;
import bk8.a$a$a;

public abstract class a$a extends Binder implements a	// class@000424
{

    public static a L1(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.oppo.omedia.IOMediaService");
       if (iInterface != null && iInterface instanceof a) {
          return iInterface;
       }
       return new a$a$a(p0);
    }
}
