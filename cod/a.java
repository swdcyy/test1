package cod.a;
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
import dod.a;

public final class a implements c	// class@00034e
{

    public void a(){
       super();
    }
    public a a(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d15d9);
       a.o(view, "view");
       return new a(view);
    }
}
