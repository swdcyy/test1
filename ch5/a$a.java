package ch5.a$a;
import androidx.recyclerview.widget.RecyclerView$r;
import ch5.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import yg5.b0;

public class a$a extends RecyclerView$r	// class@0006c0
{
    public int a;
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
       this.a = 0;
    }
    public void a(RecyclerView p0,int p1){
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a$a.class, "1")) {
          return;
       }
       int i = this.a + p2;
       this.a = i;
       this.b.q.g(i);
       return;
    }
}
