package eja.c;
import erd.o;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class c implements o	// class@0026b9
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "obj");
          uBoolean = Boolean.valueOf(p0.isLiked());
       }
       return uBoolean;
    }
}
