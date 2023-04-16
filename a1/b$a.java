package a1.b$a;
import android.os.Handler$Callback;
import a1.b;
import java.lang.Object;
import android.os.Message;
import a1.b$c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import a1.b$e;
import a1.b$d;

public class b$a implements Handler$Callback	// class@000040
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public boolean handleMessage(Message p0){
       p0 = p0.obj;
       if (p0.d == null) {
          p0.d = a.c(this.b.a, p0.c, p0.b, false);
       }
       p0.e.onInflateFinished(p0.d, p0.c, p0.b);
       this.b.c.d(p0);
       return true;
    }
}
