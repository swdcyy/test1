package aua.n$a;
import androidx.recyclerview.widget.RecyclerView$r;
import aua.n;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class n$a extends RecyclerView$r	// class@000317
{
    public final n a;

    public void n$a(n p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(n$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, n$a.class, "1")) {
          return;
       }
       if (p1) {
          this.a.R8();
       }else {
          this.a.W8();
       }
       return;
    }
}
