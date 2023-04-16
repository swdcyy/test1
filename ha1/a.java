package ha1.a;
import com.kuaishou.live.viewcontroller.ViewController;
import android.content.Context;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ha1.b;

public final class a	// class@002660
{

    public static final View a(ViewController p0,Context p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$inflateView");
       a.p(p1, "context");
       View view = b.b(p1, p2);
       a.o(view, "LiteLayoutInflater.inflate\(context, layoutRes\)");
       return view;
    }
}
