package ghd.a;
import u07.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import u07.t;
import android.view.View;
import k2b.e0;
import java.lang.String;
import sgd.b;

public final class a implements u	// class@000f28
{
    public final u b;
    public final GifshowActivity c;

    public void a(u p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       this.b.a(p0, p1);
       b.k(this.c, "FOLLOWER_AND_FOLLOWING", 0);
    }
}
