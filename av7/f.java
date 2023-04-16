package av7.f;
import java.lang.Object;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import av7.e;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import brd.a0;
import com.yxcorp.utility.TextUtils;
import brd.w;
import com.kwai.component.fansgroup.chat.a;
import erd.o;
import av7.d;
import erd.r;

public class f	// class@000385
{

    public void f(){
       super();
    }
    public static t a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(new e(p0)).subscribeOn(d.c).observeOn(d.a);
    }
    public static a0 b(String p0,t[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.concatArray(p1).onErrorReturn(a.b).filter(d.b).first(TextUtils.I(p0));
    }
}
