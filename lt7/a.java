package lt7.a;
import ta6.j;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;

public final class a implements j	// class@001dfc
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(Map p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, str)) {
          return;
       }
       a.o(p0, "it");
       if (!HoldoutConfigUtilKt.a()) {
          str = "0";
       }
       p0.put("slh", str);
       return;
    }
}
