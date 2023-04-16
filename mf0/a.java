package mf0.a;
import pc0.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.growth.pendant.viewmodel.PendantStatusVM;
import com.kuaishou.growth.pendant.viewmodel.PendantStatusVM$a;
import bc0.a$b;
import bc0.a;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import zsd.u;
import java.lang.StringBuilder;

public final class a	// class@00315c
{

    public static final b a(){
       Object obj = PatchProxy.apply(null, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x17b78eb3);
       a.o(obj, "Singleton.get\(PendantApiV2::class.java\)");
       return obj;
    }
    public static final PendantStatusVM b(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$getPendantStatusVM");
       return PendantStatusVM.Companion.a(p0);
    }
    public static final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       a.p(p0, "message");
       Object[] objArray = new Object[0];
       a$b.a.C(p0, objArray);
       return;
    }
    public static final int d(String p0,String p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p1, "defaultColor");
       boolean b = false;
       String str = (p0 == null || !p0.length())? 1: null;
       if (str) {
          i = TextUtils.J(p1, -1);
       }else if(u.q2(p0, "#", b, 2, null)){
          i = TextUtils.J(p0, -1);
       }else {
          i = TextUtils.J('#'+p0, -1);
       }
       return i;
    }
}
