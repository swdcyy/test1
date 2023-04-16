package ifd.h$a;
import androidx.recyclerview.widget.RecyclerView$r;
import ifd.h;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class h$a extends RecyclerView$r	// class@001008
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(h$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, h$a.class, "1")) {
          return;
       }
       if (!p1) {
          this.a.P8(false);
       }
       return;
    }
}
