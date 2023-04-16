package ac8.v;
import cc8.j;
import ac8.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class v implements j	// class@000074
{
    public final x a;

    public void v(x p0){
       this.a = p0;
       super();
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, v.class, "2")) {
          return;
       }
       this.a.h(1);
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       this.a.f(1);
       return;
    }
}
