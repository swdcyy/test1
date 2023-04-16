package gz0.w;
import androidx.lifecycle.Observer;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.k;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class w implements Observer	// class@0025d9
{
    public final k b;

    public void w(k p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.f();
       }else {
          tb.e();
       }
       return;
    }
}
