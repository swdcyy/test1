package c44.b$a;
import java.lang.Runnable;
import c44.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c44.a;
import androidx.recyclerview.widget.RecyclerView;
import c44.b$a$a;
import android.view.ViewGroup;

public final class b$a implements Runnable	// class@0004ac
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       a.P8(this.b.b).post(new b$a$a(this));
       return;
    }
}
