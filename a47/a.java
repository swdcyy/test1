package a47.a;
import io.reactivex.g;
import a47.c;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.yxcorp.image.request.a;
import s0d.e;
import a47.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public final class a implements g	// class@000049
{
    public final c b;
    public final String c;

    public void a(c p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       a.d(a.u(tc).q(), new b(tb, p0, tc));
    }
}
