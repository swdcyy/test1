package ed2.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.graphics.drawable.Drawable;
import lnc.a1;

public class g	// class@002701
{
    public static boolean a;

    public void g(){
       super();
    }
    public static void a(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, og, "2")) {
          return;
       }
       a1.f(p0);
       return;
    }
}
