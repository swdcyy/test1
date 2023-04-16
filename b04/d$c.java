package b04.d$c;
import androidx.recyclerview.widget.RecyclerView$r;
import b04.d;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.lifecycle.LiveData;
import ey3.a;
import androidx.lifecycle.MutableLiveData;

public class d$c extends RecyclerView$r	// class@0002f5
{
    public final d a;

    public void d$c(d p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       d$c uoc = d$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2")) {
          return;
       }
       a value = this.a.o.getValue();
       if (value == null) {
          value = new a();
       }
       value.a = p0;
       value.d = p1;
       this.a.o.setValue(value);
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(d$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d$c.class, "1")) {
          return;
       }
       a value = this.a.n.getValue();
       if (value == null) {
          value = new a();
       }
       value.a = p0;
       value.b = p1;
       value.c = p2;
       this.a.n.setValue(value);
       return;
    }
}
