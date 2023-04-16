package hx9.b$a;
import com.kwai.component.tabs.panel.h$d;
import hx9.b;
import java.lang.Object;
import com.kwai.component.tabs.panel.h$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hx9.c;

public final class b$a implements h$d	// class@002720
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public final h$b a(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.a);
    }
}
