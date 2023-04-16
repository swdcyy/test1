package ao.b$b;
import erd.g;
import ao.b;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b$b implements g	// class@0001ff
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          this.b.release();
       }
       return;
    }
}
