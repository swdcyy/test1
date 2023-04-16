package og.v0;
import erd.g;
import com.feature.post.bridge.jsmodel.JsUploadVideoParams;
import og.b1;
import java.lang.Object;
import w26.c;
import r16.f;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import pm6.e;
import og.z0;
import java.util.List;
import pm6.e$b;

public final class v0 implements g	// class@0027c6
{
    public final JsUploadVideoParams b;
    public final b1 c;

    public void v0(JsUploadVideoParams p0,b1 p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       v0 tb = this.b;
       e.b(e.a, new z0(tb, y6.r(f.class), this.c, p0));
    }
}
