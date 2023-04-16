package b53.s0;
import erd.g;
import com.kuaishou.live.gzone.barrage.q$a;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import y8c.d;
import android.view.View;
import android.widget.ImageView;

public final class s0 implements g	// class@000323
{
    public final q$a b;

    public void s0(q$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.intValue() == tb.s.get()) {
          tb.q.setVisibility(0);
          tb.r.setVisibility(0);
          tb.r.setImageResource(R.drawable.arg_RES_7f081249);
       }else {
          tb.q.setVisibility(8);
          if (tb.P8()) {
             tb.r.setVisibility(0);
             tb.r.setImageResource(R.drawable.arg_RES_7f081248);
          }else {
             tb.r.setVisibility(8);
          }
       }
       return;
    }
}
