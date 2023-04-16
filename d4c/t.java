package d4c.t;
import erd.g;
import d4c.v;
import java.lang.Object;
import kob.p;
import java.util.Objects;
import com.yxcorp.gifshow.widget.CollectAnimationView;
import com.kuaishou.android.model.music.Music;

public final class t implements g	// class@0020dd
{
    public final v b;

    public void t(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       p c = p0.c;
       p a = p0.a;
       p0 = p0.d;
       if (c == tb.F) {
          if (p0 != null) {
             if (a != null) {
                tb.t.e();
             }else {
                tb.t.k();
             }
          }else {
             tb.Y8(c);
          }
       }
       return;
    }
}
