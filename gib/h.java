package gib.h;
import erd.g;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.beauty.IMBeautifyResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gib.c;

public final class h implements g	// class@002af4
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          c.b = p0;
          c.c.d(p0);
       }
       return;
    }
}
