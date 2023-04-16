package androidx.recyclerview.widget.z$a;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.RecyclerView;

public class z$a extends RecyclerView$r	// class@00093f
{
    public boolean a;
    public final z b;

    public void z$a(z p0){
       this.b = p0;
       super();
       this.a = false;
    }
    public void a(RecyclerView p0,int p1){
       if (!p1 && this.a != null) {
          this.a = false;
          this.b.l();
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (p1 || p2) {
          this.a = true;
       }
       return;
    }
}
