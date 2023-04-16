package mr1.j;
import androidx.lifecycle.Observer;
import mr1.l;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kr1.b;

public final class j implements Observer	// class@0031fb
{
    public final l b;

    public void j(l p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          this.b.c.c();
       }
       return;
    }
}
