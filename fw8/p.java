package fw8.p;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import android.app.Dialog;
import java.util.List;

public final class p implements DialogInterface$OnDismissListener	// class@002366
{
    public final GifshowActivity b;
    public final DialogInterface$OnDismissListener c;

    public void p(GifshowActivity p0,DialogInterface$OnDismissListener p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onDismiss(DialogInterface p0){
       p tb = this.b;
       p tc = this.c;
       Objects.requireNonNull(tb);
       p0.setOnDismissListener(null);
       tb.g.remove(p0);
       if (tc != null) {
          tc.onDismiss(p0);
       }
       return;
    }
}
