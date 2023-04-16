package p9.a;
import java.lang.Iterable;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Object;
import java.util.Iterator;
import p9.a$a;

public class a implements Iterable	// class@0028e8
{
    public RecyclerView$LayoutManager b;

    public void a(RecyclerView$LayoutManager p0){
       super();
       this.b = p0;
    }
    public Iterator iterator(){
       return new a$a(this);
    }
}
