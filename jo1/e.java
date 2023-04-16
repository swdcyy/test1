package jo1.e;
import lnc.a1;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class e	// class@002bdf
{
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;

    static {
       e.a = a1.e(80.00f);
       e.b = a1.e(22.00f);
       e.c = a1.e(20.00f);
       e.d = a1.e(0x41f00000);
    }
    public void e(){
       super();
    }
    public static float a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return ((p0.getTranslationY() - (float)e.b) - ((float)p0.getMeasuredHeight() * 0x3f000000));
    }
}
