package j9a.h$a$a;
import java.lang.Runnable;
import j9a.h$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j9a.h;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;

public class h$a$a implements Runnable	// class@002990
{
    public final h$a b;

    public void h$a$a(h$a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, h$a$a.class, "1")) {
          return;
       }
       if (this.b.b.r.j() == (this.b.b.r.I0().size() - 1)) {
          this.b.b.r.v1();
       }
       return;
    }
}
