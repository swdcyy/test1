package ck5.k;
import erd.o;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bk5.g;
import kotlin.jvm.internal.a;

public final class k implements o	// class@0006dd
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public Object apply(Object p0){
       g og = PatchProxy.applyOneRefs(p0, this, k.class, "1");
       if (og != PatchProxyResult.class) {
       }else {
          a.p(p0, "result");
          og = new g(1, p0);
       }
       return og;
    }
}
