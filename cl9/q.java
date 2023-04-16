package cl9.q;
import hka.b;
import cl9.y;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;
import rkd.b;
import com.yxcorp.gifshow.comment.utils.e;

public final class q implements b	// class@00065f
{
    public final y a;

    public void q(y p0){
       this.a = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       q ta = this.a;
       Objects.requireNonNull(ta);
       if (b.g()) {
          y f = ta.F;
          if (f != null) {
             f.m();
          }
       }
       return;
    }
}
