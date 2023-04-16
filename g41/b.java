package g41.b;
import com.yxcorp.gifshow.autoplay.state.NetworkState$a;
import g41.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;

public final class b implements NetworkState$a	// class@002419
{
    public final c a;

    public void b(c p0){
       this.a = p0;
    }
    public final void b(int p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 != 1) {
          ta.g("network_mobile");
       }
       return;
    }
}
