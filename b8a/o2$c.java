package b8a.o2$c;
import erd.g;
import b8a.o2;
import java.lang.Object;
import rd5.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public final class o2$c implements g	// class@0003d3
{
    public final o2 b;

    public void o2$c(o2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, o2$c.class, "1")) {
       }else {
          TextView textView = o2.P8(this.b);
          p0 = (p0.b != null)? this.b.A: 8;
          textView.setVisibility(p0);
       }
       return;
    }
}
