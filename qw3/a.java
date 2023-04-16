package qw3.a;
import androidx.lifecycle.ViewModel;
import crd.a;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a extends ViewModel	// class@003b89
{
    public final a a;

    public void a(){
       super();
       this.a = new a();
    }
    public void o0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.a.c(p0);
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.onCleared();
       this.a.dispose();
       return;
    }
}
