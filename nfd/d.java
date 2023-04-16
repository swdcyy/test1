package nfd.d;
import java.lang.Runnable;
import com.yxcorp.plugin.search.utils.a;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Object;
import java.util.Objects;
import android.view.ViewPropertyAnimator;

public final class d implements Runnable	// class@001d9e
{
    public final a b;
    public final View c;
    public final ViewGroup d;

    public void d(a p0,View p1,ViewGroup p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       Objects.requireNonNull(tb);
       tc.animate().cancel();
       tc.setTranslationY((float)(- tc.getHeight()));
       tb.h(td, tb.g, tc);
       a f = tb.f;
       int i = 0;
       int i1 = (f == null)? 0: f[i];
       if (f != null) {
          i = f[1];
       }
       tb.j(tc, Integer.MIN_VALUE, i1, i);
       tb.j(td, td.getHeight(), Integer.MIN_VALUE, Integer.MIN_VALUE);
       tb.i = 2;
       return;
    }
}
