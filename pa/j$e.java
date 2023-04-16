package pa.j$e;
import erd.g;
import pa.j;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import yx.j0;
import java.lang.StringBuilder;
import ql9.e$c;

public final class j$e implements g	// class@002902
{
    public final j b;

    public void j$e(j p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray = new Object[0];
       j0.c("KsBannerAdControl", "request timeout", objArray);
       j b = this.b.b;
       if (b != null) {
          b.onError(-1, "request has error "+p0);
       }
       this.b.b();
       return;
    }
}
