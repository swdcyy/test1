package mg.g;
import erd.g;
import android.app.Activity;
import l26.d;
import f55.g;
import java.lang.Object;
import l26.f;
import og.l;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;

public final class g implements g	// class@002603
{
    public final Activity b;
    public final d c;
    public final g d;

    public void g(Activity p0,d p1,g p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       Object[] objArray = new Object[0];
       l.D().w("YearAlbum2022", "launchYearAlbum2022 load plugin succeed", objArray);
       p0.eA(this.b, this.c);
       this.d.onSuccess(new JsErrorResult(1, null));
    }
}
