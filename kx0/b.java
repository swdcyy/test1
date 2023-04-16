package kx0.b;
import io.reactivex.g;
import android.util.Pair;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import brd.v;
import com.facebook.imagepipeline.request.ImageRequest;
import kx0.f;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public final class b implements g	// class@002e11
{
    public final Pair b;
    public final Drawable[] c;

    public void b(Pair p0,Drawable[] p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       b tb = this.b;
       a.d(tb.second, new f(p0, tb, this.c));
    }
}
