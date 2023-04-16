package ofd.a;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import androidx.fragment.app.Fragment;
import joc.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import joc.l;
import com.yxcorp.gifshow.util.c;
import ofd.a$a;
import joc.o;
import joc.z;
import ofd.b;

public class a	// class@001f15
{

    public void a(){
       super();
    }
    public static n a(Activity p0,SwipeLayout p1,Fragment p2){
       n obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new n(p1);
       obj.E().m(new c(p0));
       obj.D(new a$a(p0, p1, p2));
       p1.c(obj);
       p1.c(new b(p1));
       return obj;
    }
}
