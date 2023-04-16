package ad9.f;
import java.lang.Runnable;
import ad9.i;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import java.lang.Integer;
import com.yxcorp.utility.n;

public final class f implements Runnable	// class@00009d
{
    public final i b;
    public final View c;

    public void f(i p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       int i = 0x7f0a445c;
       int i1 = (tc.getTag(i) != null)? tc.getTag(i).intValue(): n.p(tc)[1];
       i1 = i1 - (n.p(tb.g)[1] + tb.g.getHeight());
       i = i.r;
       if (i1 != i) {
          tb.g.setTranslationY((float)((i1 - i) + (int)tb.g.getTranslationY()));
       }
       return;
    }
}
