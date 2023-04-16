package f21.b$a;
import java.lang.Runnable;
import f21.b;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f21.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class b$a implements Runnable	// class@002295
{
    public final b b;
    public final List c;

    public void b$a(b p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b b = this.b.b;
       if (b != null) {
          b$a tc = this.c;
          if (!PatchProxy.applyVoidOneRefs(tc, b, d.class, "7")) {
             a.p(tc, "cdnUrls");
             d n = b.n;
             if (n == null) {
                a.S("giftImageView");
             }
             n.P(tc);
          }
       }
       return;
    }
}
