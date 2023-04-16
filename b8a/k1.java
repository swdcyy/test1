package b8a.k1;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import kotlin.text.StringsKt__StringsKt;

public final class k1	// class@0003ba
{
    public static final k1 a;

    static {
       k1.a = new k1();
    }
    public void k1(){
       super();
    }
    public static final boolean a(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!TextUtils.x(p0) && (!a.g("бн", p0) && !a.g("...", p0))) {
          a.m(p0);
          int i = (!StringsKt__StringsKt.o5(p0).length())? 1: 0;
          if (!i) {
             b = false;
          }
       }
    label_0040 :
       return b;
    }
}
