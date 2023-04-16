package fw8.y;
import qh7.b;
import com.yxcorp.gifshow.activity.UriRouterActivity;
import xh7.b;
import java.lang.Object;
import yh7.a;
import java.util.Objects;
import android.net.Uri;
import xh7.a;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class y implements b	// class@002370
{
    public final UriRouterActivity a;
    public final b b;

    public void y(UriRouterActivity p0,b p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(a p0){
       y ta = this.a;
       y tb = this.b;
       Objects.requireNonNull(ta);
       if (200 == p0.a) {
          ta.y = false;
          if (!TextUtils.equals(tb.g().getHost(), "search")) {
             b.a(0x4b316083).p0("URI", true);
          }
          ta.finish();
       }else {
          ta.finish();
       }
       return;
    }
}
