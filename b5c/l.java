package b5c.l;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.d;
import android.net.Uri;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;

public final class l implements g	// class@0003af
{
    public final d b;
    public final Uri c;

    public void l(d p0,Uri p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       l tb = this.b;
       l tc = this.c;
       Objects.requireNonNull(tb);
       if (!p0.isEmpty()) {
          tb.R8(tc, p0);
       }
       return;
    }
}
