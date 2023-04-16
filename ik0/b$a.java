package ik0.b$a;
import ik0.b;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class b$a	// class@00290b
{

    public static View a(b p0,ViewGroup p1,View p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, null, b$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "parent");
       return p2;
    }
    public static View b(b p0,ViewGroup p1,View p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, null, b$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "parent");
       return p2;
    }
}
