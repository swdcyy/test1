package bg0.c;
import me0.a;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;

public final class c implements a	// class@00037b
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
       return new TaskCenterDTView(context, null, 2, null);
    }
    public String getName(){
       return "任务中心";
    }
}
