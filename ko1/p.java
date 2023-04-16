package ko1.p;
import erd.g;
import ko1.b0;
import java.lang.Object;
import com.airbnb.lottie.LottieTask;
import java.util.Objects;
import ko1.b;
import w4.j;

public final class p implements g	// class@002d88
{
    public final b0 b;

    public void p(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       p0.addListener(new b(tb));
    }
}
