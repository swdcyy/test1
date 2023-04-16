package ok1.g;
import msd.a;
import ok1.h;
import android.content.Context;
import android.view.ViewGroup;
import java.lang.Object;
import java.util.Objects;
import k51.a;
import android.view.View;
import k51.b;
import z1.a;
import ok1.d;
import android.view.View$OnClickListener;

public final class g implements a	// class@003523
{
    public final h b;
    public final Context c;
    public final ViewGroup d;

    public void g(h p0,Context p1,ViewGroup p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object invoke(){
       g tb = this.b;
       Objects.requireNonNull(tb);
       View view = b.f(this.c, R.layout.live_audience_bottom_bar_gift_item, this.d, false, a.c());
       tb.k.accept(view);
       view.setOnClickListener(new d(tb));
       return view;
    }
}
