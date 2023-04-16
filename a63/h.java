package a63.h;
import erd.o;
import android.net.Uri;
import java.lang.Object;
import zq8.a;
import java.lang.Boolean;
import brd.t;
import brd.w;
import com.kuaishou.live.gzone.v2.imagepreview.n;

public final class h implements o	// class@000058
{
    public final Uri b;
    public final boolean c;

    public void h(Uri p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       h tb = this.b;
       h tc = this.c;
       p0 = (p0.b == null)? t.just(Boolean.FALSE): n.Y8(tb, tc);
       return p0;
    }
}
