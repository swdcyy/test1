package d99.c;
import d99.h$c;
import d99.h;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.util.Objects;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Set;
import e1a.v;

public final class c implements h$c	// class@002099
{
    public final h a;
    public final RecyclerView b;

    public void c(h p0,RecyclerView p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(int p0){
       c ta = this.a;
       c tb = this.b;
       Objects.requireNonNull(ta);
       tb.setTranslationY((tb.getTranslationY() + (float)p0));
       Iterator iterator = ta.w.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
}
