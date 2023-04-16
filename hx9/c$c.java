package hx9.c$c;
import erd.o;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class c$c implements o	// class@002726
{
    public static final c$c b;

    static {
       c$c.b = new c$c();
    }
    public void c$c(){
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, c$c.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "meta");
          integer = Integer.valueOf(p0.mLikeCount);
       }
       return integer;
    }
}
