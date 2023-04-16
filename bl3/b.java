package bl3.b;
import erd.g;
import bl3.i;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.autoplay.live.g;

public final class b implements g	// class@0003e6
{
    public final i b;

    public void b(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.E.mute();
       }else {
          tb.E.unMute();
       }
       return;
    }
}
