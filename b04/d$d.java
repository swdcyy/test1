package b04.d$d;
import fo4.b;
import b04.d;
import java.lang.Object;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f04.a;
import fo4.a;
import tu.d;
import tu.c;

public class d$d implements b	// class@0002f6
{
    public final d a;

    public void d$d(d p0){
       this.a = p0;
       super();
    }
    public KwaiEmptyStateView$a a(){
       return null;
    }
    public Integer b(){
       Object obj = PatchProxy.apply(null, this, d$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (a.c())? 3: 2;
       return Integer.valueOf(i);
    }
    public Integer d(){
       return a.a(this);
    }
    public Object e(){
       return c.a(this);
    }
}
