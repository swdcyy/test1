package g99.z;
import androidx.lifecycle.Observer;
import g99.a0;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import com.yxcorp.gifshow.detail.nonslide.toolbar.ImmersiveStatus;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import g99.a0$a;
import java.lang.Enum;
import zf6.k;

public final class z implements Observer	// class@002458
{
    public final a0 b;
    public final Fragment c;

    public void z(a0 p0,Fragment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onChanged(Object p0){
       z tb = this.b;
       Objects.requireNonNull(tb);
       if (this.c.getActivity() != null) {
          int i = a0$a.b[p0.ordinal()];
          boolean b = false;
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   tb.d(true);
                   tb.c(b);
                }
             }else {
                tb.d(true);
                if (!k.d() || k.e()) {
                   b = true;
                }
                tb.c(b);
             }
          }else {
             tb.d(b);
          }
       }
       return;
    }
}
