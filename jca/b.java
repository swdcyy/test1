package jca.b;
import java.lang.Runnable;
import jca.a$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jca.a;
import androidx.recyclerview.widget.RecyclerView;

public final class b implements Runnable	// class@002a50
{
    public final a$d b;

    public void b(a$d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.b.c.smoothScrollToPosition(0);
       return;
    }
}
