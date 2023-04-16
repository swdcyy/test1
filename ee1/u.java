package ee1.u;
import ok.h;
import ee1.i0;
import android.graphics.Bitmap;
import java.lang.Object;
import wv4.d1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ee1.y;
import java.lang.Number;
import wv4.f1;
import wv4.a;
import tv4.a;
import java.lang.Integer;

public final class u implements h	// class@002123
{
    public final i0 b;
    public final Bitmap c;

    public void u(i0 p0,Bitmap p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       int i;
       u tb = this.b;
       u tc = this.c;
       Objects.requireNonNull(tb);
       String str = PatchProxy.apply(null, tb, i0.class, "44");
       if (str != PatchProxyResult.class) {
       }else {
          str = tb.To(tb.d, y.b, "");
       }
       Objects.requireNonNull(p0);
       Object obj = PatchProxy.applyTwoRefs(str, tc, p0, d1.class, "33");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          p0 = p0.h;
          Objects.requireNonNull(p0);
          obj = PatchProxy.applyTwoRefs(str, tc, p0, f1.class, "27");
          i = (obj != PatchProxyResult.class)? obj.intValue(): p0.a.c(str, tc);
       }
       return Integer.valueOf(i);
    }
}
