package d0b.c$a;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.resource.Category;
import boc.b;
import com.yxcorp.gifshow.util.resource.n;

public final class c$a implements g	// class@00240b
{
    public static final c$a b;

    static {
       c$a.b = new c$a();
    }
    public void c$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
       }else {
          a.o(p0, "isNeedDownload");
          if (p0.booleanValue()) {
             n.l(Category.SCREENCAST_PATCH);
          }
       }
       return;
    }
}
