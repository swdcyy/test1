package bed.k0;
import erd.g;
import bed.q0;
import java.lang.Object;
import android.content.Intent;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import uy5.a;
import q87.c;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class k0 implements g	// class@000411
{
    public final q0 b;

    public void k0(q0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k0 tb = this.b;
       if (!TextUtils.x(tb.c)) {
          p0.putExtra("photo_task_id", tb.c);
       }
       Object[] objArray = new Object[0];
       p0.putExtra("discard_current_post_session", true);
       tb.b.startActivity(p0);
       return;
    }
}
