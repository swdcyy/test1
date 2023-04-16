package dca.a$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class a$b implements g	// class@001eeb
{
    public static final a$b b;

    static {
       a$b.b = new a$b();
    }
    public void a$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          PostUtils.D("AICutStyleLoadingViewBinder", "interval", p0);
       }
       return;
    }
}
