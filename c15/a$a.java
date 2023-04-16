package c15.a$a;
import c15.a;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import c15.a$a$a;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class a$a	// class@0003fd
{

    public static List a(a p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "tag");
       a[] uoaArray = new a[]{p0,new a$a$a(p1)};
       return CollectionsKt__CollectionsKt.L(uoaArray);
    }
}
