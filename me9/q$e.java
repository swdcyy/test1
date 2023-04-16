package me9.q$e;
import erd.o;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class q$e implements o	// class@003010
{
    public static final q$e b;

    static {
       q$e.b = new q$e();
    }
    public void q$e(){
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, q$e.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          integer = Integer.valueOf((((p0.intValue() * 10) / 100) + 90));
       }
       return integer;
    }
}
