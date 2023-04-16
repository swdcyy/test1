package cod.b;
import pn9.c;
import java.lang.Object;
import android.view.ViewGroup;
import pn9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.view.View;
import i2b.a;
import dod.b;

public final class b implements c	// class@00034f
{

    public void b(){
       super();
    }
    public a a(ViewGroup p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d15da);
       a.o(view, "view");
       return new b(view);
    }
}
