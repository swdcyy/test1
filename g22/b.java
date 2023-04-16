package g22.b;
import vq5.b;
import com.kuaishou.live.core.show.activitydialog.LiveActivityBottomDialog;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.util.Objects;
import java.lang.String;
import lnc.o5;
import androidx.viewpager.widget.ViewPager;

public final class b implements b	// class@002a44
{
    public final LiveActivityBottomDialog a;

    public void b(LiveActivityBottomDialog p0){
       this.a = p0;
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       int i = o5.b(p0.getQueryParameter("tabIndex"), -1);
       if (i >= 0) {
          LiveActivityBottomDialog a = ta.A;
          if (a != null) {
             a.setCurrentItem(i);
          }
       }
       return;
    }
}
