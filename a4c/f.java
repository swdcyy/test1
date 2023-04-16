package a4c.f;
import erd.g;
import a4c.h;
import android.view.View;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import android.content.Context;
import ekd.p0;
import e17.i;
import com.yxcorp.gifshow.widget.CollectAnimationView;
import com.yxcorp.gifshow.util.rx.RxBus;
import kob.p;

public final class f implements g	// class@00006f
{
    public final h b;
    public final View c;
    public final Music d;

    public void f(h p0,View p1,Music p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f td = this.d;
       Objects.requireNonNull(tb);
       if (!p0.C(this.c.getContext())) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
          if (tb.p.equals(td)) {
             tb.q.setFavoriteState(true);
          }
          RxBus.f.b(new p(td, true, false));
       }
       return;
    }
}
