package df0.c;
import me0.a;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.task.debugtool.TaskPendantDTView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;

public final class c implements a	// class@001f88
{

    public void c(){
       super();
    }
    public View b(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       Context context = p0.getContext();
       a.o(context, "parent.context");
       return new TaskPendantDTView(context, null, 2, null);
    }
    public String getName(){
       return "ÈÎÎñ¹Ò¼þ";
    }
}
