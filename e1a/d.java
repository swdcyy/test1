package e1a.d;
import com.yxcorp.gifshow.detail.model.BottomInteractionConfig;
import uw9.c;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.lang.Object;
import km8.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class d	// class@002045
{
    public static BottomInteractionConfig a;

    static {
       BottomInteractionConfig uBottomInter = BottomInteractionConfig.class;
       String str = c.a.getString("BottomInteractionConfig", "null");
       uBottomInter = (str == null || str == "")? null: b.a(str, uBottomInter);
       d.a = uBottomInter;
    }
    public void d(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (d.b() && d.a.mDanmakuEntranceHidden != null)? true: false;
       return b;
    }
    public static boolean b(){
       boolean b = (d.a != null)? true: false;
       return b;
    }
    public static int c(){
       Object obj = PatchProxy.apply(null, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (d.b()) {
          return d.a.mMarqueeHiddenType;
       }
       return 0;
    }
}
