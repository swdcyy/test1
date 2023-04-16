package l1.d;
import android.os.Bundle;
import java.lang.String;
import android.os.IBinder;

public final class d	// class@0024f1
{

    public static IBinder a(Bundle p0,String p1){
       return p0.getBinder(p1);
    }
    public static void b(Bundle p0,String p1,IBinder p2){
       p0.putBinder(p1, p2);
    }
}
