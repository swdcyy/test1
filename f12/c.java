package f12.c;
import f12.d;
import java.util.List;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.String;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import java.lang.RuntimeException;
import com.kuaishou.live.core.basic.activity.LiveSlideActivity;
import z41.c;
import z41.d;
import f12.i;
import java.lang.Class;
import z41.b;
import f12.l;

public final class c	// class@002831
{

    public static void a(d p0,List p1,LiveStreamFeed p2,String p3){
    }
    public static d b(Activity p0){
       if (p0 instanceof FragmentActivity) {
          return c.c(p0);
       }
       throw new RuntimeException("Only FragmentActivity is supported");
    }
    public static d c(FragmentActivity p0){
       if (p0 instanceof LiveSlideActivity) {
          return d.b(p0).a(i.class);
       }
       return d.b(p0).a(l.class);
    }
}
