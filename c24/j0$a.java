package c24.j0$a;
import ms3.c$a;
import c24.j0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hu4.h;

public final class j0$a implements c$a	// class@000481
{
    public final j0 a;

    public void j0$a(j0 p0){
       this.a = p0;
       super();
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, j0$a.class, "1")) {
          return;
       }
       this.a.f.i();
       return;
    }
    public void onShow(){
       PatchProxy.applyVoid(null, this, j0$a.class, "2");
    }
}
