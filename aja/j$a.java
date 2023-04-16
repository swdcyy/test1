package aja.j$a;
import androidx.recyclerview.widget.RecyclerView$i;
import aja.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import x2b.a;
import aja.i;
import java.lang.Runnable;
import android.view.ViewGroup;

public class j$a extends RecyclerView$i	// class@000090
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, j$a.class, "1")) {
          return;
       }
       this.a.b.post(new i(this));
       return;
    }
}
