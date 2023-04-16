package l5a.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import uw9.c;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;

public class a	// class@002d4c
{
    public static int a = 3;

    public void a(){
       super();
    }
    public static int a(){
       Object obj = PatchProxy.apply(null, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return c.a.getInt(b.d("user")+"shareTaskBubbleShowTimes", 0);
    }
}
