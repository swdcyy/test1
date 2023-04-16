package mg.t0;
import erd.g;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusParams;
import f55.g;
import java.lang.Object;
import r16.f;
import pm6.e;
import com.feature.post.bridge.k;
import java.util.List;
import pm6.e$b;

public final class t0 implements g	// class@002661
{
    public final Activity b;
    public final JsVideoUploadStatusParams c;
    public final g d;

    public void t0(Activity p0,JsVideoUploadStatusParams p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       e.b(e.a, new k(p0, this.b, this.c, this.d));
    }
}
