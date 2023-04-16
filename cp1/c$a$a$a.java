package cp1.c$a$a$a;
import d03.a;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.magiceffect.LiveMagicEffectUtil;
import wg3.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.util.HashMap;

public final class c$a$a$a implements a	// class@001e1e
{

    public void c$a$a$a(){
       super();
    }
    public Map get(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, this, c$a$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveMagicEffectUtil.a;
       String str = a.a.getString("liveEffectMap", "{}");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       if (objArray == null) {
          objArray = new HashMap();
       }
       return objArray;
    }
}
