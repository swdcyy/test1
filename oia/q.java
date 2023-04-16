package oia.q;
import e1b.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nia.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;

public class q extends b	// class@00395c
{

    public void q(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       if (this.w == null) {
          this.w = new a(this.v);
       }
       this.v.removeOnScrollListener(this.y);
       this.v.addOnScrollListener(this.y);
       return;
    }
}
