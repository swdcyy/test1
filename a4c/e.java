package a4c.e;
import erd.g;
import a4c.h;
import java.lang.Object;
import kob.p;
import java.util.Objects;
import com.yxcorp.gifshow.widget.CollectAnimationView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.RelativeLayout;
import com.kuaishou.android.model.music.Music;

public final class e implements g	// class@00006e
{
    public final h b;

    public void e(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       p c = p0.c;
       if (c == tb.p) {
          if (p0.d != null) {
             if (p0.a != null) {
                tb.q.e();
                tb.q.setContentDescription(tb.getContext().getString(R.string.arg_RES_7f10003d));
             }else {
                tb.q.k();
                tb.q.setContentDescription(tb.getContext().getString(R.string.arg_RES_7f10003c));
             }
          }else {
             tb.P8(c);
          }
       }
       return;
    }
}
