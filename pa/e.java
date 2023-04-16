package pa.e;
import x49.q;
import java.lang.Object;
import java.lang.Exception;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import yx.j0;

public final class e implements q	// class@0028f9
{
    public final q a;

    public void e(q p0){
       this.a = p0;
       super();
    }
    public void a(Exception p0){
       a.p(p0, "e");
       j0.b("AdTKBannerView", "template render failed : ", p0);
       e ta = this.a;
       if (ta != null) {
          ta.a(p0);
       }
       return;
    }
    public void b(){
       Object[] objArray = new Object[0];
       j0.f("AdTKBannerView", "template render success", objArray);
       e ta = this.a;
       if (ta != null) {
          ta.b();
       }
       return;
    }
}
