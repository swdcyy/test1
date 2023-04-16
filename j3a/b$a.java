package j3a.b$a;
import j3a.b;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class b$a	// class@0028f8
{

    public static View a(b p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "parent");
       View view = p0.d(p1);
       p0.k(view);
       return view;
    }
}
