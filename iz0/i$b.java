package iz0.i$b;
import com.yxcorp.gifshow.widget.m;
import iz0.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mkc.b;
import mkc.c;
import pk1.a;

public class i$b extends m	// class@0029dd
{
    public final i c;

    public void i$b(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, "1")) {
          return;
       }
       b[] uobArray = new b[]{b.g};
       c.d(this.c.q, uobArray);
       c.h(this.c.q, b.e);
       this.c.P8(a.a());
       return;
    }
}
