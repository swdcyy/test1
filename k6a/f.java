package k6a.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.e;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;

public final class f implements Runnable	// class@002bed
{
    public final e b;
    public final ViewGroup c;

    public void f(e p0,ViewGroup p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.c.removeView(this.b.h);
    }
}
