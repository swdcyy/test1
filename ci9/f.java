package ci9.f;
import erd.g;
import ci9.l;
import java.lang.Object;
import zb9.t;
import java.util.Objects;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class f implements g	// class@0005f6
{
    public final l b;

    public void f(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (TextUtils.n(p0.a(), "SWAP_IMAGE_SHOW_EVENT")) {
          tb.i2((p0.b() ^ 1), 1);
       }
       return;
    }
}
