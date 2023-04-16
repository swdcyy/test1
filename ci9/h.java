package ci9.h;
import java.lang.Runnable;
import ci9.l;
import java.lang.Object;
import android.view.ViewGroup;

public final class h implements Runnable	// class@0005f8
{
    public final l b;

    public void h(l p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       tb.u = (int)tb.o.getTranslationY();
    }
}
