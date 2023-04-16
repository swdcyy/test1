package gsa.k0;
import gsa.j0;
import com.kwai.kcube.decorator.IContainerDecorator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wq6.f;
import wq6.g;
import java.lang.Integer;
import java.lang.Boolean;
import xr6.c$a;
import xr6.c;
import androidx.viewpager.widget.ViewPager$i;

public class k0 implements j0	// class@002bf5
{
    public final IContainerDecorator a;

    public void k0(IContainerDecorator p0){
       super();
       this.a = p0;
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, k0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.c().B();
    }
    public void b(int p0,boolean p1,String p2){
       if (PatchProxy.isSupport(k0.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, k0.class, "3")) {
          return;
       }
       this.a.c().n(p0, p1, c.a(p2).a());
       return;
    }
    public void g(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "2")) {
          return;
       }
       this.a.c().g(p0);
       return;
    }
    public int getChildCount(){
       Object obj = PatchProxy.apply(null, this, k0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.c().h();
    }
    public void i(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "1")) {
          return;
       }
       this.a.c().i(p0);
       return;
    }
}
