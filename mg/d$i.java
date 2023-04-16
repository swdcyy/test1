package mg.d$i;
import erd.g;
import f55.g;
import android.app.Activity;
import java.lang.Object;
import qrd.l1;
import og.l;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import mg.d;
import r16.f;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import kotlin.jvm.internal.a;

public final class d$i implements g	// class@0025e3
{
    public final g b;
    public final Activity c;

    public void d$i(g p0,Activity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       Object[] objArray = new Object[0];
       l.D().w("JsEditFun", "editSmartAlbum SUCCESS", objArray);
       this.b.onSuccess(new JsErrorResult(1, null));
       x6 ox6 = y6.r(f.class);
       a.m(ox6);
       d.a.a(this.c, ox6);
    }
}
