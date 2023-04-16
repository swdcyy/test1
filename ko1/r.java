package ko1.r;
import erd.g;
import ko1.b0;
import java.lang.Object;
import com.airbnb.lottie.LottieTask;
import java.util.Objects;
import ko1.m;
import w4.j;

public final class r implements g	// class@002d8a
{
    public final b0 b;

    public void r(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       p0.addListener(new m(tb));
    }
}
