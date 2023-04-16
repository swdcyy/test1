package a6a.a$c;
import java.util.function.Predicate;
import a6a.a;
import java.lang.Object;
import com.yxcorp.gifshow.model.ContactTargetItem;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.ArrayList;

public final class a$c implements Predicate	// class@00003e
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a$c.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (this.a.p.contains(p0) && this.a.V1(p0.mSection))? true: false;
       }
       return b;
    }
}
