package d89.p;
import cxd.b;
import d89.q;
import android.app.Activity;
import android.content.Intent;
import java.lang.Object;
import cxd.c;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import d89.l;
import n3d.a;
import com.yxcorp.gifshow.webview.c;

public final class p implements b	// class@002094
{
    public final q b;
    public final Activity c;
    public final Intent d;

    public void p(q p0,Activity p1,Intent p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(c p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       c.k(this.c, this.d, 18, new l(tb, p0));
    }
}
