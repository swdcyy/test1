package b0c.a;
import io.reactivex.g;
import b0c.e;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.yxcorp.image.request.a;
import s0d.e;
import b0c.d;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public final class a implements g	// class@00037e
{
    public final e b;
    public final String c;

    public void a(e p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       a.d(a.u(this.c).q(), new d(tb, p0));
    }
}
