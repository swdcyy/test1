package l99.a;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import m99.f;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.d;
import l99.a$a;
import androidx.recyclerview.widget.RecyclerView$r;

public final class a	// class@002cd4
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final void a(RecyclerView p0){
       a a;
       a uoa = a.class;
       RecyclerView$Adapter uAdapter = null;
       if (PatchProxy.applyVoidOneRefs(p0, uAdapter, uoa, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       a = a.a;
       Objects.requireNonNull(a);
       RecyclerView$Adapter obj = PatchProxy.applyOneRefs(p0, a, uoa, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.getAdapter();
          if (!obj instanceof d) {
             obj = uAdapter;
          }
          obj = (obj != null)? obj.a1(): uAdapter;
          if (obj instanceof f) {
             uAdapter = obj;
          }
          obj = uAdapter;
       }
       if (obj != null) {
          obj.t1(true);
          p0.addOnScrollListener(new a$a(obj));
       }
       return;
    }
}
