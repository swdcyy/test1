package awb.e;
import bwb.c$a;
import awb.i;
import java.lang.Object;
import android.graphics.Bitmap;
import java.util.Objects;
import com.yxcorp.gifshow.follow.model.FilterOption;
import java.lang.String;
import zvb.a;
import awb.f;
import bwb.c;

public final class e implements c$a	// class@000344
{
    public final i a;

    public void e(i p0){
       this.a = p0;
    }
    public final void a(Bitmap p0){
       e ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 != null) {
          c.a(a.c(ta.p), new f(ta, p0));
       }
       return;
    }
}
