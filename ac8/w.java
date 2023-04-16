package ac8.w;
import cc8.j;
import ac8.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class w implements j	// class@000075
{
    public final x a;

    public void w(x p0){
       this.a = p0;
       super();
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, w.class, "2")) {
          return;
       }
       this.a.h(2);
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.a.f(2);
       return;
    }
}
