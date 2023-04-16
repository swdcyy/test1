package mg.i;
import erd.g;
import f55.g;
import java.lang.Object;
import l26.f;
import og.l;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;

public final class i implements g	// class@00260f
{
    public final g b;

    public void i(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray = new Object[0];
       l.D().w("YearAlbum2022", "preloadYearAlbumResource load plugin succeed", objArray);
       p0.ng();
       this.b.onSuccess(new JsErrorResult(1, null));
    }
}
