package brb.a$a;
import zr6.d;
import java.lang.Object;
import java.util.List;
import zq6.q;
import androidx.fragment.app.FragmentActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zr6.j;
import wq6.h;
import wn5.b;
import rn5.a;
import zq6.p;
import com.kwai.kcube.decorator.IContainerDecorator;
import com.kwai.robust.PatchProxyResult;
import brb.e;

public class a$a extends d	// class@000438
{

    public void a$a(Object p0){
       super(p0);
    }
    public void b(List p0,q p1,FragmentActivity p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "2")) {
          return;
       }
       p1.c(a.n, this.b.q("KEY_TAB_NAME_DEST"));
       return;
    }
    public IContainerDecorator c(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e();
    }
}
