package b12.b;
import ok.o;
import android.app.Activity;
import java.lang.Object;
import java.lang.ref.WeakReference;

public final class b implements o	// class@0002e9
{
    public final Activity b;

    public void b(Activity p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       boolean b = (p0.get() == this.b)? true: false;
       return b;
    }
}
