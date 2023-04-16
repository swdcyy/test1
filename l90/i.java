package l90.i;
import erd.g;
import l90.m;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Object;
import u80.d;

public final class i implements g	// class@002535
{
    public final m b;
    public final Activity c;
    public final VideoContext d;

    public void i(m p0,Activity p1,VideoContext p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       this.b.n(this.c, p0, this.d);
    }
}
