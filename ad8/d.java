package ad8.d;
import java.lang.Runnable;
import ad8.g;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import ma8.g;
import qc8.a;

public final class d implements Runnable	// class@00007b
{
    public final g b;
    public final ViewGroup c;
    public final int d;
    public final View e;

    public void d(g p0,ViewGroup p1,int p2,View p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       this.c.requestLayout();
       this.e.setTranslationY((float)(- tb.n().F(this.d)));
    }
}
