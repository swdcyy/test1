package p9.a$a;
import java.util.Iterator;
import p9.a;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;

public class a$a implements Iterator	// class@0028e7
{
    public int b;
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
       this.b = 0;
    }
    public boolean hasNext(){
       boolean b = (this.b < this.c.b.getChildCount())? true: false;
       return b;
    }
    public Object next(){
       a$a tb = this.b;
       this.b = tb + 1;
       return this.c.b.getChildAt(tb);
    }
}
