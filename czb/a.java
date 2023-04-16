package czb.a;
import j36.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import j36.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import j36.g;
import j36.d$b;
import java.util.Map;
import j36.d$c;
import java.lang.ref.WeakReference;
import czb.b;
import java.util.HashSet;

public final class a implements e	// class@00209e
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(String p0,int p1,int p2){
       Object obj;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "1")) {
          return;
       }
       if (p2 != 2) {
          return;
       }
       d uod = d.c();
       Objects.requireNonNull(uod);
       d uod1 = d.class;
       if (PatchProxy.isSupport(uod1)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), uod, uod1, "10");
          if (obj != PatchProxyResult.class) {
          }else {
          label_0041 :
             d$c uoc = uod.a.get(new d$b(p0, p1));
             obj = (uoc == null)? null: uoc.a.get();
          }
       }else {
          goto label_0041 ;
       }
       if (obj != null) {
          p0 = obj.E7();
          if (p0 != null) {
             b.b.add(p0);
          }
       }
       return;
    }
}
