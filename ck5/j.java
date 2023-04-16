package ck5.j;
import erd.o;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bk5.g;
import kotlin.jvm.internal.a;

public final class j implements o	// class@0006dc
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public Object apply(Object p0){
       g og = PatchProxy.applyOneRefs(p0, this, j.class, "1");
       if (og != PatchProxyResult.class) {
       }else {
          a.p(p0, "result");
          og = new g(2, p0);
       }
       return og;
    }
}
