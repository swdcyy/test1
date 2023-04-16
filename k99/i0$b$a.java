package k99.i0$b$a;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class i0$b$a implements Runnable	// class@002b7f
{
    public final RecyclerView b;

    public void i0$b$a(RecyclerView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, i0$b$a.class, "1")) {
          return;
       }
       this.b.scrollBy(0, 1);
       return;
    }
}
