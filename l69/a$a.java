package l69.a$a;
import erd.o;
import java.lang.Object;
import i69.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.io.File;

public final class a$a implements o	// class@002c8e
{
    public static final a$a b;

    static {
       a$a.b = new a$a();
    }
    public void a$a(){
       super();
    }
    public Object apply(Object p0){
       Pair pair = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          Integer integer = Integer.valueOf(p0.b());
          p0 = p0.c();
          if (p0 != null) {
             p0 = p0.getAbsolutePath();
             if (p0 != null) {
             label_002f :
                pair = new Pair(integer, p0);
             }
          }
          p0 = "";
          goto label_002f ;
       }
       return pair;
    }
}
