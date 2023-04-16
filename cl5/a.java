package cl5.a;
import erd.g;
import cl5.e;
import java.lang.Object;
import android.content.res.Configuration;
import cl5.b;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class a implements g	// class@0006ea
{
    public final e b;

    public void a(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       tb.t.post(new b(tb));
    }
}
