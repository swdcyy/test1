package etb.w$a;
import androidx.recyclerview.widget.RecyclerView$r;
import etb.w;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.g;
import e9c.e;

public class w$a extends RecyclerView$r	// class@002810
{
    public final w a;

    public void w$a(w p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(w$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, w$a.class, "1")) {
          return;
       }
       if (p1 == 1) {
          this.c();
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(w$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, w$a.class, "2")) {
          return;
       }
       if (p1 > 0 || p2 < 0) {
          this.c();
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, w$a.class, "3")) {
          return;
       }
       i oi = this.a.q.q();
       if (this.a.q.kb()) {
          w$a ta = this.a;
          w p = ta.p;
          if (p != null) {
             p.b(oi, ta.q.g7(), 1);
          }
       }
       return;
    }
}
