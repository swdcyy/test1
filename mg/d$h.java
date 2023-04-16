package mg.d$h;
import erd.o;
import com.kwai.feature.post.api.feature.bridge.JsEditSmartAlbumParams;
import android.app.Activity;
import java.lang.Object;
import z26.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class d$h implements o	// class@0025e2
{
    public final JsEditSmartAlbumParams b;
    public final Activity c;

    public void d$h(JsEditSmartAlbumParams p0,Activity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Object obj = p0;
       a.p(obj, "it");
       p0 = this.b;
       obj.Zv(p0.mIdentifier, this.c, (p0.mIsReturnToWeb ^ 0x01), null, null);
       return l1.a;
    }
}
