package dy8.e;
import java.lang.Runnable;
import java.lang.ref.WeakReference;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import dy8.f$a;
import dy8.c;
import lnc.c3$a;
import lnc.c3;

public final class e implements Runnable	// class@0020fe
{
    public final WeakReference b;
    public final int c;
    public final Drawable d;

    public void e(WeakReference p0,int p1,Drawable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       c3.c(this.b.get(), new c(this.c, this.d));
    }
}
