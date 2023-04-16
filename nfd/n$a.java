package nfd.n$a;
import androidx.recyclerview.widget.RecyclerView$r;
import nfd.n;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class n$a extends RecyclerView$r	// class@001dd3
{
    public final n a;

    public void n$a(n p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(n$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, n$a.class, "1")) {
          return;
       }
       this.a.e(p2);
       return;
    }
}
