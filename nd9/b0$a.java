package nd9.b0$a;
import java.lang.Runnable;
import nd9.b0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nd9.z;
import android.view.View;
import kotlin.jvm.internal.a;
import nd9.y;
import java.util.Objects;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.bubble.a$c;
import com.yxcorp.gifshow.magic.data.repo.response.MusicRecommendMagicInfo;
import j8c.a;
import q87.c;

public final class b0$a implements Runnable	// class@003132
{
    public final b0 b;

    public void b0$a(b0 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b0$a.class, "1")) {
          return;
       }
       z r = this.b.b.r;
       if (r != null && !r.getVisibility()) {
          b0 b = this.b.b;
          z r1 = b.r;
          a.m(r1);
          Objects.requireNonNull(y.o);
          b.v = a$c.f0(r1, y.m);
          b = this.b.b;
          r1 = b.y;
          if (r1 != null) {
             b.l2(r1);
             Object[] objArray = new Object[0];
             a.D().w(this.b.b.o, " anchor calculated, show blocked bubble", objArray);
          }
       }
       return;
    }
}
