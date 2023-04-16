package mg.d$k;
import erd.g;
import android.app.Activity;
import com.kwai.feature.post.api.mediascene.MediaSceneInitParams;
import f55.g;
import java.lang.Object;
import y36.b;
import mg.d;
import r16.f;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import java.lang.String;

public final class d$k implements g	// class@0025e5
{
    public final Activity b;
    public final MediaSceneInitParams c;
    public final g d;

    public void d$k(Activity p0,MediaSceneInitParams p1,g p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       p0.JQ(this.b, this.c);
       x6 ox6 = y6.r(f.class);
       a.m(ox6);
       d.a.a(this.b, ox6);
       this.d.onSuccess(new JsErrorResult(1, null));
    }
}
