package cxa.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Application;
import o56.a;
import android.media.AudioManager;

public class a	// class@0023f3
{

    public void a(){
       super();
    }
    public static boolean a(){
       AudioManager obj = PatchProxy.apply(null, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.b().getSystemService("audio");
       boolean b = (obj != null && obj.getRingerMode() == 2)? true: false;
       return b;
    }
    public static boolean b(){
       AudioManager obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.b().getSystemService("audio");
       boolean b = (obj != null && !obj.getRingerMode())? true: false;
       return b;
    }
}
