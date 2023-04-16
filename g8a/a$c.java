package g8a.a$c;
import erd.g;
import g8a.a;
import java.lang.Object;
import d0a.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;

public final class a$c implements g	// class@00240b
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          a$c tb = this.b;
          if (tb.w != null) {
             if (p0.a == 1) {
                p0 = tb.t;
                int i = 0;
                if (p0 != null) {
                   p0.setVisibility(i);
                }
                a.P8(this.b).setVisibility(i);
                p0 = this.b;
                a v = p0.v;
                if (v != null) {
                   i = v.getCurrentPosition();
                }
                p0.R8((i + 1));
             }else {
                p0 = tb.t;
                if (p0 != null) {
                   p0.setVisibility(4);
                }
                a.P8(this.b).setVisibility(8);
             }
          }
       }
       return;
    }
}
