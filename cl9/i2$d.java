package cl9.i2$d;
import androidx.recyclerview.widget.RecyclerView$i;
import cl9.i2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import g9c.a;

public class i2$d extends RecyclerView$i	// class@000631
{
    public final i2 a;

    public void i2$d(i2 p0){
       this.a = p0;
       super();
    }
    public void j(int p0,int p1){
       i2$d uod = i2$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "1")) {
          return;
       }
       if (p0 != (this.a.C.getItemCount() - p1)) {
          i2$d ta = this.a;
          if (this.a.C.N0(p0) != ta.G) {
             ta.P8();
          }
       }
       return;
    }
}
