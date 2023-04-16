package d5c.h;
import erd.g;
import d5c.g0;
import java.lang.Object;
import java.util.Map;
import android.widget.ImageView;

public final class h implements g	// class@0020f8
{
    public final g0 b;

    public void h(g0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       p0 = tb.Y0;
       if (p0 != null) {
          p0.setVisibility(8);
          tb.Y0 = null;
       }
       return;
    }
}
