package pa.k;
import x49.q;
import pa.j;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Object;
import java.lang.Exception;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yx.j0;
import ql9.e$c;
import android.view.View;

public final class k implements q	// class@002904
{
    public final j a;
    public final PhotoAdvertisement b;

    public void k(j p0,PhotoAdvertisement p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(Exception p0){
       a.p(p0, "e");
       Object[] objArray = new Object[0];
       j0.c("KsBannerAdControl", "renderFail "+p0.getMessage(), objArray);
       j b = this.a.b;
       if (b != null) {
          String message = p0.getMessage();
          if (message == null) {
             message = "";
          }
          b.onError(-2, message);
       }
       this.a.b();
       return;
    }
    public void b(){
       Object[] objArray = new Object[0];
       j0.c("KsBannerAdControl", "onRenderSuccess ", objArray);
       k ta = this.a;
       j b = ta.b;
       if (b != null) {
          b.a(ta.d);
       }
       return;
    }
}
