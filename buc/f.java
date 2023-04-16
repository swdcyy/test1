package buc.f;
import androidx.lifecycle.ViewModel;
import buc.f$b;
import nsd.u;
import buc.f$a;
import java.util.LinkedHashSet;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import buc.f$c;
import java.util.Comparator;

public final class f extends ViewModel	// class@000495
{
    public Set a;
    public static final f$a b;
    public static final f$b c;

    static {
       f.c = new f$b(null);
       f.b = new f$a();
    }
    public void f(){
       super();
       this.a = new LinkedHashSet();
    }
    public final List o0(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CollectionsKt___CollectionsKt.f5(CollectionsKt___CollectionsKt.G5(this.a), new f$c());
    }
}
