package ko1.s;
import erd.g;
import ko1.b0;
import java.lang.Object;
import com.airbnb.lottie.LottieTask;
import java.util.Objects;
import ko1.n;
import w4.j;

public final class s implements g	// class@002d8b
{
    public final b0 b;

    public void s(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       Objects.requireNonNull(tb);
       p0.addListener(new n(tb));
    }
}
