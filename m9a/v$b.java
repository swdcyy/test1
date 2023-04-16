package m9a.v$b;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig$a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import p5a.b;

public final class v$b implements DetailPlayConfig$a	// class@002f98
{
    public static final v$b a;

    static {
       v$b.a = new v$b();
    }
    public void v$b(){
       super();
    }
    public final boolean a(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.f(p0);
    }
}
