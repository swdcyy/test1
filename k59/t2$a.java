package k59.t2$a;
import androidx.lifecycle.Observer;
import k59.t2;
import msd.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import java.util.Set;

public final class t2$a implements Observer	// class@002b1d
{
    public final t2 b;
    public final a c;

    public void t2$a(t2 p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t2$a.class, "1")) {
       }else if(!this.b.j()){
          this.c.invoke();
          this.b.removeObserver(this);
          this.b.b.remove(this);
       }
       return;
    }
}
