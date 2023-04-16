package ga9.b$a;
import ga9.b;
import ec7.a;
import java.util.List;
import androidx.lifecycle.ViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public final class b$a	// class@00245d
{

    public static void a(b p0,a p1,int p2,List p3,ViewModel p4){
       if (PatchProxy.isSupport(b$a.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, b$a.class, "2")) {
             return;
          }
       }
       a.q(p1, "adapter");
       a.q(p3, "payloads");
       return;
    }
    public static void b(b p0,RecyclerView$ViewHolder p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b$a.class, "1")) {
          return;
       }
       a.q(p1, "viewHolder");
       return;
    }
}
