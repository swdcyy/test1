package cl9.i2$e;
import androidx.recyclerview.widget.ObservableLinearLayoutManager$a;
import cl9.i2;
import java.lang.Object;
import androidx.recyclerview.widget.ObservableLinearLayoutManager;
import u2.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class i2$e implements ObservableLinearLayoutManager$a	// class@000632
{
    public final i2 a;

    public void i2$e(i2 p0){
       this.a = p0;
       super();
    }
    public void a(ObservableLinearLayoutManager p0){
       h.a(this, p0);
    }
    public void b(ObservableLinearLayoutManager p0,int p1,int p2){
       if (PatchProxy.isSupport(i2$e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, i2$e.class, "1")) {
          return;
       }
       this.a.S8();
       return;
    }
    public void c(ObservableLinearLayoutManager p0){
       h.b(this, p0);
    }
}
