package fw8.x;
import qh7.b;
import com.yxcorp.gifshow.activity.SchemeActivity;
import java.lang.Object;
import yh7.a;
import java.util.Objects;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.Intent;
import com.yxcorp.gifshow.activity.SchemeActivity$a;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class x implements b	// class@00236f
{
    public final SchemeActivity a;

    public void x(SchemeActivity p0){
       this.a = p0;
    }
    public final void a(a p0){
       x ta = this.a;
       Objects.requireNonNull(ta);
       if (p0.a == 200) {
          ta.u3();
       }else {
          SchemeActivity$a y = SchemeActivity.y;
          if (y != null) {
             Intent intent = y.a(a.b());
             if (intent != null) {
                ta.startActivity(intent);
                ta.u3();
             }
          }
          ta.finish();
       }
       return;
    }
}
