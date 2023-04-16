package nfd.c;
import java.lang.Runnable;
import com.yxcorp.plugin.search.utils.a;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Object;
import java.util.Objects;
import android.view.ViewPropertyAnimator;

public final class c implements Runnable	// class@001d99
{
    public final a b;
    public final View c;
    public final ViewGroup d;

    public void c(a p0,View p1,ViewGroup p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       tc.animate().cancel();
       tb.g(tc, this.d);
       tb.i = 1;
    }
}
