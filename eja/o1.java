package eja.o1;
import erd.o;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class o1 implements o	// class@0026e6
{
    public static final o1 b;

    static {
       o1.b = new o1();
    }
    public void o1(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, o1.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "obj");
          uBoolean = Boolean.valueOf(p0.isLiked());
       }
       return uBoolean;
    }
}
