package ko1.q;
import erd.g;
import ko1.b0;
import java.lang.Object;
import com.airbnb.lottie.LottieTask;
import java.util.Objects;
import ko1.l;
import w4.j;

public final class q implements g	// class@002d89
{
    public final b0 b;

    public void q(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q tb = this.b;
       Objects.requireNonNull(tb);
       p0.addListener(new l(tb));
    }
}
